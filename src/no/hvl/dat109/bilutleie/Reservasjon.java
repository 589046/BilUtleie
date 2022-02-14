package no.hvl.dat109.bilutleie;

import java.time.*;
/**
 * Klassen representerer en bil reservasjon fra en kunde
 * @author Sander Mikael Løtuft
 */
public class Reservasjon {

    private Kunde kunde;
    private Bil bil;
    private Integer kmStand;
    private Avdeling avdeling;
    private LocalDate dato;
    private LocalTime klokkeslett;
    private Integer dager;

    public Reservasjon() {
    }

    public Reservasjon(Kunde kunde, Bil bil, Integer kmStand, Avdeling avdeling, LocalDate dato, LocalTime klokkeslett, Integer dager) {
        this.kunde = kunde;
        this.bil = bil;
        this.kmStand = kmStand;
        this.avdeling = avdeling;
        this.dato = dato;
        this.klokkeslett = klokkeslett;
        this.dager = dager;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }

    public Integer getKmStand() {
        return kmStand;
    }

    public void setKmStand(Integer kmStand) {
        this.kmStand = kmStand;
    }

    public Avdeling getAvdeling() {
        return avdeling;
    }

    public void setAvdeling(Avdeling avdeling) {
        this.avdeling = avdeling;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public LocalTime getKlokkeslett() {
        return klokkeslett;
    }

    public void setKlokkeslett(LocalTime klokkeslett) {
        this.klokkeslett = klokkeslett;
    }

    public Integer getDager() {
        return dager;
    }

    public void setDager(Integer dager) {
        this.dager = dager;
    }
}
