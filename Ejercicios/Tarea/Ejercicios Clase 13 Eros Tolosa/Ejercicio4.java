import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print ("ingrese dos numeros enteros con un espacio entre ellos");
        int numero1 = S.nextInt();
        int numero2 = S.nextInt();
        System.out.println ("suma:" + (numero1+numero2) + " resta: " + (numero1-numero2) );
        System.out.print (" multiplicacion: " + (numero1*numero2 ) + " divicion: " + (numero1/numero2) );
    }
}
