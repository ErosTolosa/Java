public class Ejercicioif3 {
   public static void main(String[] args) {
       System.out.println ("ingrese la cantidad de horas trabajadas en la semana");
       int horas=Integer.parseInt(System.console().readLine());
       if (horas <= 40){
           System.out.println("el salario semanal es: " + (horas * 250));
       }
       if (horas >= 41){
           System.out.println ("el salario seamanal es: " + (horas*300));
       }
   } 
}
