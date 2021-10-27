package foreach;

public class ForEach {

    public static void main(String[] args) {
        String[] a={"Elma","Armut","Kiraz"};
        
        for(String b : a){
            System.out.println(b);
        }
        
        
        Deneme[] array3={new Deneme("Erdal"),new Deneme("Emre"),new Deneme("Merve")};
    
         for(Deneme ad : array3){
             ad.Yaz();
         }
    
    }
}