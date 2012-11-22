package noobGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class events2 extends JFrame{
	private JLabel label1,label2;
	private JButton button1,button2;
	
	public events2(){
		setLayout(new FlowLayout());
		
		
		button1 = new JButton("Click For Text");
		add(button1);
		label1 = new JLabel();
		add(label1);
		
		button2 = new JButton("Click For More Text");
		add(button2);
		label2 = new JLabel();
		add(label2);
		
		event e = new event();
		button1.addActionListener(e);
		button2.addActionListener(e);
		
		
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==button1)label1.setText("YAY");
			if(e.getSource()==button2)label1.setText("NAY");
		}
	}
	
	public static void main (String[]args){
		events2 gui =  new events2();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,200);
		//gui.pack();
		gui.setVisible(true);
	}
	
}
