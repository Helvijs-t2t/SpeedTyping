import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class level2 implements KeyListener, ActionListener, Runnable {
	JFrame gameFrame = new JFrame();
	public final int WIDTH = 1200, HEIGHT = 760;
	public String displayString = "";
	public JLabel displayLabel, l1, l2, l3, l4, l5, l6, l7, l8, l9, l0, ltime, ScoreLabel;
	protected JLabel life1 = new JLabel(new ImageIcon(getClass().getResource("Lifes.png")));
	protected JLabel life2 = new JLabel(new ImageIcon(getClass().getResource("Lifes.png")));
	protected JLabel life3 = new JLabel(new ImageIcon(getClass().getResource("Lifes.png")));
	protected JLabel character = new JLabel(new ImageIcon(getClass().getResource("rsz_stman.png")));
	public int keyspressed = 0;
	public int spresseed = 0;
	public boolean runB = true;
	public final Timer timer = new Timer();
	JLabel backgroundPic = new JLabel(new ImageIcon(getClass().getResource("lvl2.png")));
	public JButton btnBack;
	public boolean acceptInput = true;

	public level2() {

		gameFrame.setTitle("Speed Typing\u2122");
		gameFrame.setSize(WIDTH, HEIGHT);
		gameFrame.addKeyListener(this);
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);
		gameFrame.setLayout(new BorderLayout());
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gameFrame.add(backgroundPic);

		character.setSize(100, 100);
		character.setLocation(150, 550);
		backgroundPic.add(character);

		if (startUp.Dificulty > 1 && startUp.LifesRemaining==0) {
			startUp.LifesRemaining = 3;
		}
		l1 = new JLabel("z");
		l1.setSize(30, 40);
		l1.setLocation(150, 100);
		l1.setFont(new Font("Arial Black", 3, 35));
		l1.setForeground(Color.BLACK.darker());
		backgroundPic.add(l1);

		l2 = new JLabel("1");
		l2.setSize(30, 40);
		l2.setLocation(250, 100);
		l2.setFont(new Font("Arial Black", 3, 35));
		l2.setForeground(Color.BLACK.darker());
		backgroundPic.add(l2);

		ltime = new JLabel("");
		ltime.setSize(600, 80);
		ltime.setLocation(300, 10);
		ltime.setFont(new Font("Arial", 3, 50));
		ltime.setForeground(Color.ORANGE.brighter());
		backgroundPic.add(ltime);

		l3 = new JLabel("0");
		l3.setSize(30, 40);
		l3.setLocation(350, 100);
		l3.setFont(new Font("Arial Black", 3, 35));
		l3.setForeground(Color.BLACK.darker());
		backgroundPic.add(l3);

		l4 = new JLabel("g");
		l4.setSize(30, 40);
		l4.setLocation(450, 100);
		l4.setFont(new Font("Arial Black", 3, 35));
		l4.setForeground(Color.BLACK.darker());
		backgroundPic.add(l4);

		l5 = new JLabel("n");
		l5.setSize(30, 40);
		l5.setLocation(550, 100);
		l5.setFont(new Font("Arial Black", 3, 35));
		l5.setForeground(Color.BLACK.darker());
		backgroundPic.add(l5);

		l6 = new JLabel("r");
		l6.setSize(30, 40);
		l6.setLocation(650, 100);
		l6.setFont(new Font("Arial Black", 3, 35));
		l6.setForeground(Color.BLACK.darker());
		backgroundPic.add(l6);

		l7 = new JLabel("q");
		l7.setSize(30, 40);
		l7.setLocation(750, 100);
		l7.setFont(new Font("Arial Black", 3, 35));
		l7.setForeground(Color.BLACK.darker());
		backgroundPic.add(l7);

		l8 = new JLabel("p");
		l8.setSize(30, 40);
		l8.setLocation(850, 100);
		l8.setFont(new Font("Arial Black", 3, 35));
		l8.setForeground(Color.BLACK.darker());
		backgroundPic.add(l8);

		l9 = new JLabel("4");
		l9.setSize(30, 40);
		l9.setLocation(950, 100);
		l9.setFont(new Font("Arial Black", 3, 35));
		l9.setForeground(Color.BLACK.darker());
		backgroundPic.add(l9);

		l0 = new JLabel("v");
		l0.setSize(30, 40);
		l0.setLocation(1050, 100);
		l0.setFont(new Font("Arial Black", 3, 35));
		l0.setForeground(Color.BLACK.darker());
		backgroundPic.add(l0);

		displayLabel = new JLabel("");
		displayLabel.setSize(600, 80);
		displayLabel.setLocation(330, 250);
		displayLabel.setFont(new Font("Arial", 3, 70));
		displayLabel.setForeground(Color.RED.darker());
		backgroundPic.add(displayLabel);
		
		// Label for score 
		ScoreLabel = new JLabel("");
		ScoreLabel.setSize(600, 80);
		ScoreLabel.setLocation(330, 450);
		ScoreLabel.setFont(new Font("Arial", 3, 70));
		ScoreLabel.setForeground(Color.RED.darker());
		backgroundPic.add(ScoreLabel);

		btnBack = new JButton("Back");
		btnBack.setSize(200, 40);
		btnBack.setLocation(470, 400);
		btnBack.setOpaque(false);
		btnBack.setForeground(Color.RED.darker());
		btnBack.setFont(new Font("Arial", 3, 35));
		btnBack.setContentAreaFilled(false);
		btnBack.addActionListener(this);
		btnBack.setVisible(false);
		backgroundPic.add(btnBack);
		DisplayLife();
		gameFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent btn) {
		if (btn.getSource() == btnBack) {
			if (startUp.Dificulty > 1) {
				if (startUp.LifesRemaining < 0) {
					startUp.LifesRemaining = 0;
				}
			}
			goback();
		}

	}

	@Override
	public void keyPressed(KeyEvent ke) {
		if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
			goback1();

		}
		if (acceptInput) {
			if (ke.getKeyCode() == KeyEvent.VK_Z && keyspressed == 0) {
				character.setLocation(200, 550);
				keyspressed++;
				if (runB = true && startUp.Dificulty == 3) {
					run();
					runB = false;
				}
			} else

			if (ke.getKeyCode() == KeyEvent.VK_1 && keyspressed == 1) {
				character.setLocation(300, 550);
				keyspressed++;startUp.Score++;
			} else

			if (ke.getKeyCode() == KeyEvent.VK_0 && keyspressed == 2) {
				character.setLocation(400, 550);
				keyspressed++;startUp.Score++;
			} else

			if (ke.getKeyCode() == KeyEvent.VK_G && keyspressed == 3) {
				character.setLocation(500, 550);
				keyspressed++;startUp.Score++;
			} else if (ke.getKeyCode() == KeyEvent.VK_N && keyspressed == 4) {
				character.setLocation(600, 550);
				keyspressed++;startUp.Score++;
			} else if (ke.getKeyCode() == KeyEvent.VK_R && keyspressed == 5) {
				character.setLocation(700, 550);
				keyspressed++;startUp.Score++;
			} else if (ke.getKeyCode() == KeyEvent.VK_Q && keyspressed == 6) {
				character.setLocation(800, 550);
				keyspressed++;startUp.Score++;
			} else if (ke.getKeyCode() == KeyEvent.VK_P && keyspressed == 7) {
				character.setLocation(900, 550);
				keyspressed++;startUp.Score++;
			} else if (ke.getKeyCode() == KeyEvent.VK_4 && keyspressed == 8) {
				character.setLocation(1000, 550);
				keyspressed++;startUp.Score++;
			} else if (ke.getKeyCode() == KeyEvent.VK_V && keyspressed == 9) {
				character.setLocation(1100, 550);
				keyspressed++;startUp.Score++;
			} else if (ke.getKeyCode() != KeyEvent.VK_ESCAPE) {
				startUp.LifesRemaining--;
				startUp.Score--;
				DisplayLife();
			}
			if (keyspressed == 10) {
				timer.cancel();
				acceptInput = false;
				character.setVisible(false);
				displayLabel.setText("Level Complete");
				ScoreLabel.setText("You Scored :" + startUp.Score); //  displays the score 
				btnBack.setVisible(true);
			}
		}
	}

	public void goback1() {
		if ( keyspressed < 9) {
			if (startUp.Dificulty > 1) {
				startUp.LifesRemaining = 3;
			}
			timer.cancel();
			gameFrame.setVisible(false);
			new levelCheck();
		} else {
			goback();
		}
	}

	public void goback() {
		if (VarCheck.disableCount == 1 && keyspressed > 9) {
			VarCheck.levelspassed++;
			VarCheck.disableCount++;
			if (startUp.Dificulty > 1) {
				if (startUp.LifesRemaining < 0) {
					startUp.LifesRemaining = 0;
				}
				if (startUp.LifesRemaining > 0 && startUp.LifesRemaining < 3) {
					startUp.LifesRemaining++;
				}
			}
		}
		timer.cancel();
		gameFrame.setVisible(false);
		new levelCheck();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

	public void DisplayLife() {
		if (startUp.Dificulty >= 1) {
			if (startUp.LifesRemaining == 3) {
				life1.setSize(95, 95);
				life1.setLocation(10, 640);
				backgroundPic.add(life1);
				life2.setSize(95, 95);
				life2.setLocation(110, 640);
				backgroundPic.add(life2);
				life3.setSize(95, 95);
				life3.setLocation(210, 640);
				backgroundPic.add(life3);
			}

			if (startUp.LifesRemaining == 2) {
				life1.setSize(95, 95);
				life1.setLocation(10, 640);
				backgroundPic.add(life1);
				life2.setSize(95, 95);
				life2.setLocation(110, 640);
				backgroundPic.add(life2);
				life3.setSize(95, 95);
				life3.setLocation(210, 640);
				life3.setVisible(false);
			}
			if (startUp.LifesRemaining == 1) {
				life1.setSize(95, 95);
				life1.setLocation(10, 640);
				backgroundPic.add(life1);
				life2.setSize(95, 95);
				life2.setLocation(110, 640);
				life2.setVisible(false);
				life3.setSize(95, 95);
				life3.setLocation(210, 640);
				life3.setVisible(false);
			}
			if (startUp.LifesRemaining == 0) {
				life1.setVisible(false);

				displayLabel.setText("Level Failed");
				btnBack.setVisible(true);
				if(startUp.Score <= 0 ) { startUp.Score = 0; }
				ScoreLabel.setText("You Scored :" + startUp.Score);
				startUp.KeysInputCount = 0;
				VarCheck.levelspassed = 0;
				startUp.LifesRemaining = 3;
				startUp.Score = 0;
			}
			gameFrame.repaint();

		}
	}

	@Override
	public void run() {

		timer.scheduleAtFixedRate(new TimerTask() {
			int i = 5;

			public void run() {
				ltime.setText("Time Remaining: " + i--);
				gameFrame.repaint();
				if (i < 0) {
					startUp.LifesRemaining=3;
					startUp.Score = 0;
					timer.cancel();
					acceptInput = false;
					displayLabel.setText("Level Failed");
					btnBack.setVisible(true);
				}
			}
		}, 0, 1000);

	}

}
