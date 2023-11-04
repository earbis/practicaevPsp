import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Guardar extends Thread {
	 static File fichero;
	 Map<String, Integer> diccionario = new HashMap<String, Integer>();
	 @Override
	
	 public void run() {
		 File resultado = new File(".\\ResultadoCSV.csv");
			FileWriter fw = null;
			try {
				fw = new FileWriter(resultado);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				bw.write(diccionario.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
