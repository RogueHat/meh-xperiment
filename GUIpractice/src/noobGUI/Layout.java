package noobGUI;
import java.awt.*;
import javax.swing.*;
public class Layout extends JFrame {
	JButton bot1,bot2,bot3;
	JLabel lab1,lab2,lab3;
	
	public Layout(){
		setLayout(new GridLayout(2,3));
		bot1 = new JButton("1");	add(bot1);
		bot2 = new JButton("2");	add(bot2);
		bot3 = new JButton("3");	add(bot3);
		
		lab1 = new JLabel("1");	add(lab1);
		lab2 = new JLabel("2");	add(lab2);
		lab3 = new JLabel("3");	add(lab3);
	}
	
	public static void main (String[]args){
		Layout blarg = new Layout();
		blarg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		blarg.setVisible(true);
		blarg.pack();
		
		
	}
}
