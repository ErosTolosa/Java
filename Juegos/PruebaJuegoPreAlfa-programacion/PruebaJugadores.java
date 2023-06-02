import Jugadores.Armas;
import Jugadores.ClaseJugador;
import Jugadores.Jugador;

import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

public class PruebaJugadores {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        /*//////////////////////// CREACION DE ARMAS /////////////////////////////////
        // ARMAS CABALLERO
        Armas espadaHierro = new Armas(6, 0, 0);
        Armas estoque = new Armas(3, 0, 3);
        Armas espadaFuego = new Armas(3,3,0);
        // ARMAS LADRON
        Armas dagaHierro = new Armas(4, 0, 2);
        Armas dagaHielo = new Armas(2, 2, 2);
        Armas kunai = new Armas(2, 0, 4);
        // ARMAS MAGO
        Armas baculoHierro = new Armas(2, 4, 0);
        Armas baculoElectro = new Armas(0, 4, 2);
        Armas baculoMagico = new Armas(0, 6, 0);*/
        ////////////////////////// CREACION DE JUGADORES ////////////////////////
        Jugador[] player = new Jugador[2];
        for(int i = 0; i < 2; i ++){
            System.out.println("Ingrese nombre de jugador " + (i + 1));
            String nombre = s.next();
            System.out.println("Ingrese clase de jugador " + (i + 1));
            System.out.print("1: CABALLERO\n2: LADRON\n3: MAGO\n");
            int sClase = s.nextInt();
            //System.out.println("Seleccion de Armas");
            switch (sClase){
                case 1:
                    player[i] = new Jugador(nombre, ClaseJugador.CABALLERO);
                    break;
                case 2:
                    player[i] = new Jugador(nombre, ClaseJugador.LADRON);
                    break;
                case 3:
                    player[i] = new Jugador(nombre, ClaseJugador.MAGO);
                    break;
            }
            System.out.println("Datos basicos");
            System.out.println(player[i]);
            Operaciones.FuncionesArmas.equipaArma(player[i]);
        }   
        System.out.println("Datos de jugadores con arma");
        System.out.println(player[0]);
        System.out.println(player[1]);
        do{
            System.out.println(player[0]);
            System.out.println(player[1]);
            System.out.println("Jugador 1 ataca");
            player[0].ataques(player[1]);
           
            System.out.println(player[0]);
            System.out.println(player[1]);
            System.out.println("Jugador 2 ataca");
            player[1].ataques(player[0]);
        }while (player[0].getHp() > 0 && player[1].getHp() > 0);

    }
}
