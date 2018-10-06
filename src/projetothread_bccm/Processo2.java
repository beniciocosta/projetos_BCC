package projetothread_bccm;

public class Processo2 implements Runnable {

    @Override
    public void run() {
        System.out.println( "Thread usada: "
          + Thread.currentThread().getName() );
    } // fim do método run()
    
} // fim da classe
