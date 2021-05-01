
package plastielectrica;

public class Cliente extends Persona {
    String RFC;
    String TipoCliente;
    String NumCliente;
    double subtotal, IVA, descuento, Total;
    Cliente()
    {
        super();
        RFC=" ";
        TipoCliente=" ";
        NumCliente=" ";
                
    }
    
    //metodos set
     public void setRFC(String RFC) {
        this.RFC= RFC;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    public void setNumCliente(String NumCliente) {
        this.NumCliente= NumCliente;
    }


    public String getRFC() {
        return RFC;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public String getNumCliente() {
        return NumCliente;
    }
    

    
    public void descuento()
    {
        /*este descuento es para compras de un volumen no muy grande de compra
        en donde solo se le aplica un 5%, se aplica IVA al 8%
        */
        IVA=subtotal*0.08;
        subtotal=subtotal+IVA;
        descuento=subtotal*0.05;
        Total=subtotal-descuento;
    }
  
 }      

