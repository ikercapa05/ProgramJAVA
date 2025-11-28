package jarduera25;

import java.util.Scanner;

public class jarduera25_3 {
	
	public static void main (String[] args) {
	Integer[] lista;
	Scanner sc =new Scanner(System.in);
	System.out.println ("Sartu listaren tamaina mesedez:");
	lista=new Integer[sc.nextInt()];
	for (int i=0; i<lista.length;i++) {
		lista[i]=(int) Math.floor(Math.random() * 10 + 1);
	}
	for (int i=0; i<lista.length;i++) {
		System.out.println(lista[i]);
	}
	sc.close();
	}	
}
