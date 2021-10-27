package polymorphism;


 class Çalışan{
     private String isim;

    public Çalışan(String isim) {
        this.isim = isim;
        
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
    
    public String Çalış(){
        return  "Çalışan Çalışıyor...";
        
     }

    
 }
 
 class Mühendis extends Çalışan{

    public Mühendis(String isim) {
        super(isim);
    }

    @Override
    public String Çalış() {
        return this.getIsim()+"yazılım oluşturuyor...";    //To change body of generated methods, choose Tools | Templates.
    }
     
     
 }
 
 class Temizlikçi extends Çalışan{

    public Temizlikçi(String isim) {
        super(isim);
    }

    @Override
    public String Çalış() {
        return this.getIsim()+"temizliyor...";   //To change body of generated methods, choose Tools | Templates.
    }
     
 }
 
 class Danışman extends Çalışan{

    public Danışman(String isim) {
        super(isim);
    }

    @Override
    public String Çalış() {
        return this.getIsim()+" Konuşuyor...";   //To change body of generated methods, choose Tools | Templates.
    }
     
 }





public class polymorphism {
    
    public static void Çalıştır(Çalışan çalışan){
        System.out.println(çalışan.Çalış());
    }
    public static void main(String[] args) {
        Çalışan çalışan=new Danışman("Melis");
        Çalıştır(new Temizlikçi("Fatih"));
        
        System.out.println(çalışan.Çalış());
        
        if (çalışan instanceof Danışman) {
            System.out.println("Bu çalışan Danışmandır");;
            
        }
        
    }
}
