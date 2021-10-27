package sınav;

import java.util.Scanner;


public class Sınav {

    public static void main(String[] args) {
        
        StringBuilder cumle= new StringBuilder();
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Metin giriniz: ");
        
        String metin= scanner.nextLine();
        
        cumle.append(metin);
        
        int i=0;
        
    while(i<cumle.length()){   
        
      int index=0;
    
        if(cumle.indexOf("a")!=-1){
            
            index=cumle.indexOf("a");
            cumle.deleteCharAt(index);
            
        }
        if(cumle.indexOf("A")!=-1){
            
            index=cumle.indexOf("A");
            cumle.deleteCharAt(index);
        }
        
        if(cumle.indexOf("e")!=-1){
            
            index=cumle.indexOf("e");
            cumle.deleteCharAt(index);
            
    }
        
        if(cumle.indexOf("E")!=-1){
            
            index=cumle.indexOf("E");
            cumle.deleteCharAt(index);
        }
            
        if(cumle.indexOf("u")!=-1){
            
            index=cumle.indexOf("u");
            cumle.deleteCharAt(index);
        
        
        }
        if(cumle.indexOf("U")!=-1){
            
            index=cumle.indexOf("U");
            cumle.deleteCharAt(index);
        
        
        }
        
        if(cumle.indexOf("o")!=-1){
            
            index=cumle.indexOf("o");
            cumle.deleteCharAt(index);
        
        
        }
        if(cumle.indexOf("O")!=-1){
            
            index=cumle.indexOf("O");
            cumle.deleteCharAt(index);
        
        
        }
        
        i++;
        
        }
    
        System.out.println(cumle);
    
    }
    
}
