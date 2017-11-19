import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class userProfile extends JFrame{
JFrame profile = new JFrame();
	
	public userProfile() {
		JLabel profileBG=new JLabel(new ImageIcon("C:\\Users\\Helvijs\\eclipse-workspace\\TestGame\\Launcher_BG\\profile_BG.jpg"));
		
		profile.setSize(1200, 800);
		profile.setLocationRelativeTo(null);
		profile.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		profile.add(profileBG);
		
		profile.setVisible(true);
	}
}
