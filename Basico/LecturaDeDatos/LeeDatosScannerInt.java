import java.util.Scanner;

public class LeeDatosScannerInt {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.print("Ingrese nombre y edad separados por un espacio");
        String nombre= S.next();
        int edad= S.nextInt();
        System.out.println("Tu nombre es "+nombre+" Tu edad es "+ edad);
    }
}
