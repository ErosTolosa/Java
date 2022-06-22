package Menus;

import Stock.stock2;

public class MenuPrincipal {
    /**
     * Esta función genera un menú interactivo para la compra de productos, el stock e información. 
     *Esta función es la mas importante ya que engloba a todas las demás funciones creadas para el apartado de Atención al público.
     */
    public static void menuPrincipal(){
        System.out.print("___/ Bienvenido a Compumundohipermegared S.A /En su area de atencion al publico/___");//Menu básico
        System.out.println("\n 1- compra \n 2- Stock \n 3- Sobre Nosotros \n 4- salir");
        int menuPrincipal= Integer.parseInt(System.console().readLine());

        boolean salir= false;
        do{
            if (menuPrincipal == 1){//compra (minorista/mayorista)
                            Menus.MenuCompra.subMenu(menuPrincipal);//compra pc entera.
            }if (menuPrincipal == 2){ //Stock 
                        System.out.print("\n --elegir vista de stock--");//Menu básico
                        System.out.println("\n 1-componentes de pc \n 2-stock \n 3-recarga stock \n 4-salir");
                        int opcion=Integer.parseInt(System.console().readLine());
                            switch (opcion){
                                case 1: //Menu Pcs
                                    Menus.MenuPcs.componentesPcs(opcion); //Muestra las Pcs y sus componentes.
                                break;
                                case 2: 
                                    System.out.println("elegir stock");  //menu basico
                                    System.out.println("1-Stock partes 2-Stock pcs enteras"); 
                                    int verElStock=Integer.parseInt(System.console().readLine());
                                    if (verElStock == 1){//partes
                                        stock2.stockPartes();//funcion para mostrar stock de partes
                                        Menus.MenuPrincipal.menuPrincipal();//menu principal
                                    }else{//pcs enteras
                                        stock2.stockPcsEnteras();//funcion para mostrar stock pcs enteras
                                        Menus.MenuPrincipal.menuPrincipal();//menu principal
                                    }
                                break;
                                case 3:
                                    //////recarga de Stock
                                break;
                                case 4: //salida
                                    System.out.println("\n 1-volver atras \n 2-salir de la aplicacion");
                                    int salida=Integer.parseInt(System.console().readLine());
                                    if (salida == 1){
                                        Menus.MenuPrincipal.menuPrincipal();//menu principal
                                    }else{
                                        salir=true;//Permite la salida del programa
                                    }
                                break;
                                default:salir=false;
                            }
                            
            }if (menuPrincipal == 3){
                Menus.MenuInfo.info();//llama a la funcion de informacion

            }else{ //Siempre que se coloque un numero mayor o igual a 4
                salir=(true);//Permite la salida del programa
            }
            

        }while (!salir);
    }
}
