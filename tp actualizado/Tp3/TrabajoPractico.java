public class TrabajoPractico {
    public static void main(String[] args) {
    
        
    System.out.print("___/ Bienvenido a Compumundohipermegared S.A /___");//Menu básico
        System.out.println("\n 1-Atencion al Publico \n 2-Deposito \n 3-Produccion \n 4-Personal \n 5-salir");
        int accion= Integer.parseInt(System.console().readLine());
        boolean salir= false;

        do{
            switch(accion){
                case 1://Atencion al publico
                    Menus.MenuPrincipal.menuPrincipal();
                    salir=true;
                break;
                case 2://Deposito (otro grupo)
                    System.out.println("no encontrado");
                    salir=true;
                break;
                case 3://Produccion (otro grupo)
                    System.out.println("no encontrado");
                    salir=true;
                break;
                case 4://Personal (otro grupo)
                    System.out.println("no encontrado");
                    salir=true;
                break;
                case 5://salida
                    salir=true;
                break;
            }

        }while (!salir);
    }
}
