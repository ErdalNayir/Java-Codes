
import java.util.Scanner;

public class Login {
    public boolean login(Öğrenci öğrenci){
        
        Scanner scanner=new Scanner(System.in);
        String Doğumyılı;
        String memleket;
        String şifre;
        
            System.out.println("Doğum Yılı: ");
            Doğumyılı=scanner.nextLine();
            System.out.println("Memleket: ");
            memleket=scanner.nextLine();
            System.out.println("Şifre: ");
            şifre=scanner.nextLine();
            
            
        if(öğrenci.getMemleket().equals(memleket) && öğrenci.getDogumYılı().equals(Doğumyılı) && öğrenci.getŞifre().equals(şifre)){
            return true;
        }
        
        else{
            return false;
        }
        
    }

        
 }
    
    

   
    





