public class GatoSimple {
    // ATRIBUTOS ///////////////////////////////

    String color, raza, sexo;
    int edad;
    double peso;

    // METODOS /////////////////////////////////

    // CONSTRUCTOR

    GatoSimple (String s) {
        this.sexo = s;
    }

    // GETTER //////////////////////////////////

    String getSexo() {
        return this.sexo;
    }

    /**
     * Hace maullar al gato
     */
    void maulla() {
        System.out.println("Miauuuu");
    }

    /**
     * Hace ronronear al gato
     */
    void ronronea() {
        System.out.println("Mrrrrrr");
    }

    /**
     * Hace que el gato coma
     * Solo comen pescado, si le damos otra comida la rechaza
     * 
     * @param comida la comida que se le ofrece al gato
     */
    void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Gracias por el pescado");
        } else {
            System.out.println("Ugh, no me gusta " + comida + " retirese esclavo");
        }
    }

    /**
     * Pone a pelear dos gatos
     * Solo se pelean los machos entre si
     * 
     * @param contrincante es el gato contra el que va a pelear
     */
    void peleaCon(GatoSimple contrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("No me gusta pelear");
        } else if (contrincante.getSexo().equals("hembra")){
            System.out.println("No peleo contra gatas");
        } else {
            System.out.println("BANG! AWKKKK! KAPOW!");
        }
    }
}
