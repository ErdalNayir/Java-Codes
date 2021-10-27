public class Araba {
    
    
    private String renk;
    private int tekerlek;
    private String motor;
    private int kapılar;
    private String model;
    
    
    
    public void setModel(String model){
        
        this.model=model;
        
    }
    
    public String getModel(){
        return model;
    }

   
    public String getRenk() {
        return renk;
    }

   
    public void setRenk(String renk) {
        this.renk = renk;
    }

   
    public int getTekerlek() {
        return tekerlek;
    }

    
    public void setTekerlek(int tekerlek) {
        if (tekerlek>0){
            this.tekerlek = tekerlek;  
        }
        else{
            System.out.println("Negatif Sayı Girilemez...");
        }
        
    }

  
    public String getMotor() {
        return motor;
    }

    
    public void setMotor(String motor) {
        this.motor = motor;
    }

    
    public int getKapılar() {
        return kapılar;
    }


    public void setKapılar(int kapılar) {
        if (kapılar<0){
            System.out.println("Negatif Değer Giriliemez..." );
        }
        else{
            this.kapılar=kapılar;
        }
    }
    
    
    
      
    
}
