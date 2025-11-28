package animaliak;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnimaliakAPP {
public static void main(String[] args) throws FileNotFoundException{


        Scanner scanner = new Scanner(System.in);
        // Usamos ArrayList porque no sabemos cuántas líneas tiene info.txt
        ArrayList<animaliak> animaliakList = new ArrayList<>();
        File File = new File("C:\\Users\\1AWD-3\\eclipse-workspace\\ProgramazioaEbal2\\src\\animaliak\\info.txt");

        // --- Cargar datos desde el archivo info.txt ---
        try {
            // Usamos un segundo Scanner para leer específicamente del objeto File
            Scanner fileScanner = new Scanner(File);

            while (fileScanner.hasNextLine()) {
                String linea = fileScanner.nextLine();
                String[] partes = linea.split("::");
                
                if (partes.length >= 4) {
                    String izena = partes[0];
                    String espeziea = partes[1];
                    int adina = Integer.parseInt(partes[2]);
                    
                    String[] habitats = new String[partes.length - 3];
                    for (int j = 3; j < partes.length; j++) {
                        habitats[j - 3] = partes[j];
                    }
                    animaliakList.add(new animaliak(izena, espeziea, adina, habitats));
                }
            }
            fileScanner.close(); 
        } catch (IOException e) {
            System.err.println("Errorea fitxategia irakurtzean: " + e.getMessage());
            System.err.println("Ziurtatu 'info.txt' fitxategia existitzen dela.");
            return; // Salir del programa si no se puede leer el archivo
        } catch (NumberFormatException e) {
            System.err.println("Errorea adina zenbaki bihurtzean. Egiaztatu fitxategiaren formatua.");
            return;
        }

        // Convertir ArrayList a un array simple para el resto de la lógica si se prefiere,
        // o seguir trabajando con la lista. Seguiremos con la lista.
        // Animalia[] animaliak = animaliakList.toArray(new Animalia[0]);

        int aukera = 0; // Opción del menú

        do {
            System.out.println("\n--- ANIMALIAK MENUA ---");
            System.out.println("1- 2 animalien datuak erakutsi");
            System.out.println("2- Gehien bizi den animalia bistaratu");
            System.out.println("3- Erabiltzaileak hautatzen duen animaliaren habitat-ak bistaratu");
            System.out.println("4- IRTEN");
            System.out.print("Aukeratu aukera bat: ");

            if (scanner.hasNextInt()) {
                aukera = scanner.nextInt();
                scanner.nextLine(); 

                switch (aukera) {
                    case 1:
                        System.out.println("\n--- Lehenengo 2 animalien datuak erakutsi ---");
                        animaliakList.get(0).datuakErakutsi();
                        animaliakList.get(1).datuakErakutsi();
                        break;
                    case 2:
                        System.out.println("\n--- Gehien bizi den animalia ---");
                        if (animaliakList.isEmpty()) {
                            System.out.println("Ez dago animaliarik datuak prozesatzeko.");
                            break;
                        }
                        animaliak maxAdinAnimalia = animaliakList.get(0);
                        for (int i = 1; i < animaliakList.size(); i++) {
                            if (animaliakList.get(i).adina > maxAdinAnimalia.adina) {
                                maxAdinAnimalia = animaliakList.get(i);
                            }
                        }
                        System.out.println("Gehien bizi den animalia honakoa da:");
                        maxAdinAnimalia.datuakErakutsi();
                        break;
                    case 3:
                        System.out.println("\n--- Habitat-ak bistaratu ---");
                        if (animaliakList.isEmpty()) {
                             System.out.println("Ez dago animaliarik datuak prozesatzeko.");
                            break;
                        }
                        System.out.println("Zein animaliaren habitat-a ikusi nahi duzu?");
                        for (int i = 0; i < animaliakList.size(); i++) {
                            System.out.println((i + 1) + ": " + animaliakList.get(i).izena);
                        }
                        System.out.print("Idatzi zenbakia (1-" + animaliakList.size() + "): ");
                        int animalAukera = scanner.nextInt();
                        scanner.nextLine(); 

                        if (animalAukera >= 1 && animalAukera <= animaliakList.size()) {
                            animaliakList.get(animalAukera - 1).datuakErakutsi();
                        } else {
                            System.out.println("Aukera okerra.");
                        }
                        break;
                    case 4:
                        System.out.println("Aguuuuuuuuur!!!!");
                        break;
                    default:
                        System.out.println("Aukeratu duzun opsioa ez da zuzena.");
                }
            } else {
                System.out.println("Opsioa ez da egokia, aukeratu 1etik 4ra.");
                scanner.next();
            }
        } while (aukera != 4);

        scanner.close();
    }
}

