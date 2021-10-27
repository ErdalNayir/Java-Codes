
public class ProgramDilleri {
    private String seviye;
    private String Populerlik;
    private String İsim;
    private String IDE;

    public ProgramDilleri(String seviye, String Populerlik, String İsim, String IDE) {
        this.seviye = seviye;
        this.Populerlik = Populerlik;
        this.İsim = İsim;
        this.IDE = IDE;
    }

    
    
    public void KodYaz(){
        System.out.println(getİsim()+"ile program kodlanıyor...");
        
    }
    
    public void ProgramÇalıştır(){
            System.out.println(getİsim()+"ile yazılan program çalıştırılıyor...");
    }
    /**
     * @return the seviye
     */
    public String getSeviye() {
        return seviye;
    }

    /**
     * @param seviye the seviye to set
     */
    public void setSeviye(String seviye) {
        this.seviye = seviye;
    }

    /**
     * @return the Populerlik
     */
    public String getPopulerlik() {
        return Populerlik;
    }

    /**
     * @param Populerlik the Populerlik to set
     */
    public void setPopulerlik(String Populerlik) {
        this.Populerlik = Populerlik;
    }

    /**
     * @return the İsim
     */
    public String getİsim() {
        return İsim;
    }

    /**
     * @param İsim the İsim to set
     */
    public void setİsim(String İsim) {
        this.İsim = İsim;
    }

    /**
     * @return the IDE
     */
    public String getIDE() {
        return IDE;
    }

    /**
     * @param IDE the IDE to set
     */
    public void setIDE(String IDE) {
        this.IDE = IDE;
    }
    
    public void BilgileriGöster(){
        System.out.println(getİsim());
        System.out.println(getPopulerlik());
        System.out.println(getSeviye());
        System.out.println(getIDE());

    }
    
    
}
