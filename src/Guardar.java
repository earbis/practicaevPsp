import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Guardar extends Thread {

	
	/*
	 * EJERCICIO 1.4 se usa en LectorThread
	 */
	
	 static File fichero;
	 Map<String, Integer> diccionario = new HashMap<String, Integer>();
	 @Override
	
	 public void run() {
		 File resultado = new File(".\\ResultadoCSV.csv");
			FileWriter fw = null;
			try {
				fw = new FileWriter(resultado);
			} catch (IOException e) {
				e.printStackTrace();
			}
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				bw.write(diccionario.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
