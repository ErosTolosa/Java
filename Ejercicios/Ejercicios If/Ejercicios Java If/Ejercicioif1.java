public class Ejercicioif1 {
    public static void main(String[] args) {
        System.out.println ("introduzca una hora (0 - 23)");
        int hora=Integer.parseInt(System.console().readLine());
        
        if(( hora >=6 )&& (hora <=12)){
            System.out.print ("buenos dias");
        }
        if(( hora >=13 )&& (hora <=20)){
            System.out.print ("buenas tardes");
        }
        if((( hora >=20 )&& (hora <=23))||((hora >=5)&& (hora <= 0))) {
            System.out.print ("buenas noches");
        }
        if(( hora >=24 )|| (hora <=0)){
            System.out.print ("la hora no es correcta");
        }
    }
}
