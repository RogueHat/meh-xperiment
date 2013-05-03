package Things;

public class World implements Runnable {
	private Cell[][] world;
	private int w, h;

	public World(int xSize, int ySize, double chance) {
		w = xSize;
		h = ySize;
		world = new Cell[w][h];
		for (int x = 0; x < w; x++)
			for (int y = 0; y < h; y++)
				world[x][y] = new Cell(chance);
		new Thread(this).start();
	}

	public void checkNeighbors(int xPos, int yPos) {
		int liveNeighbors = 0;
		Cell target = world[xPos][yPos];
		for (int x = xPos - 1; x <= xPos + 1; x++) {
			for (int y = yPos - 1; y <= yPos + 1; y++) {
				if (!(x < 0 || y < 0) && !(x == w || y == h)
						&& target != world[x][y])
					if (world[x][y].isAlive())
						liveNeighbors++;
			}
		}

		if (target.isAlive()) {
			if (liveNeighbors < 2 || liveNeighbors > 3)
				target.set(false);
		} else if (liveNeighbors == 3) {
			target.set(true);
		}
	}

	public Cell[][] getWorld() {
		return world;
	}

	public int getH() {
		return h;
	}

	public int getW() {
		return w;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int x = 0; x < w; x++)
				for (int y = 0; y < h; y++)
					checkNeighbors(x, y);
		}
	}

}
