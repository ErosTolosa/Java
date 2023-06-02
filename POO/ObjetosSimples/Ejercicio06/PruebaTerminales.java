public class PruebaTerminales {

  public static void main(String[] args) {
    Terminal t1 = new Terminal("011 5925 6845");
    Terminal t2 = new Terminal("2966 215 687");
    Terminal t3 = new Terminal("011 3289 4209");
    Terminal t4 = new Terminal("354 7398 4118");
    System.out.println(t1);
    System.out.println(t2);
    t1.llama(t2, 320);
    t1.llama(t3, 200);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);    
  }

}
