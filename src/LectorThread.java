
public class LectorThread {
	public static void main(String[] args) throws InterruptedException {
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
