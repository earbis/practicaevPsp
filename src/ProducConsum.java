public class ProducConsum {
	
	/*
	 * EJERCICIO 4
	 */
	
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Crear instancias de Productor y Consumidor
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        // Iniciar los hilos
        productor.start();
        consumidor.start();
    }
}
