package abstract_class;

public class Kare extends Şekil{

    private int kenar;
    
    
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void AlanHesapla() {
        
        System.out.println(getIsim()+" objesinin alanı: "+(kenar*kenar)+"'dır.");
    }
    
    
}
