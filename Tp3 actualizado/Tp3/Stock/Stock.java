package Stock;

public class Stock {
    /**
     * Esta funcion muestra el stock sobrante
     */
    public static void stock() {
        int fila, columna;
        int[][] stock = {{10, 5000},
                         {10, 2500}, 
                         {10, 7000}, 
                         {10, 15000}, 
                         {10, 6000},
                         {10, 10000}, 
                         {10, 3000}, 
                         {10, 3500},
                         {10, 1000}, 
                         {10, 1250},
                         {10, 55000},
                         {10, 59000}, 
                         {10, 69000},
        };
        String[] productos = {"Gabinete", "Memoria RAM", "Fuente de Alimentación", "Microprocesadores", "Discos rigidos", "Motherboards", "Mouses", "Teclados", "Parlantes", "Microfonos", "PC1", "PC2", "PC3"};
        for(fila = 0; fila < 13; fila++){
            System.out.print(productos[fila] + "  | " + "Cantidad: ");
            for(columna = 0; columna < 2; columna++){
                System.out.printf("%10d ", stock[fila][columna]);
            }
            System.out.println();
        }
    }

}


