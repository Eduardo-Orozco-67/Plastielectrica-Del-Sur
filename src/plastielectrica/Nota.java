
package plastielectrica;


public class Nota extends Herramientas {
    
    double subtotal, total, suma;
    String numnota;
    String fecha;
    String NumCliente;
    String TipoCliente;
    String ID;
    String idemp;
    String NomCliente;
    String Nomemp;
    double cantidade;
   
    Nota()
    {      
        super();   
    }
    
    //metodos set
     public void setfecha(String fecha) 
    {
        this.fecha= fecha;
    }

    public String getfecha() 
    {
        return fecha;
    }
    
    public void setnumnota(String numnota) 
    {
        this.numnota= numnota;
    }

    public String getnumnota() 
    {
        return numnota;
    }

    
   public void setNumCliente(String NumCliente)
    {
        this.NumCliente= NumCliente;
    }
    
   public String getNumCliente()
    {
        return NumCliente;
    }
   
   
    public void setNomCliente(String NomCliente)
    {
        this.NomCliente= NomCliente;
    }
    
   public String getNomCliente()
    {
        return NomCliente;
    }
   
   
   public void setTipoCliente(String TipoCliente) 
    {
        this.TipoCliente = TipoCliente;
    }
   
   public String getTipoCliente() 
    {
        return TipoCliente;
    }
   
   
   public void set_id(String ID) 
    {
        this.ID= ID;
    }
   
   public String get_id() 
    {
        return ID;
    }   
   
   
    public void setidempl(String idemp) 
    {
        this.idemp= idemp;
    }

    public String getidempl() 
    {
        return idemp;
    }
    
   public void setNomemp(String Nomemp)
    {
        this.Nomemp= Nomemp;
    }
    
   public String getNomemp()
    {
        return Nomemp;
    }
   
   
   public void setcantidadc(double cantidade)
    {
        this.cantidade= cantidade;
    }
    
   public double getcantidadc()
    {
        return cantidade;
    }
   
   
    public void setsubtotal(double  subtotal)
    {
        this.subtotal= subtotal;
    }
    
   public double getsubtotal()
    {
        return subtotal;
    }
  
    public void setsumasubtotal(double  suma)
    {
        this.suma= suma;
    }
    
   public double getsumasubtotal()
    {
        return suma;
    }
   
    public void settotal(double total)
    {
        this.total= total;
    }
    
   public double gettotal()
    {
        return total;
    }
   
   
   
   
    @Override
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    

    @Override
    public String getArticulo() {
        return articulo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getUnidades() {
        return unidades;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int getGarantia() {
        return garantia;
    }

    @Override
    public float getPrecio() {
        return precio;
    }


 }      

  
