
public class Programlar {
    ProgramDilleri programDilleri;
    
  public Programlar(ProgramDilleri programDilleri) {
        this.programDilleri = programDilleri;
    }  
    
    
    
    public void Yapıştır(){
        if (programDilleri instanceof Python){
            System.out.println("print() fonksiyonu ile pythonla string yapıştırılıyor");
        }
        else if (programDilleri instanceof Java){
            System.out.println("System.out.println ile Javada string yapıştırılıyor");
        }
        else if (programDilleri instanceof Cdili){
            System.out.println("printf ile C dilinde string yapıştırılıyor");
        }
    }
    
    public void İnputgir(){
        if (programDilleri instanceof Python){
            System.out.println("input() fonksiyonu ile pythonla string alınıyor");
        }
        else if (programDilleri instanceof Java){
            System.out.println("scanner=nextLine ile Javada string alınıyor");
        }
        else if (programDilleri instanceof Cdili){
            System.out.println("scanff ile C dilinde string alınıyor");
        }
        
    }

    
    public void Hoşgeldiniz(){
        if (programDilleri instanceof Python){
            System.out.println("Pythona Hoşgeldiniz");
        }
        else if (programDilleri instanceof Java){
            System.out.println("Javaya Hoşgeldiniz");
        }
        else if (programDilleri instanceof Cdili){
            System.out.println("C diline Hoşgeldiniz");
        }
    }
    public void KullanılanİDE(){
        if (programDilleri instanceof Python){
            System.out.println("Kulannılan IDE:"+ programDilleri.getIDE());
        }
        else if (programDilleri instanceof Java){
            System.out.println("Kulannılan IDE:"+ programDilleri.getIDE());
        }
        else if (programDilleri instanceof Cdili){
            System.out.println("Kulannılan IDE:"+ programDilleri.getIDE());
        }
    }
}
