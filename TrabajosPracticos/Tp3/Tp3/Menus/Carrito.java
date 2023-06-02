package Menus;


/**
 * @Param: Este es carrito de compras, aca se almacena y se suma todo lo que el usuario compro
 * @param: se usa un array vacio que se rellena segun lo que el cliente haya ingresado
 * @param: luego se recorre todo el array y se suma sus componentes para dar el total de la facturacion del cliente
 */

public class Carrito {
    public static void facturacion ( double x []) {
    x= new double[10];
     System.out.println("ingrese su compra");
    for(int i = 0 ; i <4; i++){
      System.out.print(" su factura es " + (i+1) + ": ");
    x [i]=Double.parseDouble(System.console().readLine());

 } 
     System.out.println("tus compras son: ");
   double suma= 0;
    for (int i = 0 ; i < 11 ; i++){
     System.out.print(x[i] + " " );
        suma +=  x[i];
 }    
     System.out.println("/n su compra es " + (suma));     
}
}

