import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class userProfile extends JFrame implements ActionListener{
JFrame profile = new JFrame();

JFileChooser chooser= new JFileChooser();

	Font btnFont = new Font("Arial",5,55);
	JButton Start, browse;
	public userProfile() {
		JLabel profileBG=new JLabel(new ImageIcon("Launcher_BG\\profile_BG.jpg"));
		
		profile.setSize(1200, 800);
		profile.setLocationRelativeTo(null);
		profile.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		profile.setLayout(new BorderLayout());
		profile.add(profileBG);
		
		browse = new JButton("Browse");
		browse.setSize(140,40);
		browse.setLocation(80,400);
		browse.setFocusable(false);
		browse.setContentAreaFilled(false);
		browse.setFont(new Font("Arial",5,25));
		browse.addActionListener(this);
		profileBG.add(browse);
		
		Start = new JButton("Start");
		Start.setSize(200,60);
		Start.setLocation(920,650);
		Start.setForeground(Color.BLACK.darker());
		Start.setFont(new Font("Arial",5,55));
		Start.setFocusPainted(false);
		Start.setFocusable(false);
		Start.setBackground(Color.YELLOW.darker());
		profileBG.add(Start);
		
		profile.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==browse) {
			int choice =chooser.showOpenDialog(browse);

			if (choice != JFileChooser.APPROVE_OPTION) return;

			File chosenFile = chooser.getSelectedFile();
		}
		
	}
}
