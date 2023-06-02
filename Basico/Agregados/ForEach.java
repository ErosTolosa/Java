public class ForEach {
    public static void main(String[] args) {
        int array []= {10,20,30,40,50,60};
        for(int aux: array){
            System.out.print("" + aux);
        }
        System.out.println();
        //////////////////////////////////
        Objeto obj[] = new Objeto[4];
        obj[0] = new Objeto(10 , "diez");
        obj[1] = new Objeto(20 , "veinte");
        obj[2] = new Objeto(30 , "treinta");
        obj[3] = new Objeto(40 , "cuarenta");

        for(Objeto aux : obj){
            System.out.print(aux);
        }
    }
}
