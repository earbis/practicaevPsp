import java.io.File;
import java.io.IOException;

public class Colaborar {
	public static void main(String[] args) throws IOException {
		/*
		 * ESTO NO GARANTIZA QUE VAYAN A SEGUIR EL ORDEN NATURAL
		 */
		File directorio = new File(".\\bin");
		for (int i = 1; i <= 10; i++) {
			ProcessBuilder pb= new ProcessBuilder("java","Lenguaje", String.valueOf(i * 10), "miFichero.txt");
			pb.directory(directorio);
			pb.start();
		}
	
	}
}
