public class Ekran {
    
    private String inç;
    private String üretici;
    private Resolution resolution;

    public Ekran(String inç, String üretici, Resolution resolution) {
        this.inç = inç;
        this.üretici = üretici;
        this.resolution = resolution;
    }
    
    public void MonitörKapat(){
        System.out.println("Monitor Kapatılıyor...");
    }

    /**
     * @return the inç
     */
    public String getInç() {
        return inç;
    }

    /**
     * @param inç the inç to set
     */
    public void setInç(String inç) {
        this.inç = inç;
    }

    /**
     * @return the üretici
     */
    public String getÜretici() {
        return üretici;
    }

    /**
     * @param üretici the üretici to set
     */
    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
}
