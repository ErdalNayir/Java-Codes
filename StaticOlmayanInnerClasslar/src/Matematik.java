
import java.util.Scanner;

public class Matematik {
    
    private double PI=Math.PI;
    
    
    public class Factorial {
        
        public void Faktoriyel(){
            
            Scanner scanner=new Scanner(System.in);
            
            System.out.println("Bir sayı giriniz");
            
            int sayi= scanner.nextInt();
            
            int fakt=1;
            
            for(int i=2; i<=sayi; i++){
                
                fakt=fakt*i;
                
            }
            
            System.out.println("Faktoriyel: "+ fakt);
            
            
            
        }
        
    }
    
    public class Asal{
        
        
        public boolean AsalMı(int sayi){
            
            int i=2;
            
            while(i<sayi){
                
                if(sayi%i==0){
                    
                    return false;
                    
                }
                i++;
                
        }
            
            return  true;
    }
}
    
    
    
    public class Alan{
        
        public void DaireAlan(int yarıçap){
            
            System.out.println("Dairenin alanı: "+(yarıçap*yarıçap*PI));
            
        
    }
    }


}