public class Docente extends Persona {
    private String legajoDocente;
    private int arancel = 0;
    private int horasTrabajas = 0;

    public Docente(String a, int d){
        super(a, d);
        this.legajoDocente = String.valueOf(Math.random() * 4);
    } 

    public String getLegajoDocente(){
        return this.legajoDocente;
    }
    
    public void setArancel(int a){
        this.arancel = a; 
    }

    public void setHorasTrabajadas(int h){
        this.horasTrabajas = h;
    }

    public int cobra(){
        return this.arancel * this.horasTrabajas;
    }
}
