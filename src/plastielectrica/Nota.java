
package plastielectrica;


public class Nota extends Persona {
    
    double subtotal, total;
    String fecha;
    String TipoCliente;
    String NumCliente;
    Nota()
    {
        super();
        fecha=" ";
        TipoCliente=" ";
        NumCliente=" ";
                
    }
    
    //metodos set
     public void setRFC(String fecha) {
        this.fecha= fecha;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    public void setNumCliente(String NumCliente) {
        this.NumCliente= NumCliente;
    }


    public String getfecha() {
        return fecha;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public String getNumCliente() {
        return NumCliente;
    }
    

 }      

  
