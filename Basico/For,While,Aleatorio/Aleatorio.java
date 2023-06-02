public class Aleatorio {
    public static void main(String[] args) {
        System.out.println("20 numeros aleatorios entre 0 y 10");
        System.out.println("Sin llegar al 10");
        for(int i=10; i<=20; i++){
            System.out.print(((int)(Math.random()*10)+ " "));
        }
        System.out.println();
    }
}
