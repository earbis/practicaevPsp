import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aleatorios {
public static void main(String[] args) {
	Random random = new Random();
	List<Integer> lista = new ArrayList<>();
	for (int i = 0; i < 40; i++) {
		lista.add( random.nextInt(100) );
		}
	System.out.println(lista.toString());
}
}
