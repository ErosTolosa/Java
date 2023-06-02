import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print ("ingrese dos numeros enteros con un espacio entre ellos");
        int numero1 = S.nextInt();
        int numero2 = S.nextInt();
        int multi = (numero1 * numero2);
        System.out.println ("la multiplicacion entre los numeros es: " + multi );

    }
}