public class Ejercicioif6 {
    public static void main(String[] args) {
        System.out.println("ingrese el mes en el que nacio en numero (1-12)");
        int mes=Integer.parseInt(System.console().readLine());
        System.out.println ("introduzca el dia de naciemiento");
        int dia=Integer.parseInt(System.console().readLine());
        String horoscopo= "";
        switch(mes){
            case 1: 
                if (dia < 21){
                    horoscopo= "capricornio";
                }else {
                    horoscopo= "acuario";
                }
            break;
            case 2: 
                if (dia < 20){
                    horoscopo= "acuario";
                }else {
                    horoscopo= "piscis";
                }
            break;
            case 3: 
                if (dia < 21){
                    horoscopo= "piscis";
                }else {
                    horoscopo= "aries";
                }
            break;
            case 4: 
                if (dia < 21){
                    horoscopo= "aries";
                }else {
                    horoscopo= "tauro";
                }
            break;
            case 5: 
                if (dia < 20){
                    horoscopo= "tauro";
                }else {
                    horoscopo= "geminis";
                }
            break;
            case 6: 
                if (dia < 22){
                    horoscopo= "geminis";
                }else {
                    horoscopo= "cancer";
                }
            break;
            case 7: 
                if (dia < 22){
                    horoscopo= "cancer";
                }else {
                    horoscopo= "leo";
                }
            break;
            case 8: 
                if (dia < 24){
                    horoscopo= "leo";
                }else {
                    horoscopo= "virgo";
                }
            break;
            case 9: 
                if (dia < 23){
                    horoscopo= "virgo";
                }else {
                    horoscopo= "libra";
                }
            break;
            case 10: 
                if (dia < 23){
                    horoscopo= "libra";
                }else {
                    horoscopo= "escorpio";
                }
            break;
            case 11: 
                if (dia < 21){
                    horoscopo= "escorpio";
                }else {
                    horoscopo= "sagitario";
                }
            break;
            case 12: 
                if (dia < 21){
                    horoscopo= "sagitario";
                }else {
                    horoscopo= "capricornio";
                }
            break;
            default:
        } 
        System.out.print ("su horoscopo es " + horoscopo);
    }
}
