
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
    
    public void set_RFC(String RFC) {
        this.RFC = RFC;
    }

    public void set_aguinaldo(String aguinaldo) {
        this.aguinaldo = aguinaldo;
    }

    public void setid(int ID) {
        this.ID= ID;
    }


    public String get_RFC() {
        return RFC;
    }

    public String get_aguinaldo() {
        return aguinaldo;
    }

    public int get_id() {
        return ID;
    }

}
