public class Buffer {
	char[] data = new char[1];
	boolean disponible = false;
	int cont =0;
	
	public char get() {
		char out=' ';
		if ( 0<=data.length) {
			disponible = false;
			out =data[data.length-1];
			String newdataString = (data.toString()).substring(0, data.length-1);
			data = newdataString.toCharArray();
			return out; 
		}
	return out;
	}
	public void put(char insert)  {
		if(data.length<=6) {
			String newdataString = (data.toString()+ insert);
			data = newdataString.toCharArray();
			disponible = true;
		}	
	}		
}
