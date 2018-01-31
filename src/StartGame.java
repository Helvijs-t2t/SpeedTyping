import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class StartGame extends JFrame implements ActionListener, MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
JFrame gameFrame = new JFrame();
public final int WIDTH = 1200, HEIGHT = 800;


public Rectangle car;

public ArrayList<Rectangle> columns;

public int ticks, yMotion, score;

public boolean gameOver, started;

public Random rand;
	
	public StartGame() {
		Timer timer = new Timer(20, this);
		car = new Rectangle(WIDTH / 2 - 4, HEIGHT / 2 - 4, 20, 20);
		columns = new ArrayList<Rectangle>();
		
		
		gameFrame.add(getComponent(0));
		gameFrame.setTitle("Speed Typing Alpha");
		gameFrame.setSize(WIDTH, HEIGHT);
		
		gameFrame.addMouseListener(this);
		gameFrame.addKeyListener(this);
		
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


		
		timer.start();

	
		
		gameFrame.setVisible(true);
	}
	

	  public void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    Graphics2D g2d = (Graphics2D) g;

		    g2d.setColor(new Color(212, 212, 212));
		    g2d.drawRect(10, 15, 90, 60);


		    g2d.setColor(new Color(31, 21, 1));
		    g2d.fillRect(250, 195, 90, 60);
	  }
	
	@Override
	public void actionPerformed(ActionEvent btn) {

		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
