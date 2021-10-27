/*

Türden bağımsız işlemler gerçekleştirebildiğimiz classlar ya da metodlardır.
*/

public class Main {
    public static void main(String[] args) {
        
        Integer[] sayılar={1,2,3,4};
        
        String[] isimler={"ali","ayşe","kemal","mustafa"};
        
        Character[] harfler={'A','B','C','D'};
        
        
        YazdırmaSınıfı<Character> yazdır_char=new YazdırmaSınıfı<Character>();
        YazdırmaSınıfı<Integer> yazdır_int=new YazdırmaSınıfı<Integer>();
        YazdırmaSınıfı<String> yazdır_string=new YazdırmaSınıfı<String>();
        
        
        
        yazdır_int.Yazdır(sayılar);
        yazdır_string.Yazdır(isimler);
        yazdır_char.Yazdır(harfler);
        
       
        System.out.println("*************************************************");
        
        yazdır(sayılar);
        yazdır(isimler);
        yazdır(harfler);
        
   
}
    
    public static <E> void yazdır(E[] dizi){  //Generic metod
        
        for(E item : dizi){
            
            System.out.println(item);
        }
    }
    
}
