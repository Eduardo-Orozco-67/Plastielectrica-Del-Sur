package plastielectrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String respuesta;
        int op, i;
        String nid = null;
        Scanner x = new Scanner(System.in);
        //creamos uestra arraylista para los articulos
        ArrayList<Herramientas> OBH = new ArrayList<>();
        System.out.println("*************************************");
        System.out.println("*****\tPlastielectrica Del Sur\t*****");
        System.out.println("*************************************");
        System.out.println("Venta en todo tipo de materiales electricos!!\n");
        System.out.print("\tPregunte\n\t  Por\n\t   Lo\n\t   Que\n\tNecesite!!\n\n");
        System.out.println("Email de la empresa: plastielec01@gmail.com\n");
        System.out.println("Numero telefonico de la empresa: 9624587596\n");
        System.out.println("Horario de servicio: 8:00 AM - 4:00 PM, de Lunes a Sabado!");

        do {
            System.out.println("\tMenú\t");
            System.out.println("seleccione una opción");
            System.out.println("1.agregar herramientas");
            System.out.println("2.visualizar herramientas");
            System.out.println("3.Editar herramienta");
            op = x.nextInt();
            switch (op) {
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
                        System.out.println("¿Desea ingresar otra herramienta?(si/no)");
                        respuesta = x.next();
                    } while (respuesta.equals("si"));//condición para agregar o no otro articulo
                    break;
                case 2://impresión de herramientas
                    for (i = 0; i < OBH.size(); i++) {
                        System.out.println("________________________________________");
                        System.out.println("Articulo " + OBH.get(i).articulo);
                        System.out.println("tipo: " + OBH.get(i).tipo);
                        System.out.println("codigo de identificación: " + OBH.get(i).id);
                        System.out.println("marca: " + OBH.get(i).marca);
                        System.out.println("unidad: " + OBH.get(i).unidades);
                        System.out.println("cantidad: " + OBH.get(i).cantidad + " " + OBH.get(i).unidades);
                        System.out.println("garantia: " + OBH.get(i).garantia + " días");
                        System.out.println("precio: $" + OBH.get(i).precio);
                    }
                    break;
                case 3:
                    int ind=0;
                    System.out.println("Ingrese el codigo de identificacion de la herramienta que desea modificar: ");
                    nid = x.next();
                    for (i = 0; i < OBH.size(); i++) {
                        if ((OBH.get(i).id).equals(nid)) {
                             ind = 1;
                            //System.out.println("valor de ind: "+ind); si lo encontró
                            //menu de lo que se desea actualizar
                            //System.out.println("Menu de actualizacion de datos");
                            System.out.println("1.- Articulo\n2.- Tipo\n3.- ID\n4.-Marca\n5.-Unidad\n6.-Cantidad\n7.-Garantia\n8.-Precio");
                            //System.out.println("Dame el dato correcto:");
                            //OBH.get(i).marca=ent.next();
                            break;
                        }else {
                            System.out.println("Herramienta no encontrada");
                        }
                        
                        
                    }

                    break;

            }
        } while (op != 2);

    }
}
