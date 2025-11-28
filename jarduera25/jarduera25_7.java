package jarduera25;

import java.util.Scanner;

public class jarduera25_7 {
	public static void main(String[] args) {
		// n zenbakia irakurri eta luzera horretako arraia definitu. 1etik 10erako
		// ausazko zenbakiekin bete eta gero altuena kalkulatu.
		Integer[] lista;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu ezazu zenbaki bat:");
		lista = new Integer[sc.nextInt()];
		int maximo = Integer.MIN_VALUE;
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) Math.floor(Math.random() * 10 + 1);
			System.out.println(lista[i]);

			if (maximo < lista[i]) {
				maximo = lista[i];
			}
		}
		System.out.println("Hau zenbaki maximoa da:" + maximo);
		sc.close();
	}
}
