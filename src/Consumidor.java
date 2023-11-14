public class Consumidor extends Thread {
	Buffer buffer;

	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}
	@Override
	public void run() {
		
		for (int i = 0; i < 15; i++) {
			try {
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			char producto = buffer.get();
			System.out.println(i+"=>Consume: "+ producto);
			
		}
		
	}
}
