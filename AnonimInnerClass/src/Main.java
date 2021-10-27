/*
Hiçbir class olmadan obje tanımlayabiliyoruz
Android programlamada işe yarıyor.

*/

public class Main {
    public static void main(String[] args) {
        
        IOgrenci ogrenci=ogrenci = new IOgrenci() {
            
            @Override
            public void DersÇalış() {
                
                System.out.println("Ders açlışılıyor");
            }

            @Override
            public void DerseGir() {
                
                System.out.println("Derse girildi");
                
            }
        };
        
        ogrenci.DerseGir();
        ogrenci.DersÇalış();
   
}
    
    public interface IOgrenci{
        
        void DersÇalış();
        void DerseGir();
        
    }
    
}
