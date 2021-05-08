
package plastielectrica;

public class Empleado extends Persona{
         //atributos de la clase 
     String RFC, ID, tipoEmpleado;
     
    //metodo empleado 
    Empleado()
    {
        super();
            RFC = "NULL";
            ID = "NULL";  
            tipoEmpleado = "NULL";
        }
    
    //GETTERS

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
    
    
    public String get_RFC() {
        return RFC;
    }

    public String get_id() {
        return ID;
    }    
  
    //SETTERS
    
    public void set_RFC(String RFC) {
        this.RFC = RFC;
    }

    public void set_id(String ID) {
        this.ID= ID;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
}//class