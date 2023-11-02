import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class FicheroCSV {
	//main
	public static void main(String[] args) throws IOException, FileNotFoundException {
		//llamar al identificador
		Identificador id= new Identificador(10000,6);
		//esablecer fichero(o crearlo)
		File archivo = new File(".\\archivoCSV.csv");
		//cont
		int cont= 1;
		//filewriter
		FileWriter fw = new FileWriter(archivo);
		//for (200 o tamaño set)
		for (Iterator<String> iterator = id.getSet().iterator(); iterator.hasNext();) {
			String identificador =  iterator.next();
			fw.append(identificador+", ");
			fw.append( Integer.toString(cont)+"\n");
			cont++;
			
			
		}
		//write identificador y cont
		//cerrar fileqriter
		fw.close();
	}
}
	
