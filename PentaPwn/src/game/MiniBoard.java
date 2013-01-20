package game;

import java.util.ArrayList;

public class MiniBoard extends Board {
	private ArrayList<Marble> brd = new ArrayList<Marble>();
	private int xPivot, yPivot, quad;

	public MiniBoard(int quadrant) {
		quad = quadrant;
		setPivot();
		setBoard();
	}

	public void setBoard() {
		for (int x = -1; x < 3; x++)
			for (int y = -1; y < 3; y++)
				brd.add(super.getMarble(x + xPivot, y + yPivot));
	}

	public void setPivot() {
		switch (quad) {
		case 0:
			xPivot = 1;
			yPivot = 1;
			break;
		case 1:
			xPivot = 4;
			yPivot = 1;
			break;
		case 2:
			xPivot = 4;
			yPivot = 4;
			break;
		case 3:
			xPivot = 1;
			yPivot = 4;
			break;
		}
	}

	public void rotateLeft() {
		rotate(true);
	}

	public void rotateRight() {
		rotate(false);
	}

	public void rotate(boolean turnLeft) {
		int x, y;
		x = y = 0;
		for (Marble m : brd) {
			x = m.getLoc()[0] - xPivot;
			y = m.getLoc()[1] - yPivot;
			if (turnLeft)
				m.setLoc(-y + xPivot, x + yPivot);
			else
				m.setLoc(y + xPivot, -x + yPivot);
		}
	}
}
