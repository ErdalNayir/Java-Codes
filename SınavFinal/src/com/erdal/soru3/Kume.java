package com.erdal.soru3;

import java.util.ArrayList;

/**
 *
 * @author erdal
 */
public class Kume extends Object{
    
    private ArrayList<Integer> al =new ArrayList<>();

    public Kume(int sayilar []) {
        
        for(int i : sayilar){
            
            al.add(i);
        }
        
    }
    
    public void ekle(int i){
        
        al.add(i);
        
        System.out.println("Eleman eklandi\n");
        
    }
    
    public  boolean sil(int i){
        
        
      try { 
        al.remove(i);
        return true;
    } catch(Exception e){
        return false;
    }
         
        
    }
    
    public void yazdir(){
        
        System.out.println("Küme elemanları\n");
        for(int i : al){
            
            System.out.println(i);
        }
        
        
    }

 
    public int compareTo(Kume o) {
        
        if(this.al.equals(o.al)){
            
            return 1;
        }
        else{
            return 0;
        }
        
    }
    
    
    
    
    
}
