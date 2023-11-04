import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Analizar extends Thread {
	 static File fichero = new File("archivoCSV.csv");
	 Map<String, Integer> diccionario = new HashMap<String, Integer>();
@Override
public void run() {
	FileReader fr = null;
	try {
		fr = new FileReader(fichero);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BufferedReader br = new BufferedReader(fr);
	String c;
	int suma = 0;
	try {
		while ((c = br.readLine	()) != null) {
			
			String t []= c.split(", ");
			suma+=Integer.parseInt(t[1]);
			diccionario.put(t[0],suma);
			
			}
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(diccionario.isEmpty()) {
		System.out.println("El documento esta vacio");
	}
	try {
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(diccionario);
}
}
