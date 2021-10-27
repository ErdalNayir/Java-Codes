package foreach;

public class Deneme {
    
    private String isim;

    public Deneme(String isim) {
        this.isim = isim;
    }

    
    public void Yaz(){
        System.out.println(isim);
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
    
}
