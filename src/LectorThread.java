
public class LectorThread {
	public static void main(String[] args) throws InterruptedException {

		
		/*
		 * EJERCICIO 1.4 RESUELTO CON MULTIPLES HILOS DONDE HAY UNA CLASE PARA CADA ACCION.
		 */
		
		Abrir abrir = new Abrir();
		Analizar analizar = new Analizar();
		Guardar guardar = new Guardar();
		abrir.start();
		Thread.sleep(10000);
		analizar.start();
		Thread.sleep(10000);
		guardar.start();
	}
}
