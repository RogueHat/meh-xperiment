package chat;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.DefaultCaret;

import network.Network;

@SuppressWarnings("serial")
public class ChatClientUI extends JFrame implements Runnable {
	/**
	 * @param args
	 */
	private Network net;
	private JTextArea log, input;
	private JScrollPane logPane, inputPane;

	public ChatClientUI() {
		super("Carlo's Chat Client");
		net = new Network();
		// tells everyone user joined chat
		net.send("*Joined*");
		setLayout(new GridBagLayout());
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

		log = new JTextArea(10, 30);
		log.setLineWrap(true);
		log.setWrapStyleWord(true);
		//sets scroller to go to bottom every time new msgs appear
		((DefaultCaret) log.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		logPane = new JScrollPane(log);
		add(logPane);

		input = new JTextArea(10, 13);
		input.setLineWrap(true);
		input.setWrapStyleWord(true);
		// listens for enter key and not empty input box
		input.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					String sent = input.getText().replace("\n", "").trim();
					if (!sent.equals("")) {
						net.send(sent);
						input.setText("");
						pack();
					}
				}
			}
		});
		inputPane = new JScrollPane(input);
		add(inputPane);

		// tells everyone that user left before window close
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				net.send("*Left*");
				//System.exit(0);
			}
		});

		setVisible(true);
		new Thread(this).start();
	}

	public ChatClientUI(Network nt) {
		this();
		net = nt;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String packet;
		while (true) {
			packet = "";
			try {
				Thread.currentThread().sleep(100);
				packet = net.recieve(true);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!packet.equals("")) {
				//log.setText(packet.replace("/", "").trim() + "\n" + log.getText() );
				log.setText(log.getText() + packet.replaceFirst("/", "").trim() + "\n" );
				pack();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatClientUI();
	}
}
