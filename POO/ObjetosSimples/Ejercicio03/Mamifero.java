public abstract class Mamifero extends Animal {

  public Mamifero () {
    super();
  }

  public Mamifero (Sexo s, String n) {
    super(s, n);
  }

  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Soy macho, no puedo amamantar :(");
    } else {
      System.out.println("Alimentate criatura");
    }
  }
  
  public void cuidaCrias() {
    System.out.println("Estoy cuidando mis crias");
  }
  
  public void anda() {
    System.out.println("Estoy andando");
  }
}
