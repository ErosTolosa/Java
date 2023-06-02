import java.util.HashMap;

public class EjemploContains {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(924, "Armando Paredes");
        m.put(921, "Elba Gallo");
        m.put(700, "Susana Gimenez");
        m.put(219, "Victor Tilla");
        m.put(537, "Marcelo Tinelli");
        m.put(605, "Esteban Quito ");

        System.out.print("Por favor, introduzca un código: ");
        int codigoIntroducido = Integer.parseInt(System.console().readLine());

        if (m.containsKey(codigoIntroducido)) {
            System.out.print("El código " + codigoIntroducido + " corresponde a ");
            System.out.println(m.get(codigoIntroducido));
        } else {
            System.out.print("El código introducido no existe.");
        }
    }
}