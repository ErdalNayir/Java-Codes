public class Konut {
    
    public double metreKare;
    public int fiyat;
    public boolean satilik;
    public boolean kiralik;
    public String adres;

    public Konut(double metreKare, int fiyat, boolean satilik, boolean kiralik, String adres) {
        this.metreKare = metreKare;
        this.fiyat = fiyat;
        this.satilik = satilik;
        this.kiralik = kiralik;
        this.adres = adres;
    }

    public double getMetreKare() {
        return metreKare;
    }

    public void setMetreKare(double metreKare) {
        this.metreKare = metreKare;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isSatilik() {
        return satilik;
    }

    public void setSatilik(boolean satilik) {
        this.satilik = satilik;
    }

    public boolean isKiralik() {
        return kiralik;
    }

    public void setKiralik(boolean kiralik) {
        this.kiralik = kiralik;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
    
}
