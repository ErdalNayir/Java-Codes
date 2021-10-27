
package abstract_class;

public abstract class Şekil {
    private String isim;

    public Şekil(String isim) {
        this.isim = isim;
    }
    
    public void İsimSöyle(){
        
        System.out.println("Bu obje: "+getIsim()+" objesidir");
    }
    
    abstract void AlanHesapla();

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
