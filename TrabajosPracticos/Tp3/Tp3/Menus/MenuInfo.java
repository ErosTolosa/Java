package Menus;

public class MenuInfo {

    /**
     * Esta función fue diseñada para mostrar información sobre Compumundohipermegared S.A y una de sus áreas de trabajo.
     */
    public static void info() {
        System.out.println("---Información sobre Compumundohipermegared S.A---");
        System.out.println("Compumundohipermegared S.A es una empresa proveedora de productos informáticos.");
        System.out.println ("Dentro de esta empresa hay cuatro áreas: Deposito, Personal, Atención al público y producción. Esta es la parte de atención al público.");
        System.out.println("--Información sobre atención al publico--");
        System.out.println("El área de atención al publico esta compuesta por cuatro personas Fernando,Tolosa,Copa y Sanguino. ");
        Menus.MenuPrincipal.menuPrincipal();
    }
}
