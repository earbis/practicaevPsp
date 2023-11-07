
import java.util.Random;

public class Aleatorios {
public static void main(String[] args) {
	Random random = new Random();
	String cadena = "";
	for (int i = 0; i < 40; i++) {
		cadena = cadena +" "+ random.nextInt(100) ;
		}
	System.out.println(cadena);
}
}
