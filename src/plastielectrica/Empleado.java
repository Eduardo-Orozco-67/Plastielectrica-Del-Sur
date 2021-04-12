
package plastielectrica;

import java.util.Scanner;

public class Empleado extends Persona{
    
     int ID;
     String RFC;
     String aguinaldo;
     
    Empleado()
    {
        super();
        RFC="NULL";
        aguinaldo="NULL";
        ID=0;      
    }
    
    public void set_RFC(String nombre) {
        this.nombre = nombre;
    }

    public void set_aguinaldo(String direccion) {
        this.direccion = direccion;
    }

    public void setid(int ID) {
        this.ID= ID;
    }



    public String get_RFC() {
        return direccion;
    }

    public String get_aguinaldo() {
        return telefono;
    }

    public int get_id() {
        return edad;
    }

}
