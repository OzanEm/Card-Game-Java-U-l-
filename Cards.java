package proje;

import java.util.ArrayList;
import java.util.Random;

public class Cards {

	 ArrayList<String> possible = new ArrayList<String>();	
	public Cards() {
		Initialize();
	}
	
	 public void Initialize() {
		 
		possible.add("SA");
		possible.add("S2");
		possible.add("S3");
		possible.add("S4");
		possible.add("S5");
		possible.add("S6");
		possible.add("S7");
		possible.add("S8");
		possible.add("S9");
		possible.add("S10");
		possible.add("SV");
		possible.add("SQ");		
		possible.add("SK");
		
		possible.add("HA");
		possible.add("H2");
		possible.add("H3");
		possible.add("H4");
		possible.add("H5");
		possible.add("H6");		
		possible.add("H7");
		possible.add("H8");
		possible.add("H9");
		possible.add("H10");
		possible.add("HV");
		possible.add("HQ");
		possible.add("HK");
		
		possible.add("DA");
		possible.add("D2");
		possible.add("D3");
		possible.add("D4");
		possible.add("D5");
		possible.add("D6");
		possible.add("D7");
		possible.add("D8");
		possible.add("D9");
		possible.add("D10");
		possible.add("DV");
		possible.add("DQ");
		possible.add("DK");
		
		possible.add("CA");
		possible.add("C2");
		possible.add("C3");
		possible.add("C4");
		possible.add("C5");
		possible.add("C6");
		possible.add("C7");
		possible.add("C8");
		possible.add("C9");
		possible.add("C10");
		possible.add("CV");
		possible.add("CQ");
		possible.add("CK");
		
	}
	
	
	public  String Card() {
	
		String picks= Rom();
		return picks;	
	}
	public  String Rom() {
	Random rand = new Random();
	int x = rand.nextInt(52);	
	while(possible.get(x) == "0") {
		x = rand.nextInt(52);

	}

	String y =possible.get(x);
	possible.set(x, "0");
	return y;
	}
	public static void main(String [] args) {
		Cards test = new Cards();
		test.Initialize();
		System.out.println(test.Card());
		System.out.println(test.Card());
		System.out.println(test.Card());
		System.out.println(test.Card());
		System.out.println(test.Card());
		System.out.println(test.Card());
		System.out.println(test.Card());
		System.out.println(test.Card());
		System.out.println(test.Card());
		

		
		System.out.println("Step 2");
	}
	
}
