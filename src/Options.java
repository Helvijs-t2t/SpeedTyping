import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Options extends JFrame implements ActionListener,KeyListener, ItemListener {
	private static final long serialVersionUID = 1L;

	
	JFrame options = new JFrame();
	Font labelFont = (new Font("arial", 5, 35));
	Font ChoiceFont = (new Font("arial", 5, 20));
	Font ButtonFont = (new Font("arial", 15, 35));
	Font welcomeFont = (new Font("arial", 5, 65));
	JButton back,save;
	Choice difficultyc;
	JLabel Dificulty, limitedMistakes, textArea1;
	JTextField userID, userPW;
	public FileWriter file; 
	 
	public Options() throws FileNotFoundException, UnsupportedEncodingException {
		try {
		 file = new FileWriter("config.txt",false);
		} catch (IOException e) {
		}

		JLabel background = new JLabel(
				new ImageIcon("Launcher_BG\\Launcher_BG.jpg"));

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
		textArea1.setLocation(400,20);
		textArea1.setSize(400,400);
		textArea1.setFont(labelFont);
		textArea1.setVerticalAlignment(JLabel.TOP);
		textArea1.setHorizontalAlignment(JLabel.RIGHT);
		textArea1.setForeground(Color.CYAN.darker());
		textArea1.setText("<html>Beginner dificulty - you will have unlimited time and unlimited mistakes for all levels.</html>");
		background.add(textArea1);
		
		difficultyc = new Choice();
		difficultyc.add("Beginner");
		difficultyc.add("Advanced");
		difficultyc.add("Expert");
		difficultyc.setSize(150,30);
		difficultyc.setLocation(200,47);
		difficultyc.setFocusable(false);
		difficultyc.addItemListener(this);
		difficultyc.setFont(ChoiceFont);
		difficultyc.select("Beginner");
		background.add(difficultyc);
		
		Dificulty = new JLabel("Difficulty");
		Dificulty.setSize(150,40);
		Dificulty.setLocation(40,40);
		Dificulty.setForeground(Color.YELLOW.darker());
		Dificulty.setFont(labelFont);
		background.add(Dificulty);
		
		
		save = new JButton("Save");
		save.setSize(200,40);
		save.setLocation(610,520);
		save.setOpaque(false);
		save.setFocusPainted(false);
		save.setForeground(Color.GREEN.darker());
		save.setFont(new Font("Arial",3,35));
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
		back.setFont(new Font("Arial",3,35));
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
		
		if (ev.getSource()==save) {
			try {
				savechanges();
			} catch (IOException e) {

			}
			goback();
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

	public void savechanges() throws IOException {
		file.write("Difficulty level: "+startUp.Dificulty);
		file.flush();
		file.close();
	}


	@Override
	public void itemStateChanged(ItemEvent ItemEvent) {
		if(ItemEvent.getItem()=="Advanced") {
			textArea1.setText("<html>Advanced Difficulty - You will have to finish game with less than 3 mistakes in each level."
					+ " Every level finished will give you back one life if you have less than three of them.</html>");
			startUp.Dificulty = 2;
		}
		if(ItemEvent.getItem()=="Beginner") {
			textArea1.setText("<html>Beginner difficulty - you will have unlimited time and unlimited mistakes for all levels.</html>");
			startUp.Dificulty = 1;
		}
		if(ItemEvent.getItem()=="Expert") {
			textArea1.setText("<html>Experts have only one life thorough the whole game and limited time for each level.</html>");
			startUp.Dificulty = 3;
		}
		
		
	}
}
