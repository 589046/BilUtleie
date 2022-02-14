package no.hvl.dat109.bilutleie;
/**
 * Klassen representerer en betaling
 * @author Sander Mikael Løtuft
 */
public class Betaling {
    private String kredittkort;
    private boolean regning;

    public Betaling(String kredittkort, boolean regning) {
        this.kredittkort = kredittkort;
        this.regning = regning;
    }

    public String getKredittkort() {
        return kredittkort;
    }

    public void setKredittkort(String kredittkort) {
        this.kredittkort = kredittkort;
    }

    public boolean isRegning() {
        return regning;
    }

    public void setRegning(boolean regning) {
        this.regning = regning;
    }

    public boolean godkjent() {
        return true;
    }
}
