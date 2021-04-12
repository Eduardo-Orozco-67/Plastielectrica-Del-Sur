package plastielectrica;

public class Herramientas {
    //atributos de la clase 
    String Articulo;
    String Marca;
    String garantia;
    int Precio;
    int cantidad;
    int Num_Piezas;  
    
    //metodos set de los atributos de la clase
    public void set_Articulo(String Articulo)
    {
       this.Articulo=Articulo;
    }
    
     public void set_garantia(String garantia)
    {
        this.garantia=garantia;
    }
     
    public void set_precio(int Precio)
    {
        this.Precio=Precio;
    }
    
        public void set_Marca(String Marca)
    {
        this.Marca=Marca;
    }
        
    public void set_cantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }
    
    //metodos get de los atributos de la clase
    public String getArticulo() {
        return Articulo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getGarantia() {
        return garantia;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getNum_Piezas() {
        return Num_Piezas;
    }
    
    
}