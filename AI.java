package proje;

import java.util.HashMap;

public class AI {
	
	HashMap<String , Integer> values = new HashMap<String, Integer>();
	String koz;
	String ground0 ,ground1;
	String left0, left1;
	String middle0, middle1;
	String right0, right1;
	String Choose;
	
	
	boolean worth;
	
	public void Init() {
		values.put("4",4);
		values.put("5",5);
		values.put("6",6);
		values.put("7",7);
		values.put("8",8);
		values.put("9",9);
		values.put("1",10);
		values.put("V",11);
		values.put("Q",12);
		values.put("K",13);
		values.put("2",14);
		values.put("A", 15);
		values.put("3",30);

		
		
		
	}
	public void Inital(String gro, String coz) {
		koz = coz;
		Ground(gro);
		
	}
	public String Move2(String l, String r) {
		
		char lef0, lef1;

		lef0 = l.charAt(0);
		left0 = Character.toString(lef0);
		
		lef1 = l.charAt(1);
		left1 = Character.toString(lef1);
		////////////////////////////////
		

		char rig0, rig1;
		
		
		rig0 = r.charAt(0);
		right0 = Character.toString(rig0);
		
		rig1 = r.charAt(1);
		right1 = Character.toString(rig1);
		///////////////////////////////
		
		Init();
		Choice2();
		return Choose;
	}
	public String Move(String l,String m, String r) {
		
		char lef0, lef1;

		
		lef0 = l.charAt(0);
		left0 = Character.toString(lef0);
		
		lef1 = l.charAt(1);
		left1 = Character.toString(lef1);
		////////////////////////////////
		char midd0, midd1;
	
		
		midd0 = m.charAt(0);
		middle0 = Character.toString(midd0);
		
		midd1 = m.charAt(1);
		middle1 = Character.toString(midd1);
		////////////////////////////////
		char rig0, rig1;
		
		
		rig0 = r.charAt(0);
		right0 = Character.toString(rig0);
		
		rig1 = r.charAt(1);
		right1 = Character.toString(rig1);
		///////////////////////////////
		
		Init();

		Choice();
		
		return Choose;
		
	}
	public int Value(String sample) {
		
		
		
		char as = sample.charAt(1);
		String sa = Character.toString(as);
		int x = values.get(sa);
		
		return x;
			
	}
	public void Ground(String arg) {
		char as = arg.charAt(0);
		String sa = Character.toString(as);
		
		as = arg.charAt(1);
		String ma = Character.toString(as);
		if(sa == "H") {
			
			ground0 = "H";
		}
		if(sa == "S") {
			ground0 = "S";
			
		}
		if(sa == "D") {
			ground0 = "D";
	
		}
		if(sa == "C") {
			ground0 = "C";
	
		}
		if(ma == "K" || ma == "2" || ma == "A" || ma == "3" ) {
		worth = true;
		}else {
			worth = false;
		}
		
	}
	public void Choice() {
		
		int left, right, middle;
		
		char koz1 = koz.charAt(0);
		String koz0 = Character.toString(koz1); 
		
		left = values.get(left1);
		right = values.get(right1);
		middle = values.get(middle1);
		
		if(left0 == koz0) {
			left  = left + 100;
		}
		if(middle0 == koz0) {
			middle = middle + 100;
		}
		if(right0 == koz0) {
			right = right + 100;
		}
		if(left0 == ground0) {
			left  = left + 40;
		}
		if(middle0 == ground0) {
			middle = middle + 40;
		}
		if(right0 == ground0) {
			right = right + 40;
		}
		

		if(worth == true) {
			take(left, right , middle);
		}else {
			DoNot(left, right, middle);
		}
		
		
		
	}
	public void Choice2() {
		
		int left, right;
		
		char koz1 = koz.charAt(0);
		String koz0 = Character.toString(koz1); 
		
		left = values.get(left1);
		right = values.get(right1);
	
		
		if(left0 == koz0) {
			left  = left + 100;
		}
		
		if(right0 == koz0) {
			right = right + 100;
		}
		if(left0 == ground0) {
			left  = left + 40;
		}
		
		if(right0 == ground0) {
			right = right + 40;
		}
		

		if(worth == true) {
			take2(left, right );
		}else {
			DoNot2(left, right);
		}
		
		
		
	}
	public void DoNot(int left, int right, int middle) {

		
		if(left < right) {
			if(left < middle) {
			
				Choose = "left";
			}else {
				Choose = "middle";
			}	
		}else {
			if(right < middle) {
				Choose = "right";
				
			}else {
				Choose = "middle";
			}
		}
	}
	public void DoNot2(int left, int right) {

		if(left > right) {
			Choose = "right";
			
		}else {
			Choose = "left";
		}
		
	}
	public void take(int left, int right, int middle) {
		if(left > right) {
			if(left> middle) {
			
				Choose = "left";
			}else {
				Choose = "middle";
			}	
		}else {
			if(right > middle) {
				Choose = "right";
				
			}else {
				Choose = "middle";
			}
		}
		
	}
	public void take2(int left, int right) {
		if(left > right) {
			Choose = "left";
		}
		else {
			Choose = "right";
		}
		
	}
	public void HaveTo(int x) {
		//think??
	}
	
	
	
}

	
		

	

