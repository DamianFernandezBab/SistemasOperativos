public class Proceso1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) { 
            System.out.println("Proceso 1");
            try {
                Thread.sleep(5000); // Pausa de 5 segundos entre cada impresión
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            }
        }
    }
}
