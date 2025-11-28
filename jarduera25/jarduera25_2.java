package jarduera25;

import java.util.Scanner;

public class jarduera25_2 {
public static void main(String[] args) {
		String[] hitzak = new String [5];
		Scanner sc = new Scanner (System.in);
		for (int i=0; i < hitzak.length; i++) {
			System.out.print("Sartu ezazu hitz bat: ");
			hitzak [i] = sc.nextLine();
	
		}
		sc.close();
	}
}
