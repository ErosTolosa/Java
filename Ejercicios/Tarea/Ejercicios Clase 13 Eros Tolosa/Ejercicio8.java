import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print ("Kilobytes: ");
        int kilobytes =s.nextInt();
        System.out.print (kilobytes + " kilobytes son: " + (kilobytes * 0.001 ) + " megabytes ");
    }
}
