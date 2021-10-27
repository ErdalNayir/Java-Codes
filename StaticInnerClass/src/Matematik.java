// static inner class ile direkt alt sınıftan obje oluşturabiliriz

public class Matematik { 
    
    private static double PI=Math.PI;
    
    public static class Alan{
        
        public static void daire_alan(int yaricap){
            
            System.out.println("Dairenin alanaı: "+yaricap*yaricap*PI); // bir özelliği static alanada kullanmamız için bu özelliğinde static olması lazım
        }
    }
    
}
