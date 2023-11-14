public class Buffer {
    char[] data = new char[6];
    boolean disponible = false;

    public char get() {
        char out = ' ';
        if (data.length > 0) {
            disponible = false;
            out = data[data.length - 1];
            char[] newdata = new char[data.length - 1];
            System.arraycopy(data, 0, newdata, 0, data.length - 1);
            data = newdata;
        }
        return out;
    }

    public void put(char insert) {
        if (data.length < 6) {
            char[] newdata = new char[data.length + 1];
            System.arraycopy(data, 0, newdata, 0, data.length);
            newdata[data.length] = insert;
            data = newdata;
            disponible = true;
        }
    }
}

