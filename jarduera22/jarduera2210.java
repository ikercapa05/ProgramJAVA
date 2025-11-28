package jarduera22;

import java.util.Scanner;

public class jarduera2210 {
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	// Eskatu hiru zenbaki, bata aurrekoa baino handiagoa. Horrela ez bada, atera ERROREA mezua.
	int zenbakia=0, zenbakia1=0, zenbakia2=0;
	System.out.println("Sartu ezazu zenbaki ");
	zenbakia=sc.nextInt();
	System.out.println("Sartu ezazu beste zenbaki bat");
	zenbakia1=sc.nextInt();
	System.out.println("Sartu ezazu azkenengo zenbakia");
	zenbakia2=sc.nextInt();
	if (zenbakia < zenbakia1) {
		System.out.println("Aurrekoa baino handiagoa da");
	} else if (zenbakia1< zenbakia2) {
		System.out.println("Aurrekoa baino handiagoa da");
	} else if (zenbakia>zenbakia1) {
		System.out.println("errorea");
	}else if (zenbakia1>zenbakia2) {
		System.out.println("errorea");
	}
	sc.close();
	}
	
}
