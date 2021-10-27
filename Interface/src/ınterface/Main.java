
package ınterface;

/**
 *
 * @author erdal
 */
public class Main {
    
    public static void main(String[] args) {
        
        PcMühendisi mühendis_1= new PcMühendisi(false, false);
        
        mühendis_1.askerlik_sorgula();
        mühendis_1.adli_sicil_sorgula();
        
        System.out.println(mühendis_1.mezuniyet_ortalaması(3.59));
        
        String[] şirketler={"Beko","Arçelik","Microsoft","Aselsan"};
        
        mühendis_1.is_tecrübesi(şirketler);
     
        
        //  IMühendis mühendis_1= new PcMühendisi(false, false);  bu yazış şeklide doğru ama eğer PcMühendisi classında extradan bir metod var sa hata verir
        
    }
    
}
