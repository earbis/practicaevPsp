import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Iterator;

public class ficheroCSV10 {
    public static void main(String[] args) {
        String nombreArchivo = "datos.csv";
        int lineasAGenerar = 1000000;

        try (FileWriter fw = new FileWriter(new File(nombreArchivo))) {
            FicheroCSV ficheroCSV = new FicheroCSV(); // Instancia FicheroCSV
            ficheroCSV.main(args); // Llama al método main de FicheroCSV

            Identificador id = new Identificador(200, 6);

            for (int i = 0; i < lineasAGenerar; i++) {
                for (String identificador : id.getSet()) {
                    fw.append(identificador + ", ");
                    fw.append(Integer.toString(i) + "\n");
                }
            }

            System.out.println("Generación de datos completada.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}