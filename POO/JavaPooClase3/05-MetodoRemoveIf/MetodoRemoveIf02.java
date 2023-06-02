import java.util.ArrayList;

public class MetodoRemoveIf02 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(7);
        a.add(3);
        a.add(-2);
        a.removeIf(numero -> numero < 5);

        System.out.println(a);
    }
}
