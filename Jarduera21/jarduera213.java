package Jarduera21;

import java.util.Scanner;

public class jarduera213 {
	public static void main(String[] args) {
		//Aldagaiak
				Scanner sc= new Scanner (System.in);
				int zenbaki1=0,zenbaki2=0,zenbaki3=0;
		//Biderketa
				System.out.println("Sar ezazu zenbaki bat");
				zenbaki1=sc.nextInt();
				System.out.println("Sar ezazu bigarren zenbakia");
				zenbaki2=sc.nextInt();
				System.out.println("Sar ezazu hirugarren zenbakia");
				zenbaki3=sc.nextInt();
				System.out.println("Biderketa " + (zenbaki1*zenbaki2*zenbaki3) + " da");
				sc.close();
	}
}
