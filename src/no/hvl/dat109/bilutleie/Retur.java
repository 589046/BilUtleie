package no.hvl.dat109.bilutleie;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Klassen representerer en retur av en bil fra en kunde
 * @author Sander Mikael Løtuft
 */
public class Retur {
    private Utleie utleie;
    private Integer KMstand;
    private LocalDate dato;
    private LocalTime klokkeslett;
    private Avdeling avdeling;

    public Retur(Utleie utleie, Integer KMstand, Avdeling avdeling) {
        this.utleie = utleie;
        this.KMstand = KMstand;
        this.dato = LocalDate.now();
        this.klokkeslett = LocalTime.now();
    }

    public Utleie getUtleie() {
        return utleie;
    }

    public Integer getKMstand() {
        return KMstand;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getKlokkeslett() {
        return klokkeslett;
    }
}
