
package plastielectrica;

public class Empleado extends Persona{
       //atributos de la clase 
     String RFC, ID, tipoEmpleado;
     int faltas, retardos, HT, SS, anti, HE, Cuotas;
     float sueldo, aguinaldo;
     
    //metodo empleado 
    Empleado()
    {
        super();
            RFC = "NULL";
            aguinaldo = 0;
            ID = "NULL";  
            faltas  = 0;
            retardos = 0 ; 
            HT = 0 ; 
            SS = 0 ; 
            anti = 0 ;
            HE = 0 ; 
            Cuotas = 0 ; 
            tipoEmpleado = "NULL";
        }
    
    //GETTERS

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
    
    
    public String get_RFC() {
        return RFC;
    }

    public float get_aguinaldo() {
        return aguinaldo;
    }

    public String get_id() {
        return ID;
    }    

    public int getFaltas() {
        return faltas;
    }

    public int getRetardos() {
        return retardos;
    }

    public int getSS() {
        return SS;
    }

    public int getAnti() {
        return anti;
    }

    public int getHE() {
        return HE;
    }

    public int getCuotas() {
        return Cuotas;
    }

    public float getSueldo() {
        return sueldo;
    }
    
    //SETTERS
    public void setCuotas(int Cuotas) {
        this.Cuotas = Cuotas;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public void setHE(int HE) {
        this.HE = HE;
    }
    
    public void setAnti(int anti) {
        this.anti = anti;
    }
    
    public void setSS(int SS) {
        this.SS = SS;
    }
    
    public int getHT() {
        return HT;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public void set_RFC(String RFC) {
        this.RFC = RFC;
    }

    public void set_aguinaldo(float aguinaldo) {
        this.aguinaldo = aguinaldo;
    }

    public void set_id(String ID) {
        this.ID= ID;
    }
    
    public void setRetardos(int retardos) {
        this.retardos = retardos;
    }

    public void setHT(int HT) {
        this.HT = HT;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    
     @Override
    public void llenado()
    {
        super.llenado();
        System.out.print("Dame el ID ");
        set_id(x.next());
        System.out.print("Dame el RFC ");
    }

    //metodos para calcular los respectivos pagos de los empleados
    public void calpagoQ(){
        
    }
    
    public void calpagoM(){
        
    }

}//class