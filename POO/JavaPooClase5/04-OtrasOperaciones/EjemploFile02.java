import java.io.File;

class EjemploFichero05 {
    public static void main(String[] args) {
        System.out.print("Introduzca el nombre del archivo que desea borrar: ");
        String nombreArchivo = System.console().readLine();
        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {
        archivo.delete();
        System.out.println("El archivo se ha borrado correctamente.");
        } else {
            System.out.println("El archivo " + nombreArchivo + " no existe.");
        }
    }
}
