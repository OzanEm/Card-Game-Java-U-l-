package proje;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;



public class CardGame {

	ArrayList<String> holder = new ArrayList<String>();
	West james ;
	North Mark;
	East Amelia;
	
	Cards code = new Cards();
	Images card = new Images();
	private JFrame frame;
	public JButton Right = new JButton("Right");
	public JButton Left = new JButton("Left");
	public JButton Middle = new JButton("Middle");
	
	String ground ;
	String CodeLeft;
	String CodeRight;
	String CodeMiddle;
	
	String koz = "S2";
	
	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("");
	JLabel label3 = new JLabel("");
	JLabel label4 = new JLabel("");
	
	
	String first;
	String second;
	String third;
	String fourth;
	
	int JavaSwin = 0;
	
	int firs;
	int secon;
	int thir;
	int fourt;
	
	int check =0;
	
	Icon Prep;
	
	int EndingGame = 0;
	
	boolean click = true;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardGame window = new CardGame();
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
	public CardGame() {
		
		if (this instanceof West || this instanceof East || this instanceof North) {
			
		}else {
		
		initialize();
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		JOptionPane.showMessageDialog(null, "Spades is Trump Card");
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		panel.setPreferredSize(new Dimension(frame.getHeight(),frame.getWidth()));
		
		JPanel North = new JPanel();
		North.setBackground(Color.GREEN);
		North.setPreferredSize(new Dimension(140, 100));
		panel.add(North, BorderLayout.NORTH);
		
		JPanel South = new JPanel();
		South.setBackground(Color.BLUE);
		South.setPreferredSize(new Dimension(140, 300));
		panel.add(South, BorderLayout.SOUTH);
		South.setLayout(null);
		
		

		Right.setBounds(741, 34, 171, 240);
		Right.setOpaque(false);
		Right.setContentAreaFilled(false);
		Right.setBorderPainted(false);
		Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rightx();
			}
		});
		South.add(Right);
		

		Middle.setBounds(541, 34, 171, 240);
		Middle.setOpaque(false);
		Middle.setContentAreaFilled(false);
		Middle.setBorderPainted(false);
		Middle.setIcon(new ImageIcon(CardGame.class.getResource(card.Represents("S10"))));
		Middle.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Middlex();
			}

			
		});
		South.add(Middle);
		


		Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Leftx();
			}
		});
		Left.setBounds(326, 34, 170, 246);
		Left.setOpaque(false);
		Left.setContentAreaFilled(false);
		Left.setBorderPainted(false);
	
		
		South.add(Left);
		
		JPanel West = new JPanel();
		West.setBackground(Color.RED);
		West.setPreferredSize(new Dimension(140, 200));
		panel.add(West, BorderLayout.WEST);
		
		JPanel East = new JPanel();
		East.setBackground(Color.ORANGE);
		East.setPreferredSize(new Dimension(140, 200));
		panel.add(East, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		

		label1.setBounds(294, 214, 170, 246);
		label1.setForeground(Color.BLACK);
		//label1.setIcon(new ImageIcon (CardGame.class.getResource(card.Represents("HA"))));
		panel_1.add(label1);
		

		label2.setBounds(476, 214, 170, 246);
		//label2.setIcon(new ImageIcon (CardGame.class.getResource(card.Represents("H6"))));
		panel_1.add(label2);
		

		label3.setBounds(545, 214, 170, 246);
		//label3.setIcon(new ImageIcon (CardGame.class.getResource(card.Represents("H10"))));
		panel_1.add(label3);
		

		label4.setBounds(613, 214, 170, 246);
		//label4.setIcon(new ImageIcon (CardGame.class.getResource(card.Represents("H9"))));
		panel_1.add(label4);
	}
	public void Rightx() {
		if(click == true) {
		ground = CodeRight;
		check += 1; 
		first = CodeRight;
		Prep = Right.getIcon();
		Update sleepy = new Update();
		sleepy.execute();

		Right.setVisible(false);
		click = false;
	
		}
	}
	public void Middlex() {
		if(click == true) { 
		ground = CodeMiddle;
		check += 1;
		first = CodeRight;    
		Prep = Middle.getIcon();
		Update sleepy = new Update();
		sleepy.execute();
		Middle.setVisible(false);
		click = false;
	
		}

		
		


		}
		
	
	public void Leftx() {
		if(click == true) {
		first = CodeLeft;
		check += 1;
		ground =  CodeLeft;
		Prep = Left.getIcon();
		Update sleepy = new Update();
		sleepy.execute();
		Left.setVisible(false);
		click = false;

}

}
		
		
		


	
	
	public void JamesMove() {
		james.ground  = ground;
		james.Move();
	}
	public void MarkMove() {
		Mark.ground = ground;
		Mark.Move();
	}
	public void AmeliaMove() {
		Amelia.ground = ground;
		Amelia.Move();
	}


	public void Refresh( ) {
		
		
		CodeMiddle = code.Card();
		CodeRight = code.Card();
		CodeLeft = code.Card();
		
		
		Right.setIcon(new ImageIcon(CardGame.class.getResource(card.Represents(CodeRight))));
		Middle.setIcon(new ImageIcon(CardGame.class.getResource(card.Represents(CodeMiddle))));
		Left.setIcon(new ImageIcon(CardGame.class.getResource(card.Represents(CodeLeft))));

	
		james = new West(this);
		Mark = new North(this);
		Amelia = new East(this);
		
		james.Hand(code.Card(), code.Card(), code.Card());
		Mark.Hand(code.Card(), code.Card(), code.Card());
		Amelia.Hand(code.Card(), code.Card(), code.Card());
		
		

		
	}
	public void Again() {
		
		if(EndingGame == 2) {
			EndGame();
		}
		
		CodeMiddle = code.Card();
		CodeRight = code.Card();
		CodeLeft = code.Card();
		
		Right.setVisible(true);
		Middle.setVisible(true);
		Left.setVisible(true);
		
		Right.setIcon(new ImageIcon(CardGame.class.getResource(card.Represents(CodeRight))));
		Middle.setIcon(new ImageIcon(CardGame.class.getResource(card.Represents(CodeMiddle))));
		Left.setIcon(new ImageIcon(CardGame.class.getResource(card.Represents(CodeLeft))));
		
		james.Hand(code.Card(), code.Card(), code.Card());
		Mark.Hand(code.Card(), code.Card(), code.Card());
		Amelia.Hand(code.Card(), code.Card(), code.Card());
		
		james.See();
		Mark.See();
		Amelia.See();
		
		EndingGame += 1;

		
	}
	public void Turn() {
		label1.setIcon(null);
		label2.setIcon(null);
		label3.setIcon(null);
		label4.setIcon(null);
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click= true;
		if(Left.isVisible() == false && Right.isVisible() == false && Middle.isVisible() == false) {
			Again();
		}
		
	}
	public void Calculate () {
		
		int x1,x2,x3,x4,temp;
		
		second = james.GetChoice();
		third = Mark.GetChoice();
		fourth = Amelia.GetChoice();
		
		x1 = Value(first);
		x2 = Value(second);
		x3 = Value(third);
		x4 = Value(fourth);
		
		int[] array = {x1, x2, x3, x4};
		for(int i=0; i<array.length; i++) {
			for(int j=1; j<array.length;j++) {
				if(array[j-1] > array[j]) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				}
			}
			
		}
		
		if(array[3] == x1) {
			holder.add(first);
			holder.add(second);
			holder.add(third);
			holder.add(fourth);
		}
		if(array[3] == x2) {
			james.holder.add(first);
			james.holder.add(second);
			james.holder.add(third);
			james.holder.add(fourth);
		}
		if(array[3] == x3) {
			Mark.holder.add(first);
			Mark.holder.add(second);
			Mark.holder.add(third);
			Mark.holder.add(fourth);
		}
		if(array[3] == x4) {
			Amelia.holder.add(first);
			Amelia.holder.add(second);
			Amelia.holder.add(third);
			Amelia.holder.add(fourth);
		}
		
		
	}
	public int Value(String arg) {
		
		int holdert;
		
		char hold0 = arg.charAt(1);
		String holder0 = Character.toString(hold0); 
		
		char hold = arg.charAt(0);
		String holder = Character.toString(hold); 
		
		char hold1 = koz.charAt(0);
		String holder1 = Character.toString(hold1); 
		
		char hold2 = ground.charAt(0);
		String holder2 = Character.toString(hold2); 
		
		holdert = james.think.values.get(holder0);
		
		if(holder == holder1) {
			holdert = holdert + 100;
		}
		if(holder == holder2) {
			holdert = holdert + 40;
		}
			
		
		return holdert;
	
	}
	public void EndGame() {
		int pl, jm, mk ,aml;
		pl = Hands(this.holder);
		jm = Hands(james.holder);
		mk = Hands(Mark.holder);
		aml = Hands(Amelia.holder);
		
		if(pl > jm && pl > mk && pl > aml) {
			JOptionPane.showMessageDialog(null, "You Win");
		}else {
			JOptionPane.showMessageDialog(null, "You Lose");
		}
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.dispose();
		
		
		
	}
	public int Hands(ArrayList<String> arg)  {
		
		int total = 0;
		
		HashMap<String , Integer> values = new HashMap<String, Integer>();
		values.put("4",0);
		values.put("5",0);
		values.put("6",0);
		values.put("7",0);
		values.put("8",0);
		values.put("9",0);
		values.put("1",0);
		values.put("2",10);
		values.put("A" ,11);
		values.put("V",2);
		values.put("Q", 3);
		values.put("K",4);

		char as;
		String ma;
		
		for(int i=0; i<arg.size(); i++) {
			as = arg.get(i).charAt(1);
			ma = Character.toString(as);	
			total = total + values.get(ma);
			
			
		}
		return total;
	}
	
	public class Update extends SwingWorker<Void , String>{
		
		@Override
		public Void doInBackground() throws Exception {
			publish("player");
			Thread.sleep(2000L);
			publish("james");
			Thread.sleep(2000L);
			publish("Mark");
			Thread.sleep(2000L);
			publish("Amelia");
			Thread.sleep(2000L);
			publish("Turn");
			return null;
		}

		@Override
		protected void process(List<String> chunks) {
			
			if(chunks.get(0).equals("player")) {
				label1.setIcon(Prep);
			}
			if(chunks.get(0).equals("james")) {
				JamesMove();
			}
			if(chunks.get(0).equals("Mark")) {
				MarkMove();
			}
			if(chunks.get(0).equals("Amelia")) {
				AmeliaMove();
			}
			if(chunks.get(0).equals("Turn")) {
				Calculate();
				Turn();
			}

		}

		@Override
		protected void done() {
			super.done();
		}
		
		
	}
}


