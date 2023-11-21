

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Identificador {
	
	/*
	 * EJERCICIO 1.1 GENERADOR DE 200 IDENTIFICADORES
	 */
	
	int cantidad= 200;
	int longitud=6;
	Set<String> set = new HashSet<>();
	
	public Identificador() {

		// llamar a la clase aleatorio
			Random r = new Random();

		//while hasta 200(while y no for porque no sabes si el dentificador que se genra puede entrar en el set o no)
			while (set.size()<cantidad) {
				// identificador
				String identificador="";
				char caracter;
				// for gasta 6
				for (int i = 0; i < 6; i++) {
					//rellenar de forma aleatoria
					int eleccion = r.nextInt(3); // 0 para letra mayúscula, 1 para letra minúscula, 2 para dígito
	                if (eleccion == 0) {
	                    // Generar una letra mayúscula (ASCII 65-90)
	                    caracter = (char) (r.nextInt(26) + 65);
	                } else if (eleccion == 1) {
	                    // Generar una letra minúscula (ASCII 97-122)
	                    caracter = (char) (r.nextInt(26) + 97);
	                } else {
	                    // Generar un dígito (ASCII 48-57)
	                    caracter = (char) (r.nextInt(10) + 48);
	                }
	                identificador+= caracter;
				}
				
				//introducir en set	
				  if (set.add(identificador)) {
		            }
			}
	}
	//SETTERS Y GETTERS
	public Set<String> getSet() {
		return set;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getLongitud() {
		return longitud;
	}

	
}
