public class PruebaMoviles {

  public static void main(String[] args) {
    Movil m1 = new Movil("011 5925 6845", "rata");
    Movil m2 = new Movil("2966 215 687", "mono");
    Movil m3 = new Movil("011 3289 4209", "bisonte");
    System.out.println(m1);
    System.out.println(m2);
    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }

}
