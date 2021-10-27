public class Çalışan {
    
    private String isim;
    private int maaş;
    private String departman;

    public Çalışan(String isim, int maaş, String departman) {
        this.isim = isim;
        this.maaş = maaş;
        this.departman = departman;
    }
    
    public void Çalış(){
        System.out.println("Çalışan çalışıyor...");
    
}
    public void BilgileriGöster(){
        System.out.println("İsim: "+this.isim);
        System.out.println("Departman: "+this.departman);
        System.out.println("Maaş: "+this.maaş);
    }
    public void DepartmanDeğiştir(String yeni_departman){
        this.departman=yeni_departman;
        System.out.println("Yeni Departman:"+this.departman);
        
        
    }
    
    
    
}
