package Menus;

public class MenuCompra {

/**
 * subMenu es la función que despliega el menú de compra de productos (compras tanto por Unidad como Mayorista).
 * Esta función a su vez despliega dos funciónes, una para Pcs completas (pcsEnteras) y otra para
 * partes (partes).
 * 
*/
public static void subMenu (int x){
        System.out.println ("elegir tipo de compra");//menu basico
        System.out.println("1- pcs enteras \n 2-partes \n 3-Salir");
        int tipo=Integer.parseInt(System.console().readLine());
        switch (tipo){
            case 1://Llama a la función para desplegar un menu para pcs enteras
                pcsEnteras(x);
            break;
            case 2://Llama a la función para desplegar un menu para partes de pc
                Partes(x);
            break;
            case 3:////Llama a la función para volver al menu principal
                Menus.MenuPrincipal.menuPrincipal(); 
            break;
            default: Menus.MenuCompra.subMenu(x);//Cualquier otro numero ingresado, volvera a llamar al menu    
        }
}

/**
 * Esta función despliega un menú para la compra de Pcs ya ensambladas (minorista y mayorista).
 * 
 */
    public static void pcsEnteras(int x){        
        System.out.println("---Selección de Pcs Ensambladas---");
                    System.out.println("\n 1=pc1 \n 2=pc2 \n 2=pc3 \n 4-Salir");
                    int pcs= Integer.parseInt(System.console().readLine());
                    double precio;
                    double precioTotal;
                    switch (pcs){ 
                        case 1://Pc1
                            precio=((55000 * 0.30)+55000); //precio con 30%
                            precioTotal=((precio * 0.21)+ precio); //precio con IVA
                            System.out.println("el precio total sera de " + precioTotal);

                            System.out.println("gracias por su compra");
                        break;
                        case 2://Pc2
                            precio=((59000 * 0.30)+59000); //precio con 30%
                            precioTotal=((precio * 0.21)+ precio); //precio con IVA
                            System.out.println("el precio total sera de " + precioTotal);
                            System.out.println("gracias por su compra");
                        break;
                        case 3://Pc3
                            precio=((69000 * 0.30)+69000); //precio con 30%
                            precioTotal=((precio * 0.21)+ precio); //precio con IVA
                            System.out.println("el precio total sera de " + precioTotal);
                            System.out.println("gracias por su compra");
                        break;
                        case 4://salida
                            System.out.println("\n 1=volver atras  \n 2=volver pagina principal");
                            int salidaEntera= Integer.parseInt(System.console().readLine());
                            if (salidaEntera == 1){
                                Menus.MenuCompra.subMenu(x);//llamara al menu de compra
                            }else{
                                Menus.MenuPrincipal.menuPrincipal(); //volvera al menu principal
                            }
                        break;
                        default://Salida
                            Menus.MenuPrincipal.menuPrincipal(); //volvera al menu principal
                    }
    }

/**
 * Esta función despliega un menú para la compra de partes de pcs (minorista y mayorista).
 *
 */
public static void Partes (int x){
    System.out.println("elegir producto");//menu basico
    System.out.println("\n 1-gabinete=$5000 \n 2-ram=$2500 \n 3-Fuente=$7000 \n 4-Procesador=$15000");
    System.out.println("\n 5-Discos Rigidos=$6000 \n 6-Motherboards=$10000 \n 7-mouse=$7000 \n 8-teclado=$3500");
    System.out.println("\n 9-parlante=$1000 \n 10-microfono=$1250 \n");
    int partes =Integer.parseInt(System.console().readLine());
    double precio;
    double precioTotal;
    if (partes == 1){//gabinete
        precio=5000;
        System.out.println("cuantos va a comprar?(10 unidades maximo)");
        int cantidad=Integer.parseInt(System.console().readLine());
        if (cantidad <=2){
            precioTotal=((precio*cantidad)*0.30);
            System.out.println("el precioTotal es" + (precioTotal));
        }else{
            precioTotal=(((precio*cantidad)*0.30)*0.21);
            System.out.println("el precioTotal es" + (precioTotal));
        }      
    }if (partes == 2){//ram
        precio=2500;
        System.out.println("cuantos va a comprar?");
        int cantidad=Integer.parseInt(System.console().readLine());
        if (cantidad <=2){
            precioTotal=((precio*cantidad)*0.30);
            System.out.println("el precioTotal es" + (precioTotal));
        }else{
            precioTotal=(((precio*cantidad)*0.30)*0.21);
            System.out.println("el precioTotal es" + (precioTotal));
        }      
    }


}

}
