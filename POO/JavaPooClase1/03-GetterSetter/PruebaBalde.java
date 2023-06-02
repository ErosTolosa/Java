public class PruebaBalde {
    public static void main(String[] args){
        Balde baldecito = new Balde(2);
        Balde baldesote = new Balde(7);

        System.out.println("Baldecito: \n");
        baldecito.pinta();

        System.out.println("Baldesote: \n");
        baldesote.pinta();

        System.out.println("Lleno el baldecito: \n");
        baldecito.llena();
        baldecito.pinta();

        System.out.println("El baldesote sigue vacio: \n");
        baldesote.pinta();

        System.out.println("Ahora vuelco el contenido del baldecito en el baldesote. \n");
        baldecito.vuelcaEn(baldesote);

        System.out.println("Baldecito: \n");
        baldecito.pinta();

        System.out.println("Baldesote: \n");
        baldesote.pinta();

        System.out.println("Ahora vuelco el contenido de baldesote en el baldecito. \n");
        baldesote.vuelcaEn(baldecito);

        System.out.println("Baldecito: \n");
        baldecito.pinta();

        System.out.println("Baldesote: \n");
        baldesote.pinta();
    }
}
