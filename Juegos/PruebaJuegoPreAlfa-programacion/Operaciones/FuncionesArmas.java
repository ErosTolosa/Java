package Operaciones;
import Jugadores.Armas;
import Jugadores.ClaseJugador;
import Jugadores.Jugador;
import java.util.Scanner;

public class FuncionesArmas {
    public static void equipaArma(Jugador j){
        ClaseJugador c = j.getClase();
        Scanner s = new Scanner(System.in);
        //////////////////////// CREACION DE ARMAS /////////////////////////////////
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
        Armas baculoMagico = new Armas(0, 6, 0);
        switch(c){
            case CABALLERO:
                System.out.println("Seleccione el arma: ");
                System.out.println("1. Espada de hierro");
                System.out.println("2. Estoque");
                System.out.println("3. Espada de fuego");
                switch(s.nextInt()){
                    case 1:
                        espadaHierro.equipaArma(j);
                        break;
                    case 2:
                        estoque.equipaArma(j);
                        break;
                    case 3:
                        espadaFuego.equipaArma(j);
                        break;
                }
                break;
            case LADRON:
                System.out.println("Seleccione el arma: ");
                System.out.println("1. Daga de hierro");
                System.out.println("2. Daga de hielo");
                System.out.println("3. Kunai");
                switch(s.nextInt()){
                    case 1:
                        espadaHierro.equipaArma(j);
                        break;
                    case 2:
                        estoque.equipaArma(j);
                        break;
                    case 3:
                        espadaFuego.equipaArma(j);
                        break;
                }
                break;
            case MAGO:
                System.out.println("Seleccione el arma: ");
                System.out.println("1. Baculo de hierro");
                System.out.println("2. Baculo electrico");
                System.out.println("3. Baculo magico");
                switch(s.nextInt()){
                    case 1:
                        espadaHierro.equipaArma(j);
                        break;
                    case 2:
                        estoque.equipaArma(j);
                        break;
                    case 3:
                        espadaFuego.equipaArma(j);
                        break;
                }
                break;
            case DEFAULT:
                break;
        }   
    }
}
