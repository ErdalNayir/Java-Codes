package ınterface;

public class YolculukTest {
    
    public static void main(String[] args) {
        
        Yolcu yolcu =new Yolcu();
        
        int sayaç=0;
        
        if(yolcu.yurtdışıHarcıKontrol() && yolcu.VizeDurumuKontrol() && yolcu.SiyasiYasakKontrol()){
            System.out.println("Yurtdışına çıkabilirsiniz.");
        }
        
    }
    
}
