 

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FicheroCSVMllon {
  public static void main(String[] args) throws IOException {

	//creamos objeto File al directorio donde esta Ejemplo2
	  
	/*
	 * IMPORTANTE como el directorio esta en bin el archivo tambien se va a crear en esa carpeta y se va a llamar igual que en el FicheroCSV
	 * 
	 */
	File directorio = new File(".\\bin");	

	//El proceso a ejecutar es Ejemplo2			
	ProcessBuilder pb = new ProcessBuilder("java", "FicheroCSV");

    //se establece el directorio donde se encuentra el ejecutable
    pb.directory(directorio);
        


    //se ejecuta el proceso (100 veces)
	for (int i = 0; i < 100; i++) {
		Process p = pb.start();	
		try {
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1)
				System.out.print((char) c);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
  }
}
