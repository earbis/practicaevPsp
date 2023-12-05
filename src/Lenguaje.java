import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lenguaje {
	
	/*
	 * EJERCICIO 3.1
	 */
	
	public static void main(String[] args) throws IOException {
		//File fichero = new File(args[0]);
		int repeticiones = Integer.parseInt(args[0]);
		Random r = new Random();
		char caracter = 0;
		BufferedWriter bw= new BufferedWriter(new FileWriter(new File(args[1]), true));
		for(int a = 0;a< repeticiones;a++) {
			String cadena ="";
			for (int i = 0; i < r.nextInt(10)+10; i++) {
				//rellenar de forma aleatoria
				int eleccion = r.nextInt(2); // 0 para letra mayúscula, 1 para letra minúscula, 2 para dígito
	            if (eleccion == 0) {
	                // Generar una letra mayúscula (ASCII 65-90)
	                caracter = (char) (r.nextInt(26) + 65);
	            } else if (eleccion == 1) {
	                // Generar una letra minúscula (ASCII 97-122)
	                caracter = (char) (r.nextInt(26) + 97);
	            } 
				cadena = cadena + caracter;
				
			
			}
			
			bw.write(cadena);
			bw.write('\n');
			System.out.println(cadena);
			
		}

		bw.write('\n');
		bw.close(); 
	}
}
