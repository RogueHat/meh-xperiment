package noobGUI;
import java.awt.*;
import javax.swing.*;

public class Second extends JFrame {
	private JLabel label;
	private JButton button;
	private JTextField text;
	
	
	public Second(){
		setLayout(new FlowLayout());
		
		label = new JLabel("I am label");
		add(label);
		
		text = new JTextField(15);
		add(text);
		
		button = new JButton("Click Me");
		add(button);
	}
	
	public static void main (String[]args){
		Second gui =  new Second();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,200);
		gui.setVisible(true);
	}
}
