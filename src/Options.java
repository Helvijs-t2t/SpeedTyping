import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Options extends JFrame implements ActionListener,KeyListener {
	private static final long serialVersionUID = 1L;

	
	JFrame options = new JFrame();
	Font labelFont = (new Font("arial", 5, 35));
	Font ChoiceFont = (new Font("arial", 5, 20));
	Font ButtonFont = (new Font("arial", 15, 35));
	Font welcomeFont = (new Font("arial", 5, 65));
	JButton back,save,Controls,easy,medium,hard;
	Choice difficultyc;
	JLabel Dificulty, textArea1;
	JTextField userID, userPW;
	public FileWriter file; 
	 
	public Options()  {

		Border border = BorderFactory.createDashedBorder(Color.YELLOW,4, 2,3,false);
		JLabel background = new JLabel(new ImageIcon(getClass().getResource("Launcher_BG.jpg")));

		options.setSize(820, 600);
		options.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		options.setTitle("Speed Typing\u2122");
		options.setLocationRelativeTo(null);
		options.setResizable(false);
		background.addKeyListener(this);
		options.addKeyListener(this);
		options.setLayout(new BorderLayout());
		options.add(background);
		
		textArea1 = new JLabel("",SwingConstants.CENTER);
		textArea1.setLocation(300,20);
		textArea1.setSize(500,450);
		textArea1.setFont(labelFont);
		textArea1.setVerticalAlignment(JLabel.CENTER);
		textArea1.setHorizontalAlignment(JLabel.CENTER);
		textArea1.setForeground(Color.CYAN.darker());
		textArea1.setBorder(border);
		textArea1.setText("<html> Chose dificulty and see the Key Bindings for more information.</html>");
		background.add(textArea1);
		
		
		Dificulty = new JLabel("Difficulty:");
		Dificulty.setSize(250,40);
		Dificulty.setLocation(60,70);
		Dificulty.setForeground(Color.yellow.darker());
		Dificulty.setFont(labelFont);
		background.add(Dificulty);
		
		Controls = new JButton("Key Bindings");
		Controls.setSize(250,40);
		Controls.setLocation(280,520);
		Controls.setForeground(Color.YELLOW.darker());
		Controls.addActionListener(this);
		Controls.setForeground(Color.YELLOW.darker());
		Controls.setContentAreaFilled(false);
		Controls.setOpaque(false);
		Controls.setFocusPainted(false);
		Controls.setFont(labelFont);
		background.add(Controls);
		
		easy = new JButton("Beginner");
		easy.setSize(200,40);
		easy.setLocation(40,150);
		easy.setOpaque(false);
		easy.setFocusPainted(false);
		easy.setForeground(Color.blue.brighter());
		easy.setFont(new Font("Arial",5,35));
		easy.setContentAreaFilled(false);
		easy.addActionListener(this);
		easy.setVisible(true);
		background.add(easy);
		
		medium = new JButton("Advanced");
		medium.setSize(200,40);
		medium.setLocation(40,250);
		medium.setOpaque(false);
		medium.setFocusPainted(false);
		medium.setForeground(Color.orange.darker());
		medium.setFont(new Font("Arial",5,35));
		medium.setContentAreaFilled(false);
		medium.addActionListener(this);
		medium.setVisible(true);
		background.add(medium);
		
		hard = new JButton("Expert");
		hard.setSize(200,40);
		hard.setLocation(40,350);
		hard.setOpaque(false);
		hard.setFocusPainted(false);
		hard.setForeground(Color.red.brighter());
		hard.setFont(new Font("Arial",5,35));
		hard.setContentAreaFilled(false);
		hard.addActionListener(this);
		hard.setVisible(true);
		background.add(hard);
		
		save = new JButton("Save");
		save.setSize(200,40);
		save.setLocation(610,520);
		save.setOpaque(false);
		save.setFocusPainted(false);
		save.setForeground(Color.GREEN.darker());
		save.setFont(new Font("Arial",5,35));
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
		back.setFont(new Font("Arial",5,35));
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
		
		if (ev.getSource()==Controls) {
			textArea1.setText("<html> 1.Esc button can be pressed at any time, to switch from one menu to another and leave any level . "
					+ "  2. If the player leaves level without completing it, any progress in the level won't be saved.  </html>");
		}
		
		if (ev.getSource()==save) {
			goback();
		}
		if (ev.getSource()==easy) {
			textArea1.setText("<html>Beginner  - Take as much time as you need to complete each level.</html>");
			startUp.Dificulty = 1;
		}
		if (ev.getSource()==medium) {
			textArea1.setText("<html>Advanced  - Game starts with an award of 3 lives. Each mistake takes one live away, "
					+ "each level finished adds one live back. Losing all 3 lives will erase the unlocked levels."
					+ " If player has 3 lives when level is completed, no extra lives will be awarded.</html>");
			startUp.Dificulty = 2;
		}
		if (ev.getSource()==hard) {
			textArea1.setText("<html>Experts have 3 lives for the whole game and limited time of 5 seconds for each level.</html>");
			startUp.Dificulty = 3;
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

