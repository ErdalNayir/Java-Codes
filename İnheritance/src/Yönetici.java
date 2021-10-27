public class Yönetici extends Çalışan {
    private int yönettiği;
    
    public Yönetici(String isim,int maaş,String departman,int yönettiği){
        
         super(isim,maaş,departman); // çalışan sınıfının constructor ı kullanıldı
         
         this.yönettiği=yönettiği;
         
        
    }
    public void BilgileriGöster(){ // method overriding yapıldı
        super.BilgileriGöster();
        System.out.println("Yönettiği kişi sayısı:"+this.yönettiği);
        
        
    }
  
        
}
    

