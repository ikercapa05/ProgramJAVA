package jarduera32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nutrizionista {
	public static void main(String[] args) throws FileNotFoundException {

		// aldagaiak
		File File = new File("./src/jarduera32/janariak.txt");
		Scanner scFile = new Scanner(File);
		Scanner sc = new Scanner (System.in);
		int kopurua = 0;
		int kont = 0;
		int aukera;
		String elikagaia;
		// Lerroak kontatu

		kopurua = lerroakKontatu(scFile, kopurua);
		
		// arrayak
		scFile = new Scanner(File);
		String[] izena = new String[kopurua];
		String[] egoera = new String[kopurua];
		Double[] kaloriak = new Double[kopurua];
		Double[] koipeak = new Double[kopurua];
		Double[] proteinak = new Double[kopurua];
		Double[] karbohidratoak = new Double[kopurua];
		String[] mota = new String[kopurua];
		String lerroa = null;
		String[] zatiak;
		// Datuak irakurri
		while (scFile.hasNext()) {
			lerroa = scFile.nextLine();
			zatiak = lerroa.split(";");

			izena[kont] = (zatiak[0]);
			egoera[kont] = (zatiak[1]);
			kaloriak[kont] = Double.parseDouble(zatiak[2]);
			koipeak[kont] = Double.parseDouble(zatiak[3]);
			proteinak[kont] = Double.parseDouble(zatiak[4]);
			karbohidratoak[kont] = Double.parseDouble(zatiak[5]);
			mota[kont] = (zatiak[6]);
			kont++;
		}
	do {
		System.out.println("Elikagai mota");
		
		System.out.println("Elikagai motaren kaloria batazbestekoa");
		
		System.out.println("Elikagai mota kantitatea");
		
		System.out.println("Elikagai eta egoeraren balore nutrizionala");
		
		System.out.println("Elikagai egoera araberako balore nutrizionala");
		
		aukera = Integer.parseInt(sc.nextLine());
	
		switch (aukera) {
		
		case 1:
			System.out.println("Sartu ezazu elikagai izen bat: ");
			elikagaia = sc.nextLine();
			for (int i = 0; i < izena.length; i++) {
				if (elikagaia.equals(izena[i])) {
					System.out.println("Aukeratu duzun elikagai mota hau da: " + mota[i]);
				}
			}
			break;
		
		case 2:
			
			System.out.println("Sartu ezazu elikagai izen bat: ");

			break;
		
		case 3:
			System.out.println("Sartu ezazu elikagai izen bat: ");
			aukera = Integer.parseInt(sc.next());

			break;
			
		case 4:
			System.out.println("Sartu ezazu elikagai izen bat: ");
			aukera = Integer.parseInt(sc.next());

			System.out.println("Sartu ezazu egoera mota: ");
			
			break;
			
		case 5:
			System.out.println("Sartu ezazu elikagai izen bat: ");
			aukera = Integer.parseInt(sc.next());

			break;
			
		default:
			System.out.println("Sakatu duzun aukera " + aukera + " ez da egokia");
		break;
		}
	} while (aukera!=6);
	System.out.println("Aguuuuuur");
	
	}
	
	
		

	private static int lerroakKontatu(Scanner scFile, int kopurua) {
		while (scFile.hasNext()) {
			scFile.nextLine();
			kopurua++;
		}
		System.out.println("Lerro kopurua " + kopurua + " da");
		return kopurua;

	}
}
