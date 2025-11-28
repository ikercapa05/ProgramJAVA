package jarduera31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class jarduera312 {
	public static void main(String[] args) throws FileNotFoundException {

		// Aldagaiak
		File File = new File("./src/jarduera31/pertsonak-koma.txt");
		Scanner scFile = new Scanner(File);
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int kont = 0;
		int aukera = 0;

		// Lerroak kontatu
		scFile.nextLine();
		while (scFile.hasNext()) {
			scFile.nextLine();
			i++;
		}
		System.out.println("Lerro kopurua " + i + " da");

		// 2. aldagaiak

		scFile = new Scanner(File);
		int[] id = new int[i];
		String[] firstname = new String[i];
		String[] lastname = new String[i];
		String[] email = new String[i];
		String[] email2 = new String[i];
		String[] profession = new String[i];
		int[] age = new int[i];
		double[] salary = new double[i];
		String lerroa;
		String[] zatiak;

		// datuak irakurri
		scFile.nextLine();
		while (scFile.hasNext()) {
			lerroa = scFile.nextLine();
			zatiak = lerroa.split(",");

			id[kont] = Integer.parseInt(zatiak[0]);
			firstname[kont] = zatiak[1];
			lastname[kont] = zatiak[2];
			email[kont] = zatiak[3];
			email2[kont] = zatiak[4];
			profession[kont] = zatiak[5];
			age[kont] = Integer.parseInt(zatiak[6]);
			salary[kont] = Double.parseDouble(zatiak[7]);
			// System.out.println(firstname[kont]);
			kont++;

		}

		System.out.println("Zenbatgarren pertsonaren datuak ikusi nahi dituzu?");
		aukera = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < id.length; l++) {
			if ((aukera + 1) == id[l]) {
				System.out.println("Aukeratu duzun erabiltzailea hau da: " + firstname[l] + lastname[l]);
			}
		}
	}
}
