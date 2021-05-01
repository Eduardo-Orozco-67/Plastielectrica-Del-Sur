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
        String respuesta, num, Ncliente, cdes, tipo, nid, exe;
        int op, i, res = 0, r1, r2, r3, r4, r5, ind = 0;
        boolean ban = false;
        Scanner x = new Scanner(System.in);
        //arraylist para los articulos
        ArrayList<Herramientas> OBH = new ArrayList<>();
        //arrayList para los empleados 
        ArrayList<Empleado> arrayLEmp = new ArrayList<>();
        //arrayist para clientes
        ArrayList<Cliente> clientes = new ArrayList<>();

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
            System.out.print("Teclee Opcion: ");
            res = x.nextInt();
            System.out.println();

            //switch menu pricipal
            switch (res) {
                case 1:

                    do {
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
                            case 1:

                                do {
                                    Cliente llenadocliente = new Cliente();
                                    //objeto que servira como el molde para el llenado de la lista

                                    System.out.println();
                                    x.nextLine();//aqui usamos nextLine en vez de Next para poder leer espacios
                                    //ponemos este x.nextLine para que se coma los \n
                                    System.out.println("Ingrese el Numero de Registro del Cliente: ");
                                    llenadocliente.setNumCliente(x.next());
                                    x.nextLine();
                                    System.out.println("Ingrese el Nombre del Cliente: ");
                                    llenadocliente.setNom(x.nextLine());
                                    System.out.println("Ingrese la Edad del Cliente: ");
                                    llenadocliente.setEdad(x.nextInt());
                                    x.nextLine();
                                    System.out.println("Ingrese la Direccion del Cliente: ");
                                    llenadocliente.setDirecc(x.nextLine());
                                    System.out.println("Ingrese el Email del Cliente: ");
                                    llenadocliente.setEmail(x.nextLine());
                                    System.out.println("Ingrese el Numero Telefonico del Cliente: ");
                                    llenadocliente.setTelefono(x.nextLine());
                                    System.out.println("Ingrese el RFC del Cliente: ");
                                    llenadocliente.setRFC(x.nextLine());
                                    System.out.println("Ingrese el Tipo de Pago del Cliente: ");
                                    llenadocliente.setTipoCliente(x.nextLine());
                                    clientes.add(llenadocliente);

                                    //Preguntamos si desea un nuevo cliente
                                    System.out.println("¿Deseas ingresar otro Cliente?(Si/No)");
                                    respuesta = x.next();

                                } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));

                                break;

                            case 2:
                                
                                if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("No hay datos registradoas aun");
                                    System.out.println("Vaya a opcion 1 anadir");
                                }
                                else 
                                {
                                
                                System.out.println();
                                System.out.println("Ingresar el Numero del Cliente que desea editar: ");
                                Ncliente = x.next();//lectura de datos                              
                                for (int y = 0; y < clientes.size(); y++) {
                                    if (Ncliente.equals(clientes.get(y).NumCliente)) { //se compara el dato guardado con los datos de NumCliente en el arrayList
                                        System.out.println("Cliente encontrado");
                                        System.out.println("El Num de Cliente no se puede modificar:");
                                        System.out.print(clientes.get(y).NumCliente);
                                        System.out.println("Ingrese el Nombre del Cliente: ");
                                        x.nextLine();
                                        clientes.get(y).setNom(x.nextLine());
                                        System.out.print("\nIngrese la Edad del Cliente: ");
                                        clientes.get(y).setEdad(x.nextInt());
                                        x.nextLine();
                                        System.out.print("Ingrese la Direccion del Cliente: ");
                                        clientes.get(y).setDirecc(x.nextLine());
                                        System.out.println("Ingrese el Email del Cliente: ");
                                        clientes.get(y).setEmail(x.next());
                                        System.out.println("Ingrese el Numero Telefonico del Cliente: ");
                                        clientes.get(y).setTelefono(x.next());
                                        System.out.println("Ingrese el RFC del Cliente: ");
                                        clientes.get(y).setRFC(x.next());
                                        System.out.println("Ingrese el Tipo de Pago del Cliente: ");
                                        clientes.get(y).setTipoCliente(x.next());

                                    }
                                }
                                }
                                break;

                            case 3:
                                if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("No hay datos registradoas aun");
                                    System.out.println("Vaya a opcion 1 anadir");
                                }
                                else 
                                {
                                System.out.println();
                                System.out.println("Ingresar el Numero del Cliente que desea eliminar: ");
                                Ncliente = x.next();//lectura de datos                              
                                for (int y = 0; y < clientes.size(); y++) 
                                {
                                    if (Ncliente.equals(clientes.get(y).NumCliente)) 
                                    { //se compara el dato guardado con los datos de NumCliente en el arrayList
                                        System.out.println("Cliente encontrado");
                                        System.out.println("Esta seguro de Eliminar");
                                        cdes = x.next();
                                        if (cdes.equals("SI") || cdes.equals("Si") || cdes.equals("si")) 
                                        {
                                            clientes.remove(y);//y sera el que indique el valor de posicion
                                            System.out.println("Cliente eliminado!");
                                        }
                                    } 
                                    else 
                                    {
                                        System.out.println("Cliente no encontrado");
                                    }
                                }
                                }
                                break;

                            case 4:
                                
                                if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("No hay datos registradoas aun");
                                    System.out.println("Vaya a opcion 1 anadir");
                                }
                                else 
                                {
                                System.out.println();
                                for (int q = 0; q < clientes.size(); q++) {

                                    System.out.println();
                                    System.out.println("Numero de Cliente: " + clientes.get(q).NumCliente);
                                    System.out.println("Nombre: " + clientes.get(q).nombre);
                                    System.out.println("Edad: " + clientes.get(q).edad);
                                    System.out.println("Dirección: " + clientes.get(q).direccion);
                                    System.out.println("Email: " + clientes.get(q).email);
                                    System.out.println("Telefono: " + clientes.get(q).telefono);
                                    System.out.println("RFC: " + clientes.get(q).RFC);
                                    System.out.println("Tipo de Pago: " + clientes.get(q).TipoCliente);

                                }
                                }
                                break;

                            case 5:
                                   System.out.println();
                                   System.out.println("Ingrese el número de cliente que desee ver: ");
                                   Ncliente=x.next();

                                   for(int z =0; z < clientes.size(); z++)
                                   {
                                       if((clientes.get(z).NumCliente).equals(Ncliente))
                                       {

                                          ban = true; //Cliente encontrado
                                          break;  
                                        }
                                       
                                
                                        if(ban == true)
                                        {
                                          System.out.println("Imprimiendo datos del cliente solicitado: ");
                                          System.out.println(clientes.get(z).NumCliente); 
                                          System.out.println("Nombre: " + clientes.get(z).nombre);
                                          System.out.println("Edad: " + clientes.get(z).edad);
                                          System.out.println("Dirección: " + clientes.get(z).direccion);
                                          System.out.println("Email: " + clientes.get(z).email);
                                          System.out.println("Telefono: " + clientes.get(z).telefono);
                                          System.out.println("RFC: " + clientes.get(z).RFC);
                                          System.out.println("Tipo de Pago: " +clientes.get(z).TipoCliente);
                                        }

                                        else
                                        {
                                           System.out.println("Cliente no localizado...");
                                        }
                                    }
                                break;

                            case 6:
                                System.out.println();
                                break;

                            case 7:
                                break;

                            default:
                        }
                    } while (r1 != 7);
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
                        case 1:
                            System.out.println();
                            do {
                                Empleado datosEmp = new Empleado();//objeto creado para hacer uso de los setters
                                System.out.println("Ingrese el nombre del empleado: ");
                                datosEmp.setNom(x.next());
                                System.out.println("Ingrese la edad del empleado: ");
                                datosEmp.setEdad(x.nextInt());
                                System.out.println("Ingrese la direccion del empleado: ");
                                datosEmp.setDirecc(x.next());
                                System.out.println("Ingrese el email del empleado: ");
                                datosEmp.setEmail(x.next());
                                System.out.println("Ingrese el numero telefonico del empleado: ");
                                datosEmp.setDirecc(x.next());
                                System.out.println("Ingrese el RFC del empleado: ");
                                datosEmp.set_RFC(x.next());
                                System.out.println("Ingrese el ID del empleado: ");
                                datosEmp.set_id(x.next());
                                arrayLEmp.add(datosEmp);
                                System.out.println("¿Deseas ingresar otro empleado?(si/no)");
                                respuesta = x.next();
                            } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")||respuesta.equals("sI"));//equals compara cadenas 
                            break;

                        case 2:
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            //for para mostrar los empleados existentes y sus respectivos ID
                            for (int j = 0; j < arrayLEmp.size(); j++) {//muestra los datos en el arrayList
                                System.out.println();
                                System.out.println("EMPLEADO " + (j + 1));
                                System.out.println("Nombre: " + arrayLEmp.get(j).nombre);
                                System.out.println("ID: " + arrayLEmp.get(j).ID);
                            }
                            System.out.println();
                            System.out.println("Ingresar el ID del empleado que desea eliminar: ");
                            num = x.next();//lectura de datos                              
                            for (int j = 0; j < arrayLEmp.size(); j++) {
                                if (num.equals(arrayLEmp.get(j).ID)) { //se compara el dato guardado en num con los datos de IN en el arrayList
                                    arrayLEmp.remove(j);//j es el iterador del for, el cual regula los datos
                                    System.out.println("empleado eliminado!");
                                } else {
                                    System.out.println("empleado no encontrado");
                                }
                            }
                            break;

                        case 4:
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
                            }
                            break;

                        case 5:
                            System.out.println();
                            break;

                        case 6:
                            System.out.println();
                            break;

                        case 7:

                            break;

                    }
                    break;

                case 3:
                    do {
                        //submenu de Articulos
                        System.out.println("\n-----Que deseas hacer?-----");
                        System.out.println(" 1.- Anadir articulo");
                        System.out.println(" 2.- Editar articulo");
                        System.out.println(" 3.- Eliminar articulo");
                        System.out.println(" 4.- Ver todos los articulos");
                        System.out.println(" 5.- Ver 1 articulo");
                        System.out.println(" 6.- Ver por tipos de articulos");
                        System.out.println(" 7.- Regresar");
                        r3 = x.nextInt();
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
                                    System.out.println("¿Desea ingresar otra herramienta?(si/no)");
                                    respuesta = x.next();
                                } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para agregar o no otro articulo
                                break;

                            case 2:
                                if (OBH.isEmpty()) { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } else {
                                    do {
                                        //Edicion de herramienta
                                        Herramientas modifher = new Herramientas();
                                        System.out.println("Ingrese el código de identificación dela heramienta a modificar");
                                        nid = x.next();
                                        for (i = 0; i < OBH.size(); i++) {
                                            if (nid.equals(OBH.get(i).id)) {
                                                System.out.println("Articulo encontrado");
                                                System.out.println("El código de identificación no es posible modificarlo: " + OBH.get(i).id);
                                                System.out.println("Ingrese el nombre de este artículo.");
                                                x.nextLine();
                                                OBH.get(i).setArticulo(x.nextLine());
                                                System.out.println("Ingrese el  tipo de este articulo (ejemplo: cable tipo cobre).");
                                                OBH.get(i).setTipo(x.nextLine());
                                                System.out.println("Ingrese la marca de este artículo.");
                                                OBH.get(i).setMarca(x.nextLine());
                                                System.out.println("Ingrese el tipo de unidad de este artículo.(ejemplo: kilos, metros piezas,etc)");
                                                OBH.get(i).setUnidades(x.nextLine());
                                                System.out.println("Ingrese la cantidad de este  artículo.");
                                                OBH.get(i).setCantidad(x.nextInt());
                                                System.out.println("Ingrese la garantia (en días) de este artículo.");
                                                OBH.get(i).setGarantia(x.nextInt());
                                                System.out.println("Ingrese el precio de este artículo.");
                                                OBH.get(i).setPrecio(x.nextFloat());
                                            }
                                        }
                                        System.out.println("¿Desea modifcar otra herramienta?(si/no)");
                                        respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para modifcar o no otro articulo
                                }
                                break;

                            case 3: //eliminación de herramientas  
                                if (OBH.isEmpty()) { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } else {
                                    do {
                                        System.out.println();
                                        System.out.println("Ingrese el código de identificación de la heramienta a eliminar");
                                        nid = x.next();
                                        for (i = 0; i < OBH.size(); i++) {//ciclo para verificar todos los objetos
                                            if (nid.equals(OBH.get(i).id)) {//comparación de id con nid
                                                OBH.remove(i);//eliminar el objeto con todos sus atributos
                                                System.out.println("objeto eliminado");
                                            } else {
                                                System.out.println("Este código no pertenece a ningún artículo.");
                                            }
                                        }
                                        System.out.println("¿Desea eliminar otra herramienta?(si/no)");
                                        respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para eliminar o no otro articulo
                                }
                                break;

                            case 4://impresión de herramientas
                                if (OBH.isEmpty()) { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } else {
                                    for (i = 0; i < OBH.size(); i++) {//ciclo para verificar todos los objetos
                                        System.out.println("________________________________________");
                                        System.out.println("Articulo " + OBH.get(i).articulo);
                                        System.out.println("Tipo: " + OBH.get(i).tipo);
                                        System.out.println("Codigo de identificación: " + OBH.get(i).id);
                                        System.out.println("Marca: " + OBH.get(i).marca);
                                        System.out.println("Unidad: " + OBH.get(i).unidades);
                                        System.out.println("Cantidad: " + OBH.get(i).cantidad + " " + OBH.get(i).unidades);
                                        System.out.println("Garantia: " + OBH.get(i).garantia + " días");
                                        System.out.println("Precio: $" + OBH.get(i).precio);
                                    }
                                }
                                break;
                                
                            case 5://busqueda de 1 herramienta .
                                if (OBH.isEmpty()) { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } else {
                                    do {
                                        System.out.println("Ingrese el codigo de identificacion de la herramienta que desea ver: ");
                                        nid = x.next();
                                        try {//Inicio de la excepcion 
                                            for (i = 0; i < OBH.size(); i++) {//ciclo para verificar todos los objetos
                                                if ((OBH.get(i).id).equals(nid)) {//comparación de id con nid
                                                    ind = 1;
                                                    System.out.println("Articulo encontrado");
                                                    break;
                                                }
                                            }

                                            if (ind == 1) {////comparación de nid con su valor de salida
                                                System.out.println("");
                                                System.out.println("Articulo " + OBH.get(i).articulo);
                                                System.out.println("Tipo: " + OBH.get(i).tipo);
                                                System.out.println("Codigo de identificación: " + OBH.get(i).id);
                                                System.out.println("Marca: " + OBH.get(i).marca);
                                                System.out.println("Unidad: " + OBH.get(i).unidades);
                                                System.out.println("Cantidad: " + OBH.get(i).cantidad + " " + OBH.get(i).unidades);
                                                System.out.println("Garantia: " + OBH.get(i).garantia + " días");
                                                System.out.println("Precio: $" + OBH.get(i).precio);
                                            }
                                        } catch (Exception e) {//fin de la excepcion
                                            System.out.println("\nArticulo no encontrado.");
                                        }

                                        System.out.println("\n¿Deseas ver otro articulo?(si/no)");
                                        respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para ver o no otro articulo
                                }
                                break;

                            case 6: //busqueda de herramientas por tipo 
                                if (OBH.isEmpty()) { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } else {
                                    do {
                                        System.out.println("Ingrese el tipo de herramientas que desea ver ");
                                        tipo = x.next();
                                        try {//Inicio de la excepcion 
                                            for (i = 0; i < OBH.size(); i++) {//ciclo para verificar todos los objetos
                                                if (tipo.equals(OBH.get(i).tipo)) {//comparación del tipo requerido con el registrado
                                                    System.out.println("");
                                                    System.out.println("Articulo " + OBH.get(i).articulo);
                                                    System.out.println("Tipo: " + OBH.get(i).tipo);
                                                    System.out.println("Codigo de identificación: " + OBH.get(i).id);
                                                    System.out.println("Marca: " + OBH.get(i).marca);
                                                    System.out.println("Unidad: " + OBH.get(i).unidades);
                                                    System.out.println("Cantidad: " + OBH.get(i).cantidad + " " + OBH.get(i).unidades);
                                                    System.out.println("Garantia: " + OBH.get(i).garantia + " días");
                                                    System.out.println("Precio: $" + OBH.get(i).precio);
                                                }
                                            }
                                        } catch (Exception e) {//fin de la excepcion
                                            System.out.println("\nTipo no encontrado.");
                                        }
                                        System.out.println("¿Desea buscar otro tipo de herramientas?");
                                        respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para ver o no otro articulo
                                }

                                break;

                            case 7:
                                System.out.println("\nVolviendo a menú principal...");

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
                    r5 = x.nextInt();
                      
                    switch (r5) 
                    {

                    }  
                    break;

                case 6:
                    System.out.println("Gracias por usar nustro sistema, saludos cordiales de parte de todo el equipo de desarrollo!");
                    break;
            }
            
        } while (res != 6);
        
    }
}

