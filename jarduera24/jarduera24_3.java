package jarduera24;

import java.util.Scanner;

public class jarduera24_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String testua;
		int i;
		System.out.println("Sartu ezazu testu bat");
		testua=sc.nextLine();
		for (i = 0; i < testua.length(); i++) {
		System.out.println(testua.charAt(i));
			
		}
		sc.close();
	}
}
