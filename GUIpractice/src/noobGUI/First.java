package noobGUI;
import javax.swing.JFrame;

public class First extends JFrame{
	public static void main(String[]args){
		First gui = new First();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,200);
		gui.setVisible(true);
		
		gui.setTitle("THIS IS A TITLE");
	}
}
