package Stock;

public class FuncionCantidad {
    public static void main(String[] args) {
        
   // public static void cantidadActual(int x[][]){

    int [][] resta = new int[13][2];
    resta[0][0]=10;
    resta[1][0]=10;
    resta[2][0]=10;
    resta[3][0]=10;
    resta[4][0]=10;
    resta[5][0]=10;
    resta[6][0]=10;
    resta[7][0]=10;
    resta[8][0]=10;
    resta[9][0]=10;
    resta[10][0]=10;
    resta[11][0]=10;
    resta[12][0]=10;

    int tamanoArray = resta.length;
    int resultadoResta = resta[0][0];
    for (int i = 1; i < tamanoArray; i++)
    {
        resultadoResta = resultadoResta - resta[i][i];
    }
  }
}

