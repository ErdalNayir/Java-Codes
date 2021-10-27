public class Bilgisayar {
    
    private Ekran ekran;
    private Kasa kasa;
    private Anakart anakart;

    public Bilgisayar(Ekran ekran, Kasa kasa, Anakart anakart) {
        this.ekran = ekran;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    /**
     * @return the ekran
     */
    public Ekran getEkran() {
        return ekran;
    }

    /**
     * @param ekran the ekran to set
     */
    public void setEkran(Ekran ekran) {
        this.ekran = ekran;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    /**
     * @return the anakart
     */
    public Anakart getAnakart() {
        return anakart;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
    
    
}
