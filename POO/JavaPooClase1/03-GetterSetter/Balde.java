public class Balde {
    // ATRIBUTOS ///////////////////////////////

    int capacidad; // Capacidad maxima en litros
    int contenido; // contenido actual en litros

    // METODOS /////////////////////////////////

    // CONSTRUCTOR
    Balde (int c) {
        this.capacidad = c;
    }

    // GETTER
    int getCapacidad() {
        return this.capacidad;
    }

    int getContenido() {
        return this.contenido;
    }

    // SETTER
    void setContenido(int litros) {
        this.contenido = litros;
    }

    // OTROS METODOS
    void vacia() {
        this.contenido = 0;
    }

    /**
     * Llena el balde al maximo
     */
    void llena() {
        this.contenido = this.capacidad;
    }

    /**
     * Pinta el balde en pantalla.
     * Se muestran los bordes con el caracter # y el contenido con el caracter ~
     */
    void pinta() {
        for (int nivel = this.capacidad; nivel > 0; nivel --) {
            if (this.contenido >= nivel){
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }

    /**
     * Vuelca el contenido de un balde sobre otro
     * Antes de volcar el agua se comprueba cuanto puede contener
     * el balde destino
     */
    void vuelcaEn(Balde destino){
        int libres = destino.getCapacidad() - destino.getContenido();

        if (libres > 0) {
            if (this.contenido <= libres) {
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido -= libres;
                destino.llena();
            }
        }
    }
}
