public class Ejercicioif8 {
    public static void main(String[] args) {
        System.out.print ("intrudzca un numero entero");
        int n=Integer.parseInt(System.console().readLine());
        if((n%2)==0){
            System.out.print ("el numero introducido es par");
        }else{
            System.out.print ("el numero introducido es impar");
        }
        if ((n%5)==0){
            System.out.print ("y divisible entre 5");
        }else{
            System.out.print ("y no divisible entre 5");
        }
    }
}
