
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class StartGame extends JFrame implements ActionListener, KeyListener{
	private static final long serialVersionUID = 1L;

JFrame gameFrame = new JFrame();
public static StartGame Startgame;
public final int WIDTH = 1200, HEIGHT = 800;
public boolean gameOver, started;

	public StartGame() {
		
		JLabel backgroundPic = new JLabel(
				new ImageIcon("Launcher_BG\\background1v2.png"));
		
		Timer timer = new Timer(20, this);
		JLabel label1 ;
		JButton btn1 ;
		gameFrame.setTitle("Speed Typing Alpha");
		gameFrame.setSize(WIDTH, HEIGHT);
		gameFrame.addKeyListener(this);
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);
		gameFrame.setLayout(new BorderLayout());
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gameFrame.add(backgroundPic);
		//timer.start();
		
		label1 = new JLabel("This is level 1");
		label1.setSize(200,20);
		label1.setLocation(10,10);
		label1.setForeground(Color.black.darker());
		label1.setFont(new Font("Arial",1,22));
		backgroundPic.add(label1);
		
		
		
		gameFrame.setVisible(true);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent btn) {

		
	}
	@Override
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode()== KeyEvent.VK_ESCAPE ) {
			gameFrame.setVisible(false);
			new userProfile();
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
}
