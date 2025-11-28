package jarduera26;

import java.util.Scanner;

public class jarduera261 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double euroa;
		double dolar = 0;
		double aldaketa;
		double emaitza;
		System.out.println("Sartu ezazu euroak, dolaretara pasatzeko: ");
		euroa = sc.nextDouble();
		emaitza=aldaketa(euroa,dolar);
		System.out.println("Daukazu "+aldaketa (euroa,dolar)+ "dolar etan.");

	}
	public static double aldaketa(double euroa, double dolar) {
		dolar=euroa*1.17;
		return dolar;
	}
}
