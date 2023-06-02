public class Perro extends Mamifero {

  public Perro (Sexo s, String n) {
    super(s, n);
  }

  public Perro () {
    super(Sexo.HEMBRA, "fido");
  }

  public void ladra() {
    System.out.println("Guau guau");
  }

  public void dameLaPata() {
    System.out.println("Toma mi patita");
  }

  public void caza() {
    System.out.println("Estoy cazando ardillas");
  }
}
