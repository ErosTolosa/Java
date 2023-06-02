import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.WatchService;

public class Discos {

    public static void main(String[] args) {
        System.out.println("Elija una opcion");
        int op= Integer.parseInt(System.console().readLine());
        boolean salir= false;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("mejoresdiscos.txt"));
            BufferedReader br = new BufferedReader(new FileReader("DiscoLista.txt"));
            System.out.println("Archivo mejoresdiscos.txt creado satisfactoriamente.");
            

            String linea = "";
            do {
                
            
            switch (op) {
                case 1:
            
            while (linea != null) {
                linea = br.readLine();
                if (linea != null) {
                    bw.write(linea + "\n");
                    System.out.println(linea);
                }
            }
            bw.close();
            
        break;

        case 2:
        System.out.println("ingrese el nombre del disco");
        String ndisco=System.console().readLine();
        System.out.println("ingrese el nombre del autor");
        String nautor=System.console().readLine();
        bw.write(ndisco + " " + nautor);
        bw.close();
        break;
        }

        } while (salir= true);
        
    
}catch (Exception e) {
    //TODO: handle exception

} 

}
}
