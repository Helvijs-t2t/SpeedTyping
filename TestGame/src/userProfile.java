import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class userProfile extends JFrame implements ActionListener{
JFrame profile = new JFrame();

JFileChooser chooser= new JFileChooser();

	Font btnFont = new Font("Arial",5,55);
	JButton Level1, Level2,Level3,Level4,Level5,Level6,Level7,Level8,Level9,Level10;
	public userProfile() {
		Border border = BorderFactory.createDashedBorder(Color.green,12, 1,1,true);
		Border border1 = BorderFactory.createDashedBorder(Color.red,12, 1,1,true);
		JLabel profileBG=new JLabel(new ImageIcon("Launcher_BG\\profile_BG.jpg"));
		
		profile.setSize(1180, 800);
		profile.setLocationRelativeTo(null);
		profile.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		profile.setLayout(new BorderLayout());
		profile.add(profileBG);
		
		Level1 = new JButton("1");
		Level1.setSize(180,180);
		Level1.setLocation(70,50);
		Level1.setForeground(Color.BLACK.darker());
		Level1.setFont(new Font("Arial",5,55));
		Level1.setFocusable(false);
		Level1.setBorder(border);
		Level1.setContentAreaFilled(false);
		Level1.addActionListener(this);
		profileBG.add(Level1);
		
		Level2 = new JButton("2");
		Level2.setSize(180,180);
		Level2.setLocation(270,50);
		Level2.setForeground(Color.BLACK.darker());
		Level2.setBorder(border1);
		Level2.setFocusable(false);
		Level2.setContentAreaFilled(false);
		Level2.setFont(new Font("Arial",5,55));
		Level2.addActionListener(this);
		profileBG.add(Level2);
		
		Level3 = new JButton("3");
		Level3.setSize(180,180);
		Level3.setLocation(470,50);
		Level3.setForeground(Color.BLACK.darker());
		Level3.setFont(new Font("Arial",5,55));
		Level3.setFocusable(false);
		Level3.setBorder(border1);
		Level3.setContentAreaFilled(false);
		Level3.addActionListener(this);
		profileBG.add(Level3);
		
		Level4 = new JButton("4");
		Level4.setSize(180,180);
		Level4.setLocation(670,50);
		Level4.setForeground(Color.BLACK.darker());
		Level4.setFont(new Font("Arial",5,55));
		Level4.setFocusable(false);
		Level4.setBorder(border1);
		Level4.setContentAreaFilled(false);
		Level4.addActionListener(this);
		profileBG.add(Level4);
		
		Level5 = new JButton("5");
		Level5.setSize(180,180);
		Level5.setLocation(870,50);
		Level5.setForeground(Color.BLACK.darker());
		Level5.setFont(new Font("Arial",5,55));
		Level5.setFocusable(false);
		Level5.setBorder(border1);
		Level5.setContentAreaFilled(false);
		Level5.addActionListener(this);
		profileBG.add(Level5);
		
		Level6 = new JButton("6");
		Level6.setSize(180,180);
		Level6.setLocation(70,300);
		Level6.setForeground(Color.BLACK.darker());
		Level6.setFont(new Font("Arial",5,55));
		Level6.setFocusable(false);
		Level6.setBorder(border1);
		Level6.setContentAreaFilled(false);
		Level6.addActionListener(this);
		profileBG.add(Level6);
		
		Level7 = new JButton("7");
		Level7.setSize(180,180);
		Level7.setLocation(270,300);
		Level7.setForeground(Color.BLACK.darker());
		Level7.setFont(new Font("Arial",5,55));
		Level7.setFocusable(false);
		Level7.setBorder(border1);
		Level7.setContentAreaFilled(false);
		Level7.addActionListener(this);
		profileBG.add(Level7);
		
		Level8 = new JButton("8");
		Level8.setSize(180,180);
		Level8.setLocation(470,300);
		Level8.setForeground(Color.BLACK.darker());
		Level8.setFont(new Font("Arial",5,55));
		Level8.setFocusable(false);
		Level8.setBorder(border1);
		Level8.setContentAreaFilled(false);
		Level8.addActionListener(this);
		profileBG.add(Level8);
		
		Level9 = new JButton("9");
		Level9.setSize(180,180);
		Level9.setLocation(670,300);
		Level9.setForeground(Color.BLACK.darker());
		Level9.setFont(new Font("Arial",5,55));
		Level9.setFocusable(false);
		Level9.setBorder(border1);
		Level9.setContentAreaFilled(false);
		Level9.addActionListener(this);
		profileBG.add(Level9);
		
		Level10 = new JButton("10");
		Level10.setSize(180,180);
		Level10.setLocation(870,300);
		Level10.setForeground(Color.BLACK.darker());
		Level10.setFont(new Font("Arial",5,55));
		Level10.setFocusable(false);
		Level10.setBorder(border1);
		Level10.setContentAreaFilled(false);
		Level10.addActionListener(this);
		profileBG.add(Level10);
		
		profile.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Level2) {
			System.out.println("clicked on 2");
		}
		if(e.getSource()==Level1) {
			System.out.println("clicked on 1");
		}
	}
}
