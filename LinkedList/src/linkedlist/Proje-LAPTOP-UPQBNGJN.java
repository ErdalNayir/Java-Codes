
package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Proje {
    
    
    public static void islemleri_bastır(){
        
        System.out.println("1- Bir sonraki şehre git");
        System.out.println("2- Bir önceki şehre git");
        System.out.println("0- Çıkış");
        
    }
    
    
    
    
    public static void Sehir_turla(LinkedList<String> Liste){
        
        Scanner scanner =new Scanner(System.in);
        
        ListIterator<String> iterator=Liste.listIterator();
        
        int islem;
        
       if(!iterator.hasNext()){ // Listenin boşluğu kontrol ediliyor
           
           System.out.println("Listede hiçbir ülke bulunmuyor");
           
           System.out.println("");
           
           System.out.println("Sistemden çıkılıyor...");
           
           return;
       }
       
       else{
       
       boolean çıkış=false;
       boolean ileri=true;
       
      while(!çıkış){
          System.out.println("Bir işlem seçiniz: ");
          
          System.out.println("************************************************");
          
          
          islemleri_bastır();
          
          System.out.println("************************************************");
          
          islem=scanner.nextInt();
          
          if(islem==0){
              
              System.out.println("Sistemden Çıkılıyor");
              çıkış=true;
          }
          else if(islem==1){
              
              if(!ileri){ // onceden ileri gidip gidilmediği kontrol ediliyor gidilmediyse ileri gidiyor
                  if(iterator.hasNext()){
                  iterator.next();
                  }
              }
              ileri=true;
              
              if(iterator.hasNext()){
                  
                  System.out.println("Ülkeye Gidiliyor: "+iterator.next());
                  System.out.println(" ");
                }
              else{
                  System.out.println("Daha Fazla ileri gidilemiyor");
                  ileri=true;
              }
             
              
          }
          else if(islem==2){
              
              if(ileri){ // onceden ileri gidip gidilmediği kontrol ediliyor ileri gidildiyse geri gidiyor gidiyor
                  if(iterator.hasPrevious()){
                  
                  iterator.previous();
                  
                  }
              }
              ileri=false;
              
              if(iterator.hasPrevious()){
                  System.out.println("Bir önceki şehire gidiliyor: "+iterator.previous());
                  System.out.println(" ");
              }
              
              else{
                  System.out.println("Geri gidilemiyor");
                  
              }
          }
          
      }
          
          
      }
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        LinkedList<String> ülkeler = new LinkedList<String>();
        
      
        
        ülkeler.add("Japonya");
        ülkeler.add("Almanya");
        ülkeler.add("Kanada");
        ülkeler.add("Fransa");
        ülkeler.add("İspanya");
      
        
        
        Sehir_turla(ülkeler);
        
        
        
    }
    
    
}
