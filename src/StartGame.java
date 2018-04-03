
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class StartGame extends JFrame implements ActionListener, KeyListener{
	private static final long serialVersionUID = 1L;

JFrame gameFrame = new JFrame();
public static StartGame Startgame;
public final int WIDTH = 1200, HEIGHT = 800;
public String displayString ="";
public JLabel displayLabel, l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
public JLabel character = new JLabel(new ImageIcon("Launcher_BG\\rsz_stman.png"));
public int keyspressed = 0;
public int spresseed = 0;
JLabel backgroundPic = new JLabel(new ImageIcon("Launcher_BG\\lvl1.png"));
public JButton btnBack;
	public StartGame() {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		String [] newList = new String[11];
		Random r = new Random(alphabet.length);
		
		for(int i=0;i<10;i++) {
			
			int x = r.nextInt(26) + 1;
			newList[i] = alphabet[x]+"";
			displayString=displayString+"  "+alphabet[x];
		}
		
		gameFrame.setTitle("Speed Typing Alpha");
		gameFrame.setSize(WIDTH, HEIGHT);
		gameFrame.addKeyListener(this);
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);
		gameFrame.setLayout(new BorderLayout());
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gameFrame.add(backgroundPic);
		
		
		character.setSize(100,100);
		character.setLocation(150,550);
		backgroundPic.add(character);
		
		l1 = new JLabel(newList[0]+"");
		l1.setSize(30,40);
		l1.setLocation(150,100);
		l1.setFont(new Font("Arial Black",3,35));
		l1.setForeground(Color.BLACK.darker());
		backgroundPic.add(l1);
		
		l2 = new JLabel(newList[1]+"");
		l2.setSize(30,40);
		l2.setLocation(250,100);
		l2.setFont(new Font("Arial Black",3,35));
		l2.setForeground(Color.BLACK.darker());
		backgroundPic.add(l2);
		
		l3 = new JLabel(newList[2]+"");
		l3.setSize(30,40);
		l3.setLocation(350,100);
		l3.setFont(new Font("Arial Black",3,35));
		l3.setForeground(Color.BLACK.darker());
		backgroundPic.add(l3);
		
		l4 = new JLabel("l");
		l4.setSize(30,40);
		l4.setLocation(450,100);
		l4.setFont(new Font("Arial Black",3,35));
		l4.setForeground(Color.BLACK.darker());
		backgroundPic.add(l4);
		
		l5 = new JLabel(newList[4]+"");
		l5.setSize(30,40);
		l5.setLocation(550,100);
		l5.setFont(new Font("Arial Black",3,35));
		l5.setForeground(Color.BLACK.darker());
		backgroundPic.add(l5);
		
		l6 = new JLabel(newList[5]+"");
		l6.setSize(30,40);
		l6.setLocation(650,100);
		l6.setFont(new Font("Arial Black",3,35));
		l6.setForeground(Color.BLACK.darker());
		backgroundPic.add(l6);
		
		l7 = new JLabel(newList[6]+"");
		l7.setSize(30,40);
		l7.setLocation(750,100);
		l7.setFont(new Font("Arial Black",3,35));
		l7.setForeground(Color.BLACK.darker());
		backgroundPic.add(l7);
		
		l8 = new JLabel(newList[7]+"");
		l8.setSize(30,40);
		l8.setLocation(850,100);
		l8.setFont(new Font("Arial Black",3,35));
		l8.setForeground(Color.BLACK.darker());
		backgroundPic.add(l8);
		
		l9 = new JLabel(newList[8]+"");
		l9.setSize(30,40);
		l9.setLocation(950,100);
		l9.setFont(new Font("Arial Black",3,35));
		l9.setForeground(Color.BLACK.darker());
		backgroundPic.add(l9);
		
		l0 = new JLabel(newList[9]+"");
		l0.setSize(30,40);
		l0.setLocation(1050,100);
		l0.setFont(new Font("Arial Black",3,35));
		l0.setForeground(Color.BLACK.darker());
		backgroundPic.add(l0);
		
		displayLabel = new JLabel("");
		displayLabel.setSize(600,80);
		displayLabel.setLocation(330,250);
		displayLabel.setFont(new Font("Arial",3,70));
		displayLabel.setForeground(Color.RED.darker());
		backgroundPic.add(displayLabel);

		btnBack = new JButton("Back");
		btnBack.setSize(200,40);
		btnBack.setLocation(470,400);
		btnBack.setOpaque(false);
		btnBack.setForeground(Color.RED.darker());
		btnBack.setFont(new Font("Arial",3,35));
		btnBack.setContentAreaFilled(false);
		btnBack.addActionListener(this);
		btnBack.setVisible(false);
		backgroundPic.add(btnBack);
		
		
		gameFrame.setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent btn) {
		if(btn.getSource()==btnBack) {
			goback();
		}
		
	}
	@Override
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode()== KeyEvent.VK_ESCAPE ) {
			goback();

		}
		
		if(ke.getKeyCode()== KeyEvent.VK_X && keyspressed==0 ) {
			character.setLocation(200,550);
			repaint();
			keyspressed++;
		}
		
		if(ke.getKeyCode()== KeyEvent.VK_H && keyspressed==1) {
			character.setLocation(300,550);
			repaint();
			keyspressed++;
		}
		
		if(ke.getKeyCode()== KeyEvent.VK_S && keyspressed==2) {
			character.setLocation(400,550);
			repaint();
			keyspressed++;
			spresseed++;
		}
		
		if(ke.getKeyCode()== KeyEvent.VK_L && keyspressed==3) {
			character.setLocation(500,550);
			repaint();
			keyspressed++;
		}
		if(ke.getKeyCode()== KeyEvent.VK_F && keyspressed==4) {
			character.setLocation(600,550);
			repaint();
			keyspressed++;
		}
		if(ke.getKeyCode()== KeyEvent.VK_U && keyspressed==5) {
			character.setLocation(700,550);
			repaint();
			keyspressed++;
		}
		if(ke.getKeyCode()== KeyEvent.VK_O && keyspressed==6) {
			character.setLocation(800,550);
			repaint();
			keyspressed++;
		}
		if(ke.getKeyCode()== KeyEvent.VK_K && keyspressed==7) {
			character.setLocation(900,550);
			repaint();
			keyspressed++;
		}
		if(ke.getKeyCode()== KeyEvent.VK_G && keyspressed==8) {
			character.setLocation(1000,550);
			repaint();
			keyspressed++;
		}
		if(ke.getKeyCode()== KeyEvent.VK_J && keyspressed==9) {
			character.setLocation(1100,550);
			repaint();
			keyspressed++;
		}
		if(keyspressed==10) {
			character.setVisible(false);
			displayLabel.setText("Level Complete");
			btnBack.setVisible(true);
		}
	}
	public void goback() {
		if(VarCheck.disableCount==0 && keyspressed>9) {
		VarCheck.levelspassed++;
		VarCheck.disableCount++;
		}
		gameFrame.setVisible(false);
		new level1();
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