import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class EjemploEscritura01 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));
            bw.write("naranja\n");
            bw.write("mango\n");
            bw.write("chirimoya\n");
            System.out.println("El archivo se escribio sactifactoriamente.");
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}