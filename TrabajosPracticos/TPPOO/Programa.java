import java.util.ArrayList;


public class Programa {
    public static void main(String[] args) {
        boolean salir=false;
        //inicializa el array del objeto personal generando sus respectivos codigos,puestos y antiguedad.
        ArrayList <Personal> ap =new ArrayList<Personal>();
        ap.ensureCapacity(50);
        for(int i=0;i<50;i++){
            int j=((int)(Math.random() * 9000) + 1000);
            String cod=(j+"");
            int anti =((int)(Math.random() *10)+1);
            int pues =((int)(Math.random()*4)+1);
            ap.add(new Personal(cod, pues, anti));
        }
        
        do{
            FuncionMenu.menuPrincipal();
            int op=Integer.parseInt(System.console().readLine());
            switch (op) {
                case 1:
                    System.out.println("--------Personal--------");
                    for(int i = 0; i< 50; i++){
                        System.out.print(i +": ");      //indica el puesto donde esta guardado un objeto especifico
                        System.out.println(ap.get(i));  //se invoca el método toString de la clase Personal             
                    }
                break;

                case 2:
                    System.out.println("--------Pago de Empleado--------");
                    System.out.println("1-TécnicoSR  2-TécnicoJR  3-Administrativo  4-Staff general");
                    //Personal.Pagar()
                break;

                case 3:
                    System.out.println("--------Despedir Personal--------");
                    System.out.println("ingrese el lugar del empleado al que funar");
                    int a=Integer.parseInt( System.console().readLine());
                        ap.remove(a);
                        System.out.println("el empleado fue borrado del sistema");
                break;

                case 4:
                    System.out.println("--------Contratar Personal--------");
                    if(ap.size()>50){
                        System.out.println("No hay puestos de trabajo disponibles");
                    }else{
                        int nc=((int)(Math.random() * 9000) + 1000);
                        String cod=(nc+"");
                        int an=0;
                        System.out.println("ingrese puesto de trbajo");
                        System.out.println("1-TécnicoSR  2-TécnicoJR  3-Administrativo  4-Staff general");
                        int p=Integer.parseInt(System.console().readLine());
                        ap.add(new Personal(cod, p, an));
                        System.out.println(ap.get(50));
                    }
                break;

                case 5:
                    salir=true;
                break;
                
                default:
                    System.out.println("ingrese un numero que este dentro del menu");
                break;
                        
            }
        }while(!salir);
    }
}
