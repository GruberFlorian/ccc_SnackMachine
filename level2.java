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
			int zwischen = 0;
			euro[0] = 1;
			euro[1] = 2;
			euro[2] = 5;
			euro[3] = 10;
			euro[4] = 20;
			euro[5] = 50;
			euro[6] = 100;
			euro[7] = 200;
			rueckgabe = (betrag-eingeworfen)*-1;
			
			
			
			if(rueckgabe % euro[7] >=0 ) {

				ausgabemuenzen[7] = rueckgabe/ euro[7];
				rueckgabe = rueckgabe%euro[7];
			}
			if(rueckgabe % euro[6] >=0 ) {

				ausgabemuenzen[6] = rueckgabe / euro[6];
				rueckgabe = rueckgabe%euro[6];
			}
			if(rueckgabe % euro[5] >0 ) {

				ausgabemuenzen[5] = rueckgabe / euro[5];
				rueckgabe = rueckgabe%euro[5];
			}
			if(rueckgabe % euro[4] >=0 ) {

				ausgabemuenzen[4] =rueckgabe / euro[4];
				rueckgabe = rueckgabe%euro[4];
			}
			if(rueckgabe % euro[3] >=0 ) {

				ausgabemuenzen[3] =rueckgabe / euro[3];
				rueckgabe = rueckgabe%euro[3];
			}
			if(rueckgabe % euro[2] >=0 ) {

				ausgabemuenzen[2] =rueckgabe/ euro[2];
				rueckgabe = rueckgabe%euro[2];
			}
			if(rueckgabe % euro[1] >=0 ) {

				ausgabemuenzen[1] = rueckgabe / euro[1];
				rueckgabe = rueckgabe%euro[1];
			}
			if(rueckgabe % euro[0] >=0 ) {

				ausgabemuenzen[0] =rueckgabe / euro[0];
				rueckgabe = rueckgabe%euro[0];
			}

			
			System.out.println("CHANGE:" +(betrag-eingeworfen)*-1);
			for(int z = 0; z<8;z++) {
				System.out.print(ausgabemuenzen[z]+" ");
			}
			
		}
		else if (betrag -eingeworfen == 0) {

			System.out.println("genau");
		}
		else {
			System.out.println("MISSING:" + (betrag -eingeworfen));
		}

		
		


	}

}
