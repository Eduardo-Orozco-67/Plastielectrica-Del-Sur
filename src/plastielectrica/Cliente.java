
package plastielectrica;

public class Cliente extends Persona {
    String RFC;
    String TipoCliente;
    int NumCliente;
    double subtotal, IVA, descuento, Total;
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
    
    @Override
    public void llenado()
    {
        super.llenado();
        System.out.print("Dame el ID ");
        set_NumCliente(x.nextInt());
        System.out.print("Dame el RFC ");
        set_RFC(x.next());
        System.out.println("Dame el tipo de Cliente: Descuento, Credito o mostrador ");
        set_TipoCliente(x.next());
    }
    
    public void descuento1()
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

