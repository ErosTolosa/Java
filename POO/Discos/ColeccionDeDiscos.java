public class ColeccionDeDiscos  extends coleccion{
    public static void main(String[] args) {
    String nombre,artista, genero;        
    int anio , cantidadCanciones;

    Album disco1 = new Album("Cerati", "Bocanada", 1999, 8, "Rock");
    Album disco2 = new Album("RedHot", "Californication", 1999, 14,"Jazz");
    Album disco3 = new Album("Charly", "Clix Modernos", 1983, 9, "Rap");

    System.out.println(disco1);
    System.out.println(disco2);
    System.out.println(disco3);




    /* 
        System.out.println("Cual es el nombre del disco?");
        artista=System.console().readLine();

        System.out.println("Cual es el nombre del artista?");
        nombre=System.console().readLine();

        System.out.println("Cual es el año de lanzamiento del disco?");
        anio= Integer.parseInt(System.console().readLine());

        System.out.println("Cuantas canciones tiene el disco?");
        cantidadCanciones= Integer.parseInt(System.console().readLine());

        System.out.println("Cual es la duracion del disco?");
        duracion= Double.parseDouble(System.console().readLine());

        System.out.println("Cual es el precio del disco?");
        precio= Double.parseDouble(System.console().readLine());

        Album disco1 = new Album(nombre, artista, anio, cantidadCanciones, duracion, precio);

       System.out.println(disco1);
    */
    }
    
}
