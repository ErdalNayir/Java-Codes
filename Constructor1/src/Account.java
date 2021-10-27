public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    
    private String email;
    
    private String telefonNo;
    
    //Constructor//*************************************************************//
    public Account(){
        this.hesapNo="Bilgi Yok";
        this.bakiye=0;
        this.isim="Bilgi Yok";
        this.email="Bilgi Yok";
        this.telefonNo="Bilgi Yok";
        
    }
    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo){
        
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
        
    }
    public Account(double bakiye,String isim){
        this.hesapNo="Bilgi Yok";
        this.bakiye=bakiye;
        this.isim=isim;
        this.email="Bilgi Yok";
        this.telefonNo="Bilgi Yok";
        
        
    }
   

    //**************************************************************************//
    
    public void BilgileriGöster(){
        
        System.out.println("İsim:"+this.isim);
        System.out.println("Email:"+this.email);
        System.out.println("Telefon:"+this.telefonNo);
        System.out.println("Hesap No:"+this.hesapNo);
        System.out.println("Bakiye:"+this.bakiye);
        
    }
    
    public  void paraYatır(double miktar){
        if (miktar<0){
            System.out.println("Negatif Sayı girilemez...");
                   
        }
        else{
            bakiye+=miktar;
            System.out.println("Güncellenmiş Bakiyeniz:"+bakiye);
        }
    }
    
    public void paraÇek(double nakit){
        if (nakit<0){
            System.out.println("Negatif Sayı Girilemez...");
        }
        else if (nakit>bakiye || nakit>1500){
            System.out.println("Mevcut Paranızın daha üstü ve 1500 TL den daha fazla Para çekemezsiniz");
            
        }
        else{
            bakiye-=nakit;
            System.out.println("Güncellenmiş Bakiyeniz:"+bakiye);
        }
    }
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
}
