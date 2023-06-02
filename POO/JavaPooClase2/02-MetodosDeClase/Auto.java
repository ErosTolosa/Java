public class Auto {

  // atributo de clase
  private static int kilometrajeTotal = 0;
  
  // método de clase
  public static int getKilometrajeTotal() {
    return Auto.kilometrajeTotal;
  }
  
  private String marca;
  private String modelo;
  private int kilometraje;

  public Auto(String ma, String mo) {
    this.marca = ma;
    this.modelo = mo;
    this.kilometraje = 0;
  }
  
  public int getKilometraje() {
    return this.kilometraje;
  }

  /**
   * Recorre una determinada distancia.
   * 
   * @param km distancia a recorrer en kilómetros
   */  
  public void recorre(int km) {
    this.kilometraje += km;
    Auto.kilometrajeTotal += km;
  }
}
