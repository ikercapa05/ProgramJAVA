package jarduera25;

import java.util.Scanner;

public class jarduera25_8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aukera = 0;

		int num = 0;

		int zenbakia[] = new int[10];

		int kontadorea = 0;

		int batuketa = 0;

		for (int i = 0; i < zenbakia.length; i++) {

			System.out.println("Sartu ezazu " + (i + 1) + " posizioko zenbakia arrayan sartzeko");

			zenbakia[i] = Integer.parseInt(sc.nextLine());

		}

		do {

			System.out.println("1.Batuketa kalkulatu eta bistaratu.");

			System.out.println("2.Zenbakirik altuena bistaratu.");

			System.out.println("3.Zenbakirik txikiena bistaratu.");

			System.out.println("4.Zenbaki bat eskatu eta arraian zenbat bider agertzen den bistaratu.");

			System.out.println("5.Irten");

			aukera = Integer.parseInt(sc.nextLine());

			switch (aukera) {

			case 1:

				System.out.println("Batuketa");

				for (int i = 0; i < zenbakia.length; i++) {

					batuketa = batuketa + zenbakia[i];

				}

				System.out.println("Batuketaren emaitza " + batuketa + " da");

				break;

			case 2:

				System.out.println("Zenbaki altuena");

				int max = Integer.MIN_VALUE;

				for (int i = 0; i < zenbakia.length; i++) {

					if (zenbakia[i] > max) {

						max = zenbakia[i];

					}

				}

				System.out.println("Zenbakirik altuena " + max + " da");

				break;

			case 3:

				System.out.println("Zenbaki txikiena");

				int min = Integer.MAX_VALUE;

				for (int i = 0; i < zenbakia.length; i++) {

					if (zenbakia[i] > min) {

						min = zenbakia[i];

					}

				}

				System.out.println("Zenbakirik altuena " + min + " da");

				break;

			case 4:

				System.out.println("Zenbaki bat eskatu eta arraian zenbat bider agertzen den bistaratu.");

				num = Integer.parseInt(sc.nextLine());

				for (int i = 0; i < zenbakia.length; i++) {

					if (zenbakia[i] == num) {

						kontadorea++;

						System.out.println("Zenbaki hau " + num + "errepikatzen da" + kontadorea + " aldiz");

					}

				}

				break;

			default:

				System.out.println("sakatu ikusten duzun aukerak " + aukera + " ez da egokia");

				break;

			}

		} while (aukera != 5);

		System.out.println("Gero arte!!!!");

		sc.close();
	}
}
