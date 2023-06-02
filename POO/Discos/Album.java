public class Album extends coleccion {
    
    String artista, nombre, genero;
    int anio, cantidadCanciones;





    Album (String a , String n , int an ,int cc, String g){
        this.artista = a ;
        this.nombre= n;
        this.anio = an ;
        this.cantidadCanciones = cc;
        this.genero=g;

    }

    

    String getArtista(){
        return this.artista;
    }

    String getNombre(){
        return this.nombre;
    }

    int getAnio(){
        return this.anio;
    }

    int getcc(){
        return this.cantidadCanciones;
    }
    String getGenero(){
        return this.genero;
    }

  

    public String toString() {
        return "disco" + "\n" + 
        "Nombre del disco "  + this.nombre + "\n"+
        "Artista " + this.artista + "\n"+
        "Año "+ this.anio + "\n"+
        "Cantidad de canciones "+ this.cantidadCanciones + "\n";
    }
     
}


