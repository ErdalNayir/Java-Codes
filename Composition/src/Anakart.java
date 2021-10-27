public class Anakart {
    
    private String isim;
    private String Ram;
    private String işletim;
    

    public Anakart(String isim, String Ram,String işletim) {
        this.isim = isim;
        this.Ram = Ram;
        this.işletim= işletim;
    }

    
    public void İşletimsistemi_yükle(String yeni_işletim){
        
        this.işletim=yeni_işletim;
        System.out.println("İşletim sistemi yüklendi");
        System.out.println("Yeni İşletim Sistemi: "+yeni_işletim);
    }
    
    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the Ram
     */
    public String getRam() {
        return Ram;
    }

    /**
     * @param Ram the Ram to set
     */
    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    /**
     * @return the işletim
     */
    public String getIşletim() {
        return işletim;
    }

    /**
     * @param işletim the işletim to set
     */
    public void setIşletim(String işletim) {
        this.işletim = işletim;
    }
    
    
    
    
    
}
