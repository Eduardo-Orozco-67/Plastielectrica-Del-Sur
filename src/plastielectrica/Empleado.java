
package plastielectrica;

import java.util.Scanner; //metodo scanner para la lectura de dtaos ingresados desde teclado 

public class Empleado extends Persona{
    
    //atributos de la clase 
     int ID;
     String RFC;
     String aguinaldo;
     
    //constructor de la clase 
    Empleado()
    {
        super();
        RFC="NULL";
        aguinaldo="NULL";
        ID=0;      
    }
    
    //metodos set de los atributos de la clase 
    public void set_RFC(String RFC) {
        this.RFC = RFC;
    }

    public void set_aguinaldo(String aguinaldo) {
        this.aguinaldo = aguinaldo;
    }

    public void setid(int ID) {
        this.ID= ID;
    }

    //metodos get de los atributos de la clase 
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
