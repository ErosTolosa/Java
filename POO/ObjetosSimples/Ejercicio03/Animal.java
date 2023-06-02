public abstract class Animal {

  private Sexo sexo;
  String nombre;

  public Animal () {
    this.sexo = Sexo.MACHO;
  }

  public Animal (Sexo s, String n) {
    this.sexo = s;
    this.nombre = n;
  }

  public Sexo getSexo() {
    return this.sexo;
  }

  public void duerme() {
    System.out.println("Zzzzzzz");
  }
  
  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }
}
