import java.util.HashMap;

public class EjemploMetodoGet {
    public static void main(String[] args) {

        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(921, "Elba Gallo");
        m.put(219, "Victor Tilla");
        m.put(605, "Esteban Quito");

        System.out.println(m.get(921));
        System.out.println(m.get(605));
        System.out.println(m.get(888));
    }
}