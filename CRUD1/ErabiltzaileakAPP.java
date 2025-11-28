package CRUD1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ErabiltzaileakAPP {
	static Scanner sc = new Scanner (System.in);
	static String fitx = "C:\\Users\\1AWD-3\\eclipse-workspace\\ProgramazioaEbal2\\src\\CRUD1\\erabiltzaileak.txt";
	public static void main(String[] args) throws FileNotFoundException {
		 ArrayList <Erabiltzailea> lista = Erabiltzailea.datuakKargatu(fitx);
			int aukera = -1;
			
			do {
				System.out.println("\n--- MENU ---");
				System.out.println("1. Erabiltzaileak erakutsi");
				System.out.println("2. Erabiltzaileak ezabatu");
				System.out.println("3. Erabiltzailea sortu");
				System.out.println("4. Erabiltzailea aldatu");
				System.out.println("0.Irten");
				aukera = sc.nextInt();
				
			switch (aukera) {
			
			case 1:
				
				break;
				
			case 2:
				
				break;
			
			case 3:
				
				break;
				
			case 4:
				
				break;
			
			case 5:
				
				break;
			}
			}while (aukera!=6);
			
		}
	static void ezabatu (ArrayList<Erabiltzailea> lista) {
		System.out.println("Id-a: ");
		int id= sc.nextInt();
		
		Boolean ezabatzeko = false;
		
		for (Erabiltzailea e : lista) {
			if (e.getId() == id) {
				lista.remove(e);
				ezabatzeko=true;
				System.out.println("Ezabatuta");
				
			}
		}
	}
	
	
	}