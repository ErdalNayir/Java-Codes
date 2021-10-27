package exceptionhandling;

import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author erdal nayir 19360859049
 */
public class ErdalNayir19360859049 {
    
    public static void Bolme(){
        
        int[] ilkSayilar= {2,3,5,6,7,9,10,34,24,76,58,94};
        int[] ikinciSayilar={4,6,8,5,0,5,2,7,0,3,0,5};
        
        int a;
        
        for(int i=0; i<ilkSayilar.length; i++){
            
             try{
                    a = ilkSayilar[i]/ikinciSayilar[i];
                    System.out.println(ilkSayilar[i]+ "/" + ikinciSayilar[i]+" = "+a);
                }
                catch(Exception e){
                    System.out.println("Bir sayıyı 0'a bölemezsiniz");
                }
           
        }
        
        
        
    }
    public static void main(String[] args) {
        
      Bolme();
          
      }
        
   }
  
    

