
public class Ejercicioif7 {
    public static void main(String[] args) {
        int aux;
        System.out.println("ingrese 3 numeros con un espacio entre medio");
        int a =Integer.parseInt(System.console().readLine());
        int b =Integer.parseInt(System.console().readLine());
        int c =Integer.parseInt(System.console().readLine());
        if (a>b){
            aux=a;
            a=b;
            b=aux;
        }
        if (b>c){
            aux=b;
            b=c;
            c=aux;
        }
        if (a>b){
            aux=a;
            a=b;
            b=aux;
        }
        System.out.print ("los numeros intruducidos ordenados de menor a mayor son" + a + " , "+ b +" y "+c);
        
}
}