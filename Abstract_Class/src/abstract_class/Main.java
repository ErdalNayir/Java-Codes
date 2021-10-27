package abstract_class;

// abstract class lardan obje oluşturamıyoruz

public class Main {
    
    public static void main(String[] args) {
        
        Daire daire_1=new Daire("Daire", 5);
        Kare  kare_1= new Kare("Kare", 6);
        
        daire_1.AlanHesapla();
        System.out.println("\n\n");
        kare_1.AlanHesapla();
        
        Şekil şekil_1;
        
        şekil_1=new Kare("Kare_2", 8);
        
        System.out.println("\n\n");
        şekil_1.AlanHesapla();
        
    }
    
}
