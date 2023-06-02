public class Gato {
    private String nombre;
    private String color;
    private String raza;

    public Gato(String n, String c, String r){
        this.nombre = n;
        this.color = c;
        this.raza = r;
    }

    public String toString(){
        return this.nombre + "\n" + this.color + "\n" + this.raza + "\n";
    }
}
