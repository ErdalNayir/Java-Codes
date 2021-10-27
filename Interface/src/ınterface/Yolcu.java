package ınterface;

import java.util.Scanner;

public class Yolcu implements IYurtDışıKuralları{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız harç miktarı: ");
        this.harc = scanner.nextInt();
        
        System.out.println(" ");
        scanner.nextLine();
        
        System.out.print("Herhangi siyasi yasağınız bulunuyor mu ? : ");
        
        String cevap=scanner.nextLine();
        
        
        System.out.println(" ");
        
        cevap=cevap.toLowerCase();
        
        if(cevap.equals("evet")){
            
            this.siyasiYasak = true; // siyasi yasak var
        
        }
        else if (cevap.equals("hayir")|| cevap.equals("hayır")){
           
            this.siyasiYasak = false; // siyasi yasak yok
            
        }
        
        System.out.print(" Vizeniz Bulunuyor mu ? : ");
        
        String yanıt= scanner.nextLine();
        
        System.out.println(" ");
        
        yanıt=yanıt.toLowerCase();
        
        if(yanıt.equals("evet")){
            
            this.vizeDurumu = true;
        }
        else if(yanıt.equals("hayir") || yanıt.equals("hayır")){
            
            this.vizeDurumu = false;
        }
        
  
    }

   @Override
    public boolean yurtdışıHarcıKontrol() {
        
        if (this.harc>=2500){
            
           
            
            return true;
        }
        else{
            System.out.println("Yurtdışına çıkmak için en az 2500 dolar ödenmeli\n");
            
            return false;
        }
        
    }

    @Override
    public boolean SiyasiYasakKontrol() {
        
        if(!this.siyasiYasak){
            
            
            return  true;
        }
        else{
            System.out.println("Siyasi yasağınız bulunduğundan yurdışına çıkamazsınız.");
            return  false;
        }
    }

    
    @Override
    public boolean VizeDurumuKontrol() {
        
        if(this.vizeDurumu){
            
            return true;
        }
        else{
            System.out.println("Vizeniz bulunmadığından yurtdışına çıkamazsınız.");
            return false;
        }
        
    }
    
    
    
    
}
