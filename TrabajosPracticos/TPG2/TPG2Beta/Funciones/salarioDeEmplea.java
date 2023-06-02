package Funciones;
public class salarioDeEmplea {
    public static void salarioDeEmple(){

        System.out.println("Este programa sirve para ver cuanto gana cada categoria de empleado por hora.");
        System.out.println("Si desea saber mas informacion, ingrese el numero de la categoria a la que pertenece: ");
        System.out.println("1.Técnico SR");
        System.out.println("2.Técnico JR");
        System.out.println("3.Administrativo");
        System.out.println("4.Staff general");
        int categoria=Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = Integer.parseInt(System.console().readLine());
        String salarios;

        switch(categoria){
            case 1:
            salarios="Técnico SR " + horasTrabajadas * 550 ;
            break;
            case 2:
            salarios="Técnico JR " + horasTrabajadas * 380;
            break;
            case 3:
            salarios= "Administrativo "+ horasTrabajadas * 400;
            break;
            case 4:
            salarios="Staff general " + horasTrabajadas * 300;
            break;
            default:
            salarios="No existe esa categoria";
        }
        System.out.println("El salario semanal correspondiente a esa categoria es de: " + salarios + " pesos");
        
        //FALTA AGREGARLE EL 10% POR ANTIGUEDAD.
    }

    
}
