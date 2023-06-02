package Operaciones;
import Jugadores.Jugador;
import java.util.Scanner;

public class Funciones {
    Scanner s = new Scanner(System.in);
    public void turnos(Jugador j){
        boolean salir = false;
        for (int i = 0; i < 2; i++){
            do{
                Operaciones.Menues.acciones();
                int accion = s.nextInt();
                switch (accion){
                    case 1:
                        //1.ataqueBasico(j2);
                    case 2:
    
                    case 3:
                }
            }while(!salir);
        }

    }

    
}
