import java.util.ArrayList;

public class MetodoRemoveIf01 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");
        a.removeIf(palabra -> palabra.contains("a"));
        System.out.println(a);
    }
}
