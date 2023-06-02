
public class EsPrimo{
public static void main(String[] args){
    System.out.print("Ingrese un numero entero positivo ");
    int n = Integer.parseInt(System.console().readLine());

    boolean esPrimo = true;
    for (int i = 2; i < n; i++){
        if ((n % i) == 0){
            esPrimo = false;
        }
    }               
    
    if (esPrimo){
        System.out.printf("El numero %d es primo\n", n);
    } else {
        System.out.println("El numero " + n + " no es primo");
    }
}
}
