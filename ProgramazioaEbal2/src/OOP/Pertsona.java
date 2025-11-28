package OOP;

public class Pertsona {
 private String izena;
 private int adina;
 private String dni;
 
 // ===== Eraikitzaile hutsa =====
 
 public Pertsona () {
	 this.izena = " ";
	 this.dni = " ";
	 this.adina = 0;
 }
 // ========= Eraikitizaliea =========
 public Pertsona (String izena, int adina, String dni) {
	 this.izena = izena;
	 this.adina = adina;
	 this.dni = dni;
 }
	
// ===== Getters ====
 public String getIzena() {
	 return izena;
 }
 
 public String getDni() {
	 return dni;
 }
 

public int getAdina() {
	 return adina;
 }
 
 // ===== Setters ====
 public void setIzena(String izena) {
	 this.izena = izena;
 }
 
 public void setDni(String dni) {
	 this.dni = dni;
 }
 
 public void setAdina(int adina) {
	 this.adina = adina;
 }
 public void imprimatu () {
	 	System.out.println("Izena: " + izena +
	 						" ,Abizena: " + dni +
	 						", Adina: " +adina);
	 	
 }
@Override
public String toString() {
	return "Pertsona [izena=" + izena + ", adina=" + adina + ", dni=" + dni + "]";
}
}

 