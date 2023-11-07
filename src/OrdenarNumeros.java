
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNumeros {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        List<Integer> lista = new ArrayList<>();

	        while (scanner.hasNextInt()) {
	            int numero = scanner.nextInt();
	            lista.add(numero);
	        }
		Collections.sort(lista);
		System.out.println(lista.toString());
		scanner.close();
	}
	
}
