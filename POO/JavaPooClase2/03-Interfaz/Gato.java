public class Gato extends Animal implements Mascota {
  
  private String codigo;
  
  public Gato (Sexo s, String c) {
    super(s);
    this.codigo = c;
  }

  @Override
  public String getCodigo() {
    return this.codigo;
  }

  /**
   * Hace que el gato emita sonidos.
   */
  @Override
  public void haceRuido() {
    this.maulla();
    this.ronronea();
  }

  /**
   * Hace que el gato maulle.
   */
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */ 
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechaza
   * 
   * @param comida la comida que se le ofrece al gato
   */
  @Override
  public void come(String comida) {
    if (comida.equals("pescado")) {
        System.out.println("Gracias por el pescado");
    } else {
        System.out.println("Ugh, no me gusta " + comida + " retirese esclavo");
    }
}

  /**
   * Pone a pelear al gato contra otro animal.
   * Solo se van a pelear dos machos entre sí.
   * 
   * @param contrincante es el animal contra el que pelear
   */
  @Override
  public void peleaCon(Animal contrincante) {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("no me gusta pelear");
    } else if (contrincante.getSexo() == Sexo.HEMBRA){
      System.out.println("No peleo contra hembras");
    } else {
      System.out.println("BANG! AWKKKK! KAPOW!");
    }
  }
}
