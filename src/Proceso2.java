public class Proceso2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) { 
            System.out.println("Proceso 2");
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre cada impresión
            } catch (InterruptedException e) {
                 
                e.printStackTrace(); // Imprime el stack trace de la excepción
                return; // Termina el hilo
            }
        }
    }
}
