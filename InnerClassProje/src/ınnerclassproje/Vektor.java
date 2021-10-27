package ınnerclassproje;
import java.util.concurrent.ThreadLocalRandom;

public class Vektor {
    final int i_dim;
    final int j_dim;
    final int k_dim;

    public Vektor() {
        this.i_dim = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        this.j_dim = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        this.k_dim = ThreadLocalRandom.current().nextInt(1, 50 + 1);
    }
    
    public void BoyutGöster(){
        
        System.out.println("i: "+i_dim+" j: "+j_dim+" k: "+k_dim);
    }
    
    
}
