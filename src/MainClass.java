public class MainClass {

    public static void main(String[] args) {

        Proceso1 hilo1 = new Proceso1(); 
        Thread hilo2 = new Thread(new Proceso2()); 
        hilo1.start(); // Inicia los hilos de Procesos
        hilo2.start(); 

        // Espera 3 segundos e interrumpe hilo1
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo1.interrupt(); // Interrumpe el hilo1
    }
}
