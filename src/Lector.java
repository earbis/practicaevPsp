import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;

public class Lector  extends Thread{

	
	/*
	 * EJERCICIO 1.4 RESUELTO CON UN UNICO HILO Y UNA CLASE
	 */
	
	 static File fichero;
	 String ruta;
	 Map<String, Integer> diccionario = new HashMap<String, Integer>();
	 
	 //constructor
	 public Lector(String ruta) {
		 this.ruta=ruta;
	    }
	 //metodo THREAD
	 @Override
	    public void run() {
	        try {
	            notificar("Iniciando el proceso de lectura.");
	            abrir();
	            analizar();	            
	            guardar();
	        } catch (IOException | NullPointerException npe) {
	            notificar("No pudo realizarse el proceso.");
	        }
	    }
	 //MAIN
	public static void main(String[] args) throws IOException {
		    
		Lector lector = new Lector("archivoCSV.csv");
		lector.start();
	}
	
	//Mantiene registro de lo que hace el hilo
	private void notificar(String mensaje) {
        System.out.println("Hilo " + Thread.currentThread().getId() + ": " + mensaje);
    }
	
	//abre el archivo
	public void abrir() throws IOException {
		if (!(new File(ruta)).exists()) {
            notificar("El archivo no existe.");
            System.exit(0);
        }
		fichero = new File(ruta);
		 FileReader fr = new FileReader(fichero);
		 BufferedReader br = new BufferedReader(fr);
		try {
			String linea;
			while ((linea = br.readLine()) != null) {
				notificar(linea);
			}
		}catch (FileNotFoundException e) { System.out.println();}	
		finally {
        	br.close();
        	notificar("Lectura del archivo completada.");
        	
		}
	}
	
	//procesa la informacion
	public Map<String, Integer> analizar() throws IOException {
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		int suma = 0;
		while ((linea = br.readLine	()) != null) {
			
			String t []= linea.split(", ");
			suma+=Integer.parseInt(t[1]);
			diccionario.put(t[0],suma);
			
			}
		if(diccionario.isEmpty()) {
			notificar("El documento esta vacio");
			System.exit(0);
		}
		br.close();
		notificar("Análisis del archivo completado.");
		return diccionario;
	}
	
	//guarda la informacion en otro archivo
	public void guardar() throws IOException {
		File resultado = new File(".\\ResultadoCSV.csv");
		FileWriter fw = new FileWriter(resultado);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(diccionario.toString());
		bw.close();
		notificar("Guardado de resultados completado.");
		
	}
}
