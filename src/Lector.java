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

public class Lector {
	File fichero;
	FileReader fr = new FileReader(fichero);
	BufferedReader br = new BufferedReader(fr);
	
	public Lector() throws FileNotFoundException {
		super();
	}

	public Lector(File fichero, FileReader fr, BufferedReader br) throws FileNotFoundException {
		super();
		this.fichero = fichero;
		this.fr = fr;
		this.br = br;
	}
	

	public void setFichero(File fichero) {
		this.fichero = fichero;
	}

	public static void main(String[] args) throws IOException {
	
		
		
	/*
	//metodo para abrir el fichero
	File fichero = new File(".\\archivoCSV.csv");
	File resultado = new File(".\\ResultadoCSV.csv");
	FileReader fr = new FileReader(fichero);
	BufferedReader br = new BufferedReader(fr);
	Map<String, Integer> diccionario = new HashMap<String, Integer>();
	FileWriter fw = new FileWriter(resultado);
	BufferedWriter bw = new BufferedWriter(fw);
	String c;
	
	while ((c = br.readLine	()) != null) {
		
		String t []= c.split(", ");
		diccionario.put(t[0],Integer.parseInt(t[1]));
		
		}
	System.out.println(diccionario.toString());
	bw.write(diccionario.toString());
	//metodo para procesar la informacion
	//metodo para escribir el resultado en otro fichero
	
	*/
	}
	
	public void abrir(String documento) throws IOException {
		try {
			fichero = new File(documento);
			
			String c;

			while ((c = br.readLine	()) != null) {
				System.out.println(c);
			}
		}catch (FileNotFoundException e) { System.out.println();}	
	}
	public Map<String, Integer> analizar() {
		Map<String, Integer> diccionario = new HashMap<String, Integer>();
		return diccionario;
	}
}
