
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Personal {
    public static void main(String[] args) {
        boolean salida=false;
        double sueldo;
        Scanner s=new Scanner(System.in);

        /*
        * Inicializa un mapa con el numero del Empleado y su lugar de trabajo:
                   1-TécnicoSR  2-TécnicoJR  3-Administrativo  4-Staff general
        */
            HashMap <Integer,String> mp=new HashMap<Integer,String>();
            for(int i=0;i<50;i++){
                int j=((int)(Math.random() * 9000) + 1000);
                int puesto=((int)(Math.random() *4)+1);
                String a=(puesto + "");
                mp.put(j,a);  
            }

        do{
            Funciones.FuncionMenu.menuPrincipal();
            int opcionMenu =Integer.parseInt(System.console().readLine());

            switch(opcionMenu){
                case 1:
                    System.out.println("--------Personal--------");
                    for(Map.Entry pareja:mp.entrySet()){
                        System.out.println("Empleado: " + pareja.getKey() + "\t puesto: " + pareja.getValue());
                    }
                break;

                
                case 2:
                    System.out.println("--------Pago de Empleado--------");
                    System.out.println("ingrese el codigo de un empleado");
                    String codigo=System.console().readLine();
                    if (mp.containsKey(codigo)){
                        System.out.println("cuantos anios de antiguead tiene el trabajador?");
                        int an=Integer.parseInt(System.console().readLine());
                        System.out.println("cauntas hrs trabaja por semana?");
                        double hrs=s.nextDouble();
                        String p=mp.get(codigo);
                        int n = Integer.valueOf(p);
                        if (n == 1){
                            hrs=hrs*550;
                            sueldo=(hrs );
                            System.out.println("el sueldo mensual del trbajador "+ mp.get(codigo) + "es: " + sueldo );
                        }if(n==2){
                            hrs=hrs*380;
                            sueldo=(hrs );
                            System.out.println("el sueldo mensual del trbajador "+ mp.get(codigo) + "es: " + sueldo );
                        }if(n==3){
                            hrs=hrs*400;
                            sueldo=(hrs );
                            System.out.println("el sueldo mensual del trbajador "+ mp.get(codigo) + "es: " + sueldo );
                        }if(n==4){
                            hrs=hrs*300;
                            sueldo=(hrs );
                            System.out.println("el sueldo mensual del trbajador "+ mp.get(codigo) + "es: " + sueldo );
                        }
                    }else{
                        System.out.println("el codigo es incorrecto");
                        salida=false;
                    }
                break;


                case 3:
                    System.out.println("--------Despedir Personal--------");
                    System.out.println("ingrese el codigo de un empleado al que funar");
                    int c=Integer.parseInt(System.console().readLine());
                    if (mp.containsKey(c)){
                        mp.remove(c);
                        System.out.println(c + " eliminado del sistema");
                    }else{
                        System.out.println("el codigo es incorrecto");
                    }
                break;


                case 4: 
                    System.out.println("--------Contratar Personal--------");
                    boolean salir=false;
                   do{
                    System.out.println("ingrese el codigo del nuevo empleado");
                    int nombre=Integer.parseInt(System.console().readLine());
                    if(mp.containsKey(nombre)){
                        System.out.println("ese codigo ya exixte. Intente nuevamente");
                        salida=false;
                    }else{
                        System.out.println("ingrese puesto");
                        System.out.println("1-TécnicoSR  2-TécnicoJR  3-Administrativo  4-Staff general");
                        int puesto=Integer.parseInt(System.console().readLine());
                        if((puesto > 4) || (puesto < 1)){
                            System.out.println("ese puesto no es correcto. Intente nuevamente");
                            salida=false;
                        }else{
                            String puestof=(puesto + "");
                            mp.put(nombre,puestof);
                            salir=true;
                        }
                    }
                   }while(!salir);
                break;


                case 5:
                    salida=true;
                break;
            }


        }while(!salida);
    }
 
}