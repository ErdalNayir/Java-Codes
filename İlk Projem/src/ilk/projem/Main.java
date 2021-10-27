
public class Main {
    public static void main(String[] args) {
      /* 
        ProgramDilleri programDilleri=new Python("Yüksek", "95", "Python", "PyCharm");
        ProgramDilleri programDilleri1=new Java("Yüksek", "87", "Java", "NetBeans");
        ProgramDilleri programDilleri2=new Cdili("Orta", "71", "C", "Dev C++");
        
        
    Programlar programlar=new Programlar(programDilleri1);
    
    
    programDilleri.BilgileriGöster();
        
       */
      
      int EnBuyukAsal=2;
      
      int YeniAsal;
        
       int sayı=44544623;
        
        int ikinci;
        
        int sayaç=0;
        
        for(YeniAsal=1; YeniAsal<sayı; YeniAsal++){
            
            if(sayı%YeniAsal==0){
                
                
                for(ikinci=2; ikinci<=YeniAsal; ikinci++){
                    
                    if(YeniAsal%ikinci==0){
                        sayaç++;
                    }
                    
                    if(sayaç==1){
                        
                   if(YeniAsal>EnBuyukAsal){
                       
                       EnBuyukAsal=YeniAsal;
                   }
                }
                

                   
               } 
            }
                
             
    
}
        
        System.out.println(EnBuyukAsal);
    }
    
    
}