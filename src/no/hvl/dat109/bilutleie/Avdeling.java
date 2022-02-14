package no.hvl.dat109.bilutleie;
import java.util.ArrayList;
import java.util.List;
/**
 * Klassen representerer en avdeling
 * @author Sander Mikael Løtuft
 */
public class Avdeling {

    private Integer ID;
    private String navn;
    private Adresse adresse;
    private Integer telefon;
    private List<Bil> biler;

    public Avdeling(Integer id, String navn, Adresse adresse, Integer telefon) {
        this.ID = id;
        this.navn = navn;
        this.adresse = adresse;
        this.telefon = telefon;
        this.biler = new ArrayList<Bil>();
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public void addBil(Bil bil) {
        biler.add(bil);
    }

    public void removeBil(Bil bil) {
        biler.remove(bil);
    }

    public List<Bil> getBiler(){
        return biler;
    }
}
