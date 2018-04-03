import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Options extends JFrame implements ActionListener,KeyListener {
	private static final long serialVersionUID = 1L;

	
	JFrame options = new JFrame();
	Font labelFont = (new Font("arial", 5, 25));
	Font ButtonFont = (new Font("arial", 15, 35));
	Font welcomeFont = (new Font("arial", 5, 65));
	JButton back,save;
	JLabel user, welcome, password, message;
	JTextField userID, userPW;
	
	
	public Options() throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer1= new PrintWriter("game.log", "UTF-8");
		
		Border border = BorderFactory.createDashedBorder(Color.YELLOW,12, 22,3,false);

		JLabel background = new JLabel(
				new ImageIcon("Launcher_BG\\Launcher_BG.jpg"));

		options.setSize(820, 600);
		options.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		options.setTitle("Speed Typing\u2122");
		options.setLocationRelativeTo(null);
		options.setResizable(false);
		background.addKeyListener(this);
		options.addKeyListener(this);
		options.setLayout(new BorderLayout());
		options.add(background);
		
		save = new JButton("Save");
		save.setSize(200,40);
		save.setLocation(610,520);
		save.setOpaque(false);
		save.setFocusPainted(false);
		save.setForeground(Color.GREEN.darker());
		save.setFont(new Font("Arial",3,35));
		save.setContentAreaFilled(false);
		save.addActionListener(this);
		save.setVisible(true);
		background.add(save);
		
		back = new JButton("Back");
		back.setSize(200,40);
		back.setLocation(5,520);
		back.setOpaque(false);
		back.setFocusPainted(false);
		back.setForeground(Color.RED.darker());
		back.setFont(new Font("Arial",3,35));
		back.setContentAreaFilled(false);
		back.addActionListener(this);
		back.setVisible(true);
		background.add(back);
		
		options.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource()==back) {
			goback();
		}
		
	}


	@Override
	public void keyPressed(KeyEvent ev1) {
		if(ev1.getKeyCode() == KeyEvent.VK_ESCAPE ) {
			goback();
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
	}


	@Override
	public void keyTyped(KeyEvent arg0) {	
	}
	
	public void goback()  {
		try {
			new startUp();
		} catch (IOException e) {}
		
		options.setVisible(false);
		
	}
}
