package jarduera22;
import java.util.Scanner;
public class jarduera226 {
	public static void main(String[] args) {
//Aldagaiak
		Scanner sc= new Scanner (System.in);
		int zenbaki1=0,zenbaki2=0,zenbaki3=0;
		int batuketa;
//Elementuak
		System.out.println("Sartu ezazu lehenengoko zenbakia");
		zenbaki1=sc.nextInt();
		System.out.println("Sartu ezazu bigarren zenbakia");
		zenbaki2=sc.nextInt();
		System.out.println("Sartu ezazu hirugarren zenbakia");
		zenbaki3=sc.nextInt();
		batuketa = zenbaki1+zenbaki2+zenbaki3;
		System.out.println( batuketa + "batuketa da");
		sc.close();
		System.out.println( batuketa / 3 + "batazbestekoa da");
	}
}