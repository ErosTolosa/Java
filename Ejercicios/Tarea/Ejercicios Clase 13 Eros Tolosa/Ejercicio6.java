import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print ("ingrese el numero de horas trabajadas por dia");
        int horas = S.nextInt();
        System.out.print ("ingrese la cantidad de dias trabajados en la semana");
        int cantidadDias = S.nextInt();
        int salarioSemanal = ((250 * horas) * (cantidadDias));
        System.out.print ("el salario semanal es: " + (salarioSemanal) );
    }
}
