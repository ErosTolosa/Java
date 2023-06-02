public class PogramaCurso {
    // Declaro como estaticos la constante y el array para poder
    // ser utilizadas con las funciones sin pasarlos como
    // parametro

    static final int MAXALU = 100;
    static final int MAXDOC = 20;
    static Alumno[] arrayAlumno = new Alumno[MAXALU];
    static Docente[] arrayDocente = new Docente[MAXDOC];
    public static void main(String[] args){
        int op;
        boolean salida = false;
        boolean salidaDoc = false;
        for (int i = 0; i < MAXALU; i++){
            arrayAlumno[i] = new Alumno();
        }
        do{
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Evaluar Alumno");
            System.out.println("3. Ingresar Docente");
            System.out.println("4. Arancel y horas del docente");
            System.out.println("5. Salida");

            op = Integer.parseInt(System.console().readLine());
            switch (op){
                case 1:
                    ingresoDeDatos(op);
                    break;
                
                case 2:
                    System.out.println("Ingrese legajo del alumno a evaluar");
                    String legajoAlumno = System.console().readLine();
                    arrayAlumno[posicionLegajo(legajoAlumno, op)].setNota();
                    break;
                
                case 3:
                    ingresoDeDatos(op);
                    break;
                
                case 4:
                    int opDoc;
                    System.out.println("Ingrese legajo de docente");
                    String legajoDocente = System.console().readLine();
                    do{
                        System.out.println("1. Ingresar arancel");
                        System.out.println("2. Ingresar carga horaria");
                        System.out.println("3. Pagar");
                        System.out.println("4. volver");
                        opDoc = Integer.parseInt(System.console().readLine());
                        switch (opDoc){
                            case 1:
                                System.out.println("Ingrese arancel del docente");
                                int arancel = Integer.parseInt(System.console().readLine());
                                arrayDocente[posicionLegajo(legajoDocente, op)].setArancel(arancel);
                                break;
                            case 2:
                                System.out.println("Ingrese carga horaria");
                                int cargaHoraria = Integer.parseInt(System.console().readLine());
                                arrayDocente[posicionLegajo(legajoDocente, op)].setHorasTrabajadas(cargaHoraria);
                                break;
                            case 3:
                                System.out.println("El docente " + legajoDocente + "debe abonar:");
                                System.out.println("$" + arrayDocente[posicionLegajo(legajoDocente, op)]);
                                break;
                            case 4:
                                salidaDoc = true;
                                break;
                        }
                    }while (!salidaDoc);
                    break;

                case 5:
                    salida = true;
                    break;
            }
            
        }while(!salida);
    }

    /////////////
    //FUNCIONES//
    /////////////

    /**
     * Ingresa los datos del alumno o docente en base a la opcion ingresada
     * @param op opcion ingresada
     */
    public static void ingresoDeDatos(int op){
        String apyn;
        int dni;
        System.out.println("Ingrese nombre y apellido");
        apyn = System.console().readLine();
        System.out.println("Ingrese DNI");
        dni = Integer.parseInt(System.console().readLine());
        if (op == 1){
            arrayAlumno[primeraPosicionLibre(op)] = new Alumno(apyn, dni);
        } else {
            arrayDocente[primeraPosicionLibre(op)] = new Docente(apyn, dni);
        }
    }

    /**
     * Busca la primera posicion libre, dependiendo de la opcion ingresada se buscara
     * en el array de alumnos o docentes
     * @param op opcion ingresada
     * @return
     */
    public static int primeraPosicionLibre(int op){
        if (op == 1){
            for (int i = 0; i < MAXALU; i ++){
                if (arrayAlumno[i].getLegajoAlumno().equals("libre")){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < MAXDOC; i ++){
                if (arrayDocente[i].getLegajoDocente().equals("libre")){
                    return i;
                }
            }
        }
        System.out.println("El array se encuentra lleno");
        return -1;
    }

    /**
     * Devuelve la posicion del array donde se encontro el legajo
     * @param l legajo ingresado
     * @return
     */
    public static int posicionLegajo(String l, int op){
        if (op == 2){
            for (int i = 0; i < MAXALU; i ++){
                if (arrayAlumno[i].getLegajoAlumno().equals(l)){
                    return i;
                }
            }
            return -1;
        } else {
            for (int i = 0; i < MAXDOC; i ++){
                if (arrayDocente[i].getLegajoDocente().equals(l)){
                    return i;
                }
            }
            return -1;
        }

    }
}
