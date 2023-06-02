import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print ("ingrese la cantidad de dolares");
        int dolares =s.nextInt();
        System.out.print ( dolares + " dolares al cambio son " + (dolares * 206.50) + " pesos");
    }
}
