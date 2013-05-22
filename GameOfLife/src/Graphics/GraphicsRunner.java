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
	private static final int WIDTH = 1920;
	private static final int HEIGHT = 1024;

	public GraphicsRunner()
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new GraphicWorld(this,5,.2));

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}