import java.util.Scanner;
public class LeeDatosScannerMedia {
    public static void main(String[] args) {
        Scanner S =new Scanner (System.in);
        System.out.print ("Ingrese 3 numeros con un espacio de distancia");
        double x1= S.nextDouble();
        double x2 =S.nextDouble();
        double x3 =S.nextDouble();
        double media = (x1 +x2+ x3)/3;
        System.out.print ("la media de los 3 es: " + media );        
    }
}
