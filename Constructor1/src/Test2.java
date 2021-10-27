
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Test2 {
    public static void main(String[] args) {
        
        Account account1= new Account();
        
        account1.setHesapNo("19360859049");
        account1.setTelefonNo("05395484325");
        account1.setEmail("erdal4568@gmail.com");
        account1.setIsim("Erdal Nayir");
        account1.setBakiye(3000);
        
        //System.err.println("Güncel Bakiyeniz:"+" "+account1.getBakiye());
        
        Account account2= new Account("15015962869",2000,"@Emre Nayir","bahsjsjbanan5371@gmail.com","05054716311");
        
        //account2.paraYatır(150);
        //account1.paraYatır(200);
        
        
        Account account3=new Account(2000,"Erdal");
        
        account1.BilgileriGöster();
       
        
   
}
    
}
