package jarduera23;

import java.util.Scanner;

public class jarduera23_10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int zenbakia;
		System.out.println("Sartu ezazu zenbaki bat");
		zenbakia=sc.nextInt();
		for (int i=0;i<zenbakia;i++) {
			System.out.println("*");
		}
		sc.close();
	}
}
//Programa bat idatzi, zenbaki bat eskatzen duena eta pantailatik zenbakiaren kopuru bereko asteriskoak ateratzen dituena, lerro ezberdinetan.