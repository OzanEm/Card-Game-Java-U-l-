package proje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main {

	private JFrame frame;
	public CardGame game;
	public Action action = new Action();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Three");
		frame.setBounds(100, 100, 633, 528);
	
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton Start = new JButton("Start The Game");
		Start.setBackground(Color.white);
		Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start();
			}
		});
		Start.setBounds(247, 112, 123, 57);
		panel_1.add(Start);
		
		JButton How = new JButton("How To Play");
		How.setBackground(Color.white);
		How.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HowToPlay learn = new HowToPlay();
				learn.map();
			}
		});
		How.setBounds(247, 195, 123, 57);
		panel_1.add(How);
		
		JButton Exit = new JButton("Exit");
		Exit.setBackground(Color.white);
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		Exit.setBounds(247, 278, 123, 57);
		panel_1.add(Exit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/images/MainMenu.png")));
		lblNewLabel.setBounds(0, -28, 634, 538);
		panel_1.add(lblNewLabel);
		
		
	}

	
	////////////////////
	///////////////////
	
	public void Start() {
		game = new CardGame();
		action.Initialize(game);
		frame.setVisible(false);
		}
}
