package no.hvl.dat109.bilutleie;
/**
 * Klassen representerer en bil
 * @author Sander Mikael Løtuft
 */
public class Bil {
    private String registreringsnr;
    private String model;
    private biltyper type;
    private Integer kilometerstand;
    private boolean leiestatus;

    public Bil(String registreringsnr, String model, biltyper type, Integer kilometerstand) {
        this.registreringsnr = registreringsnr;
        this.model = model;
        this.type = type;
        this.kilometerstand = kilometerstand;
        this.leiestatus = false;
    }

    public String getRegistreringsnr() {
        return registreringsnr;
    }

    public void setRegistreringsnr(String registreringsnr) {
        this.registreringsnr = registreringsnr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public biltyper getType() {
        return type;
    }

    public void setType(biltyper type) {
        this.type = type;
    }

    public Integer getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(Integer kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public boolean isLeiestatus() {
        return leiestatus;
    }

    public void setLeiestatus(boolean leiestatus) {
        this.leiestatus = leiestatus;
    }
}
