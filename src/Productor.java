import java.util.Random;

public class Productor extends Thread {
	Buffer buffer;
	Random r = new Random();

	public Productor(Buffer buffer) {
		this.buffer = buffer;
	}
	@Override
	public void run() {
		
		for (int i = 0; i < 15; i++) {
			char producto = (char)(r.nextInt(74)+48);
			buffer.put(producto);
			System.out.println(i+"=>Produce: "+ producto);
			try {
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
