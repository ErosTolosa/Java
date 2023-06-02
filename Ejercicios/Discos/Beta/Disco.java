public class Disco extends Album {
  
  private String tipos;

  public Disco (Genero s, String r) {
    super(s);
    this.tipos = r;
  }
  
  public Disco (Genero s) {
    super(s);
    tipos = "Indefinido";
  }

  public Disco (String r) {
    super(Genero.ROCK);
    this.tipos = r;
  }
  
  public Disco () {
    super(Genero.ROCK);
    this.tipos = "Indefinido";
  }
  
  @Override
  public String toString() {
    return super.toString()
            + "Disco: " + this.tipos
            + "\n*************************\n";
  }
  
}
