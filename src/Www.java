import java.io.File;
import java.io.IOException;

public class Www {
	    public static void main(String[] args) throws IOException, InterruptedException {
	        // Ruta del directorio donde se encuentran los archivos compilados (.class)
	        File directorio = new File(".\\bin");

	        // Definir el archivo de salida para Aleatorios
	        File salidaAleatorios = new File("info.txt");

	        // Configurar el proceso para ejecutar Aleatorios y redirigir su salida a un archivo
	        ProcessBuilder pbAleatorios = new ProcessBuilder("java", "Aleatorios");
	        pbAleatorios.directory(directorio);
	        pbAleatorios.redirectOutput(salidaAleatorios);

	        // Configurar el proceso para ejecutar OrdenarNumeros y redirigir su entrada desde el archivo de salida de Aleatorios
	        ProcessBuilder pbOrdenarNumeros = new ProcessBuilder("java", "OrdenarNumeros");
	        pbOrdenarNumeros.directory(directorio);
	        pbOrdenarNumeros.redirectInput(salidaAleatorios);

	        // Redirigir la salida estándar de OrdenarNumeros a la consola
	        pbOrdenarNumeros.redirectOutput(ProcessBuilder.Redirect.INHERIT);

	        // Iniciar el proceso de Aleatorios
	        Process procesoAleatorios = pbAleatorios.start();

	        // Esperar a que Aleatorios termine
	        int exitCodeAleatorios = procesoAleatorios.waitFor();

	        if (exitCodeAleatorios == 0) {
	            // Si Aleatorios termina correctamente, iniciar el proceso de OrdenarNumeros
	            Process procesoOrdenarNumeros = pbOrdenarNumeros.start();

	            // Esperar a que OrdenarNumeros termine
	            int exitCodeOrdenarNumeros = procesoOrdenarNumeros.waitFor();
	            
	            if (exitCodeOrdenarNumeros == 0) {
	                System.out.println("OrdenarNumeros se ejecutó correctamente.");
	            } else {
	                System.out.println("OrdenarNumeros no se ejecutó correctamente.");
	            }
	        } else {
	            System.out.println("Aleatorios no se ejecutó correctamente.");
	        }
	    }
	}
