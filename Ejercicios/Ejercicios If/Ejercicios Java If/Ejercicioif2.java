
public class Ejercicioif2 {
    public static void main(String[] args) {
        System.out.println ("ingrese un numero del 1 al 7 ");
        int numero=Integer.parseInt(System.console().readLine());
        String nombreDias= "";
        switch (numero){
            case 1:
                nombreDias= "lunes";
            break;
            case 2:
                nombreDias= "martes";
            break;
            case 3:
                nombreDias= "miercoles";
            break;
            case 4:
                nombreDias= "jueves";
            break;
            case 5:
                nombreDias= "viernes";
            break;
            case 6:
                nombreDias= "sabado";
            break;
            case 7:
                nombreDias= "domingo";
            break;
            default:
                System.out.print ("ese dia no exixte");
            break;
            
        }
        System.out.println ("el dia " + (numero) + " = " + (nombreDias));
    }
}
