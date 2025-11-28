package jarduera22;

import java.util.Scanner;

public class jarduera223 {
	public static void main(String[] args) {
//Aldagaiak 
		Scanner sc = new Scanner (System.in);
		int zenbakia=0;
//Elementuak		
		System.out.println("Jarri zenbaki bat");
		zenbakia = sc.nextInt();
		if (zenbakia>0) {
			System.out.println("Zure zenbakia positiboa da");
		}
		if (zenbakia<0) {
			System.out.println("Zure zenbakia negatiboa da");
		}
		if (zenbakia==0) {
			System.out.println("Zure zenbakia zero da");
		}
		sc.close();
	}
}
