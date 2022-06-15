package Menus;

public class MenuCompraUnidad {
    public static void MenuUnidad (int x){
        System.out.println ("elegir tipo de compra");
        System.out.println("1- pcs enteras /n 2-partes");
        int tipo=Integer.parseInt(System.console().readLine());
        switch (tipo){
            case 1:
                pcsEnteras(x);
            break;
            case 2:
                Partes(x);
            break;    
        }
    }


    public static void pcsEnteras(int x){        
        System.out.println("elija el pc que quiere comprar");
                    System.out.println("\n 1- \n pc1- \n");
                    System.out.println("\n 2- \n pc2- \n");
                    System.out.println("\n 3- \n pc3- \n");
                    int pcs= Integer.parseInt(System.console().readLine());
                    double precio;
                    double precioTotal;
                    switch (pcs){ 
                        case 1:
                            precio=((55000 * 0.30)+55000); //precio con 30%
                            precioTotal=((precio * 0.21)+ precio); //precio con IVA
                            System.out.println("el precio total sera de " + precioTotal);
                            System.out.println("gracias por su compra");
                        break;
                        case 2:
                            precio=((59000 * 0.30)+59000); //precio con 30%
                            precioTotal=((precio * 0.21)+ precio); //precio con IVA
                            System.out.println("el precio total sera de " + precioTotal);
                            System.out.println("gracias por su compra");
                        break;
                        case 3:
                            precio=((69000 * 0.30)+69000); //precio con 30%
                            precioTotal=((precio * 0.21)+ precio); //precio con IVA
                            System.out.println("el precio total sera de " + precioTotal);
                            System.out.println("gracias por su compra");
                        break;
    }
}

public static void Partes (int x){
    System.out.println("elegir producto");
    System.out.println("\n 1-gabinete=$5000 \n 2-ram=$2500 \n 3-Fuente=$7000 \n 4-Procesador=$15000");
    System.out.println("\n 5-Discos Rigidos=$6000 \n 6-Motherboards=$10000 \n 7-mouse=$7000 \n 8-teclado=$3500");
    System.out.println("\n 9-parlante=$1000 \n 10-microfono=$1250 \n");
    int producto=Integer.parseInt(System.console().readLine());
    System.out.println("cuantos quiere comprar?");
    int cantidad =Integer.parseInt(System.console().readLine());
    
    switch (cantidad){
        case 1:
            System.out.println("gabinete");
            if (cantidad >= 3) {
                System.out.println((producto * cantidad * 0.30));
            } else (cantidad < 3){
                System.out.println((producto * cantidad * 0.30)* 0.21);

            }

        break;
        case 2:
            System.out.println("ram");
        break;
    }
    
}

}
