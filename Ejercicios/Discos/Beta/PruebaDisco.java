public class PruebaDisco {
  public static void main(String[] args) {

    Disco disco1 = new Disco(Genero.ROCK, "Unlited love");
    Disco disco2 = new Disco(Genero.ROCK, "Bocanada");
    Disco disco3 = new Disco(Genero.JAZZ, "New York New York");
    Disco disco4 = new Disco();
    
    System.out.println(disco1);
    System.out.println(disco2);
    System.out.println(disco3);
    System.out.println(disco4);

  }
}
