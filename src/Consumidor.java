public class Consumidor extends Thread {
	
	/*
	 * EJERCICIO 4
	 */
	
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                sleep(100); // Simula un tiempo de espera antes de consumir
            } catch (InterruptedException e) {
                // Manejar la interrupción del hilo si es necesario
                e.printStackTrace();
            }

            char producto = buffer.get();
            System.out.println(i + " => Consume: " + producto);
        }
    }
}
