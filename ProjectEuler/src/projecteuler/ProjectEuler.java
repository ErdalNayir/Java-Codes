package projecteuler;


 
public class ProjectEuler {

    public static void main(String[] args) {
        
        int sum_of_squares=0;
        
        int square_of_sum=0;
        
        int sum =0;
        
        
        for(int i=0; i<=100; i++){
            
            sum_of_squares+=i*i;
            
        }
        
       
        
        for(int j=0; j<=100; j++){
            
            sum+=j;
            
        }
        
        square_of_sum=sum*sum;
        
        
        System.out.println(square_of_sum-sum_of_squares);
        
    }
    
    
        
}
    

