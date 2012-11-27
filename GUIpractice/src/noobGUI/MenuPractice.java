package noobGUI;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MenuPractice extends JFrame {
	JMenuBar bar;
	//JMenu file;
	JMenuItem exit,enter;
	
	public MenuPractice(){
		setLayout(new FlowLayout());
		bar = new JMenuBar();
		setJMenuBar(bar);
		
		//file = new JMenu("FILE");
		//bar.add(file);
		
		exit = new JMenuItem("exit");
		enter = new JMenuItem("enter");
		//file.add(exit);
		bar.add(enter);
		bar.add(exit);
		
		event e = new event();
		exit.addActionListener(e);
	}
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	public static void main (String[]args){
		MenuPractice gui = new MenuPractice();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,200);
		gui.setVisible(true);
	}
	
}
