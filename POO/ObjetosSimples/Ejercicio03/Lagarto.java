public class Lagarto extends Animal {

  public Lagarto() {}

  public Lagarto(Sexo s, String n) {
    super(s, n);
  }

  public void tomaElSol() {
    System.out.println("Estoy tomando el Sol");
  }

  public void baniate() {
    System.out.println("Me estoy dando bañando");
  }

  public void escondete() {
    System.out.println("Estoy escondido, ya no me podes ver");
  }
}
