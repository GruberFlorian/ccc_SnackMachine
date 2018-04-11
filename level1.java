package ccc_vendingmachine_gruber;

public class level1 {

	public static void main(String[] args) {
		int betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int [anzahlMuenzen];
		int eingeworfen = 0;
		
		for(int m = 0; m<anzahlMuenzen;m++) {
			int offset = 2;
			muenzen[m] = Integer.parseInt(args[offset + m]);
		}
		
		for (int i = 0; i<anzahlMuenzen;i++) {
			eingeworfen = muenzen[i] + eingeworfen; 
		}
		
		if(betrag - eingeworfen < 0) {
			System.out.println("CHANGE:" + (betrag-eingeworfen)*-1);
		}
		else if (betrag -eingeworfen == 0) {
			
			System.out.println("genau");
		}
		else {
			System.out.println("MISSING:" + (betrag -eingeworfen));
		}
			
		System.out.println(eingeworfen);
		

	}
}