import java.util.HashMap;
import java.util.Map;

public class EjemploGetkeyYGetValue {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(219, "Victor Tilla");
        m.put(537, "Marcelo Tinelli");
        m.put(605, "Esteban Quito ");

        System.out.println("Código\tNombre\n------\t-------------");
        for (Map.Entry pareja: m.entrySet()) {
            System.out.print(pareja.getKey() + "\t");
            System.out.println(pareja.getValue());
        }
    }
}