import javax.security.sasl.SaslClientFactory;

public class Tp3 {
    public static void main(String[] args) {
        System.out.print("que decea hacer?");
        System.out.println("\n 1- compra" + "\n 2- Stock" + "\n 3- salir");
        int menuPrincipal= Integer.parseInt(System.console().readLine());


        boolean salir= false;
        do{
            if (menuPrincipal == 1){//compra 
                        switch (menuPrincipal){ 
                                    case 1: //compra pc entera
                                        Menus.MenuCompraUnidad.MenuUnidad(menuPrincipal);
                                    break;
                                    case 2: //compra por partes
                                        Menus.MenuCompraUnidad.Partes(menuPrincipal);
                                    break;
                                    }
            }if (menuPrincipal == 2){ 
                        System.out.println("elegir vista de stock");
                        System.out.println("\n 1-componentes de pc \n 2-stock \n 3-recarga stock");
                        int opcion=Integer.parseInt(System.console().readLine());
                            switch (opcion){
                                case 1:
                                    System.out.println("falta");
                                break;
                                case 2: 
                                    Stock.Stock;
                                break;
                                }
                            
            }if (menuPrincipal == 3){
                salir=(true);
            }
            
             
                                          

        }while (!salir);
    }
}

