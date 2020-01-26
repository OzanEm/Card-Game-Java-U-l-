package proje;

import javax.swing.JButton;


public class Action {
	
	
	
	public int Ground;
	public CardGame self;
	public boolean time = true;
	
	public void Initialize(CardGame e) {
		
		self = e;
		Kurye();
		
	}
	public void Kurye(){
		if (time == true ) {
			  self.Refresh();
		}else {
			
			
	//nothing		
			
			
		}
	}
	
	public JButton distribute() {
		
		//cards.
		
		return null;
			
	}
	public void PCAction() {
		
		//main rules 
		
		
		
		
	}
	public void TimeTester() {
		
		
		
		
	}
	
}
