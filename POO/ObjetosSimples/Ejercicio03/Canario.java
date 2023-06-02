public class Canario extends Ave {

  public Canario() {}
  
  public Canario(Sexo s, String n) {
    super(s, n);
  }

  public void canta() {
    System.out.println("Tralaralariiiiiiii");
  }

  public void caza() {
    System.out.println("Los canarios no cazan");
  }

  public void pia() {
    System.out.println("Pio pio pio");
  }
}
