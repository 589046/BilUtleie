package no.hvl.dat109.bilutleie;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Klassen representerer en utleie av en bil til en kunde
 * @author Sander Mikael Løtuft
 */
public class Utleie extends Reservasjon{

    private Betaling betaling;

    public Utleie(Kunde kunde, Bil bil, Integer kmStand, Avdeling avdeling, LocalDate dato, LocalTime klokkeslett, Integer dager, Betaling betaling) {
        super(kunde, bil, kmStand, avdeling, dato, klokkeslett, dager);
        this.betaling = betaling;
    }
}
