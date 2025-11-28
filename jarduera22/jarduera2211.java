package jarduera22;

import java.util.Scanner;

public class jarduera2211 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	// Eskatu letra bat eta egiaztatu B edo E den. B edo E bada, atera ONDO, bestela ERROREA.
		String letra;
		System.out.println("Sartu ezazu letra bat");
		letra=sc.nextLine();
		if (letra.equals("B")) {
			System.out.println("ONDO");
		}else if (letra.equals("E")) {
			System.out.println("ONDO");
		}else if (letra.equals("b")){
			System.out.println("ONDO");
		}else if (letra.equals("e")){
			System.out.println("ONDO");
		}
		else{
			System.out.println("ERROREA");
		}
		sc.close();
	}
}
