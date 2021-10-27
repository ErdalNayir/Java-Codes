public class Kasa {
    private  String üretici;
    private String model;

    public Kasa(String üretici, String model) {
        this.üretici = üretici;
        this.model = model;
    }
    
    public void BilgisayarAç(){
        System.out.println("Bilgisayarınız Açıldı");
    
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    
}
