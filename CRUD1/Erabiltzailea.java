package CRUD1;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Erabiltzailea {

    private int id;
    private String izena;
    private String abizena;
    private String erabiltzaileIzena;
    private String pasahitza;
    private boolean aktibo;

    // Parametrorik gabeko sortzailea
    public Erabiltzailea() {}

    // Parametrodun sortzailea
    public Erabiltzailea(int id, String izena, String abizena,
                         String erabiltzaileIzena, String pasahitza, boolean aktibo) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.erabiltzaileIzena = erabiltzaileIzena;
        this.pasahitza = pasahitza;
        this.aktibo = aktibo;
    }

    // Getters
    public int getId() { return id; }
    public String getIzena() { return izena; }
    public String getAbizena() { return abizena; }
    public String getErabiltzaileIzena() { return erabiltzaileIzena; }
    public String getPasahitza() { return pasahitza; }
    public boolean isAktibo() { return aktibo; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setIzena(String izena) { this.izena = izena; }
    public void setAbizena(String abizena) { this.abizena = abizena; }
    public void setErabiltzaileIzena(String erabiltzaileIzena) { this.erabiltzaileIzena = erabiltzaileIzena; }
    public void setPasahitza(String pasahitza) { this.pasahitza = pasahitza; }
    public void setAktibo(boolean aktibo) { this.aktibo = aktibo; }

    // toString
    @Override
    public String toString() {
        return id + " - " + izena + " " + abizena + " (" + erabiltzaileIzena + ") Aktibo: " + aktibo;
    }

    // ------------------------------
    //   METODO ESTATIKOAK
    // ------------------------------

    public static ArrayList<Erabiltzailea> datuakKargatu(String fitxategiIzena) {
        ArrayList<Erabiltzailea> lista = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(fitxategiIzena))) {

            while (sc.hasNextLine()) {
                String lerroa = sc.nextLine();
                String[] z = lerroa.split(":");

                Erabiltzailea e = new Erabiltzailea(
                        Integer.parseInt(z[0]),
                        z[1],
                        z[2],
                        z[1],               // erabiltzaileIzena = izena (fitxategiak ez du jartzen)
                        z[3],
                        z[4].equals("1"));

                lista.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public static void datuakGorde(ArrayList<Erabiltzailea> lista, String fitxategiIzena) {
        try (FileWriter fw = new FileWriter(fitxategiIzena)) {

            for (Erabiltzailea e : lista) {
                String linea =
                        e.getId() + ":" +
                        e.getIzena() + ":" +
                        e.getAbizena() + ":" +
                        e.getPasahitza() + ":" +
                        (e.isAktibo() ? "1" : "0") +
                        "\n";

                fw.write(linea);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
