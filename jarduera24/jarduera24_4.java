package jarduera24;

import java.util.Scanner;
// Hitz bat sartuta, atzetik aurrera atera pantailatik.
public class jarduera24_4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String hitza;
		int i;
		System.out.println("Sartu hitz bat");
		hitza=sc.nextLine();
		String builder;
		for (i = 0; i < hitza.length(); i--) {
			System.out.println(hitza.charAt(i + 1));
		sc.close();	
	}
	}
}
