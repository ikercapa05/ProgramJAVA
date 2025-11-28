package jarduera26;

import java.util.Scanner;

public class jarduera26_2 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * @param dirukopurua komak daukatelez boolean,aldagia da,
		 * 
		 * 
		 */
		double dirukopurua;
		double D = 0;
		double E = 0;
		System.out.println("Sartu ezazu dirukopurua:");
		dirukopurua = sc.nextDouble();
		System.out.println("Sartu ezazu zein txanpon gura duzu aldaketa egin:");
		char aldaketatxanpona = sc.next().charAt(0);
	}

	private static void bihurtutxanpona(double dirukopurua, char aldaketatxanpona) {
		double E = 0;
		double D = 0;
		D = E * 1.17;
		E = D * 0.86;
		if (aldaketatxanpona == 'D') {
			//System.out.println("Daukazu " + bihurtutxanpona(dirukopurua, aldaketatxanpona) + "dolar etan.");
		} else if (aldaketatxanpona == 'E') {
			//System.out.println("Daukazu " + bihurtutxanpona(dirukopurua, aldaketatxanpona) + "dolar etan.");
		}
		//return emaitza;
	}
}
