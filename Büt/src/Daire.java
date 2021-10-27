public class Daire extends Konut{
    
    private int salon_sayisi;
    private int oda_sayisi;
    private int bulunduguKat;

    public Daire(double metreKare, int fiyat, boolean satilik, boolean kiralik, String adres) {
        super(metreKare, fiyat, satilik, kiralik, adres);
        
        this.bulunduguKat = 1 + (int)(Math.random() * ((7 - 1) + 1));;
        
        this.oda_sayisi= 2 + (int)(Math.random() * ((5 - 2) + 1));
        
        this.salon_sayisi= (this.oda_sayisi==5 || this.oda_sayisi==4 )? 1 + (int)(Math.random() * ((2 - 1) + 1)) : 1;
                           
               
                    
        
    }

    public int getSalon_sayisi() {
        return salon_sayisi;
    }

    public void setSalon_sayisi(int salon_sayisi) {
        this.salon_sayisi = salon_sayisi;
    }

    public int getOda_sayisi() {
        return oda_sayisi;
    }

    public void setOda_sayisi(int oda_sayisi) {
        this.oda_sayisi = oda_sayisi;
    }

    public int getBulunduguKat() {
        return bulunduguKat;
    }

    public void setBulunduguKat(int bulunduguKat) {
        this.bulunduguKat = bulunduguKat;
    }
    
    
    
    
    
}
