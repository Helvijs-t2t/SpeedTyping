import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class level1 extends JFrame implements ActionListener,KeyListener{

	private static final long serialVersionUID = 1L;

JFrame profile = new JFrame();
Border border = BorderFactory.createDashedBorder(Color.green,12, 1,1,true);
Border border1 = BorderFactory.createDashedBorder(Color.red,12, 1,1,true);

	Font btnFont = new Font("Arial",5,55);
	static JButton Level1,Level2,Level3,Level4,Level5,Level6,Level7,Level8,Level9,Level10;
	public level1() {
		
		JLabel profileBG=new JLabel(new ImageIcon("Launcher_BG\\profile_BG.jpg"));
		
		profile.addKeyListener(this);
		
		profile.setSize(1180, 800);
		profile.setLocationRelativeTo(null);
		profile.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		profile.setLayout(new BorderLayout());
		profile.add(profileBG);
		
		Level1 = new JButton("1");
		Level1.setSize(180,180);
		Level1.setLocation(70,80);
		Level1.setForeground(Color.BLACK.darker());
		Level1.setFont(new Font("Arial",5,55));
		Level1.setFocusable(false);
		Level1.setBorder(border);
		Level1.setContentAreaFilled(false);
		Level1.addActionListener(this);
		profileBG.add(Level1);
		
		Level2 = new JButton("2");
		Level2.setSize(180,180);
		Level2.setLocation(270,80);
		Level2.setForeground(Color.BLACK.darker());
		Level2.setBorder(border1);
		Level2.setFocusable(false);
		Level2.setContentAreaFilled(false);
		Level2.setFont(new Font("Arial",5,55));
		Level2.addActionListener(this);
		profileBG.add(Level2);
		
		Level3 = new JButton("3");
		Level3.setSize(180,180);
		Level3.setLocation(470,80);
		Level3.setForeground(Color.BLACK.darker());
		Level3.setFont(new Font("Arial",5,55));
		Level3.setFocusable(false);
		Level3.setBorder(border1);
		Level3.setContentAreaFilled(false);
		Level3.addActionListener(this);
		profileBG.add(Level3);
		
		Level4 = new JButton("4");
		Level4.setSize(180,180);
		Level4.setLocation(670,80);
		Level4.setForeground(Color.BLACK.darker());
		Level4.setFont(new Font("Arial",5,55));
		Level4.setFocusable(false);
		Level4.setBorder(border1);
		Level4.setContentAreaFilled(false);
		Level4.addActionListener(this);
		profileBG.add(Level4);
		
		Level5 = new JButton("5");
		Level5.setSize(180,180);
		Level5.setLocation(870,80);
		Level5.setForeground(Color.BLACK.darker());
		Level5.setFont(new Font("Arial",5,55));
		Level5.setFocusable(false);
		Level5.setBorder(border1);
		Level5.setContentAreaFilled(false);
		Level5.addActionListener(this);
		profileBG.add(Level5);
		
		Level6 = new JButton("6");
		Level6.setSize(180,180);
		Level6.setLocation(70,330);
		Level6.setForeground(Color.BLACK.darker());
		Level6.setFont(new Font("Arial",5,55));
		Level6.setFocusable(false);
		Level6.setBorder(border1);
		Level6.setContentAreaFilled(false);
		Level6.addActionListener(this);
		profileBG.add(Level6);
		
		Level7 = new JButton("7");
		Level7.setSize(180,180);
		Level7.setLocation(270,330);
		Level7.setForeground(Color.BLACK.darker());
		Level7.setFont(new Font("Arial",5,55));
		Level7.setFocusable(false);
		Level7.setBorder(border1);
		Level7.setContentAreaFilled(false);
		Level7.addActionListener(this);
		profileBG.add(Level7);
		
		Level8 = new JButton("8");
		Level8.setSize(180,180);
		Level8.setLocation(470,330);
		Level8.setForeground(Color.BLACK.darker());
		Level8.setFont(new Font("Arial",5,55));
		Level8.setFocusable(false);
		Level8.setBorder(border1);
		Level8.setContentAreaFilled(false);
		Level8.addActionListener(this);
		profileBG.add(Level8);
		
		Level9 = new JButton("9");
		Level9.setSize(180,180);
		Level9.setLocation(670,330);
		Level9.setForeground(Color.BLACK.darker());
		Level9.setFont(new Font("Arial",5,55));
		Level9.setFocusable(false);
		Level9.setBorder(border1);
		Level9.setContentAreaFilled(false);
		Level9.addActionListener(this);
		profileBG.add(Level9);
		
		Level10 = new JButton("10");
		Level10.setSize(180,180);
		Level10.setLocation(870,330);
		Level10.setForeground(Color.BLACK.darker());
		Level10.setFont(new Font("Arial",5,55));
		Level10.setFocusable(false);
		Level10.setBorder(border1);
		Level10.setContentAreaFilled(false);
		Level10.addActionListener(this);
		profileBG.add(Level10);
		
		VarCheck.checklevels();
		profile.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Level2 && (VarCheck.levelspassed >0)) {
			profile.setVisible(false);
			 new level2();
		}
		if(e.getSource()==Level1 && (VarCheck.levelspassed >=0)) {
			profile.setVisible(false);
			 new StartGame();
		}
		
		if(e.getSource()==Level3 && (VarCheck.levelspassed >1)) {
			profile.setVisible(false);
			 new level3();
		}
		if(e.getSource()==Level4 && (VarCheck.levelspassed >2)) {
			profile.setVisible(false);
			 new level4();
		}
		if(e.getSource()==Level5 && (VarCheck.levelspassed >3)) {
			profile.setVisible(false);
			 new level5();
		}
		if(e.getSource()==Level6 && (VarCheck.levelspassed >4)) {
			profile.setVisible(false);
			 new level6();
		}
		if(e.getSource()==Level7 && (VarCheck.levelspassed >5)) {
			profile.setVisible(false);
			 new level7();
		}
		if(e.getSource()==Level8 && (VarCheck.levelspassed >6)) {
			profile.setVisible(false);
			 new level8();
		}
		if(e.getSource()==Level9 && (VarCheck.levelspassed >7)) {
			profile.setVisible(false);
			 new level9();
		}
		if(e.getSource()==Level10 && (VarCheck.levelspassed >8)) {
			profile.setVisible(false);
			 new level10();
		}

	}
	@Override
	public void keyPressed(KeyEvent ke) {
		
		if(ke.getKeyCode()== KeyEvent.VK_ESCAPE ) {
			profile.setVisible(false);
			try {
				new startUp();
			} catch (IOException e) {
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}
}
