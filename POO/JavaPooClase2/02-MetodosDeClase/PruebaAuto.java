public class PruebaAuto {
  public static void main(String[] args) {
    
    Auto auto1 = new Auto("Peugeot", "504");
    Auto auto2 = new Auto("Toyota", "Corolla");

    auto1.recorre(30);
    auto1.recorre(40);
    auto1.recorre(220);
    auto2.recorre(60);
    auto2.recorre(150);
    auto2.recorre(90);
    System.out.println("El auto 1 recorrio " + auto1.getKilometraje() + "Km");
    System.out.println("El auto 2 recorrio " + auto2.getKilometraje() + "Km");
    System.out.println("El kilometraje total fue " + Auto.getKilometrajeTotal() + "Km");
  }
}
