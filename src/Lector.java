import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lector {
	public static void main(String[] args) throws IOException {
		
	
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
	
	
}}
