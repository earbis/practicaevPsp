import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Conector {
	public static void main(String[] args) throws IOException {
		File directorio = new File(".\\bin");
		File direccion = new File("info.txt");
		ProcessBuilder pr= new ProcessBuilder("java","OrdenarNumeros");
		ProcessBuilder pb= new ProcessBuilder("java","Aleatorios");
		pr.directory(directorio);
		pb.directory(directorio);
		pb.redirectOutput(direccion);
		pr.redirectInput(direccion);
		pr.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		Process p = pb.start();
		Process p2 = pr.start();
		
		try {
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1) {
				System.out.print((char) c);
			}
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Obtener la salida que yo le ponga
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
