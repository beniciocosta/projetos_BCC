package projetothread_bccm;

public class ProjetoThread_BCCM {

    public static void main(String[] args) {
        Thread t1 = new Processo1();
        t1.setName("Processo Herança");
        
        Thread t2 = new Thread( new Processo2() , 
            "Processo Interface" );
        
        t1.start();
        t2.start();
        
    } // fim do main
    
} // fim da classe
