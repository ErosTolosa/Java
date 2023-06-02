public class OperadorLogicos01 {
    public static void main(String[] args) {
        System.out.print ("adivina el numero");
        System.out.print ("introduce un numero del 1 al 100");
        String linea = System.console ().readLine();
        int n =Integer.parseInt(linea);
        if ((n>1)&&(n<100)) {
            System.out.println ("el numero es del 1 al 100");
            System.out.print ("otra oportunidad");
            linea = System.console().readLine();
            n=Integer.parseInt(linea);
        }

        if (n==24) {
            System.out.print ("es correcto");
        }else {
            System.out.print ("es incorrecto");
        }
    }
}
