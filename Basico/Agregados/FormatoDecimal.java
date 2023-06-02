import java.text.DecimalFormat;
public class FormatoDecimal {
    public static void main(String[] args) {
        DecimalFormat variable = new DecimalFormat("0.00");

        double a= 0.123456;
        
        System.out.println(variable.format(a));
    }
}
