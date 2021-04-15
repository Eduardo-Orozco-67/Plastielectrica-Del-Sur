

package plastielectrica;

import java.util.Scanner;

public class Herramientas {
Scanner x = new Scanner(System.in);
    String Articulo;
    String Marca;
    String garantia;
    float Precio;
    String cantidad;
    int Num_Piezas;  
    
    public void set_Articulo(String Articulo)
    {
       this.Articulo=Articulo;
    }
    
     public void set_garantia(String garantia)
    {
        this.garantia=garantia;
    }
     
    public void set_precio(float Precio)
    {
        this.Precio=Precio;
    }
    
        public void set_Marca(String Marca)
    {
        this.Marca=Marca;
    }
        
    public void set_cantidad(String cantidad)
    {
        this.cantidad=cantidad;
    }
        
    public void set_Num_Piezas(int Num_Piezas)
    {
        this.Num_Piezas=Num_Piezas;
    }
    
    
    //METODOS GET DE LA CLASE
    public String getArticulo() {
        return Articulo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getGarantia() {
        return garantia;
    }

    public float getPrecio() {
        return Precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public int getNum_Piezas() {
        return Num_Piezas;
    }
void MostrarDatosHerramientas(){//funcion para pedir datos
    System.out.println("Articulo : " + getArticulo());
    System.out.println("Marca: "+ getMarca());
    System.out.println("garantia: "+ getGarantia());
    System.out.println("precio: "+ getPrecio());
    System.out.println("Cantidad (por ejemplo:kilos,piezas,etc): "+ getCantidad());
    System.out.println("Número de piezas o cantidad: "+ getNum_Piezas());
}
    public void PedirDatosHerramientas(/*String Articulo,String Marca,String 
     garantia,float Precio, String cantidad, int Num_Piezas/*/){
        System.out.println("______________________________________________");
        System.out.println("dame el nombre del Articulo.");
        Articulo =x.next();
        System.out.println("dame la marca del Articulo.");
        Marca =x.next();
        System.out.println("dame la garantia del Articulo.");
        garantia =x.next();
        System.out.println("dame el precio del Articulo.");
        Precio =x.nextFloat();
        System.out.println("dame la cantidad de este articulo.");//por ejemplo: kilo,piezas
        cantidad =x.next();
        System.out.println("dame el numero de piezas o cantidad del Articulo.");
        Num_Piezas =x.nextInt(); 
        System.out.println("______________________________________________");
        
}
}