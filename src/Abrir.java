import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Abrir extends Thread {

	
	/*
	 * EJERCICIO 1.4 se usa en LectorThread
	 */
	
	 static File fichero;
	 Map<String, Integer> diccionario = new HashMap<String, Integer>();
@Override
public void run() {
	InputStreamReader in = new InputStreamReader(System.in);
	   BufferedReader br1 = new BufferedReader(in);
	   String texto = null;
	 do {
 System.out.println("Introduce un documento existente....");
 try {
	texto= br1.readLine();
} catch (IOException e) {
	e.printStackTrace();
}
	 }while(!(new File(texto)).exists());
	 fichero= new File(texto);
	 
	FileReader fr = null;
	try {
		fr = new FileReader(fichero);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 BufferedReader br = new BufferedReader(fr);
	try {
		
		
		String c;
		while ((c = br.readLine()) != null) {
			System.out.println(c);
		}
		
	}catch (FileNotFoundException e) { System.out.println();} catch (IOException e) {
		e.printStackTrace();
	}	
	try {
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
