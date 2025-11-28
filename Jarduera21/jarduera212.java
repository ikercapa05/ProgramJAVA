package Jarduera21;

import java.util.Scanner;

public class jarduera212 { 
public static void main(String[] args) {
	//Aldagaiak
			Scanner sc = new Scanner (System.in);
			int zenbaki1=0,zenbaki2=0;
//Batuketa
			System.out.println("Sar ezazu zenbaki bat");
			zenbaki1=sc.nextInt();
			System.out.println("Sar ezazu beste zenbaki bat");
			zenbaki2=sc.nextInt();
			System.out.println("Batuketa " + (zenbaki1+zenbaki2) + " da");
			sc.close();
}
}
