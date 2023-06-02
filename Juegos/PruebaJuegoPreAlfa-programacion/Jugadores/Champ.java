package Jugadores;
public abstract class Champ {
    private String nombre;
    private ClaseJugador clase;
    private int maxHp;
    private int maxMana;
    private int fuerza;
    private int inteligencia;
    private int destreza;

    public Champ(){

    }

    public Champ(String n, ClaseJugador c){
        this.nombre = n;
        this.clase = c;
    }
    
    // GETTERS
    public String getNombre(){
        return nombre;
    }
    public ClaseJugador getClase(){
        return clase;
    }
    public int getMaxHp(){
        return maxHp;
    }
    public int getMaxMana(){
        return maxMana;
    }
    public int getFuerza(){
        return this.fuerza;
    }

    public void setStats(int mh, int mm, int f, int i, int d){
        this.maxHp = mh;
        this.maxMana = mm;
        this.fuerza = f;
        this.inteligencia = i;
        this.destreza = d;
    }
    public void setArmas(int f, int i, int d){
        this.fuerza += f;
        this.inteligencia += i;
        this.destreza += d;
    }

    public String toString(){
        return  "Nombre: " + this.nombre + "\n" +
                "Clase: " + this.clase + "\n" +
                "Vida maxima: " + this.maxHp + "\n" +
                "Mana maximo: " + this.maxMana + "\n" +
                "Fuerza: " + this.fuerza + "\n" +
                "Inteligencia: " + this.inteligencia +"\n" +
                "Destreza: "+ this.destreza + "\n";
    }
}
