package projetothread_bccm;

public class Processo1 extends Thread {
    
    @Override
    public void run() {
        System.out.println("Thread usada: " 
          + Thread.currentThread().getName() );
    } // fim do método run()
    
} // fim da classe Processo1
