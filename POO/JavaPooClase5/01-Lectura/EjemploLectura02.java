import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class EjemploLectura02 {
    public static void main(String[] args) {
    System.out.print("Ingrese el nombre del archivo donde se encuentran los numeros: ");
    String nombreArchivo = System.console().readLine();

    try {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea = "0";
        int i = 0;
        double suma = 0;
        while (linea != null) {
            i++;
            suma += Double.parseDouble(linea);
            linea = br.readLine();
        }

        i--;
        br.close();
        System.out.println("La media es " + suma / (double)i);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
