import java.util.Scanner;
public class Ejercicioif4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ingrese 3 numeros con un espacio entre medio");
        int numero1 =s.nextInt();
        int numero2 =s.nextInt();
        int numero3 =s.nextInt();
        int media= ((numero1 + numero2 + numero3)/3) ;
        System.out.println("la media es " + media);

    }   
}
