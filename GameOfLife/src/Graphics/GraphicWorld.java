package Graphics;

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;

import Things.Cell;
import Things.World;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicWorld extends JPanel implements Runnable {
	private World world;
	private Cell[][] table;
	private int size;
	
	// use an array of Molecule
	// Molecule[] molecules;

	public GraphicWorld(GraphicsRunner gr, int s, double chance) {
		setBackground(Color.black);
		setVisible(true);
		size = s;
		world = new World(gr.getWidth()/size,gr.getHeight()/size, chance);
		table = world.getWorld();
		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		//window.setColor(Color.black);
		for(int x = 0; x < world.getW(); x++){
			for(int y = 0; y < world.getH(); y++){
				window.setColor(Color.black);
				if(table[x][y].isAlive())
					window.setColor(Color.blue);
				window.fillRect(x*size, y*size, size, size);
			}
		}
		
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(50);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}
