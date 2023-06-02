import java.util.ArrayList;

public class MetodoRemoveContains {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");
        a.add("blanco");
        System.out.println("Contenido de la lista: ");

        for(String color: a) {
            System.out.println(color);
        }

        if (a.contains("blanco")) {
            a.remove("blanco");
        }

        a.remove(2);

        for(String color: a) {
            System.out.println(color);
        }
    }
}
    