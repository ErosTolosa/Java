public class array02 {
    public static void main(String[] args) {
        int [] x= new int [5];
        x [0]= 0;
        x [1]= 33;
        x [2]= 200;
        x [3]= 150;
        x [4]= 11;
        System.out.println("el array tiene 5 elementos");
        System.out.println("introduzca un numero del 0 al 4");
        int indice =Integer.parseInt(System.console().readLine());
        System.out.println("el elemento " + indice);
        System.out.println("es" + (x[indice]));
    }
}
