public class SentenciaIf02 {
    public static void main(String[] args) {
        System.out.print ("ingrese un numero entero");
        String linea = System.console().readLine();
        int x =Integer.parseInt(linea);
        if (x<0){
            System.out.print ("\nel numero es negativo \n");

        }else{
            System.out.print ("\nel numero es positivo \n");
    }
    }
}
