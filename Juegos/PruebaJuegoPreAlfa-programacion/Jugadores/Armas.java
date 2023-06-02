package Jugadores;

public class Armas extends Champ {
    private int fuerza;
    private int inteligencia;
    private int destreza;

    public Armas(int f, int i, int d){
        this.fuerza = f;
        this.inteligencia = i;
        this.destreza = d;
    }

    public void equipaArma(Jugador j){
        j.setArmas(fuerza, inteligencia, destreza);
    }
}
