public class Alumno extends Persona{
    private int nota[] = new int[4];
    private String legajoAlumno;    

    public Alumno(){
        super();
        this.legajoAlumno = "libre";
    }
    public Alumno(String a, int d){
        super(a, d);
        this.legajoAlumno = String.valueOf(Math.random() * 5);
    }

    public String getLegajoAlumno(){
        return this.legajoAlumno;
    }

    public void setNota(){
        for (int i = 0; i < 4; i++ ){
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            this.nota[i] = Integer.parseInt(System.console().readLine());
        }
    }

    void evalua(String a, int d, int n, int e){
        this.nota[e] = n;
    }

}