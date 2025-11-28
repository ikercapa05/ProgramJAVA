package jarduera25;

import java.util.Scanner;

public class jarduera25_5 {
	public static void main (String[] args) {
	// 5 luzerako arraia definitu eta izenekin bete. Gero, a letraz hasten diren izenak pantailatik atera.
		String[] izena = new String [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Eman 5 izen");
		for (int i = 0; i < izena.length; i++) {
			izena [i] = sc.nextLine();
		}
		for(int j = 0; j< izena.length;j++) {
			if (izena[j].toLowerCase().startsWith("a")) {
			System.out.println(izena[j]);
			}
		}	
		sc.close();
	}
}
