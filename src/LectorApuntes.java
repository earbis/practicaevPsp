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

public class LectorApuntes  extends Thread{
	 static File fichero;
	 String ruta;
	 Map<String, Integer> diccionario = new HashMap<String, Integer>();
	 public LectorApuntes(String ruta) {
		 this.ruta=ruta;
	    }
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

	public static void main(String[] args) throws IOException {
		    
		LectorApuntes lector = new LectorApuntes("archivoCSV.csv");
		lector.start();
		/*Lector lector2 = new Lector("archivoC.csv");
		Lector lector3 = new Lector("prueba.csv");
		lector.abrir();
	    lector.analizar();
	    lector.guardar();
	    lector2.abrir();
	    lector2.analizar();
	    lector2.guardar();
	    lector3.abrir();
	    lector3.analizar();
	    lector3.guardar();
		*/
	/*
	//metodo para abrir el fichero
	File fichero = new File(".\\archivoCSV.csv");
	
	FileReader fr = new FileReader(fichero);
	BufferedReader br = new BufferedReader(fr);
	Map<String, Integer> diccionario = new HashMap<String, Integer>();
	File resultado = new File(".\\ResultadoCSV.csv");
	FileWriter fw = new FileWriter(resultado);
	BufferedWriter bw = new BufferedWriter(fw);
	String c;
	
	while ((c = br.readLine	()) != null) {
		
		String t []= c.split(", ");
		diccionario.put(t[0],Integer.parseInt(t[1]));
		
		}
	System.out.println(diccionario.toString());
	bw.write(diccionario);
	//metodo para procesar la informacion
	//metodo para escribir el resultado en otro fichero
	
	*/
	}
	private void notificar(String mensaje) {
        System.out.println("Hilo " + Thread.currentThread().getId() + ": " + mensaje);
    }
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
	public void guardar() throws IOException {
		File resultado = new File(".\\ResultadoCSV.csv");
		FileWriter fw = new FileWriter(resultado);
		BufferedWriter bw = new BufferedWriter(fw);
		for (Map.Entry<String, Integer> entry : diccionario.entrySet()) {
            bw.write(entry.getKey() + ", " + entry.getValue());
            bw.newLine();
        }
		bw.close();
		notificar("Guardado de resultados completado.");
		
	}
}
