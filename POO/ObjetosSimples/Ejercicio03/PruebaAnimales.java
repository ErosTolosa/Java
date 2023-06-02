public class PruebaAnimales {

  public static void main(String[] args) {
    Gato gato1 = new Gato(Sexo.MACHO, "Persa", "Garfield");

    gato1.maulla();
    gato1.duerme();

    Perro perro1 = new Perro(Sexo.HEMBRA, "laika");
    perro1.ladra();
    perro1.dameLaPata();
    perro1.duerme();

    Gato gato2 = new Gato();


    /*Pinguino tux = new Pinguino(Sexo.MACHO, "tux");
    tux.come("pochoclo");
    tux.programa();
    
    Perro laika = new Perro(Sexo.HEMBRA, "firulais");
    laika.duerme();
    laika.dameLaPata();
    laika.amamanta();
    laika.cuidaCrias();
    
    Lagarto godzilla = new Lagarto(Sexo.MACHO, "juancho");
    godzilla.tomaElSol();
    godzilla.duerme();

    System.out.println(godzilla.nombre);
    System.out.println(laika.nombre);*/
  }
}
