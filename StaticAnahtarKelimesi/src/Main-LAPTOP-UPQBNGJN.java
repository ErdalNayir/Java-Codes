public class Main {
    public static void main(String[] args) {
   
        Seyirci seyirci_1=new Seyirci("Erdal");
        Seyirci seyirci_2 = new Seyirci("Emre");
        
        
        seyirci_1.OyunSeyret();
        
        //System.out.println("Seyirci Sayisi: "+ Seyirci.SeyirciSayisi);// eğer seyirci sayisi özelliği public olursa böyle  kullanabiliriz
        
        
        System.out.println("Seyirci Sayisi: "+ Seyirci.SeyirciSayisi());
        
       
        
    }
}
