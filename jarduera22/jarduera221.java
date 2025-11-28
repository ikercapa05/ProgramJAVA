package jarduera22;

import java.util.Scanner;

public class jarduera221 {
	public static void main(String[] args) {
		//Aldagaiak
		int nota = 0;
				Scanner sc= new Scanner (System.in);
//Programa
			System.out.println("Sartu ezazu zure nota");
			nota=sc.nextInt();
		if (nota<5) {
			System.out.println("Ez daukazu gaindituta");
		}else if (nota>=5) {
			System.out.println("Gaindituta daukazu");
		}
		sc.close();
	}
}
