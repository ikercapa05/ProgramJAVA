package Jarduera21;

import java.util.Scanner;

public class jarduera214 {
	public static void main(String[] args) {
	//Aldagaiak
				Scanner sc= new Scanner (System.in);
				int graduak=0;
//Gelako graduak
				System.out.println("Jarri gelako tenperatura");
				graduak=sc.nextInt();
				System.out.println("Fº hau da gelan " + (graduak*1.8+32));
				sc.close();
	}
}
