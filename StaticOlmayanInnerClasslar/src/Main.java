
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Matematik.Factorial faktoriyel = new Matematik().new Factorial(); // Önce Mat classını oluştur sonra faktoriyeli oluştur
        
        Matematik.Asal asal = new Matematik().new Asal();
        
        Matematik.Alan alan = new Matematik().new Alan();
        
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        
        int sayi= scanner.nextInt();
        
        
        
        
        if(asal.AsalMı(sayi)){
            System.out.println("Asaldır");
        }
        else{
            System.out.println("Asal Değil");
        }
        
        faktoriyel.Faktoriyel();
        
        alan.DaireAlan(6);
        
    }
}
