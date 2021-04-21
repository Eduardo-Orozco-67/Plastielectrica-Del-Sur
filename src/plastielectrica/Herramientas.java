//clase herramientas, para los articulos que se venden el la ferreteria electrica
package plastielectrica;

public class Herramientas {
    //creación de atributos      id= identificador
    String articulo,tipo,id,marca,unidades;//tipo para dar el tipo de cada producto, ejemplo cable tipocalibre 14
    int cantidad,garantia;//garantia en dias,unidad en tipo ,por ejemplo kilos,metros,piezas etc.
    float precio;

    public Herramientas(String articulo, String tipo, String id, String marca, String unidades, int cantidad, int garantia, float precio) {
        this.articulo = articulo;
        this.tipo = tipo;
        this.id = id;
        this.marca = marca;
        this.unidades = unidades;
        this.cantidad = cantidad;
        this.garantia = garantia;
        this.precio = precio;
    }
    Herramientas(){
        articulo = null; tipo = null; id = null;marca=null;unidades = null;
        cantidad =0;garantia = 0;
        precio=0;
    }
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getUnidades() {
        return unidades;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getGarantia() {
        return garantia;
    }

    public float getPrecio() {
        return precio;
    }
    
    
}
