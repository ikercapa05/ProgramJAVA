package jarduera22;
import java.util.Scanner;
public class jarduera225 {
	public static void main(String[] args) {
//Aldagaiak
		Scanner sc= new Scanner (System.in);
		int zenbakia=0;
//Elementuak
		System.out.println("Jarri ezazu zenbaki bat");
		zenbakia=sc.nextInt();
		sc.close();
		if ((zenbakia>=0)&& zenbakia<=10) {
			System.out.println("Zenbakia dago 0 eta 10-en artean");
		} else {
			System.out.println("Zenbakia ez dago 0 eta 10-en artean");
		}
		}
		
	}
