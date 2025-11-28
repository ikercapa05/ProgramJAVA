package Erronka1_Ebaluazioa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Erronka1 {
public static void main(String[] args) throws FileNotFoundException {
//aldagaiak
File file = new File("./src/Erronka1_Ebaluazioa/DatuakErronka.txt");
Scanner scFile = new Scanner (file);
Scanner sc = new Scanner (System.in);
int aukera=0;
int kopurua = 0;
int kont = 0;

// datuakKargatu
scFile.nextLine();
while (scFile.hasNext()) {
scFile.nextLine();
kopurua++;
}
scFile.close();
System.out.println("Lerro kopurua " + kopurua + " da");
//Elementuak
String[] herrialdeak = new String [kopurua];
String [] Kokapena = new String [kopurua];
Double [] Lana = new Double [kopurua];
Double [] Dirua = new Double [kopurua];
Double [] Ezagupenak = new Double [kopurua];
Double [] Denbora = new Double [kopurua];
Double [] Boterea = new Double [kopurua];
Double [] Osasuna = new Double [kopurua];
String lerroa = null;
String [] zatiak;
// Datuak sartu
int lag=0;
scFile = new Scanner (file);
while (scFile.hasNext()) {
lerroa = scFile.nextLine();
if (lag==0){
lerroa = scFile.nextLine();
lag++;
}

zatiak = lerroa.split(";");

herrialdeak[kont] = zatiak[0];
Kokapena[kont] = zatiak[1];
Lana[kont] = Double.parseDouble(zatiak[2]);
Dirua[kont] = Double.parseDouble (zatiak[3]);
Ezagupenak[kont] = Double.parseDouble (zatiak[4]);
Denbora[kont] = Double.parseDouble (zatiak[5]);
Boterea[kont] = Double.parseDouble (zatiak[6]);
Osasuna [kont] = Double.parseDouble (zatiak [7]);
kont++;
}

scFile.close();
// arrayak bistaratu
scFile = new Scanner (file);
  System.out.println("Herrialdeak, Kokapena, Lana, Dirua, Ezagupenak, Denbora, Boterea, Osasuna ");
  for ( int i=0; i<herrialdeak.length; i++) {
 System.out.println(herrialdeak[i] + "," + Kokapena[i] + "," + Lana [i] + "," + Dirua[i] + "," + Ezagupenak [i] + "," + Denbora[i] + "," + Boterea[i] + "," + Osasuna [i]);
  }
  do {
  System.out.println("1. Datuen bistaratzea herrialdeka");
  System.out.println("2. DIRUA parametroaren datuen batazbestekoa");
  System.out.println("3. DENBORA parametroan batazbestekotik gora dauden herrialdeak");
  System.out.println("4. Herrialdearen balioak aldatu");
  System.out.println("5. Datuak gorde");
  System.out.println("6. Berdintasun gutxien  duten herrialdeak");
  System.out.println("7. Irten");
  aukera = Integer.parseInt(scFile.nextLine());
 
  switch (aukera){
 
  case 1:
 System.out.print("Sartu herrialdearen izena: ");
      String izena = sc.nextLine().trim();
      boolean aurkitua = false;

      for (int i = 0; i < herrialdeak.length; i++) {
          if (herrialdeak[i].equalsIgnoreCase(izena)) {
              System.out.println("\n--- " + herrialdeak[i] + " ---");
              System.out.println("Kokapena: " + Kokapena[i]);
              System.out.println("Lana: " + Lana[i]);
              System.out.println("Dirua: " + Dirua[i]);
              System.out.println("Ezagupenak: " + Ezagupenak[i]);
              System.out.println("Denbora: " + Denbora[i]);
              System.out.println("Boterea: " + Boterea[i]);
              System.out.println("Osasuna: " + Osasuna[i]);
              aurkitua = true;
              break;
          }
      }

      if (!aurkitua) System.out.println("Errorea: herrialdea ez da existitzen.");
  break;
 
  case 2:
 
  break;
 
  case 3:

  break;
 
  case 4:
 System.out.print("Sartu herrialdea: ");
      izena = sc.nextLine().trim();
      int pos = -1;
      for (int i = 0; i < herrialdeak.length; i++) {
          if (herrialdeak[i].equalsIgnoreCase(izena)) {
              pos = i;
              break;
          }
      }
      if (pos == -1) {
          System.out.println("Errorea: herrialdea ez da existitzen.");
          return;
      }
 
  break;
 
  case 5:
//  try (PrintWriter pw = new PrintWriter(new FileWriter(fitxategia))) {
//          System.out.println("Herrialdea,Kokapena,Lana,Dirua,Ezagupenak,Denbora,Boterea,Osasuna");
//          for (int i = 0; i < herrialdeak.length; i++) {
//              pw.printf("%s,%s,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f%n",
//                      herrialdeak[i], kokapenak[i], lana[i], dirua[i],
//                      ezagupenak[i], denbora[i], boterea[i], osasuna[i]);
//          }
//          System.out.println("Datuak ondo gorde dira.");
//      } catch (Exception e) {
//          System.out.println("Datuak ez dira ondo gorde: " + e.getMessage());
//      }
//  }

  break;
 
  case 6:
//  double[] kopia = dirua.clone();
//      String[] herrKopia = herrialdeak.clone();
//
//      // Ordenatu txikienetik handienera (Dirua parametroaren arabera)
//      for (int i = 0; i < kopia.length - 1; i++) {
//          for (int j = i + 1; j < kopia.length; j++) {
//              if (kopia[j] < kopia[i]) {
//                  double aux = kopia[i];
//                  kopia[i] = kopia[j];
//                  kopia[j] = aux;
//                  String auxS = herrKopia[i];
//                  herrKopia[i] = herrKopia[j];
//                  herrKopia[j] = auxS;
//              }
//          }
//      }
//
//      System.out.println("Berdintasun mailarik baxuena duten 3 herrialdeak %s, %s eta %s dira.%n",
//              herrKopia[0], herrKopia[1], herrKopia[2]);
//  }
//}

  break;
 
  default:
System.out.println("Aukeratu duzun " + aukera + " ez da dago");
break;
}
  }while (aukera!=7);
  System.out.println("Gero Arteeeee");
 scFile.close();
}
}