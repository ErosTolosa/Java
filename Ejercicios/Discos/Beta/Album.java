public abstract class Album {

  private Genero generos;

  public Album() {
    this.generos = Genero.ROCK;
  }

  public Album (Genero x) {
    this.generos = x;
  }

  public Genero getGenero() {
    return this.generos;
  }

  @Override
  public String toString() {
    return "Genero: " + this.generos + "\n";
  }
}
  

