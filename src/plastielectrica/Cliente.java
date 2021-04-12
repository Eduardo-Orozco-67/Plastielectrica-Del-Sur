
package plastielectrica;

public class Cliente extends Persona {
    
    //atributos de la clase Cliente
    String RFC;
    String TipoCliente;
    int NumCliente;
    
    //constructor de la clase 
    Cliente()
    {
        //se usa el super para poder inicializar los atributos heredados de la clase Persona
        super();
        RFC="NULL";
        TipoCliente="NULL";
        NumCliente=0;    
        
    }
    
    //metodos set de lops atributos de la clase 
     public void set_RFC(String RFC) {
        this.RFC= RFC;
    }

    public void set_TipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    public void set_NumCliente(int NumCliente) {
        this.NumCliente= NumCliente;
    }

    //metodos get de los atributos de la clase 
    public String get_RFC() {
        return RFC;
    }

    public String get_TipoCliente() {
        return TipoCliente;
    }

    public int get_NumCliente() {
        return NumCliente;
    }
}
