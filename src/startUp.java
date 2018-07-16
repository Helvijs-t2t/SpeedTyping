import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class startUp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1;

	JFrame Launcher = new JFrame();
	Font labelFont = (new Font("arial", 5, 25));
	Font ButtonFont = (new Font("arial", 15, 35));
	Font welcomeFont = (new Font("arial", 5, 65));
	JButton start, options, quit, h;
	JLabel user, welcome, password, message;
	JTextField userID, userPW;
	public static int Dificulty = 1;
	public static int LifesRemaining = 3;
	public static int KeysInputCount = 0;
	public static boolean isLevelFinished = false;
	public static void main(String[] args)  {
		try {
			new startUp();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public startUp() throws IOException {
		Border border = BorderFactory.createDashedBorder(Color.YELLOW, 12, 22, 3, false);
		JLabel background = new JLabel(new ImageIcon(getClass().getResource("Launcher_BG.jpg")));

		Launcher.setSize(820, 600);
		Launcher.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Launcher.setTitle("Speed Typing\u2122");
		Launcher.setLocationRelativeTo(null);
		Launcher.setResizable(false);
		Launcher.setLayout(new BorderLayout());
		Launcher.setContentPane(background);

		password = new JLabel();
		password.setSize(300, 350);
		password.setLocation(250, 100);
		password.setFont(labelFont);
		password.setBorder(border);
		password.setForeground(Color.white);
		Launcher.add(password);

		welcome = new JLabel("Speed typing Alpha");
		welcome.setSize(600, 70);
		welcome.setLocation(150, 5);
		welcome.setFont(welcomeFont);
		welcome.setForeground(Color.green.brighter());
		Launcher.add(welcome);

		start = new JButton("Start");
		start.setSize(200, 40);
		start.setLocation(300, 150);
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		start.setFont(ButtonFont);
		start.addActionListener(this);
		start.setFocusPainted(false);
		start.setForeground(Color.WHITE.brighter());
		Launcher.add(start);

		options = new JButton("Options");
		options.setSize(200, 40);
		options.setLocation(300, 250);
		options.setOpaque(false);
		options.setContentAreaFilled(false);
		options.setFont(ButtonFont);
		options.addActionListener(this);
		options.setFocusPainted(false);
		options.setForeground(Color.WHITE.brighter());
		Launcher.add(options);

		quit = new JButton("Quit");
		quit.setSize(200, 40);
		quit.setLocation(300, 350);
		quit.setOpaque(false);
		quit.setContentAreaFilled(false);
		quit.setFont(ButtonFont);
		quit.addActionListener(this);
		quit.setFocusPainted(false);
		quit.setForeground(Color.WHITE.brighter());
		Launcher.add(quit);

		h = new JButton("");
		h.setSize(200, 40);
		h.setLocation(300, 350);
		h.setOpaque(false);
		h.setContentAreaFilled(false);
		h.setFont(ButtonFont);
		h.addActionListener(this);
		h.setEnabled(false);
		h.setFocusPainted(false);
		h.setForeground(Color.WHITE.brighter());
		Launcher.add(h);

		Launcher.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			Launcher.setVisible(false);
			new levelCheck();
		}
		if (e.getSource() == quit) {
			System.exit(0);
		}

		if (e.getSource() == options) {
			
				Launcher.setVisible(false);
				new Options();
		
		}
	}

}
