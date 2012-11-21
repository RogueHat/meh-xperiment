package noobGUI;

import java.awt.*;
import javax.swing.*;
public class Image extends JFrame {
	private ImageIcon pic1,pic2;
	private JLabel label1,label2;
	
	public Image(){
		setLayout(new FlowLayout());
		pic1 = new ImageIcon(getClass().getResource("pic.gif"));
		label1 = new JLabel(pic1);
		add(label1);
	}
	public static void main (String[]args){
		Image gui =  new Image();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//gui.setSize(200,200);
		gui.pack();
		gui.setVisible(true);
	}
	
}
