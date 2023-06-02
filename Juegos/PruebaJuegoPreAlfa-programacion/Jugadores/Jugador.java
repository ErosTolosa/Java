package Jugadores;
import java.util.Scanner;
public class Jugador extends Champ {
    private int hp;
    private int mana;
    private Armaduras armadura = new Armaduras();
    
    public Jugador(){
        super("DEFAULT", ClaseJugador.DEFAULT);
    }
    public Jugador (String n, ClaseJugador c){
        super(n, c);
        switch (c){
            case CABALLERO:
                super.setStats(500, 100,  10, 4, 6);
                this.setHpMp();
                break;
            case LADRON:
                super.setStats(300, 250,  5, 5, 10);
                this.setHpMp();
                break;
            case MAGO:
                super.setStats(100, 400,  3, 13, 4);
                this.setHpMp();
                break;
            default:
                super.setStats(0, 0,  0, 0, 0);
                this.setHpMp();
                break;
        }
    }
    // GETTERS
    public int getHp(){
        return this.hp;
    }
    public int getMana(){
        return this.mana;
    }
    
    // SETTERS 
    public void setHpMp(){
        this.hp = super.getMaxHp();
        this.mana = super.getMaxMana();
    }

    // METODOS
    public void muestraObjetos(){
        for (int i = 0; i < 2; i++){
            System.out.println("Armadura: " + armadura);
        }
    }

    public void muestraHpMana(){
        System.out.println("HP: " + this.hp);
        System.out.println("Mana: " + this.mana);
    }

    public void restaHp(int a){
        this.hp -= a;
    }

    public void ataqueBasico(Jugador oponente){
        oponente.restaHp(this.getFuerza() + 10);
    }

    public void verHabilidades(){
        switch (this.getClase()){
            case CABALLERO:
                System.out.println("Ataque Circular: Daño: 20 Mana: 15");
                System.out.println("Golpe bajo: Daño: 35 Mana: 25");
                System.out.println("Estocada: Daño: 40 Mana: 55");
            case LADRON:
                System.out.println("Ataque por la espalda: Daño: 20 Mana: 30");
                System.out.println("Daga venenosa: Daño: 20 Mana: 30");
                System.out.println("Ataque Circular: Daño: 20 Mana: 30");
            case MAGO:
                System.out.println("Bola de fuego: Daño: 70 Mana: 100");
                System.out.println("Rayo: Daño: 50 Mana: 75");
                System.out.println("Telekinesis Circular: Daño: 30 Mana: 50");
            case DEFAULT:
                System.out.println("DEFAULT");
        }

    }
    public void ataques(Jugador oponente){
        Scanner s = new Scanner(System.in);
        Operaciones.Menues.acciones();
        int accion = s.nextInt();
        switch (accion){
            case 1:
                this.ataqueBasico(oponente);
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    @Override
    public String toString(){
        return this.getNombre() + "\n" +
                "HP: " + this.getHp() + "\n" +
                "Mana: " + this.getMana() + "\n";
    }
}
