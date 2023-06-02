

public class Personal {
    private String codigo="";
    private int puesto;
    private int antiguedad;
    
    public Personal(String codigo,int puesto,int antiguedad){
        this.codigo=codigo;
        this.puesto=puesto;
        this.antiguedad=antiguedad;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getCodigo(){
        return codigo;
    }

    public void setPuesto(int puesto){
        this.puesto=puesto;
    }
    public int getPuesto(){
        return puesto;
    }

    public void setAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }
    public int getAntiguedad(){
        return antiguedad;
    }

    public String toString(){
        String cadena="codigo: " + this.codigo + 
        "  puesto: " + this.puesto + 
        "  antiguedad: "+ this.antiguedad; 
        return cadena;
    }

}

