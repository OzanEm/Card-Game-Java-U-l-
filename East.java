package proje;

import javax.swing.ImageIcon;

public class East extends West implements Basics{

	public East(CardGame arg) {
		super(arg);

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
			sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
			Choice = right;
			right = null;
		
		}
		if (choice == "middle") {
			sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
			Choice = middle;
			middle = null;
		}
		if (choice == "left") {
			sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
			Choice = left;
			left = null;
		}
		
		}
		if(MakeMe == 1) {
			if(left == null && done != 1) {
				String choice = think.Move2(middle, right);
				if(choice == "left") {
					sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
					Choice = middle;
					middle = null;
					done =1;
				}
				if(choice == "right") {
					sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
					Choice = right;
					right = null;
					done =1;
				}
			}
			if(middle == null && done != 1) {
				String choice = think.Move2(left, right);
				if(choice == "left") {
					sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
					Choice = left;
					left = null;
					done =1;
				}
				if(choice == "right" ) {
					sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
					Choice = right;
					right = null;
					done =1;
				}
			}
			if(right == null && done !=1) {
				String choice = think.Move2(left, middle);
				if(choice == "left") {
					sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
					Choice = left;
					left = null;
					done =1;
				}
				if(choice == "right") {
					sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
					Choice = middle;
					middle = null;
					done =1;
				}
			}
			
		}
		if(MakeMe == 3) {
			if(right != null) {
				sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(right))));
				Choice = right;
				right = null;
			}
			if(middle != null) {
				sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(middle))));
				Choice = middle;
				middle = null;
			}
			if(left != null) {
				sef.label4.setIcon(new ImageIcon(West.class.getResource(card.Represents(left))));
				Choice = left;
				left = null;

			}
		}
	}

}
