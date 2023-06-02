import java.util.Random;

public class Cuadrado {
    public static void main(String[] args) {
        System.out.println("horizontal");
        int a=Integer.parseInt(System.console().readLine());
        System.out.println("vertical");
        int b=Integer.parseInt(System.console().readLine());
        String COSA="$";
        String dime [][]  = new String [a][b];

        

        for (int i = 0; i<a; i++){
             for (int o = 0; o<b; o++){
                dime[i][o]= "#";
                //System.out.print(dime[i][o]);
            }
                //System.out.println();
            }

        int x = (int)(Math.random() * a);
        int y = (int)(Math.random() * b);
        dime [x][y]="$";

        for (int i = 0; i<a; i++){
            for (int o = 0; o<b; o++){
                System.out.print(dime[i][o]);
            }
                System.out.println();
            }
        
       

       

    }
}

