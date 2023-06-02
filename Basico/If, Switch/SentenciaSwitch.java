public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.print ("ingrese el numero del mes");
        int mes = Integer.parseInt(System.console().readLine());
        String nombreMes;
        
        switch (mes){
            case 1:
                nombreMes="enero";
                break;
            case 2: 
                nombreMes= "febrero";
                break;
            case 3: 
                nombreMes= "marzo";
                break;
            default:
                nombreMes= "el mes no existe";
                break;
        }
    System.out.println ("el mes " + mes + " es " + (nombreMes));
    }
}
