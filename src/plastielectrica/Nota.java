
package plastielectrica;


public class Nota extends Herramientas {
    
    double subtotal, total;
    String fecha;
   
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

  
