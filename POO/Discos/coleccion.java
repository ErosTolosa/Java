public abstract class coleccion {
    private Generos genero;
    public coleccion(){
        this.genero = Generos.ROCK;
        
    }
    public coleccion (Generos x){
        this.genero = x;
    }

    @Override
    public String toString() {
      return "Genero: " + this.genero + "\n";
    }
}