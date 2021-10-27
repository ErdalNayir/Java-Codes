package sınav;

import java.util.Date;

public class Kitap {
    
    private String kitapAd;
    private Date basim_tarihi;
    
    private Yazar yazar;

    public Kitap(String kitapAd, Date basim_tarihi, Yazar yazar) {
        
        this.kitapAd = kitapAd;
        this.basim_tarihi = basim_tarihi;
        this.yazar = yazar;
        
    }

    /**
     * @return the kitapAd
     */
    public String getKitapAd() {
        return kitapAd;
    }

    /**
     * @param kitapAd the kitapAd to set
     */
    public void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }

    /**
     * @return the basim_tarihi
     */
    public Date getBasim_tarihi() {
        return basim_tarihi;
    }

    /**
     * @param basim_tarihi the basim_tarihi to set
     */
    public void setBasim_tarihi(Date basim_tarihi) {
        this.basim_tarihi = basim_tarihi;
    }

    /**
     * @return the yazar
     */
    public Yazar getYazar() {
        return yazar;
    }

    /**
     * @param yazar the yazar to set
     */
    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
    
}
