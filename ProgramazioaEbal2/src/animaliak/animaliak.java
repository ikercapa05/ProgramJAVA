package animaliak;

import java.util.Arrays;

public class animaliak {
	 String izena;
	 String espeziea;
	 int adina; 
	 String habitat [];
	
	public animaliak(String izena, String espeziea, int adina, String[] habitat) {
		this.izena = izena;
		this.espeziea = espeziea;
		this.adina = adina;
		this.habitat = habitat;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getEspeziea() {
		return espeziea;
	}

	public void setEspeziea(String espeziea) {
		this.espeziea = espeziea;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public String[] getHabitat() {
		return habitat;
	}

	public void setHabitat(String[] habitat) {
		this.habitat = habitat;
	}

	
	public String toString() {
		return "animaliak [izena=" + izena + ", espeziea=" + espeziea + ", adina=" + adina + ", habitat="
				+ Arrays.toString(habitat) + "]";
	}
	 public void datuakErakutsi() {
	        System.out.println("---------------------------------");
	        System.out.println("Izena (Nombre): " + izena);
	        System.out.println("Espeziea/Tipoa (Especie/Tipo): " + espeziea);
	        System.out.println("Adina (Edad media): " + adina + " urte");
	        System.out.print("Habitat-ak (Hábitats): ");
	        for (int i = 0; i < habitat.length; i++) {
	            System.out.print(habitat[i]);
	            if (i < habitat.length - 1) {
	                System.out.print(", ");
	            }
	        }
	 }
}
