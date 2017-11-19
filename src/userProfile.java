import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class userProfile extends JFrame{
JFrame profile = new JFrame();

	Font btnFont = new Font("Arial",5,55);
	JButton Start;
	public userProfile() {
		JLabel profileBG=new JLabel(new ImageIcon("Launcher_BG\\profile_BG.jpg"));
		
		profile.setSize(1200, 800);
		profile.setLocationRelativeTo(null);
		profile.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		profile.setLayout(new BorderLayout());
		profile.add(profileBG);
		
		
		Start = new JButton("Start");
		Start.setSize(200,60);
		Start.setLocation(920,650);
		Start.setForeground(Color.BLACK.darker());
		Start.setFont(btnFont);
		Start.setFocusPainted(false);
		Start.setFocusable(false);
		Start.setBackground(Color.YELLOW.darker());
		profileBG.add(Start);
		
		profile.setVisible(true);
	}
}
