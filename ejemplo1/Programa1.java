package ejemplo1;

public class Programa1 extends Thread {

    //Este metodo de la clase Runnable debe ser implementado
    //Se ejecuta al llamar al método Start()
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " subproceso corriendo...");
    }

    public static void main(String[] args) {
        Thread hilo = new Thread(new Programa1(), "Hilo1");
        hilo.start();
        System.out.println("Este código esta fuera del hilo.");
    }

}