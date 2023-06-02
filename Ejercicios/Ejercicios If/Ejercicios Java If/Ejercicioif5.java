import java.util.Scanner;
public class Ejercicioif5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ingrese 3 numeros con un espacio entre medio");
        int numero1 =s.nextInt();
        int numero2 =s.nextInt();
        int numero3 =s.nextInt();
        int media= ((numero1 + numero2 + numero3)/3) ;

        if (media <=5){
            System.out.println ("insuficiente");
        }
        if (media ==6 ){
            System.out.println("suficiente");
        }
        if (media ==7){
            System.out.println("bien");
        }
        if (media ==8){
            System.out.println("notable");
        }
        if (media ==9){
            System.out.println("sobresaliente");
        }

    }   
}