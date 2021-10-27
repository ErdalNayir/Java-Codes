
package abstract_class;

public class Daire extends Şekil{
    private int YarıÇap;
   

    public Daire(String isim,int YarıÇap) {
        super(isim);
        this.YarıÇap=YarıÇap;
    }

    @Override
    void AlanHesapla() {
        System.out.println(getIsim()+" objesinin alanı: "+(Math.PI*YarıÇap*YarıÇap)+"'dır.");
    }
    
    
    
}
