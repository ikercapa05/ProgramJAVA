package jarduera25;

import java.util.Scanner;

public class jarduera25_6 {
	public static void main(String[] args) {
		// 5 luzerako arraia definitu eta izenez bete. Erabiltzaileari izen bat eskatu
		// eta arraian dagoen edo ez adierazi.
		// aldagaiak
		Scanner sc = new Scanner(System.in);
		String[] izena = new String[5];
		String eskatu;
		boolean badago;
		for (int i = 0; i < izena.length; i++) {
			System.out.println("Sartu ezazu izena");
			izena[i] = sc.nextLine();
		}
		System.out.println("Sartu ezazu bilatu nahi duzun izena");
		eskatu = sc.nextLine();
		for (int i = 0; i < izena.length; i++) {
			if (izena[i].equals(eskatu)) {
				System.out.println("Bilatu duzun izena " + eskatu + " arraian dago");
			} else System.out.println("Bilatu duzun izena ez dago arraian");
		}
		sc.close();
	}
}
