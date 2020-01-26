package proje;

import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

public class West extends CardGame implements Basics{
	String left;
	String middle;
	String right;
	
	int MakeMe = 0;
	int NoMiddle;
	int done=0;
	public CardGame sef;
	public AI think = new AI();
	
	String Choice;
	
	public void Hand(String left, String middle, String right) {
		
		this.left = left;
		this.middle = middle;
		this.right = right;

		
	}
	public West(CardGame arg) {
		sef = arg;
	}
	
	public String[] Cards() {
		String[] dummy = {left, middle , right};
		return dummy;
	}

	public void Move() {
		think.Inital(ground, koz);
		
		if(left == null ) {
			
		MakeMe += 1;	
		}
		if(middle == null ) {
			
		MakeMe += 1;
			
		}
		if(right == null ) {
		
		MakeMe += 1;
		
		}
	
		if(MakeMe == 0) {
		String choice = think.Move(left, middle, right );
		if (choice == "right") {
			sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
			Choice = right;
			right = null;
		
		}
		if (choice == "middle") {
			sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
			Choice = middle;
			middle = null;
		}
		if (choice == "left") {
			sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
			Choice = left;
			left = null;
		}
		
		}
		if(MakeMe == 1) {
			if(left == null && done != 1) {
				String choice = think.Move2(middle, right);
				if(choice == "left") {
					sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
					Choice = middle;
					middle = null;
					done =1;
				}
				if(choice == "right") {
					sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
					Choice = right;
					right = null;
					done =1;
				}
			}
			if(middle == null && done != 1) {
				String choice = think.Move2(left, right);
				if(choice == "left") {
					sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
					Choice = left;
					left = null;
					done =1;
				}
				if(choice == "right" ) {
					sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
					Choice = right;
					right = null;
					done =1;
				}
			}
			if(right == null && done !=1) {
				String choice = think.Move2(left, middle);
				if(choice == "left") {
					sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
					Choice = left;
					left = null;
					done =1;
				}
				if(choice == "right") {
					sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
					Choice = middle;
					middle = null;
					done =1;
				}
			}
			
		}
		if(MakeMe == 3) {
			if(right != null) {
				sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
				Choice = right;
				right = null;
			}
			if(middle != null) {
				sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
				Choice = middle;
				middle = null;
			}
			if(left != null) {
				sef.label2.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
				Choice = left;
				left = null;

			}
		}
	}
	public static void main(String [] args) {
	
		
	}
	public void Wait() {
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void See() {
		System.out.println("PC left:"+left+" PC middle:"+middle+" PC rig"+right);
		
	}
	public String GetChoice() {
		return Choice;
	}
	
	
}
