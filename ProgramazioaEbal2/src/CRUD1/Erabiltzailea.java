package CRUD1;

public class Erabiltzailea {
	public int id;
	public String izena;
	public String abizena;
	public String erabiltzaileizena;
	public String pasahitza;
	public boolean aktibo;
	
	//----erakitzaileHutsa----
	public Erabiltzailea() {
		this.id = 0;
		this.izena = "";
		this.abizena = "";
		this.erabiltzaileizena = "";
		this.pasahitza = "";
		this.aktibo = false;
	}
	
	//----erakitzaile----
	public Erabiltzailea(int id, String izena, String abizena, String erabiltzaileizena, String pasahitza,
			boolean aktibo) {
		super();
		this.id = id;
		this.izena = izena;
		this.abizena = abizena;
		this.erabiltzaileizena = erabiltzaileizena;
		this.pasahitza = pasahitza;
		this.aktibo = aktibo;
	}

	//----Getters/Setters----	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getErabiltzaileizena() {
		return erabiltzaileizena;
	}

	public void setErabiltzaileizena(String erabiltzaileizena) {
		this.erabiltzaileizena = erabiltzaileizena;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public boolean isAktibo() {
		return aktibo;
	}

	public void setAktibo(boolean aktibo) {
		this.aktibo = aktibo;
	}

	//----ToString----
	public String toString() {
		return "Erabiltzailea [id=" + id + ", izena=" + izena + ", abizena=" + abizena + ", erabiltzaileizena="
				+ erabiltzaileizena + ", pasahitza=" + pasahitza + ", aktibo=" + aktibo + "]";
	}
	
	
	
}
