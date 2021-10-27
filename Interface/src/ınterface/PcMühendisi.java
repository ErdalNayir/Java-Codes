package ınterface;


public class PcMühendisi implements IMühendis{
    
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMühendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    

    @Override
    public void askerlik_sorgula() {
        
        if(askerlik){
            System.out.println("Askerliğimi Yaptım");
        }
        else{
            System.out.println("Askerliğimi henüz yapmadım");
        }
        
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        
        return "Ortalamam: "+ derece;
        
    }

    @Override
    public void adli_sicil_sorgula() {
        
        if(adli_sicil){
            System.out.println("Adli Sicil Kaydım var");
        }
        else{
            System.out.println("Adli sicil kaydım yok");
        }
    }

    @Override
    public void is_tecrübesi(String[] array) {
        
        System.out.println("Bilgisayar Mühendisi Olarak Şu şirketlerde çalıştım:\n ");
        
        
        for(String a : array){
            
            System.out.println(a);
        }
        
    }
    
}
