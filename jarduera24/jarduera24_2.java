package jarduera24;

import java.util.Scanner;

public class jarduera24_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String testua;
		int i;
		System.out.println("Sartu ezazu testu bat");
		testua=sc.nextLine();
		System.out.println(testua.charAt(0));
		for (i = 0; i < testua.length(); i++) {
			if(testua.charAt(i) == ' ') {
		System.out.println(testua.charAt(i +  1));
			}
		}
		sc.close();
	}
}
