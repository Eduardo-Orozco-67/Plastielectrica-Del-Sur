
package plastielectrica;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      String respuesta;
      int op,i, res, r1, r2,r3,r4,r5;
        Scanner x = new Scanner(System.in);
          //creamos uestra arraylista para los articulos
          ArrayList<Herramientas> OBH = new ArrayList<>();
       
        //INFORMACION DE BIENVENIDA 
        System.out.println("*************************************");
        System.out.println("*****\tPlastielectrica Del Sur\t*****");
        System.out.println("*************************************");
        System.out.println("Venta en todo tipo de materiales electricos!!\n");
        System.out.print("\tPregunte\n\t  Por\n\t   Lo\n\t   Que\n\tNecesite!!\n\n");
        System.out.println("Email de la empresa: plastielec01@gmail.com\n");
        System.out.println("Numero telefonico de la empresa: 9624587596\n");
        System.out.println("Horario de servicio: 8:00 AM - 4:00 PM, de Lunes a Sabado!");

        //menu principal 
          System.out.println("\n-----MENU-----");
          System.out.println("\n-----Elige una opcion-----");
          System.out.println(" 1.- Clientes");
          System.out.println(" 2.- Empleados");
          System.out.println(" 3.- Articulos");
          System.out.println(" 4.- Notas");
          System.out.println(" 5.- Estadisticas");
          System.out.println(" 6.- Salir");
          System.out.println();
          res = x.nextInt();
          System.out.println();

          //switch menu pricipal
             switch (res) 
             { 
                case 1:
                     //submenu de cliente
                     System.out.println("\n-----Que deseas hacer?-----");
                     System.out.println(" 1.- Anadir Cliente");
                     System.out.println(" 2.- Editar Cliente");
                     System.out.println(" 3.- Eliminar Cliente");
                     r1=x.nextInt();
                        switch(r1)
                        {
                            
                        }
                break;
                 
                case 2:
                    //submenu de Empleado 
                     System.out.println("\n-----Que deseas hacer?-----");
                     System.out.println(" 1.- Anadir Empleado");
                     System.out.println(" 2.- Editar Empleado");
                     System.out.println(" 3.- Eliminar Empleado");
                     r2=x.nextInt();
                        switch(r2)
                        {
                            
                        }
                break;     
                
                case 3:
                    //submenu de Empleado 
                     System.out.println("\n-----Que deseas hacer?-----");
                     System.out.println(" 1.- Anadir Articulo");
                     System.out.println(" 2.- Editar Articulo");
                     System.out.println(" 3.- Eliminar Articulo");
                     r3=x.nextInt();
                        switch(r3)
                        {
                            
                        }
                break;
                
                case 4:
                    //submenu de Empleado 
                     System.out.println("\n-----Que deseas hacer?-----");
                     System.out.println(" 1.- Anadir Empleado");
                     System.out.println(" 2.- Editar Empleado");
                     System.out.println(" 3.- Eliminar Empleado");
                     r4=x.nextInt();
                        switch(r4)
                        {
                            
                        }
                break;      
             }
        
        do{
            System.out.println("\tMenú\t");
            System.out.println("seleccione una opción");
            System.out.println("1.agregar herramientas");
            System.out.println("2.visualizar herramientas");
            op = x.nextInt();
            switch (op){
                case 1:
                     do {//ciclo para ingresar arituculosde forma dinámica.
                Herramientas articulos = new Herramientas();
                System.out.println("Ingrese el nombre de este artículo.");
                articulos.setArticulo(x.next()); 
                System.out.println("Ingrese el  tipo de este articulo (ejemplo: cable tipo cobre).");
                articulos.setTipo(x.next()); 
                System.out.println("Ingrese el codigo de identificación de este articulo.");
                articulos.setId(x.next()); 
                System.out.println("Ingrese la marca de este artículo.");
                articulos.setMarca(x.next()); 
                System.out.println("Ingrese el tipo de unidad de este artículo.(ejemplo: kilos, metros piezas,etc)");
                articulos.setUnidades(x.next()); 
                System.out.println("Ingrese la cantidad de este  artículo.");
                articulos.setCantidad(x.nextInt()); 
                System.out.println("Ingrese la garantia (en días) de este artículo.");
                articulos.setGarantia(x.nextInt()); 
                System.out.println("Ingrese el precio de este artículo.");
                articulos.setPrecio(x.nextFloat()); 
                OBH.add(articulos);
                
       System.out.println("¿desea ingresar otra herramienta?(si/no)");
    respuesta=x.next();
        }while (respuesta.equals("si"));//condición para agregar o no otro articulo
                    break;
                case 2://impresión de herramientas
                    for ( i=0; i<OBH.size();i++){
                        System.out.println("________________________________________");
                        System.out.println("Articulo "+OBH.get(i).articulo);
                        System.out.println("tipo: "+OBH.get(i).tipo);
                        System.out.println("codigo de identificación: "+OBH.get(i).id);
                        System.out.println("marca: "+OBH.get(i).marca);
                        System.out.println("unidad: "+OBH.get(i).unidades);
                        System.out.println("cantidad: "+OBH.get(i).cantidad + " "+OBH.get(i).unidades);
                        System.out.println("garantia: "+OBH.get(i).garantia+" días");
                        System.out.println("precio: $"+OBH.get(i).precio);
                        
                        
                    }
                    break;
            }
        }while(op!=2);
        
}
}
       

