package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author erdal
 */
public class Diziİslemleri {
    
    public static  int [] DiziDoldur(int sayi){
        
        int[] a=new int[sayi];
        
        for(int i =0; i<sayi; i++){
            Scanner scanner=new Scanner(System.in);
            
            a[i]=scanner.nextInt();
        }
        return a;
    }
    
    public static void DiziBastır(int[] b){
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        
    }
    
    public static void DiziSırala(int[] array){
        
        Arrays.sort(array);
        
        DiziBastır(array);
    }
    
    
    public static void main(String[] args) {
        
        int[] dizi=DiziDoldur(10);
        System.out.println("------------------------------------------------------");
        DiziBastır(dizi);
        System.out.println("-------------------------------------------------------");
        
        System.out.println("Sıralanmış dizi:");
        System.out.println("\n");
        
        DiziSırala(dizi);
        
        
        System.out.println("\n\n\n");
        
        int[] a1={1,2,3,4,5};
        int[] a2={1,2,3,4,5};
        
        if(Arrays.equals(a1, a2)){ // dizileri karşılaştırmak için kullanılır
            System.out.println("Eşittler");
        }
        else{
            System.out.println("Eşit değiller");
        }
    }
    
}
