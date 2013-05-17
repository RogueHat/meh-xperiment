package Graphics;
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

import Things.World;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new GraphicWorld(this,2,.1));

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}