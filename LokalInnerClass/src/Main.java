/*
Lokal ınner claslar metodların üyesidir
lokal ineer claslara başka başka metodlaradan erişilemiyor çünkü bunlar metodun içinde oluşturulmuş değişlkenler gibi sadece metoda özgüler

*/

public class Main {
    public static void main(String[] args) {
   
        
        class Alan{
            
            public  void Daire_alan(int yarıçap){
                
                System.out.println("Diarenin alanı: "+yarıçap*yarıçap*Math.PI);
                
            }
        }
        
        Alan alan =new Alan();
        
        alan.Daire_alan(4);
}
    
}
