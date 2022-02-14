package no.hvl.dat109.bilutleie;
/**
 * Klassen representerer en Kunde
 * @author Sander Mikael Løtuft
 */
public class Kunde {
    private String fornavn;
    private String etternavn;
    private Integer telefon;
    private Adresse adresse;

    public Kunde(String fornavn, String etternavn, Integer telefon, Adresse adresse) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.adresse = adresse;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
