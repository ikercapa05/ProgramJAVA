package jarduera22;

import java.util.Scanner;

public class jarduera227 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
// Eskatu zenbaki bat 1 eta 7ren arteaneta zehaztu dagokion asteko eguna zein den.
		int zenbakia=0;
		System.out.println("Sartu ezazu zenbaki bat");
		zenbakia=sc.nextInt();
		if (zenbakia==1) {
			System.out.println("Astelehena");
		} else if (zenbakia==2) {
			System.out.println("Martitzena");
		}else if (zenbakia==3) {
			System.out.println("Eguaztena");
		}else if (zenbakia==4) {
				System.out.println("Eguena");
		}else if (zenbakia==5) {
			System.out.println("Barikua");
		}else if (zenbakia==6) {
			System.out.println("Zapatue");
		}else if (zenbakia==7) {
			System.out.println("Domekie");
		}
		sc.close();
	}

}
