public class Öğrenci {
    
    private String isim;
    private String OgrenciNo;
    private String TcKimlikNo;
    private String Yas;
    private String DogumYılı;
    private String Memleket;
    private String Şifre="1650";
    private int Devamsızlık;


public Öğrenci(String isim,String OgrenciNo,String TcKimlik,String Yas,String DogumYılı,String Memleket,int Devamsızlık){

    this.isim=isim;
    this.OgrenciNo = OgrenciNo;
    this.TcKimlikNo=TcKimlik;
    this.Yas=Yas;
    this.DogumYılı=DogumYılı;
    this.Memleket=Memleket;
    this.Devamsızlık=Devamsızlık;

}

public void BilgileriGöster(){
    System.out.println("İsim:"+this.getIsim());
    System.err.println("Öğrenci Numarası:"+this.getOgrenciNo());
    System.err.println("T.C. Kimlik Numarası:"+this.getTcKimlikNo());
    System.err.println("Doğum Yılı:"+this.getDogumYılı());
    System.err.println("Yaş:"+this.getYas());
    System.out.println("Memleket:"+this.getMemleket());
    
    
}

    
    public String getIsim() {
        return isim;
    }

    
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public String getOgrenciNo() {
        return OgrenciNo;
    }

   
    public void setOgrenciNo(String OgrenciNo) {
        this.OgrenciNo = OgrenciNo;
    }

   
    public String getTcKimlikNo() {
        return TcKimlikNo;
    }

   
    public void setTcKimlikNo(String TcKimlikNo) {
        this.TcKimlikNo = TcKimlikNo;
    }

  
    public String getYas() {
        return Yas;
    }

   
    public void setYas(String Yas) {
        this.Yas = Yas;
    }

   
    public String getDogumYılı() {
        return DogumYılı;
    }

   
    public void setDogumYılı(String DogumYılı) {
        this.DogumYılı = DogumYılı;
    }

 
    public String getMemleket() {
        return Memleket;
    }

   
    public void setMemleket(String Memleket) {
        this.Memleket = Memleket;
    }

   
    public String getŞifre() {
        return Şifre;
    }

   
    public void setŞifre(String Şifre) {
        this.Şifre = Şifre;
        
    }

  
    public int getDevamsızlık() {
        return Devamsızlık;
    }

   
    public void setDevamsızlık(int Devamsızlık) {
        this.Devamsızlık = Devamsızlık;
    }














}