package no.hvl.dat109.bilutleie;

/**
 * Klassen representerer en addresse
 * @author Sander Mikael Løtuft
 */
public class Adresse {

    private String gateAdresse;
    private Integer postNr;
    private String postSted;

    public Adresse(String gateAdresse, Integer postNr, String postSted) {
        this.gateAdresse = gateAdresse;
        this.postNr = postNr;
        this.postSted = postSted;
    }

    public String getGateAdresse() {
        return gateAdresse;
    }

    public void setGateAdresse(String gateAdresse) {
        this.gateAdresse = gateAdresse;
    }

    public Integer getPostNr() {
        return postNr;
    }

    public void setPostNr(Integer postNr) {
        this.postNr = postNr;
    }

    public String getPostSted() {
        return postSted;
    }

    public void setPostSted(String postSted) {
        this.postSted = postSted;
    }
}
