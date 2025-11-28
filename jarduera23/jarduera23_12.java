package jarduera23;

import java.util.Scanner;

public class jarduera23_12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Sartu ezazu zenbaki bat");
		int zenbakia=sc.nextInt();
		int biderketa=1;
		while (biderketa < 11) {
			System.out.println(zenbakia * biderketa);
			biderketa ++;
			sc.close();
		}
	}
}
// Programa bat idatzi, zenbaki bat eskatzen duena eta bere biderketa taula ateratzen duena, 1etik 10era.