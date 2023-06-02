package Stock;

public class stock2 {
    /**
     * Esta funcion muestra el stock sobrante de las partes 
     */
    public static void stockPartes() {
        int [] produc= new int[10];
        produc[0]=10;
        produc[1]=10;
        produc[2]=10;
        produc[3]=10;
        produc[4]=10;
        produc[5]=10;
        produc[6]=10;
        produc[7]=10;
        produc[8]=10;
        produc[9]=10;
        
    

        System.out.println("Gabinete|RAM|Fuente|procesadores|Discos|Motherboards|Mouses|Teclados| Parlantes|Microfonos|");
        for(int i = 0; i < 10; i++){
            System.out.print(produc[i] + "    |    ");
        }
    }

 /**
 * Esta funcion muestra el stock sobrante de las pcs enteras
 */
    public static void stockPcsEnteras() {
        int [] producto= new int[3];
        producto[0]=10;
        producto[1]=10;
        producto[2]=10;

        System.out.println("PC1| PC2 | PC3|");
        System.out.println(producto[0] + "| " + producto[1] + " | " + producto[2] + "|");
    }
    


}





