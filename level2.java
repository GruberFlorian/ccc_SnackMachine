package ccc_vendingmachine_gruber;

public class level2 {

	public static void main(String[] args) {
		int betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int [anzahlMuenzen];
		int[] euro = new int[8];
		int eingeworfen = 0;
		int rueckgabe = 0;
		int[] ausgabemuenzen = new int[8];

		for(int m = 0; m<anzahlMuenzen;m++) {
			int offset = 2;
			muenzen[m] = Integer.parseInt(args[offset + m]);
		}

		for (int i = 0; i<anzahlMuenzen;i++) {
			eingeworfen = muenzen[i] + eingeworfen; 
		}



		if(betrag - eingeworfen < 0) {
			euro[0] = 1;
			euro[1] = 2;
			euro[2] = 5;
			euro[3] = 10;
			euro[4] = 20;
			euro[5] = 50;
			euro[6] = 100;
			euro[7] = 200;
			rueckgabe = (betrag-eingeworfen)*-1;
			
			
			
			
			
			System.out.print("CHANGE:");
			for(int z = 0; z<8;z++) {
				System.out.println(ausgabemuenzen[z]);
			}
			
		}
		else if (betrag -eingeworfen == 0) {

			System.out.println("genau");
		}
		else {
			System.out.println("MISSING:" + (betrag -eingeworfen));
		}

		System.out.println(rueckgabe % euro[7]);
		


	}

}
