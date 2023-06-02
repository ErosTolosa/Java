public class PruebaGatoSimple {
    public static void main(String[] args){

        GatoSimple garfield = new GatoSimple("macho");

        System.out.println("Hola gato");
        garfield.maulla();
        System.out.println("Tomá una lechuga");
        garfield.come("lechuga");
        System.out.println("Tomá pescado, a ver si te gusta mas");
        garfield.come("pescado");

        GatoSimple tom = new GatoSimple("macho");

        System.out.println("Tomá pan");
        tom.come("pan");

        GatoSimple lisa = new GatoSimple("hembra");

        System.out.println("Maullen gatos");
        garfield.maulla();
        lisa.maulla();
        tom.maulla();

        garfield.peleaCon(lisa);
        lisa.peleaCon(tom);
        tom.peleaCon(garfield);
    }
}
