

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
        return this.codigo;
    }

    public void setPuesto(int puesto){
        this.puesto=puesto;
    }
    public int getPuesto(){
        return this.puesto;
    }

    public void setAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }
    public int getAntiguedad(){
        return this.antiguedad;
    }

    public String toString(){
        String cadena="codigo: " + this.codigo + 
        "  puesto: " + this.puesto + 
        "  antiguedad: "+ this.antiguedad; 
        return cadena;
    }

    public void auc(){
        System.out.println("auc");
    }

    // funcion utilizada para pagar
     
    public void Pagar(){
        System.out.println("ingrese codigo del empleado");
        String cod=System.console().readLine();
        double salario=0;
        int salariobase=0;
        if(cod.equals(Personal.this.codigo)){
            if(this.puesto==1){
                salariobase=550;
            }else if(this.puesto==2){
                salariobase=380;
            }else if(this.puesto==3){
                salariobase=400;
            }else if(this.puesto==4){
                salariobase=300;
            }else{
                System.out.println("hubo un problema con su puesto ");
            }
            System.out.println("ingrese las horas trabajadas por dia (numeros enteros)");
            int horas=Integer.parseInt(System.console().readLine());
            System.out.println("ingrese cuantos son los dias trabajados por semana");
            int dias=Integer.parseInt(System.console().readLine());

            salario=(salariobase * horas)*(dias*4);
            salario+=(salario*0.10)*antiguedad;
            System.out.println("el salario del trabajador nº: "+ cod + " es: " + salario );


        }else{
            System.out.println("el codigo de esa persona no existe");
        }
    }
}

