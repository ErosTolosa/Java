import java.util.ArrayList;

public class MetodoAdd03 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");
        System.out.println("Contenido de la lista: ");

        for(int i=0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
