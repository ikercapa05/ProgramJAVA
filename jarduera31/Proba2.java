package ebal1.jarduera31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Proba2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("./src/datuak/proba2.txt");
		Scanner scFile=new Scanner (file);

//		IDAZTEKO HURRENGO BI KLASEAK		
//		FileWriter fw =new FileWriter(file,true);
//		PrintWriter pw = new PrintWriter(fw);
		Scanner sc = new Scanner (System.in);
		//System.out.println("Sartu lerro berri bat");
//		String lerroa =sc.nextLine();
		int kont=0;
		
		
		
		String lerroa;
		while (scFile.hasNext()) {
			lerroa=scFile.nextLine();
			//System.out.println(lerroa);
			kont++;
		}
		scFile=new Scanner (file);
		System.out.println(kont);
		String [] izena=new String[kont];
		String [] abizena=new String[kont];
		String[] herria=new String[kont];
		String[] zatiak;
		int i=0;
		//lerroa=scFile.nextLine();
		
		while (scFile.hasNext()) {
			lerroa=scFile.nextLine();
			zatiak=lerroa.split(":");
			izena[i]=zatiak[0];
			abizena[i]=zatiak[1];
			herria[i]=zatiak[2];
			//lerroa=scFile.nextLine();
			i++;
		}
		System.out.println(izena[1]+abizena[1]+herria[1]);
//		for (int j=0;j<izena.length;j++) {
//			System.out.println(izena[j]);
//		}
		
//		
//		
//		
//		while (scFile.hasNext()) {
//			lerroa=scFile.nextLine();
//			System.out.println(lerroa);
//		}
		
		
		
		
		
//		pw.println(lerroa);
//		
//		
//		fw.close();
//		pw.close();
		scFile.close();
		sc.close();
		
		
//		String lerroa=null;
//		
//		IRAKURTZEKO SCANNER-REKIN
//		
//		while (scFile.hasNext()) {
//			lerroa=scFile.nextLine();
//			System.out.println(lerroa);
//		}
		
		
		
		
// 		IRAKURTZEKO FileReader eta BufferedReader-rekin
//		FileReader fr =new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		
//		String lerroa=null;
//		lerroa=br.readLine();
//		while(lerroa!=null) {
//			System.out.println(lerroa);
//			lerroa=br.readLine();
//			
//		}
		
		

	}

}
