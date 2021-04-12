
package plastielectrica;

public class Cliente extends Persona {
    String RFC;
    String TipoCliente;
    int NumCliente;
    Cliente()
    {
        super();
        RFC="NULL";
        TipoCliente="NULL";
        NumCliente=0;
                
    }
    
     public void set_RFC(String RFC) {
        this.RFC= RFC;
    }

    public void set_TipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    public void set_NumCliente(int NumCliente) {
        this.NumCliente= NumCliente;
    }


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
