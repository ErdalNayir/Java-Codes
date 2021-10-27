package ınnerclassproje;

public class Matematik {
    
    public static class Alan{
        
        public static void KareAlan(int uzunluk){
            
            System.out.println("Karenin Alanı: "+uzunluk*uzunluk);
        }
        
        public static void DaireAlan(int yarıcap){
            
            System.out.println("Dairenin Alanı: "+yarıcap*yarıcap*Math.PI);
        }
        public static void DikdortgenAlan(int kısaKenar,int uzunKenar){
            
            System.out.println("Dikdörtgenin Alanı: "+kısaKenar*uzunKenar);
        }
    
    
}
    public static class Çevre{
        
        public static void KareÇevre(int uzunluk){
        
            System.out.println("Karenin Çevresi: "+uzunluk*4);
        
        }
        
         public static void DaireÇevre(int yarıcap){
             
             System.out.println("Dairenin Çevresi: "+2*yarıcap*Math.PI);
             
         }
         
         public static void DikdortgenÇevre(int kısaKenar,int uzunKenar){
             
             System.out.println("Dikdörtgenin Çevresi: "+(kısaKenar+kısaKenar +uzunKenar+ uzunKenar));
             
             
         }
         
    }
    
    public static class Vektörİşlemleri{
        
        public static void VektorToplam(Vektor vektor_ilk,Vektor vektor_son){
            
            System.out.println("Toplamaı: "+"i: "+(vektor_ilk.i_dim+vektor_son.i_dim)+" j: "+(vektor_ilk.j_dim+vektor_son.j_dim)+" k: "+(vektor_ilk.k_dim+vektor_son.k_dim));
        }
        
        public static void VektorCarpım(Vektor vektor_ilk,Vektor vektor_son){
            
            System.out.println("Çarpım: "+"i: "+(vektor_ilk.i_dim*vektor_son.i_dim)+" j: "+(vektor_ilk.j_dim*vektor_son.j_dim)+" k: "+(vektor_ilk.k_dim*vektor_son.k_dim));
            
        }
        
    }
    
}
