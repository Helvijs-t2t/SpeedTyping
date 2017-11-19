import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class startUp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1;
	
	PrintWriter writer= new PrintWriter("config.cfg", "UTF-8");
	JFrame Launcher = new JFrame();
	Font labelFont = (new Font("arial", 5, 25));
	Font ButtonFont = (new Font("arial", 15, 35));
	Font welcomeFont = (new Font("arial", 5, 65));
	JButton start;
	JLabel user, welcome, password, message;
	JTextField userID, userPW;
	JCheckBox saveMe;
	public static void main(String[] args) throws IOException {
		new startUp();

	}

	public startUp() throws IOException {

		JLabel background = new JLabel(
				new ImageIcon("Launcher_BG\\Launcher_BG.jpg"));

		Launcher.setSize(900, 600);
		Launcher.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Launcher.setTitle("Test\u2122");
		Launcher.setLocationRelativeTo(null);
		Launcher.setResizable(false);
		Launcher.setLayout(new BorderLayout());
		Launcher.add(background);

		user = new JLabel("User ID");
		user.setSize(120, 40);
		user.setLocation(80, 200);
		user.setFont(labelFont);
		user.setForeground(Color.white);
		background.add(user);

		userID = new JTextField();
		userID.setSize(180, 40);
		userID.setLocation(205, 200);
		userID.setFont(labelFont);
		userID.setForeground(Color.white);
		userID.setOpaque(false);
		background.add(userID);

		password = new JLabel("Password");
		password.setSize(120, 40);
		password.setLocation(80, 280);
		password.setFont(labelFont);
		password.setForeground(Color.white);
		background.add(password);

		userPW = new JTextField();
		userPW.setSize(180, 40);
		userPW.setLocation(205, 280);
		userPW.setFont(labelFont);
		userPW.setForeground(Color.white);
		userPW.setOpaque(false);
		background.add(userPW);
		
		saveMe = new JCheckBox("Save Credentials");
		saveMe.setSize(300,80);
		saveMe.setLocation(80,380);
		saveMe.setFocusPainted(false);
		saveMe.setForeground(Color.WHITE.brighter());
		saveMe.setOpaque(false);
		saveMe.setContentAreaFilled(false);
		saveMe.setFont(labelFont);
		background.add(saveMe);

		welcome = new JLabel("Speed typing Alpha");
		welcome.setSize(600, 70);
		welcome.setLocation(150, 5);
		welcome.setFont(welcomeFont);
		welcome.setForeground(Color.green.brighter());
		background.add(welcome);

		start = new JButton("Login");
		start.setSize(200, 40);
		start.setLocation(300, 450);
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		start.setFont(ButtonFont);
		start.addActionListener(this);
		start.setFocusPainted(false);
		start.setForeground(Color.WHITE.brighter());
		background.add(start);

		message = new JLabel("");
		message.setSize(520, 40);
		message.setLocation(200, 500);
		message.setFont(labelFont);
		message.setForeground(Color.RED.darker());
		background.add(message);

		
		Launcher.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== start) {
		String UID = userID.getText();
		String UPW = userPW.getText();
			if (UID.length()==0) {
				message.setText("UserID must be specified!");
			}else if(UPW.length()==0) {
				message.setText("Password must be specified!");
			}else {

				writer.println("UID: " +UID);
				writer.println("UPW: "+ UPW);
				writer.close();

					Launcher.setVisible(false);
						new userProfile();
			}
		}
	}

}
