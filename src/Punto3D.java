import java.util.ArrayList;
import java.util.Random;

public class Punto3D extends Thread {
	//genere 10 coordenadas 3d en forma de arrays de 3 num aleatorios
	Random r = new Random();

	ArrayList<ArrayList<Integer>> nube = new ArrayList<>();
	ArrayList<Integer> lista = new ArrayList<>();
	@Override
	public void run() {
		
		for (int x = 0; x< 10; x++) {
			nube.add(lista);
			for (int i = 0; i < 3; i++) {
				lista.add(r.nextInt());
		}
		}
		System.out.println(
		lista.toString());
		
		nube.toString();
		super.run();
		
		
	}
	
}
