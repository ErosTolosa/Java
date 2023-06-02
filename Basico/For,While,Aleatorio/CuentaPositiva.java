public class CuentaPositiva {
    public static void main(String[] args) {
        System.out.println("Valla introduciendo numeros enteros, pulsando la tecla enter");
        System.out.println(" Para dejar de introducir numeors, ingrese un numero negativo");
        int numeroIntroducido= 0;
        int cuentaNumeros=0;
        int suma=0;
        while(numeroIntroducido>=0){
            numeroIntroducido=Integer.parseInt(System.console().readLine());
            cuentaNumeros++;
            suma+=numeroIntroducido;
        }
        System.out.println("Se introdujeron " + (cuentaNumeros-1)+ " numeros positivos");
        System.out.println("La suma total es: " + (suma-numeroIntroducido));
    }
}
