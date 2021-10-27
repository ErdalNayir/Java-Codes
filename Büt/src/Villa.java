public class Villa extends Konut{
    
    private int kat_sayisi;
    private boolean havuzluMu;
    private boolean bahceliMi;
    private boolean otoparkliMi;

    public Villa(double metreKare, int fiyat, boolean satilik, boolean kiralik, String adres) {
        super(metreKare, fiyat, satilik, kiralik, adres);
        
        this.kat_sayisi = 1 + (int)(Math.random() * ((3 - 1) + 1));;
        
        float probabilty=(float)Math.random();
        
        this.bahceliMi= (probabilty<0.5)?true:false;
        this.havuzluMu= (probabilty<0.5)?true:false;
        this.otoparkliMi= (probabilty<0.5)?true:false;
    }

    public int getKat_sayisi() {
        return kat_sayisi;
    }

    public void setKat_sayisi(int kat_sayisi) {
        this.kat_sayisi = kat_sayisi;
    }

    public boolean isHavuzluMu() {
        return havuzluMu;
    }

    public void setHavuzluMu(boolean havuzluMu) {
        this.havuzluMu = havuzluMu;
    }

    public boolean isBahceliMi() {
        return bahceliMi;
    }

    public void setBahceliMi(boolean bahceliMi) {
        this.bahceliMi = bahceliMi;
    }

    public boolean isOtoparkliMi() {
        return otoparkliMi;
    }

    public void setOtoparkliMi(boolean otoparkliMi) {
        this.otoparkliMi = otoparkliMi;
    }
    
    
}
