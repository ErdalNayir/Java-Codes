/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author erdal
 */
public class Main {
    
    
    public static void Bastır(LinkedList<String> a){
        
       /* for(String ülke : a){
            System.out.println(ülke); ForEach ile Bastırma
        }
        */
       
       //KARMAŞIK İŞLEMLER İÇİN İTERATOR OLUŞTURMA
       
        ListIterator<String> iterator = a.listIterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public static void SiraliEkle(LinkedList<String> Liste,String yeni){
        
        
        ListIterator<String> iterator = Liste.listIterator();
        
        while (iterator.hasNext()) {
                
            int karsilastir = iterator.next().compareTo(yeni);
            
            if(karsilastir==0){
                // karşılaştırılan değerler eşitse
                System.out.println("Listenizde Bu eleman Bulunmaktadır...");
                
                return;
            }
            else if(karsilastir<0){
                // yeni element iterator.next()  den daha büyük
                
                
            }
            
            else if(karsilastir>0){
                // yeni element iterator.next() den daha küçük
                
                iterator.previous();
                
                iterator.add(yeni);
                
                return;
                        
            }
          
            
        }
        iterator.add(yeni);
        
        
    }
    
    
    public static void main(String[] args) {
       
        /*
        LinkedList<String> gezilecek_yerler= new LinkedList<String>();
        
        gezilecek_yerler.add("Japonya");
        gezilecek_yerler.add("Almanya");
        gezilecek_yerler.add("Kanada");
        gezilecek_yerler.add("Fransa");
        gezilecek_yerler.add("İspanya");
        
        Bastır(gezilecek_yerler);
        
        gezilecek_yerler.add(3,"Ukrayna");
        
        System.out.println("-----------------------------------------");
        
        Bastır(gezilecek_yerler);
        
        System.out.println("-----------------------------------------");


        */
         LinkedList<String> gezilecek= new LinkedList<String>();
        
        SiraliEkle(gezilecek, "Postane");
        SiraliEkle(gezilecek, "Market");
        SiraliEkle(gezilecek, "Ev");
        
        
        
        Bastır(gezilecek);
    }
    
    
}
