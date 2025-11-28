package aukilurrak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import aukilurrak.aurikularrak;

public class aurikullarakAPP {

	
	public static void main(String[] args) throws FileNotFoundException {
		File File = new File("C:\\Users\\1AWD-3\\eclipse-workspace\\ProgramazioaEbal2\\src\\aukilurrak\\auriculares.txt");
		
		if (!File.exists()) {
		}
			
			
		ArrayList<aurikularrak> lista = new ArrayList<>();
	try (Scanner scFile = new Scanner(new FileReader(File))){
		
		while (scFile.hasNextLine()) {
			String lerroa = scFile.nextLine();
			
			String[] zatiak = lerroa.split(";");
		}
		
	}
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Zein aurikularren prezioa igo? (kodea): ");
	String kodeBilatu = sc.nextLine();
	sc.close();
	boolean aurkitua = false;
	
//	for (aurikularrak a : lista) {
//		if (a.getKodea().equalsIgnoreCase(kodeBilatu)) {
//			a.setPrezioa(a.getPrezioa() + 10);
//			aurkitua = true;
//			System.out.println("Prezio berria: " + a.getPrezioa());
//		}
//	}
//	try (FileWriter fw = new FileWriter(File)){
//		for (aurikularrak a : lista) {
//			fw.write.(a.toString() + "\n");
//		}
//		System.out.println("Datuak eguneratuta gorde dira");
//	} catch (IOException e) {
//		System.out.println("Errorea gordetzen: " + e.getMessage());
//	}
	sc.close();
	}
}
