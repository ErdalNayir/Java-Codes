/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author erdal
 */
public class Array {
    
    public static void bolumleriYazdir(){
            int[] dizi1 = {1,2,3,5,8};
            int[] dizi2 = {2,1,0,2,0};
            double bolum = 0.0;
            
            for(int i=0;i<dizi1.length;i++){
                try{
                    bolum = dizi1[i]/dizi2[i];
                    System.out.println("Bolum: "+bolum);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    
    public static void main(String[] args) {
        
        bolumleriYazdir();
    }
    }
    
 
        
        
    
    


 
    
