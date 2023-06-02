
import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        boolean salir=false;
        //inicializa el array del objeto personal generando sus respectivos codigos,puestos y antiguedad.
        
        ArrayList <Personal> ap =new ArrayList<Personal>();
        for(int i=0;i<50;i++){
            int j=((int)(Math.random() * 9000) + 1000);
            String cod=(j+"");
            int anti =((int)(Math.random() *10)+1);
            int pues =((int)(Math.random()*4)+1);
            ap.add(new Personal(cod, pues, anti));
        }
     

        do{
            int op=Integer.parseInt(System.console().readLine());
         
            switch (op) {
                case 1:
                    for(int i = 0; i< 50; i++){
                        System.out.println(ap.get(i));  //se invoca el método toString de la clase Personal             
                    }     
                break;
                case 2:

                break;
                
                case 3:
                    System.out.println("--------Despedir Personal--------");
                    System.out.println("ingrese el codigo de un empleado al que funar");
                    int a=Integer.parseInt( System.console().readLine());
                    if (ap.contains(a)){
                        ap.remove(a);
                        FuncionMenu.menuPrincipal();
                    }else{
                        System.out.println("el codigo de empleado ingresado no existe. Intente nuevamente");
                        salir=false;
                    }
                break;
                case 4:
                    System.out.println("--------Contratar Personal--------");

                break;
                default:
                    System.out.println("ingrese un numero que este dentro del menu");
                    FuncionMenu.menuPrincipal();
                     
                break;
                 
            }
     
           

        }while(!salir);

    }
}
