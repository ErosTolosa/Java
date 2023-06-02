import java.util.Scanner;

public class LeeDatosScanner {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println ("ingrese nombre");
        String nombre =S.nextLine();
        System.out.println ("ingrese edad");
        int edad = Integer.parseInt(S.nextLine());
        System.out.println ("tu nombre es" + nombre + "tu edad es:" + edad); 

    }
}
