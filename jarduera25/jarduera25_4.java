package jarduera25;

import java.util.Scanner;

public class jarduera25_4 {
	public static void main (String[] args) {
		// 2 ariketari, gehitu izenak pantailatik ateratzea.
		String[] izena = new String [5];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i < izena.length; i++) {
			System.out.print("Sartu "+i+" izena ");
			izena [i] = sc.nextLine();
		}
		for(int i = 0; i< izena.length;i++) {
			System.out.println(izena[i]);
		}
		sc.close();
	}
}