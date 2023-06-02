public class LeeNumero {
    public static void main(String[] args) {
        String linea;
        System.out.print ("ingrese numero");
        linea = System.console ().readLine();
        int primerNumero;
        primerNumero = Integer.parseInt(linea);
        System.out.println ("ingrese otro numero");
        linea= System.console ().readLine();
        int segundoNumero = Integer.parseInt (linea);
        int total;
        total= (2* primerNumero) +segundoNumero;
        System.out.println ("1er N" + primerNumero);
        System.out.println ("2do N" + segundoNumero);
        System.out.println ("el doble de los numeros es:" + total);

    }
}
