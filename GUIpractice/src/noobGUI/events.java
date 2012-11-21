package noobGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class events extends JFrame{
	private JLabel label;
	private JButton button;
	
	public events(){
		setLayout(new FlowLayout());
		
		
		button = new JButton("Click For Text");
		add(button);
		label = new JLabel();
		add(label);
		
		
		event e = new event();
		button.addActionListener(e);
		
		
		
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			label.setText("YAY");
		}
	}
	
	public static void main (String[]args){
		events gui =  new events();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,200);
		//gui.pack();
		gui.setVisible(true);
	}
	
}
