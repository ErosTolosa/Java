public class SentenciaIfo1 {
    public static void main(String[] args) {
        System.out.print ("Cual es la capital de rusia?");
        String respuesta = System.console().readLine();
        if(respuesta.equals("moscu")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        } 
    }
}
