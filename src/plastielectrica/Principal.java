package plastielectrica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author < Noe Guillen Gerardo ---- noe.guillen22@unach.mx >
 *
 * @author < Jose Eduardo Orozco Cradenas ---- eduardo.orozco66@unach.mx >
 *
 * @author < Samuel Sanchez Guzman ---- samuel.sanchez85@unach.mx >
 *
 * @author < Jeannette Sanchez Hernandez ---- jeannette.sanchez79@unach.mx >
 *
 * @author < Francisco Javier Solis Bamaca ---- francisco.solis41@unach.mx >
 *
 * @author < Emilia Zuniga Losada ---- emilia.zuniga49@unach.mx >
 *
 */


public class Principal {

    public static void main(String[] args) {
        String respuesta, num, tipeEmp, tipeEmp2;
        int op, i, res, r1, r2, r3, r4, r5;
        Scanner x = new Scanner(System.in);
        //creamos uestra arraylista para los articulos
        ArrayList<Herramientas> OBH = new ArrayList<>();
        //creación de una arrayList para los empleados 
        ArrayList<Empleado> arrayLEmp = new ArrayList<>();

        //INFORMACION DE BIENVENIDA 
        System.out.println("*************************************");
        System.out.println("*****\tPlastielectrica Del Sur\t*****");
        System.out.println("*************************************");
        System.out.println("Venta en todo tipo de materiales electricos!!\n");
        System.out.print("\tPregunte\n\t  Por\n\t   Lo\n\t   Que\n\tNecesite!!\n\n");
        System.out.println("Email de la empresa: plastielec01@gmail.com\n");
        System.out.println("Numero telefonico de la empresa: 9624587596\n");
        System.out.println("Horario de servicio: 8:00 AM - 4:00 PM, de Lunes a Sabado!");

        do {
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
            switch (res) {
                case 1:
                    //submenu de Cliente
                    System.out.println("\n-----Que deseas hacer?-----");
                    System.out.println(" 1.- Anadir Cliente");
                    System.out.println(" 2.- Editar Cliente");
                    System.out.println(" 3.- Eliminar Cliente");
                    System.out.println(" 4.- Ver todos los Clientes");
                    System.out.println(" 5.- Ver 1 Cliente");
                    System.out.println(" 6.- Ver Por Tipos de Clientes");
                    System.out.println(" 7.- Regresar");
                    r1 = x.nextInt();
                    switch (r1) {

                    }
                    break;

                case 2:
                    //submenu de Empleados
                    System.out.println("\n-----Que deseas hacer?-----");
                    System.out.println(" 1.- Anadir Empleado"); 
                    System.out.println(" 2.- Editar Empleado");
                    System.out.println(" 3.- Eliminar Empleado");
                    System.out.println(" 4.- Ver todos los Empleados");
                    System.out.println(" 5.- Ver 1 Empleado");
                    System.out.println(" 6.- Ver Por Tipos de Empleados");
                    System.out.println(" 7.- Regresar");
                    r2 = x.nextInt();
                    switch (r2) {
                        case 1://registro de empleados
                            System.out.println();
                            do {
                                Empleado datosEmp = new Empleado();//objeto creado para hacer uso de los setters
                                System.out.println("Ingresar el nombre del empleado: ");
                                datosEmp.setNom(x.next());
                                System.out.println("Ingresar la edad del empleado: ");
                                datosEmp.setEdad(x.nextInt());
                                System.out.println("Ingresar la direccion del empleado: ");
                                datosEmp.setDirecc(x.next());
                                System.out.println("Ingresar el email del empleado: ");
                                datosEmp.setEmail(x.next());
                                System.out.println("Ingresar el numero telefonico del empleado: ");
                                datosEmp.setTelefono(x.next());
                                System.out.println("Ingresar el RFC del empleado: ");
                                datosEmp.set_RFC(x.next());
                                System.out.println("Ingresar el ID del empleado: ");
                                datosEmp.set_id(x.next());
                                System.out.println("Ingresar el tipo de empleado(quincenal/mensual)");
                                datosEmp.setTipoEmpleado(x.next());
                                arrayLEmp.add(datosEmp);
                                System.out.println("¿Deseas ingresar otro empleado?(si/no)");
                                respuesta = x.next();
                            } while (respuesta.equals("si"));//equals compara cadenas 
                            break;

                        case 2://edicion de datos de empleados 
                            System.out.println();
                            break;

                        case 3://eliminar empleados
                            System.out.println();
                            //for para mostrar los empleados existentes y sus respectivos ID
                            for (int j = 0; j < arrayLEmp.size(); j++) {//muestra los datos en el arrayList
                                System.out.println();
                                System.out.println("EMPLEADO " + (j + 1));
                                System.out.println("Nombre: " + arrayLEmp.get(j).nombre);
                                System.out.println("ID: " + arrayLEmp.get(j).ID);
                                System.out.println("Tipo de enpleado: "  + arrayLEmp.get(j).tipoEmpleado);
                            }
                            System.out.println();
                            System.out.println("Ingresar el ID del empleado que desea eliminar: ");
                            num = x.next();//lectura de datos                              
                            for (int j = 0; j < arrayLEmp.size(); j++) {
                                if (num.equals(arrayLEmp.get(j).ID)) { //se compara el dato guardado en num con los datos de ID en el arrayList
                                    arrayLEmp.remove(j);//j es el iterador del for, el cual regula los datos
                                    System.out.println("empleado eliminado!");
                                } else {
                                    System.out.println("empleado no encontrado");
                                }
                            }
                            break;

                        case 4://impresion de todos los empleados actuales
                            System.out.println();
                            for (int j = 0; j < arrayLEmp.size(); j++) {
                                System.out.println();
                                System.out.println("EMPLEADO " + (j + 1));
                                System.out.println("Nombre: " + arrayLEmp.get(j).nombre);
                                System.out.println("Edad: " + arrayLEmp.get(j).edad);
                                System.out.println("Dirección: " + arrayLEmp.get(j).direccion);
                                System.out.println("Email: " + arrayLEmp.get(j).email);
                                System.out.println("Telefono: " + arrayLEmp.get(j).telefono);
                                System.out.println("RFC: " + arrayLEmp.get(j).RFC);
                                System.out.println("ID: " + arrayLEmp.get(j).ID);
                                System.out.println("Tipo de Empleado: " + arrayLEmp.get(j).tipoEmpleado);
                            }
                            break;

                        case 5://mostrar solo un empleado
                            System.out.println();
                            System.out.println("Ingresar el ID del empleado que desea ver: ");
                            num = x.next();//lectura de datos                              
                            for (int j = 0; j < arrayLEmp.size(); j++) {
                                if (num.equals(arrayLEmp.get(j).ID)) { //se compara el dato guardado en num con los datos de ID en el arrayList
                                    System.out.println("");                      
                                    System.out.println("Nombre: " + arrayLEmp.get(j).nombre);
                                    System.out.println("Edad: " + arrayLEmp.get(j).edad);
                                    System.out.println("Dirección: " + arrayLEmp.get(j).direccion);
                                    System.out.println("Email: " + arrayLEmp.get(j).email);
                                    System.out.println("Telefono: " + arrayLEmp.get(j).telefono);
                                    System.out.println("RFC: " + arrayLEmp.get(j).RFC);
                                    System.out.println("ID: " + arrayLEmp.get(j).ID);
                                    System.out.println("Tipo de Empleado: " + arrayLEmp.get(j).tipoEmpleado);
                                    System.out.println("");                            
                                } else {
                                    System.out.println("empleado no encontrado");
                                }
                            }
                            break;

                        case 6://mostrar empleados por medio del tipo de contrato
                            tipeEmp = "quincenal";
                            tipeEmp2 = "mensual";
                            //for para mostar los empleados del tipo quincenal
                            for (int m = 0; m < arrayLEmp.size(); m++) {
                            if(tipeEmp.equals(arrayLEmp.get(m).tipoEmpleado)) {
                                //se compara el dato guardado en num con los datos de IN en el arrayList
                                System.out.println("Empleados QUINCENALES");
                                System.out.println("");
                                System.out.println("Nombre: " + arrayLEmp.get(m).nombre);
                                System.out.println("Edad: " + arrayLEmp.get(m).edad);
                                System.out.println("Dirección: " + arrayLEmp.get(m).direccion);
                                System.out.println("Email: " + arrayLEmp.get(m).email);
                                System.out.println("Telefono: " + arrayLEmp.get(m).telefono);
                                System.out.println("RFC: " + arrayLEmp.get(m).RFC);
                                System.out.println("ID: " + arrayLEmp.get(m).ID);
                                System.out.println("Tipo de Empleado: " + arrayLEmp.get(m).tipoEmpleado);
                                System.out.println("");
                                } 
                            }
                            //for para mostar los empleados del tipo mensual
                            for (int n = 0; n < arrayLEmp.size(); n++) {
                                if(tipeEmp2.equals(arrayLEmp.get(n).tipoEmpleado)){
                                    System.out.println("Empleados MENSUALES");
                                    System.out.println("");                      
                                    System.out.println("Nombre: " + arrayLEmp.get(n).nombre);
                                    System.out.println("Edad: " + arrayLEmp.get(n).edad);
                                    System.out.println("Dirección: " + arrayLEmp.get(n).direccion);
                                    System.out.println("Email: " + arrayLEmp.get(n).email);
                                    System.out.println("Telefono: " + arrayLEmp.get(n).telefono);
                                    System.out.println("RFC: " + arrayLEmp.get(n).RFC);
                                    System.out.println("ID: " + arrayLEmp.get(n).ID);
                                    System.out.println("Tipo de Empleado: " + arrayLEmp.get(n).tipoEmpleado);
                                    System.out.println("");
                                }
                            }
                        break;

                        case 7://regresar 
                            System.out.println("Regresando al menu principal:)");
                            break;

                    }
                    break;

                case 3:
                    //submenu de Articulos
                    System.out.println("\n-----Que deseas hacer?-----");
                    System.out.println(" 1.- Anadir Articulo");
                    System.out.println(" 2.- Editar Articulo");
                    System.out.println(" 3.- Eliminar Articulo");
                    System.out.println(" 4.- Ver todos los Articulos");
                    System.out.println(" 5.- Ver 1 Articulo");
                    System.out.println(" 6.- Ver Por Tipos de Articulos");
                    System.out.println(" 7.- Regresar");
                    r3 = x.nextInt();

                    do {

                        switch (r3) {

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
                                    respuesta = x.next();
                                } while (respuesta.equals("si"));//condición para agregar o no otro articulo
                                break;

                            case 4://impresión de herramientas
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
                        }
                    } while (r3 != 7);
                    break;

                case 4:
                    //submenu de Notas
                    System.out.println("\n-----Que deseas hacer?-----");
                    System.out.println(" 1.- Nueva Nota");
                    System.out.println(" 2.- Editar Nota");
                    System.out.println(" 3.- Eliminar Nota");
                    System.out.println(" 4.- Ver Todas Las Notas");
                    System.out.println(" 5.- Ver 1 Nota");
                    System.out.println(" 6.- Regresar");
                    r4 = x.nextInt();
                    switch (r4) {

                    }
                    break;

                case 5:
                    //submenu de Estadisticas 
                    System.out.println("\n-----Que deseas hacer?-----");
                    System.out.println(" 1.- Ver Articulo Mas Vendido");
                    System.out.println(" 2.- Ver Articulo Menos Vendido");
                    System.out.println(" 3.- Ver Ventas Totales");
                    r2 = x.nextInt();
                    switch (r2) {

                    }
                    break;

                case 6:
                    System.out.println("Gracias por usar nustro sistema, saludos cordiales de parte de todo el equipo de desarrollo!");
                    break;
            }

        } while (res != 6);

    }
}