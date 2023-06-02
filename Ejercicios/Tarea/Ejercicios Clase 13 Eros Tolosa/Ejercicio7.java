import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print ("Megabytes: ");
        int megaBytes =s.nextInt();
        System.out.print (megaBytes + " megabytes son: " + (megaBytes * 1000) + " kilobytes ");
    }
}