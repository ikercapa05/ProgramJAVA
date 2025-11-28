package jarduera22;

import java.util.Scanner;

public class jarduera224 {
	public static void main(String[] args) {
//Aldagaiak
		Scanner sc= new Scanner (System.in);
		int zenbakia=0;
//Elementuak
		System.out.println("sartu zenbaki bat");
		zenbakia=sc.nextInt();
		if (zenbakia % 2 ==0) {
			System.out.println("Zenbaki hau bikoitia da");
		}else if (zenbakia %1 ==0) {
			System.out.println("Zenbaki hau bakoitia da");
		}
		sc.close();
	}
}