package janariak;

import java.util.Objects;

public class janaria {

	String izena;
	String egoera;
	double kaloriak;
	double koipeak;
	double proteinak;
	double karbohidratoak;
	String mota;

		//-------Eraikitzaile hutsa------
	public janaria () {
		this.izena = "";
		this.egoera = "";
		this.kaloriak=0.0;
		this.koipeak=0.0;
		this.proteinak=0.0;
		this.karbohidratoak=0.0;
		this.mota="";
	}
	 // -------Eraikitzailea---------
	public janaria (String izen,String egoe, double kalor, double koipe, double protei, double karbohidrato, String mot) {
		this.izena = izen;
		this.egoera = egoe;
		this.kaloriak = kalor;
		this.koipeak = koipe;
		this.proteinak = protei;
		this.karbohidratoak = karbohidrato;
		this.mota = mot;
	}
	// ------Getters eta Setters------
	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getEgoera() {
		return egoera;
	}

	public void setEgoera(String egoera) {
		this.egoera = egoera;
	}

	public double getKaloriak() {
		return kaloriak;
	}

	public void setKaloriak(double kaloriak) {
		this.kaloriak = kaloriak;
	}

	public double getKoipeak() {
		return koipeak;
	}

	public void setKoipeak(double koipeak) {
		this.koipeak = koipeak;
	}

	public double getProteinak() {
		return proteinak;
	}

	public void setProteinak(double proteinak) {
		this.proteinak = proteinak;
	}

	public double getKarbohidratoak() {
		return karbohidratoak;
	}

	public void setKarbohidratoak(double karbohidratoak) {
		this.karbohidratoak = karbohidratoak;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}
 // -----ToString-----
	public String toString() {
		return "janaria [izena=" + izena + ", egoera=" + egoera + ", kaloriak=" + kaloriak + ", koipeak=" + koipeak
				+ ", proteinak=" + proteinak + ", karbohidratoak=" + karbohidratoak + ", mota=" + mota + "]";
	}
}