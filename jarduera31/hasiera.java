package jarduera31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hasiera {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("./src/jarduera31/kaixo-fitxategiak.txt");
		Scanner scFile = new Scanner(file);

		int i = 0;
		int j = 0;

		while (scFile.hasNext()) {
			scFile.nextLine();
			i++;
		}
		System.out.println("Lerro kopurua " + i + " da");
		scFile= new Scanner (file);
	
		File file = new File ("./src/jarduera31/pertsonak-koma.txt");
		int [] id = new int [j];
		String [] firstname = new String [j];
		String [] lastname = new String [j];
		String [] email = new String [j];
		String [] email2 = new String [j];
		String [] profession = new String [j];
		String [] age =new String [j];
		String [] salary = new String [j];
		
		
	}
}
