package jarduera22;

import java.util.Scanner;

public class jarduera222 {
	public static void main(String[] args) {
// Aldagaiak
	Scanner sc = new Scanner(System.in);
	int zenbakia=0,zenbaki=0;
//Elementuak
	System.out.println("Sartu ezazu zenbaki bat");
	zenbakia=sc.nextInt();
	System.out.println("Sartu ezazu bigarren zenbakia");
	zenbaki=sc.nextInt();
	if (zenbakia<zenbaki) {
		System.out.println("Bigarren zenbakia handiagoa da");
	}else if (zenbakia>zenbaki) {
		System.out.println("Lehen zenbakia handiagoa da");
	}else if (zenbakia==zenbaki) {
		System.out.println("Bi numeroak berdinak dira");
	}
	sc.close();
	}
}
