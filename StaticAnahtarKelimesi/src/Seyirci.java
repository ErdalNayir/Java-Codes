public class Seyirci {
    
    private String isim;
    
    private static int SeyirciSayisi=0;

    public Seyirci(String isim) {
        this.isim = isim;
        this.SeyirciSayisi++;
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

    
    public void OyunSeyret(){
        System.out.println(isim+ " oyun seyrediyor");
    }
    
    
    public static int SeyirciSayisi(){
        
        return SeyirciSayisi;
        
    }
    
    
}
