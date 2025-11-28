package janariak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ElikagaiakAPP {
	private static ArrayList<janaria> lista = new ArrayList <>();

public static void main(String[] args) throws FileNotFoundException {
	Scanner sc = new Scanner (System.in);
	DatuakKargatu();
	int aukera;
	do {
		System.out.println("1. Elikagaiak bilatu");
		System.out.println("2. Elikagaiak erakutsi");
		System.out.println("3. Kaloriak kalkulatu");
		System.out.println("4. IRTEN!!!!!!!");
		
		aukera = Integer.parseInt(sc.nextLine());
		switch (aukera) {
		
		case 1:
			System.out.println("Elikagaia bilatu");
			 ElikagaiaBilatu();
			break;
			
		case 2:
			System.out.println("Elikagaia erakutsi");
			ElikagaiaBistaratu();
			break;
			
		case 3:
			System.out.println("Kaloriak kalkulatu");
			kaloriakKalkulatu();
			break;
			
		case 4:
			System.out.println("Aguuuuuur!!!");
			break; 
			default: 
				System.out.println("Sartun duzun zenbakia ez da egokia, aukera beste zenbaki bat 1-etik 4-ra");
				break;
		}
	} while(aukera!=4);
	sc.close();
}



public static void DatuakKargatu() {
	int kont;
	// Dokumentua sartu
	File File = new File("C:\\Users\\1AWD-3\\eclipse-workspace\\ProgramazioaEbal2\\src\\janariak\\janariak.txt");
	
	if (File.exists()) {
		System.out.println("Dokumentua existitzen da");
	} else {
		System.out.println("Dokumentua ez da existitzen");
	}
	// arraylist sortu
	
	try (Scanner scFile = new Scanner(new FileReader(File))){
		
		while (scFile.hasNextLine()) {
			String lerroa = scFile.nextLine();
			String [] zatiak = lerroa.split(";");	
			
		String izena = zatiak[0];
		String egoera = zatiak [1];
		double kaloriak = Double.parseDouble(zatiak [2]);
		double koipeak = Double.parseDouble(zatiak [3]);
		double proteinak = Double.parseDouble(zatiak [4]);
		double karbohidratoak = Double.parseDouble(zatiak [5]);
		String mota = zatiak [6];
		lista.add(new janaria(izena, egoera, kaloriak, koipeak, proteinak, karbohidratoak, mota));
		kont ++;
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void ElikagaiaBilatu() {
	Scanner sc = new Scanner(System.in);
	        System.out.print("Sartu bilatu nahi duzun elikagaiaren izena: ");
	        String izena = sc.nextLine().trim().toLowerCase();
	        boolean aurkitua = false;

	        for (janaria elikagaia : lista) {
	            if (elikagaia.getIzena().toLowerCase().equals(izena)) {
	                System.out.println("Elikagaia aurkitu da:");
	                System.out.println(elikagaia.toString());
	                aurkitua = true;
	            }
	        }

	        if (!aurkitua) {
	            System.out.println("Ez da aurkitu " + izena + " elikagaia");
	        }
	        sc.close();
	    }

			public static void ElikagaiaBistaratu() {
				System.out.println("Sartu ezazu bistaratu gura duzun elikagaia");
				Scanner sc = new Scanner(System.in);
					String izena = sc.next();
						for(janaria j : lista) {
							if(izena.equalsIgnoreCase(j.getIzena())) {
					System.out.println(j);
					}
				}
						sc.close();
			}
			 private void kaloriakKalkulatu() {
			        System.out.print("Sartu elikagaiaren izena: ");
			        Scanner sc = new Scanner (System.in);
			        String izena = sc.nextLine().trim().toLowerCase();
			        System.out.print("Sartu elikagaiaren egoera: ");
			        String egoera = sc.nextLine().trim().toLowerCase();

			        janaria aurkitutakoa = null;
			        for (janaria elikagaia : lista) {
			            if (elikagaia.getIzena().toLowerCase().equals(izena) && elikagaia.getEgoera().toLowerCase().equals(egoera)) {
			                aurkitutakoa = elikagaia;
			                break;
			            }
			        }
			        if (aurkitutakoa != null) {
			            try (Scanner scFile = new Scanner(new FileReader(File))){
			                System.out.print("Sartu pisua gramotan: (Introduce el peso en gramos): ");
			                double pisua = sc.nextDouble();
			                
			                double kaloriak = (pisua / 100.0) * aurkitutakoa.getKaloriak();
			                System.out.printf("Elikagai kantitate horrek daukan kaloria kopurua: %.2f kcal%n", kaloriak);
			            } catch (FileNotFoundException e) {
			                System.out.println("Sarrera okerra. Mesedez, idatzi pisu baliozkoa.");
			 
			            }
			        } else {
			            System.out.println("Ez da aurkitu irizpide horiekin bat datorren elikagairik.");
			        }
			        sc.close();
			    }

}
