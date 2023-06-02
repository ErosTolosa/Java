import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print ("ingrese valor 1 ");
        int a = S.nextInt();
        System.out.print ("ingrese valor 2");
        int b = S.nextInt();
        System.out.print ("area " + (a*b) + " perimetro  " + ((a*2) + (b*2)));
    }
}
