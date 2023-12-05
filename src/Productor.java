import java.util.Random;

public class Productor extends Thread {
	
	/*
	 * EJERCICIO 4
	 */
	
    private Buffer buffer;
    private Random random = new Random();

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            char producto = (char) (random.nextInt(74) + 48);
            buffer.put(producto);
            System.out.println(i + " => Produce: " + producto);

            try {
                sleep(100); // Simula un tiempo de espera antes de producir el siguiente elemento
            } catch (InterruptedException e) {
                // Manejar la interrupción del hilo si es necesario
                e.printStackTrace();
            }
        }
    }
}

