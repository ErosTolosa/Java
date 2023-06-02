import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print ("ingrese la cantidad de pesos");
    int pesos =s.nextInt();
    System.out.print ( pesos + " pesos al cambio son " + (pesos/203.50) + " dolares");
    }
}
