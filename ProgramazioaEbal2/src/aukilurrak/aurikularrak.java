package aukilurrak;

public class aurikularrak {

	private String modelo;
	private String marca;
	private double precio;
	private int stock;
	// ======= Eraikitzaile Hutsa =======
	public aurikularrak () {
		this.modelo = " ";
		this.marca = " ";
		this.precio = 0;
		this.stock = 0;
	}
	// ========= Eraikitzailea ==========
	public aurikularrak (String model, String mar, double pre, int sto) {
		this.modelo = model;
		this.marca = mar;
		this.precio = pre;
		this.stock = sto;
	}
	// ======= getters =======
	public String getModelo () {
		return modelo;
	}
	public String getmarca () {
		return marca;
	}
	public double getprecio () {
		return precio;
	}
	public int getstock () {
		return stock;
	}
	// ====== Setters ======
	public void setModelo (String model) {
		this.modelo = model;
	}
	public void setMarca (String mar) {
		this.marca = mar;
	}
	public void setPrecio (double pre) {
		this.precio = pre;
	}
	public void setStock (int sto) {
		this.stock = sto;
	}
	public String toString() {
		return "aurikularrak [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
}
