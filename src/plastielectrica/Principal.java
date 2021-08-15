package plastielectrica;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author < Noe Guillen Gerardo ---- noe.guillen22@unach.mx >
 *
 * @author < Jose Eduardo Orozco Cardenas ---- eduardo.orozco66@unach.mx >
 *
 * @author < Samuel Sanchez Guzman ---- samuel.sanchez85@unach.mx >
 *
 * @author < Jeannette Sanchez Hernandez ---- jeannette.sanchez79@unach.mx >
 *
 * @author < Francisco Javier Solis Bamaca ---- francisco.solis41@unach.mx >
 *
 * @author < Emilia Zuniga Losada ---- emilia.zuniga49@unach.mx >
 * 
 * @version <1.1>
 *  
 * Programacion Orientada a Objetos
 * Profesora: Vannessa Benavides Garcia
 * 8 de mayo de 2020
 * 
 * 
 * Muchas felicitaciones por su cumple profe, de parte de todos los integrantes
 * le deseamos un feliz cumpleaños y le mandamos muchas bendiciones
 */


public class Principal {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        
        //VARIABLES STRING PARA LA TOMA DE DECISIONES O COMPARACIONES DE DATOS
        String respuesta, num, Ncliente, cdes, tipo, nid, elimar, respuesta2, TCliente,tipeEmpleado,nid2;
        int min, max ,ei,ez;
        int  i, o, v = 0, t=0, p, g, u, ventas=0;
        double lleva , sub1, descuento, total ;
        //VARIABLES STRING PARA LOS DISTINTOS SWITCH DE MENUS
        String res , r1, r2, r3, r4, r5;
        boolean ban=false, ban2=false, clnoenco=false, ind = false, artel = false, ban3=true, ind2=false, bn=false;
        boolean ban4 = false, ban5=false, ban6=false, ban7=true, bne=false;
        Scanner x = new Scanner(System.in);
        //arraylist para los articulos
        ArrayList<Herramientas> OBH = new ArrayList<>();
        //arrayList para los empleados 
        ArrayList<Empleado> arrayLEmp = new ArrayList<>();
        //arrayist para los clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        //arrayist para las Notas
        ArrayList<Nota> lisNota = new ArrayList<>();
        ArrayList<Nota> listNota = new ArrayList<>();
        ArrayList<ArrayList<Nota>> listaNota = new ArrayList<>();
        ArrayList<Nota> listNotatotal = new ArrayList<>();
        
        //INFORMACION DE BIENVENIDA 
        System.out.println("*************************************");
        System.out.println("*****\tPlastielectrica Del Sur\t*****");
        System.out.println("*************************************");
        System.out.println("Venta en todo tipo de materiales electricos!!\n");
        System.out.print("\tPregunte\n\t  Por\n\t   Lo\n\t   Que\n\tNecesite!!\n\n");
        System.out.println("Email de la empresa: plastielec01@gmail.com\n");
        System.out.println("Numero telefonico de la empresa: 9624587596\n");
        System.out.println("Horario de servicio: 8:00 AM - 4:00 PM, de Lunes a Sabado!");
        System.out.println("Todos nuestros precios ya tienen IVA");

        
        
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
            res = x.next();
            System.out.println();

            //switch menu pricipal
            switch (res) {
                case "1":

                    do 
                    {
                        //submenu de Cliente
                        System.out.println("\n-----Que deseas hacer?-----");
                        System.out.println(" 1.- Anadir Cliente");
                        System.out.println(" 2.- Editar Cliente");
                        System.out.println(" 3.- Eliminar Cliente");
                        System.out.println(" 4.- Ver todos los Clientes");
                        System.out.println(" 5.- Ver 1 Cliente");
                        System.out.println(" 6.- Ver Por Tipos de Clientes");
                        System.out.println(" 7.- Regresar");
                        System.out.println();
                        System.out.print("Teclee Opcion: ");
                        r1 = x.next();
                        System.out.println("");

                        switch (r1) {
                            case "1":

                                do {
                                    Cliente llenadocliente = new Cliente();
                                    //objeto que servira como el molde para el llenado de la lista

                                    System.out.println();
                                    x.nextLine();//aqui usamos nextLine en vez de Next para poder leer espacios
                                    //ponemos este x.nextLine para que se coma los \n
                                    System.out.print("Ingrese el Numero de Registro del Cliente: ");
                                    llenadocliente.setNumCliente(x.next());
                                    x.nextLine();
                                    System.out.print("Ingrese el Nombre del Cliente: ");
                                    llenadocliente.setNom(x.nextLine());
                                    System.out.print("Ingrese la Edad del Cliente: ");
                                    llenadocliente.setEdad(x.nextInt());
                                    x.nextLine();
                                    System.out.print("Ingrese la Direccion del Cliente: ");
                                    llenadocliente.setDirecc(x.nextLine());
                                    System.out.print("Ingrese el Email del Cliente: ");
                                    llenadocliente.setEmail(x.nextLine());
                                    System.out.print("Ingrese el Numero Telefonico del Cliente: ");
                                    llenadocliente.setTelefono(x.nextLine());
                                    System.out.print("Ingrese el RFC del Cliente: ");
                                    llenadocliente.setRFC(x.nextLine());
                                    System.out.print("Ingrese el Tipo de Pago del Cliente: ");
                                    llenadocliente.setTipoCliente(x.nextLine());
                                    clientes.add(llenadocliente);

                                    //Preguntamos si desea un nuevo cliente   
                                    System.out.println("");
                                    System.out.println("¿Desea ingresar otro Cliente?(Si/No)");
                                    respuesta = x.next();

                                } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));

                                break;

                            case "2":
                                
                                if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("\nNo se han ingresado datos, favor de ir a la opcion 1.");
                                }
                                else 
                                {
                                    
                                 do{
                                      System.out.println();
                                      System.out.println("Ingresar el Numero del Cliente que desea editar: ");
                                      Ncliente = x.next();//lectura de datos                              
                                
                                      for (int y = 0; y < clientes.size(); y++) 
                                       {
                                         if (Ncliente.equals(clientes.get(y).NumCliente))  //se compara el dato guardado con los datos de NumCliente en el arrayList
                                         {
                                            System.out.println("Cliente encontrado");
                                            System.out.println("El Num de Cliente no se puede modificar:");
                                            System.out.println(clientes.get(y).NumCliente);
                                            System.out.print("Ingrese el Nombre del Cliente: ");
                                            x.nextLine();
                                            clientes.get(y).setNom(x.nextLine());
                                            System.out.print("\nIngrese la Edad del Cliente: ");
                                            clientes.get(y).setEdad(x.nextInt());
                                            x.nextLine();
                                            System.out.print("Ingrese la Direccion del Cliente: ");
                                            clientes.get(y).setDirecc(x.nextLine());
                                            System.out.print("Ingrese el Email del Cliente: ");
                                            clientes.get(y).setEmail(x.next());
                                            System.out.print("Ingrese el Numero Telefonico del Cliente: ");
                                            clientes.get(y).setTelefono(x.next());
                                            System.out.print("Ingrese el RFC del Cliente: ");
                                            clientes.get(y).setRFC(x.next());
                                            System.out.print("Ingrese el Tipo de Pago del Cliente: ");
                                            clientes.get(y).setTipoCliente(x.next());
                                            
                                        }
                                         else
                                         {
                                             bn=true;
                                         }
                                         
                                    }
                                      if(bn==true)
                                      {
                                          System.out.println("Cliente no encontrado");
                                      }
                                     System.out.println("");
                                     System.out.println("¿Desea Editar otro Cliente?(Si/No)");
                                     respuesta = x.next();
                                    }while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));
                                }
                                break;

                            case "3":
                                if (clientes.isEmpty())//verificamos si la lista no esta vacia
                                {
                                    System.out.println();
                                    System.out.println("\nNo se han ingresado datos, favor de ir a la opcion 1.");
                                }
                                else 
                                {
                                  do{
                                      System.out.println();
                                      System.out.println("Ingresar el Numero del Cliente que desea eliminar: ");
                                      Ncliente = x.next();//lectura de dato                          
                                        
                                       for (int y = 0; y < clientes.size(); y++) 
                                       {
                                          if (Ncliente.equals(clientes.get(y).NumCliente)) 
                                             { //se compara el dato guardado con los datos de NumCliente en el arrayList
                                                System.out.println("Cliente encontrado");
                                                System.out.println("Esta seguro de Eliminar a el cliente");
                                                cdes = x.next();
                                                 
                                                if (cdes.equals("SI") || cdes.equals("Si") || cdes.equals("si")||cdes.equals("sI")) 
                                                 {
                                                    clientes.remove(y);//y sera el que indique el valor de posicion en el arraylist
                                                    System.out.println("Cliente eliminado!");
                                                    clnoenco=false;
                                                }
                                                else 
                                                {
                                                   System.out.println("No se borro nada");
                                                }
                                             }
                                          else
                                             {
                                               clnoenco=true;
                                             }
                                        }
                                        if(clnoenco==true)
                                        {
                                           System.out.println("Cliente no encontrado");
                                        }
                                    
                                       System.out.println("");
                                       System.out.println("¿Desea Eliminar otro Cliente?(Si/No)");
                                       respuesta = x.next();
                                    }while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));
                                }
                                break;

                            case "4"://IMPRIMIR DATOS DE LOS CLIENTES
                                
                                if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("\nNo se han ingresado datos, favor de ir a la opcion 1.");
                                }
                                else 
                                {
                                    System.out.println();
                                    for (int q = 0; q < clientes.size(); q++) 
                                    {

                                       System.out.println();
                                       System.out.println("______________________________________________________________________________");
                                       System.out.println("Numero de Cliente: " + clientes.get(q).NumCliente);
                                       System.out.println("Nombre: " + clientes.get(q).nombre);
                                       System.out.println("Edad: " + clientes.get(q).edad);
                                       System.out.println("Dirección: " + clientes.get(q).direccion);
                                       System.out.println("Email: " + clientes.get(q).email);
                                       System.out.println("Telefono: " + clientes.get(q).telefono);
                                       System.out.println("RFC: " + clientes.get(q).RFC);
                                       System.out.println("Tipo de Pago: " + clientes.get(q).TipoCliente);
                                    }
                                    System.out.println("______________________________________________________________________________");
                                }
                                break;

                            case "5":
                                
                                if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("\nNo se han ingresado datos, favor de ir a la opcion 1.");
                                }
                                else 
                                {
                                   do{
                                       System.out.println();
                                       System.out.println("Ingrese el número de cliente que desee ver: ");
                                       Ncliente=x.next();

                                       for(int z =0; z < clientes.size(); z++)
                                       {
                                          if((clientes.get(z).NumCliente).equals(Ncliente))
                                           {
                                              ban = true; //Cliente encontrado
                                              System.out.println("Cliente encontrado");
                                              
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
                                        } 
                                          if(ban ==false)
                                            {
                                              System.out.println("Cliente no localizado...");
                                            }
                                      System.out.println("");
                                      System.out.println("¿Desea ver otro Cliente?(Si/No)");
                                      respuesta = x.next();
                                    }while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));
                                }  
                                break;

                            case "6":
                                   int w;
                                 //Mostrar a los clientes y todos sus datos dependiendo del tipo de pago que los clientes sean
                                 if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("\nNo se han ingresado datos, favor de ir a la opcion 1.");
                                }
                                else 
                                {
                                 do{
                                      
                                      System.out.println("");
                                      System.out.println("Escriba el tipo de pago los clientes a visualizar: ");
                                      System.out.println("Tipos de Clientes \n Descuento \n Credito \n Mostrador \n");
                                      System.out.print("Teclee la busqueda: ");
                                      TCliente=x.next();
                            
                                       if(TCliente.equals("Descuento")||TCliente.equals("descuento")||TCliente.equals("DESCUENTO"))
                                       {
                                          //Mostrar datos del tipo cliente descuento 
                                          System.out.println("");
                                          System.out.println("Datos de clientes con tipo de pago en descuento");
                                          System.out.println("");
                                          for(w =0; w < clientes.size(); w++)
                                          {
                                    
                                              if((clientes.get(w).TipoCliente).equals("Descuento")||(clientes.get(w).TipoCliente).equals("descuento")||(clientes.get(w).TipoCliente).equals("DESCUENTO"))
                                               {
                                                 ban2=true;
                                                 ban3=false;
                                               }
                                               
                                               if (ban2==true)
                                               {
                                                 System.out.println("Numero de Cliente: "+clientes.get(w).NumCliente); 
                                                 System.out.println("Nombre: " + clientes.get(w).nombre);
                                                 System.out.println("Edad: " + clientes.get(w).edad);
                                                 System.out.println("Dirección: " + clientes.get(w).direccion);
                                                 System.out.println("Email: " + clientes.get(w).email);
                                                 System.out.println("Telefono: " + clientes.get(w).telefono);
                                                 System.out.println("RFC: " + clientes.get(w).RFC);
                                                 System.out.println("Tipo de Pago del cliente: " +clientes.get(w).TipoCliente); 
                                                 ban2=false;
                                               }
                                       
                                           }//Fin ciclo for
                                           if(ban3==true)
                                            {
                                                System.out.println("No se encontraron clientes con este tipo de pago descuento...");
                                            }

                                       }//Fin del if clientes a descuento
                                      

                                       if(TCliente.equals("Mostrador")||TCliente.equals("mostrador")||TCliente.equals("MOSTRADOR"))
                                        {
                                            //mostrar datos de clientes mostrador
                                            System.out.println("");
                                            System.out.println("Datos de clientes con tipo de pago en Mostrador");
                                            System.out.println("");
                                            for(w =0; w < clientes.size(); w++)
                                            {
                                    
                                              if((clientes.get(w).TipoCliente).equals("Mostrador")||(clientes.get(w).TipoCliente).equals("mostrador")||(clientes.get(w).TipoCliente).equals("MOSTRADOR"))
                                               {
                                                 ban2=true;
                                                 ban3=false;
                                               }
                                               
                                               if (ban2==true)
                                               {
                                                 System.out.println("Numero de Cliente: "+clientes.get(w).NumCliente); 
                                                 System.out.println("Nombre: " + clientes.get(w).nombre);
                                                 System.out.println("Edad: " + clientes.get(w).edad);
                                                 System.out.println("Dirección: " + clientes.get(w).direccion);
                                                 System.out.println("Email: " + clientes.get(w).email);
                                                 System.out.println("Telefono: " + clientes.get(w).telefono);
                                                 System.out.println("RFC: " + clientes.get(w).RFC);
                                                 System.out.println("Tipo de Pago del cliente: " +clientes.get(w).TipoCliente); 
                                                 ban2=false;
                                               }
                        
                                            }//Fin ciclo for
                                           if(ban3==true)
                                                {
                                                    System.out.println("No se encontraron clientes con este tipo de pago mostrador...");
                                                }
                                        }//Fin del if clientes a mostrador

                                                 
                                        if(TCliente.equals("Credito")||TCliente.equals("credito")||TCliente.equals("CREDITO"))
                                        {
                                            System.out.println("");
                                            System.out.println("Datos de clientes con tipo de pago en credito");
                                            System.out.println("");
                                            for(w =0; w < clientes.size(); w++)
                                           {
                                    
                                              if((clientes.get(w).TipoCliente).equals("Credito")||(clientes.get(w).TipoCliente).equals("credito")||(clientes.get(w).TipoCliente).equals("CREDITO"))
                                               {
                                                 ban2=true;
                                                 ban3=false;
                                               }
                                               
                                               if (ban2==true)
                                               {
                                                 System.out.println("Numero de Cliente: "+clientes.get(w).NumCliente); 
                                                 System.out.println("Nombre: " + clientes.get(w).nombre);
                                                 System.out.println("Edad: " + clientes.get(w).edad);
                                                 System.out.println("Dirección: " + clientes.get(w).direccion);
                                                 System.out.println("Email: " + clientes.get(w).email);
                                                 System.out.println("Telefono: " + clientes.get(w).telefono);
                                                 System.out.println("RFC: " + clientes.get(w).RFC);
                                                 System.out.println("Tipo de Pago del cliente: " +clientes.get(w).TipoCliente); 
                                                 ban2=false;
                                               }
                                       
                                           }//Fin ciclo for
                                           if(ban3==true)
                                                {
                                                    System.out.println("No se encontraron clientes con este tipo de pago descuento...");
                                                }
                                                     
                                        }    
                                    
                                       System.out.println("");
                                       System.out.println("¿Desea visualizar mas tipos de Cliente?(Si/No)");
                                       System.out.println("");
                                       respuesta2 = x.next();
                                    }while(respuesta2.equals("si")||respuesta2.equals("Si")||respuesta2.equals("SI"));
                                }
                                break;

                            case "7":
                                break;

                            default:
                        }
                    } while (!"7".equals(r1));
                break;

                case "2":
                 
                    do
                    {
                      
                     //submenu de Empleados
                       System.out.println("\n-----Que deseas hacer?-----");
                       System.out.println(" 1.- Anadir Empleado");
                       System.out.println(" 2.- Editar Empleado");
                       System.out.println(" 3.- Eliminar Empleado");
                       System.out.println(" 4.- Ver todos los Empleados");
                       System.out.println(" 5.- Ver 1 Empleado");
                       System.out.println(" 6.- Ver Por Tipos de Empleados");
                       System.out.println(" 7.- Regresar");
                       System.out.println();
                       System.out.print("Teclee Opcion: ");
                       r2 = x.next();
                    
                       switch (r2) 
                       {
                          case "1":
                              
                               do 
                                {
                                    Empleado datosEmp = new Empleado();//objeto creado para hacer uso de los setters
                                    x.nextLine();//aqui usamos nextLine en vez de Next para poder leer espacios
                                    //ponemos este x.nextLine para que se coma los \n
                                    System.out.print("Ingresar el ID del empleado: ");
                                    datosEmp.set_id(x.next());
                                    x.nextLine();
                                    System.out.print("Ingresar el nombre del empleado: ");
                                    datosEmp.setNom(x.nextLine());
                                    System.out.print("Ingresar la edad del empleado: ");
                                    datosEmp.setEdad(x.nextInt());
                                    x.nextLine();
                                    System.out.print("Ingresar la direccion del empleado: ");
                                    datosEmp.setDirecc(x.nextLine());
                                    System.out.print("Ingresar el email del empleado: ");
                                    datosEmp.setEmail(x.nextLine());
                                    System.out.print("Ingresar el numero telefonico del empleado: ");
                                    datosEmp.setTelefono(x.nextLine());
                                    System.out.print("Ingresar el RFC del empleado: ");
                                    datosEmp.set_RFC(x.nextLine());
                                    System.out.print("Ingresar el tipo de empleado(quincenal/mensual)");
                                    datosEmp.setTipoEmpleado(x.next());                                  
                                    arrayLEmp.add(datosEmp);
                                    System.out.println("");
                                    System.out.print("¿Deseas ingresar otro empleado?(si/no)");
                                    respuesta = x.next();
                                } while (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("Si") || respuesta.equals("sI"));//equals compara cadenas 
                           break;

                           case "2": //editar empleados
                                 System.out.println();
                                 
                                 if (arrayLEmp.isEmpty()) 
                                   {   
                                     //Validar si el arreglo
                                     System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                   } 
                                 else 
                                 {
                                    do {
                                         System.out.println("Ingrese el ID del empleado a editar");
                                         nid = x.next();
                                         System.out.println();        
                                         
                                         for (int j = 0; j < arrayLEmp.size(); j++) 
                                           {
                                               if (nid.equals(arrayLEmp.get(j).ID)) 
                                               { //se compara el dato guardado en num con los datos de ID en el arrayList
                                                  System.out.println("Empleado encontrado");
                                                  System.out.println("El ID del empleado no se puede modificar:");
                                                  System.out.println(arrayLEmp.get(j).ID);
                                                  System.out.print("Ingrese el Nombre del empleado: ");
                                                  x.nextLine();
                                                  arrayLEmp.get(j).setNom(x.nextLine());
                                                  System.out.print("\nIngrese la Edad del empleado: ");
                                                  arrayLEmp.get(j).setEdad(x.nextInt());
                                                  x.nextLine();
                                                  System.out.print("Ingrese la Direccion del empleado: ");
                                                  arrayLEmp.get(j).setDirecc(x.nextLine());
                                                  System.out.print("Ingrese el Email del empleado: ");
                                                  arrayLEmp.get(j).setEmail(x.next());
                                                  System.out.print("Ingrese el Numero de telefono del empleado: ");
                                                  arrayLEmp.get(j).setTelefono(x.next());
                                                  System.out.print("Ingrese el RFC del empleado: ");
                                                  arrayLEmp.get(j).set_RFC(x.next());
                                                  System.out.print("Ingrese el Tipo de contrato del empleado: ");
                                                  arrayLEmp.get(j).setTipoEmpleado(x.next());
                                                } 
                                               else 
                                                {
                                                  bne=true;
                                                }
                                            }
                                         if(bne==true)
                                         {
                                             System.out.println("Empleado No encontrado");
                                         }
                                            System.out.println("");
                                            System.out.print("¿Desea modifcar otro empleado ?(si/no)");
                                            respuesta = x.next();
                                        } while (nid.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para modifcar o no otro articulo
                                 }
                           break;

                           case "3": //eliminar empleados
                                 if (arrayLEmp.isEmpty()) 
                                  { //Validar si el arreglo tiene datos
                                     System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                  } 
                                  else 
                                  {
                                      do 
                                      {
                                     
                                         System.out.println("Ingrese el ID del empleado a eliminar");
                                         System.out.println("");
                                         nid = x.next();
                                        
                                          for (i = 0; i < arrayLEmp.size(); i++) 
                                           {//ciclo para verificar todos los objetos
                                              if (nid.equals(arrayLEmp.get(i).ID)) 
                                              { //comparación de id con nid
                                                 System.out.println("Empleado existente");
                                                 System.out.println("Esta seguro que desea eliminar este empleado?");
                                                 elimar = x.next();

                                                 if (elimar.equals("si") || elimar.equals("Si") || elimar.equals("SI") || elimar.equals("sI")) 
                                                  {//condición para ver o no otro articulo
                                                     arrayLEmp.remove(i);//eliminar el objeto con todos sus atributos
                                                     System.out.println("Empleado eliminado");
                                                     artel = false;
                                                  } 
                                                 else 
                                                  {
                                                     System.out.println("Empleado NO eliminado");
                                                  } 
                                              } 
                                              else 
                                              {
                                                 artel = true;
                                              }
                                           }
                                          
                                           if (artel == true) 
                                           {
                                             System.out.println("Empleado no encontrado");
                                           }
                                          System.out.println("");
                                          System.out.println("¿Desea eliminar otro empleado?(si/no)");
                                          respuesta = x.next();

                                        } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para eliminar o no otro articulo
                                    }
                           break;
                                                               
                           case "4": //ver todos los empleados
                                
                                System.out.println();
                                if (arrayLEmp.isEmpty()) 
                                  { //Validar si el arreglo tiene datos
                                     System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                  } 
                                else
                                {
                             
                                for (int j = 0; j < arrayLEmp.size(); j++) 
                                {
                                  System.out.println("______________________________________________________________________________");
                                  System.out.println("");
                                  System.out.println("EMPLEADO " + (j + 1));
                                  System.out.println("ID: " + arrayLEmp.get(j).ID);
                                  System.out.println("Nombre: " + arrayLEmp.get(j).nombre);
                                  System.out.println("Tipo de contrato: " + arrayLEmp.get(j).tipoEmpleado);
                                  System.out.println("Edad: " + arrayLEmp.get(j).edad);
                                  System.out.println("Dirección: " + arrayLEmp.get(j).direccion);
                                  System.out.println("Email: " + arrayLEmp.get(j).email);
                                  System.out.println("Telefono: " + arrayLEmp.get(j).telefono);
                                  System.out.println("RFC: " + arrayLEmp.get(j).RFC);
                                  System.out.println("");
                                } 
                                System.out.println("______________________________________________________________________________");
                                }
                           break;

                           case "5": //ver solo un empleado
                                if (arrayLEmp.isEmpty()) 
                                { //Validar si el arreglo tiene datos
                                   System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } 
                                else
                                {
                                   System.out.println();
                                   System.out.print("Ingresar el ID del empleado que desea ver: ");
                                   num = x.next();//lectura de datos                              
                               
                                   for (int j = 0; j < arrayLEmp.size(); j++) 
                                   {
                                       if (num.equals(arrayLEmp.get(j).ID)) 
                                       { //se compara el dato guardado en num con los datos de ID en el arrayList
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
                                       } 
                                        else 
                                        {
                                          System.out.println("empleado no encontrado");
                                        }
                                    }
                                }
                           break;

                           case "6": //ver por tipos de contrato
                              
                                      int w;
                                 if (arrayLEmp.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("No hay datos registradoas aun");
                                    System.out.println("Vaya a opcion 1 anadir");
                                }
                                else 
                                {
                                 do{
                                      
                                      System.out.println("");
                                      System.out.println("Escriba el tipo de empleados que desea visualizar: ");
                                      System.out.println("Tipos de empleados \n Quincenal \nMensual \n");
                                      System.out.print("Teclee la busqueda: ");
                                      tipeEmpleado=x.next();
                            
                                       if(tipeEmpleado.equals("Quincenal")||tipeEmpleado.equals("quincenal")||tipeEmpleado.equals("QUINCENAL"))
                                       {
                                          //Mostrar datos del tipo empleado quincenal 
                                          System.out.println("");
                                          System.out.println("Datos de empleados con contrato QUINCENAL");
                                          System.out.println("");
                                          for(w =0; w < arrayLEmp.size(); w++)
                                          {
                                    
                                              if((arrayLEmp.get(w).tipoEmpleado).equals("Quincenal")||(arrayLEmp.get(w).tipoEmpleado).equals("quincenal")||(arrayLEmp.get(w).tipoEmpleado).equals("QUINCENAL"))
                                               {
                                                 ban6=true;
                                                 ban7=false;
                                               }
                                               
                                               if (ban6==true)
                                               {
                                                    System.out.println("");
                                                    System.out.println("ID: " + arrayLEmp.get(w).ID);
                                                    System.out.println("Nombre: " + arrayLEmp.get(w).nombre);
                                                    System.out.println("Edad: " + arrayLEmp.get(w).edad);
                                                    System.out.println("Dirección: " + arrayLEmp.get(w).direccion);
                                                    System.out.println("Email: " + arrayLEmp.get(w).email);
                                                    System.out.println("Telefono: " + arrayLEmp.get(w).telefono);
                                                    System.out.println("RFC: " + arrayLEmp.get(w).RFC);
                                                    System.out.println("Tipo de Empleado: " + arrayLEmp.get(w).tipoEmpleado); 
                                                    ban6=false;
                                               }
                                               
                                       
                                           }//Fin ciclo for
                                           if(ban7==true)
                                            {
                                                System.out.println("No se encontraron empleados de tipo de pago QUINCENAL...");
                                            }

                                       }//Fin del if empleados quincenales
                                      

                                       if(tipeEmpleado.equals("Mensual")||tipeEmpleado.equals("mensual")||tipeEmpleado.equals("MENSUAL"))
                                        {
                                            //mostrar datos de empleados de tipo mensual
                                            System.out.println("");
                                            System.out.println("Datos de empleados con tipo de contrato MENSUAL");
                                            System.out.println("");
                                            for(w =0; w < arrayLEmp.size(); w++)
                                            {
                                    
                                              if((arrayLEmp.get(w).tipoEmpleado).equals("Mensual")||(arrayLEmp.get(w).tipoEmpleado).equals("mensual")||(arrayLEmp.get(w).tipoEmpleado).equals("MENSUAL"))
                                               {
                                                 ban6=true;
                                                 ban7=false;
                                               }
                                               
                                               if (ban6==true)
                                               {
                                                    System.out.println("");
                                                    System.out.println("ID: " + arrayLEmp.get(w).ID);
                                                    System.out.println("Nombre: " + arrayLEmp.get(w).nombre);
                                                    System.out.println("Edad: " + arrayLEmp.get(w).edad);
                                                    System.out.println("Dirección: " + arrayLEmp.get(w).direccion);
                                                    System.out.println("Email: " + arrayLEmp.get(w).email);
                                                    System.out.println("Telefono: " + arrayLEmp.get(w).telefono);
                                                    System.out.println("RFC: " + arrayLEmp.get(w).RFC);
                                                    System.out.println("Tipo de Empleado: " + arrayLEmp.get(w).tipoEmpleado); 
                                                    ban6=false;
                                               }
                                            }   
                                        }//Fin del if de empleados mensuales
                        
                                            
                                           if(ban7==true)
                                            {
                                                System.out.println("No se encontraron empleados de tipo de pago MENSUAL...");
                                            }
                                           
                                            System.out.println("");
                                            System.out.println("¿Desea visualizar mas empleados?(Si/No)");
                                            System.out.println("");
                                            respuesta2 = x.next();
                                        }while(respuesta2.equals("si")||respuesta2.equals("Si")||respuesta2.equals("SI"));
                                    }//Fin del if 
                           break;                            

                           case "7": //salida
                               System.out.println("");
                           break;
                            
                           default:

                        }
                    } while (!"7".equals(r2));
            
                break;//Regresa al submenu

                case "3":
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
                        System.out.println();
                        System.out.print("Teclee Opcion: ");
                        r3 = x.next();
                        switch (r3) {

                            case "1":
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

                            case "2":
                                if (OBH.isEmpty()) 
                                { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } 
                                else 
                                {
                                    do 
                                    {
                                        //Edicion de herramienta
                                        System.out.println("Ingrese el código de identificación dela heramienta a modificar");
                                        nid = x.next();
                                        for (i = 0; i < OBH.size(); i++) 
                                        {
                                            if (nid.equals(OBH.get(i).id)) 
                                            {
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

                            case "3": //eliminación de herramientas  
                                if (OBH.isEmpty()) 
                                { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } else 
                                {
                                    do 
                                    {
                                        System.out.println();
                                        System.out.println("Ingrese el código de identificación de la heramienta a eliminar");
                                        nid = x.next();
                                        for (i = 0; i < OBH.size(); i++) {//ciclo para verificar todos los objetos
                                            if (nid.equals(OBH.get(i).id)) 
                                            {//comparación de id con nid
                                                System.out.println("Articulo encontrado");
                                                System.out.println("Esta seguro que desea elimiar este articulo");
                                                elimar = x.next();

                                                if (elimar.equals("si") || elimar.equals("Si") || elimar.equals("SI") || elimar.equals("sI")) {//condición para ver o no otro articulo
                                                    OBH.remove(i);//eliminar el objeto con todos sus atributos
                                                    System.out.println("Articulo eliminado");
                                                    artel = false;
                                                } else {
                                                    System.out.println("Articulo NO eliminado");
                                                }
                                            } 
                                            else 
                                            {
                                                artel = true;
                                            }
                                        }
                                        if (artel == true) {
                                            System.out.println("Articulo no encontrado");
                                        }

                                        System.out.println("¿Desea eliminar otra herramienta?(si/no)");
                                        respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para eliminar o no otro articulo
                                }
                                break;

                            case "4"://impresión de herramientas
                                if (OBH.isEmpty()) 
                                { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } 
                                else 
                                {
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

                            case "5"://busqueda de 1 herramienta .
                                if (OBH.isEmpty()) 
                                { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                } 
                                else 
                                {
                                    do 
                                    {
                                        System.out.println("Ingrese el codigo de identificacion de la herramienta que desea ver: ");
                                        nid = x.next();
                                          try 
                                           {//Inicio de la excepcion 
                                               for (i = 0; i < OBH.size(); i++)
                                                {//ciclo para verificar todos los objetos
                                                   if ((OBH.get(i).id).equals(nid)) 
                                                   {//comparación de id con nid
                                                      ind = true;
                                                      System.out.println("Articulo encontrado");
                                                      break;
                                                   }
                                                }

                                                if (ind == true)
                                                {////comparación de nid con su valor de salida
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
                                            System.out.println("\nArticulo no encontrado.");}

                                        System.out.println("\n¿Deseas ver otro articulo?(si/no)");
                                        respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para ver o no otro articulo
                                }
                                break; 

                            case "6": //busqueda de herramientas por tipo 
                                if (OBH.isEmpty()) 
                                { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1.");
                                }
                                else 
                                {
                                    do {
                                        System.out.println("Ingrese el tipo de herramientas que desea ver ");
                                        tipo = x.next();
                                        try 
                                        {//Inicio de la excepcion 
                                            for (i = 0; i < OBH.size(); i++) {//ciclo para verificar todos los objetos
                                                if (tipo.equals(OBH.get(i).tipo)) 
                                                {//comparación del tipo requerido con el registrado
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
                                            System.out.println("\nTipo no encontrado."); }
                                        System.out.println("¿Desea buscar otro tipo de herramientas?");
                                        respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para ver o no otro articulo
                                }

                                break;

                            case "7":
                                    

                                break;
                                
                            default:
                        }
                    } while (!"7".equals(r3));
                    break;

                case "4":
                    //submenu de Notas
                    do{
                        System.out.println("\n-----Que deseas hacer?-----");
                        System.out.println(" 1.- Nueva Nota");
                        System.out.println(" 2.- Ver Todas Las Notas");
                        System.out.println(" 3.- Regresar");
                        System.out.println();
                        System.out.print("Teclee Opcion: ");
                        r4 = x.next();
                        
                        switch (r4) 
                        {
                            case "1":
                                
                                 do{
                                 if (clientes.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("No hay datos registradoas aun");
                                    System.out.println("Vaya a opcion 1 anadir");
                                }
                                else 
                                {
                                  
                                       System.out.println();
                                       System.out.println("Ingrese el número de cliente: ");
                                       Ncliente=x.next(); 
                                       Nota llenadonota1 = new Nota();
                                       for( v =0; v < clientes.size(); v++)
                                       {
                                          if((clientes.get(v).NumCliente).equals(Ncliente))
                                           {
                                              ban4 = true; //Cliente encontrado
                                              System.out.println("Cliente encontrado");
                                              System.out.println("");
                                              break;
                                           }
                                       }
                                           if(ban4 == true)
                                            {
                                              System.out.println("Ingrese la fecha de hoy");
                                              x.nextLine();
                                              llenadonota1.setfecha(x.nextLine());
                                              System.out.println("Ingrese el Numero de Nota");
                                              llenadonota1.setnumnota(x.next());
                                              llenadonota1.setNumCliente(clientes.get(v).NumCliente);
                                              llenadonota1.setTipoCliente(clientes.get(v).TipoCliente);
                                              lisNota.add(llenadonota1);
                                            }
                                         
                                          if(ban4 ==false)
                                            {
                                              System.out.println("Cliente no localizado...");
                                            }
                                    }
                                    }while (ban4!=true);
                                 
                                 g=0;
                                 lleva=0;
                                 Nota totalnota = new Nota();
                                 do{  
                                    //objeto que servira como el molde para el llenado de la lista
                                   
                                    if (OBH.isEmpty()) 
                                    { //Validar si el arreglo tiene datos
                                        System.out.println("\nNo se han ingresado datos sobre articulos favor de ir a la opcion 1.");
                                    } 
                                    
                                    else 
                                    {   
                                        
                                           Nota llenadonota= new Nota();
                                         
                                           System.out.println("\nIngrese el codigo de identificacion del articulo que desea agregar: ");
                                           nid2 = x.next();
                                           //Inicio de la excepcion 
                                               for ( o = 0; o < OBH.size(); o++) 
                                               {//ciclo para verificar todos los objetos
                                                  if ((OBH.get(o).id).equals(nid2)) 
                                                   {//comparación de id con nid
                                                      ind2 = true;
                                                      System.out.println("Articulo encontrado");
                                                      break;
                                                   }
                                                }   

                                                if (ind2 == true) 
                                                {////comparación de nid con su valor de salida
                                                    
                                                   llenadonota.setId(OBH.get(o).id);
                                                   llenadonota.setArticulo(OBH.get(o).articulo);
                                                   llenadonota.setTipo(OBH.get(o).tipo);
                                                   llenadonota.setMarca(OBH.get(o).marca);
                                                   llenadonota.setUnidades(OBH.get(o).unidades);
                                                   llenadonota.setCantidad(OBH.get(o).cantidad);
                                                   llenadonota.setGarantia(OBH.get(o).garantia);
                                                   llenadonota.setPrecio(OBH.get(o).precio);
                                                   System.out.println("Ingrese la cantidad que lleva");
                                                   llenadonota.setcantidadc(x.nextDouble());
                                                   sub1=OBH.get(o).precio * llenadonota.getcantidadc();
                                                   llenadonota.setsubtotal(sub1);
                                                   lleva=lleva+sub1;
                                                   llenadonota.setsumasubtotal(lleva);
                                                   if(lisNota.get(v).TipoCliente.equals("Descuento")||lisNota.get(v).TipoCliente.equals("descuento")||lisNota.get(v).TipoCliente.equals("DESCUENTO"))
                                                   {
                                                       descuento=llenadonota.getsumasubtotal()*0.15;
                                                       total=llenadonota.getsumasubtotal() - descuento;
                                                       totalnota.settotal(total);
                                                   }
                                                   else
                                                   {
                                                   if(lisNota.get(v).TipoCliente.equals("Credito")||lisNota.get(v).TipoCliente.equals("credito")||lisNota.get(v).TipoCliente.equals("CREDITO"))
                                                   {
                                                       if(llenadonota.getcantidadc()<=10)
                                                       {
                                                         total=llenadonota.getsumasubtotal()/3;
                                                         totalnota.settotal(total);
                                                       }
                                                       else
                                                       {
                                                           if(llenadonota.getcantidadc()>10 && llenadonota.getcantidadc()<=20)
                                                           {
                                                             total=llenadonota.getsumasubtotal()/6;
                                                             totalnota.settotal(total);
                                                             
                                                           }
                                                           else
                                                           {
                                                                if(llenadonota.getcantidadc()>20)
                                                                {
                                                                   total=llenadonota.getsumasubtotal()/12;
                                                                   totalnota.settotal(total);
                                                                   
                                                                }
                                                           }
                                                       }
                                                   }
                                                   else
                                                   {
                                                       total=llenadonota.getsumasubtotal();
                                                       totalnota.settotal(total);
                                                   }
                                                   }
                                                   
                                                   listaNota.add(new ArrayList<>());
                                                   listaNota.get(t).add(g,llenadonota);
                                                   ventas++;
                                                   g++;
                                                }
                                                else 
                                                {
                                                  System.out.println("\nArticulo no encontrado.");
                                                }
                                                listNotatotal.add(totalnota);
                                      }
                                       
                                        System.out.println("\n¿Desea agregar otro articulo?(si/no)");
                                         respuesta = x.next();
                                    } while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI"));//condición para ver o no otro articulo
                                    t=t+1;
                                    
                                    
                                   do{
                                 if (arrayLEmp.isEmpty())
                                {
                                    System.out.println();
                                    System.out.println("No hay datos registradoas aun");
                                    System.out.println("Vaya a opcion 1 anadir");
                                }
                                else 
                                {
                                       System.out.println();
                                       System.out.print("Ingresar el ID del empleado: ");
                                       num = x.next();//lectura de datos 
                                       Nota llenadonota2 = new Nota();
                                
                                      for (u = 0; u < arrayLEmp.size(); u++) 
                                      {
                                             if(num.equals(arrayLEmp.get(u).ID)) 
                                           { //se compara el dato guardado en num con los datos de ID en el arrayList
                                              ban5 = true; //Cliente encontrado
                                              System.out.println("empleado encontrado");
                                              System.out.println("");
                                              break;
                                           }
                                       }
                                          if(ban5==true)
                                           {
                                             llenadonota2.setidempl(arrayLEmp.get(u).ID);
                                             llenadonota2.setNomemp(arrayLEmp.get(u).nombre);
                                             listNota.add(llenadonota2);
                                           }
                                          if(ban5 ==false)
                                            {
                                              System.out.println("empleado no encontrado");
                                            }
                                    }

                                    }while (ban5!=true);

                                break;
                             
                            case "2":
                               
                                if (listaNota.isEmpty()) 
                                { //Validar si el arreglo tiene datos
                                    System.out.println("\nNo se han ingresado datos favor de ir a la opcion 1 nueva nota.");
                                } 
                                else
                                {
                                    try
                                    {
                                       for (p = 0;p < lisNota.size(); p++)
                                        {//ciclo para imprimir los datos de 2 de las 3 listas usadas para nota
                                            //usamos ciclos for anidados ya que manejamos arraylist bidimensionales()
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("************************************************");
                                            System.out.println("Num de Nota: "+ lisNota.get(p).numnota);
                                            System.out.println("Fecha: "+ lisNota.get(p).fecha);
                                            System.out.println("Num de Cliente: " + lisNota.get(p).NumCliente); 
                                            System.out.println("Tipo de Pago: " + lisNota.get(p).TipoCliente); 
                                    
                                            for (i = 0; i < listaNota.get(p).size(); i++) 
                                            {//ciclo para imprimir todos los objetos del 2do arraylist(bidimensional)
                                             
                                              System.out.println("________________________________________");
                                              System.out.println("Articulo: " + listaNota.get(p).get(i).articulo);
                                              System.out.println("Tipo: " + listaNota.get(p).get(i).tipo);
                                              System.out.println("Codigo de identificación: " + listaNota.get(p).get(i).id);
                                              System.out.println("Marca: " + listaNota.get(p).get(i).marca);
                                              System.out.println("Unidad: " + listaNota.get(p).get(i).unidades);
                                              System.out.println("Cantidad: " + listaNota.get(p).get(i).cantidad + " " + listaNota.get(p).get(i).unidades);
                                              System.out.println("Garantia: " + listaNota.get(p).get(i).garantia);
                                              System.out.println("Precio: $" + listaNota.get(p).get(i).precio);
                                              System.out.println("Cant de Venta" + listaNota.get(p).get(i).cantidade);
                                              System.out.println("Sub total de articulo: " + listaNota.get(p).get(i).subtotal);
                                              System.out.println("Suma Sub Total: "+ listaNota.get(p).get(i).suma);
                                            }
                                           System.out.println("________________________________________");   
                                           if(p==0)
                                           {
                                              System.out.println("Gran Total: "+   listNotatotal.get(p).total);
                                           }
                                           else
                                           {
                                               System.out.println("Gran Total: "+   listNotatotal.get(p+1).total);
                                           }
                                           System.out.println("Ud fue antendido por: "+ listNota.get(p).Nomemp);
                                           System.out.println("Con Id: "+ listNota.get(p).idemp );
                                           System.out.println("************************************************");
                                        }
                                    } catch (Exception e) {}
                                }
                                break;           
                            
                            case "3":
                                break;
                                
                            default:
                        }
                    
                    }while(!"3".equals(r4));
                    
                    break;

                case "5":
                    
                    do{
                    //submenu de Estadisticas 
                    System.out.println("\n-----Que deseas hacer?-----");
                    System.out.println(" 1.- Ver Articulo Mas Vendido");
                    System.out.println(" 2.- Ver Articulo Menos Vendido");
                    System.out.println(" 3.- Ver Total de Articulos Vendidos");
                    System.out.println(" 4-. Regresar");
                    System.out.println();
                    System.out.print("Teclee Opcion: ");
                    r5 = x.next();
                      
                    switch (r5) 
                    {
                        case "1"://se imprimen los árticulos más vendidos
                          if (OBH.isEmpty())
                            {//validar si lalista esta vacia
                             System.out.println("no hay datos ingresados");
                            }
                            else
                            {
                               max = OBH.get(0).cantidad;
                               
                                for( ei=1;ei<OBH.size();ei++)
                                {
                                   if (OBH.get(ei).cantidad>max)
                                   {
                                       max = OBH.get(ei).cantidad;
                                   }
                                }
                           
                           for(ez=0;ez<OBH.size();ez++)
                           {
                              if(OBH.get(ez).cantidad == max)//en el ciclo, se compara si la cantidd es menor
                               {
                                  //impresión de articulos
                                  System.out.println("Articulo menos vendido");
                                  System.out.println(""+OBH.get(ez).articulo+" "+ OBH.get(ez).tipo);
                                  System.out.println(""+OBH.get(ez).marca);
                                  System.out.println(""+OBH.get(ez).precio);
                               }
                           }
                            }
                            break;
                            
                        case "2"://se imprimen los árticulos menos vendidos  
                            if (OBH.isEmpty())
                            {//validar si lalista esta vacia
                             System.out.println("no hay datos ingresados");
                            }
                            else
                            {
                               min = OBH.get(0).cantidad;
                               
                                for( ei=1;ei<OBH.size();ei++)
                                {
                                   if (OBH.get(ei).cantidad<min)
                                   {
                                       min = OBH.get(ei).cantidad;
                                   }
                                }
                           
                           for(ez=0;ez<OBH.size();ez++)
                           {
                              if(OBH.get(ez).cantidad == min)//en el ciclo, se compara si la cantidd es menor
                               {
                                  //impresión de articulos
                                  System.out.println("Articulo menos vendido");
                                  System.out.println(""+OBH.get(ez).articulo+" "+ OBH.get(ez).tipo);
                                  System.out.println(""+OBH.get(ez).marca);
                                  System.out.println(""+OBH.get(ez).precio);
                               }
                           }
                            }
                            break;
                        case "3"://se imprimen el total de ventas
                            System.out.println("Se han vendido un total de: " + ventas);
                            break;
                        case "4":
                            System.out.println("");
                            break;
                    }
                    }while(!"4".equals(r5));
                    break;

                case "6":
                    System.out.println("");
                    System.out.println("Gracias por usar nustro sistema, saludos cordiales de parte de todo el equipo de desarrollo!");
                    System.out.println("");
                    break;
                    
                default:
            }
        } while (!"6".equals(res));
        
    }
}

