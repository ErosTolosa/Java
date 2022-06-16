package Menus;

public class MenuPcs {
/**
 * La Función componentesPcs da a elegir la visualización de las diferentes computadoras ya armadas 
 * y permite ver que componentes la conforman. 
 * 
 * 
*/
    public static void componentesPcs(int x){
        System.out.println("Los componentes de cual PC quiere ver?");//Menu básico
        System.out.println("\n 1-Pc1 \n 2-Pc2 \n 3-Pc3 \n 4-salir");
        int componentes=Integer.parseInt(System.console().readLine());
        switch (componentes){
            case 1: //Pc 1 y componentes.
                System.out.println("Pc1");
                System.out.print("Componentes Fijos (Gabinete / Fuente / Procesador / Motherboard)");
                System.out.print("\n Ram x1 \n Disco Rigido x1\n");
                componentesPcs(x);//Resetea la Función y vuelve a selección de Pcs.
            break;
            case 2: //Pc 2 y componentes.
                System.out.println("Pc2");
                System.out.print("Componentes Fijos (Gabinete / Fuente / Procesador / Motherboard)");
                System.out.print("\n Ram x4 \n Disco Rigido x2\n");
                componentesPcs(x);//Resetea la Función y vuelve a selección de Pcs.
            break;
            case 3: //Pc 3 y componentes.
                System.out.println("Pc3");
                System.out.print("Componentes Fijos (Gabinete / Fuente / Procesador / Motherboard)");
                System.out.print("\n Ram x8 \n Disco Rigido x2\n");
                componentesPcs(x);//Resetea la Función y vuelve a selección de Pcs.
            break;
            case 4:
                Menus.MenuPrincipal.menuPrincipal();//Manda hacia el menu principal
            break;
            default:  //En caso de ingresar un numero incorrecto, mostrara un mensaje y volverá al menú.
                System.out.println("Esa Pc no existe");
                componentesPcs(x); //Resetea la Función y vuelve a selección de Pcs.
            break;
        }
    }
}

