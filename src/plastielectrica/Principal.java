package plastielectrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String cant;
        int ban = 0;
        Scanner x1 = new Scanner(System.in); 
        
        System.out.println("*************************************");
        System.out.println("*****\tPlastielectrica Del Sur\t*****");
        System.out.println("*************************************");
        System.out.println("Venta en todo tipo de materiales electricos!!\n");
        System.out.print("Pregunte\n\tPor\n\t\tLo\n\t\t\tQue\n\t\t\t\tNecesite!!\n\n");
        System.out.println("Email de la empresa: plastielec01@gmail.com\n");
        System.out.println("Numero telefonico de la empresa: 9624587596\n");
        System.out.println("Horario de servicio: 8:00 AM - 4:00 PM, de Lunes a Sabado!");
        System.out.println("Somos tu mejor opcion");
        
        Herramientas varillas = new Herramientas();
        varillas.PedirDatosHerramientas();
        varillas.MostrarDatosHerramientas();
        
        Herramientas pilas = new Herramientas();
        pilas.PedirDatosHerramientas();
        pilas.MostrarDatosHerramientas();
        
        Herramientas pastillas = new Herramientas();
        pastillas.PedirDatosHerramientas();
        pastillas.MostrarDatosHerramientas();
        
        Herramientas resistencias = new Herramientas();
        resistencias.PedirDatosHerramientas();
        resistencias.MostrarDatosHerramientas();
        
        Herramientas guantes_aislantes = new Herramientas();
        guantes_aislantes.PedirDatosHerramientas();
        guantes_aislantes.MostrarDatosHerramientas();
        
        Herramientas clavijas = new Herramientas();
        clavijas.PedirDatosHerramientas();
        clavijas.PedirDatosHerramientas();
        
        Herramientas grapas =new Herramientas();
        grapas.PedirDatosHerramientas();
        grapas.MostrarDatosHerramientas();
        
        Herramientas canaletas = new Herramientas();
        canaletas.PedirDatosHerramientas();
        canaletas.MostrarDatosHerramientas();
        
        Herramientas cinta_ais = new Herramientas();
        cinta_ais.PedirDatosHerramientas();
        cinta_ais.MostrarDatosHerramientas();
        
        Herramientas transformadores = new Herramientas();
        transformadores.PedirDatosHerramientas();
        transformadores.MostrarDatosHerramientas();
        
        Herramientas mufa = new Herramientas();
        mufa.PedirDatosHerramientas();
        mufa.MostrarDatosHerramientas();
        
        Herramientas lamparas_tubo = new Herramientas();
        lamparas_tubo.PedirDatosHerramientas();
        lamparas_tubo.MostrarDatosHerramientas();
        
  
        //implementacion de los ArrayList para el empleado quincenal
        int a,n;
        ArrayList<Empleado> empQ = new ArrayList<Empleado>();
        String des;
        Empleado emp1 = new Empleado();
        //ALTA DE EMPLEADOS
       do{
           Empleado emp = new Empleado();
           //System.out.println("EMPLEADO No: " + (z+1));
           System.out.println("Dame su nombre:  ");
           emp.nombre = x1.next();
           System.out.println("Dame el ID: ");
           emp.ID = x1.next();
           System.out.println("Dame su direccion: ");
           emp.direccion = x1.next();
           System.out.println("Dame su numero de telefono: ");
           emp.telefono = x1.next();
           System.out.println("Dame su edad: ");
           emp.edad = x1.nextInt();
           System.out.println("Dame su email: ");
           emp.email = x1.next();
           System.out.println("Ingresar el sueldo del empleado: ");
           emp.sueldo = x1.nextFloat();
           System.out.print("Ingresar las faltas acumuladas del empleado : ");
           emp.faltas = x1.nextInt();
           System.out.println("Ingresar los retardos del empleado: ");
           emp.retardos = x1.nextInt();
           System.out.println("Ingresar el total de HT: ");
           emp.HT = x1.nextInt();
           System.out.println("Ingresar el porcentaje el cual se le hace al empleado para pagar el seguro social: ");
           emp.SS = x1.nextInt();
           System.out.println("\n");
           empQ.add(emp);
           System.out.println("Deseas agregar otro empleado? \n SI o NO");
           des=x1.next();
       }while(des.equals("SI"));
       
        //IMPRESIÓN DE DATOS DE EMPLEADOS
        for ( n = 0; n < empQ.size(); n++) {
            System.out.println("Nombre: " + empQ.get(n).nombre + "\t" 
                    + "ID: " + empQ.get(n).ID + "\t"
                    +"Dirección: " + empQ.get(n).direccion + "\t" 
                    +"Telefono: " + empQ.get(n).telefono + "\t" 
                    +"Edad: " + empQ.get(n).edad + "\t" 
                    +"Email: " + empQ.get(n).email + "\t" 
                    +"Sueldo: " + empQ.get(n).sueldo + "\t" 
                    +"Faltas: " + empQ.get(n).faltas + "\t" 
                    +"Retardos" + empQ.get(n).retardos + "\t" 
                    +"HT: " + empQ.get(n).HT +"\t" 
                    +"SS: " + empQ.get(n).SS);
        }
        
        //BUSQUEDA DE EMPLEADOS
        System.out.println("dame el ID: ");
        cant = x1.next();
        for (n = 0; n < empQ.size(); n++) {
            if ((empQ.get(n).ID).equals(cant)){
                ban = 1;
                break;
            }
        }
        if (ban == 1) {
            System.out.println("Nombre: " + empQ.get(n).nombre + "\t" 
            + "ID: " + empQ.get(n).ID + "\t"
            +"Dirección: " + empQ.get(n).direccion + "\t" 
            +"Telefono: " + empQ.get(n).telefono + "\t" 
            +"Edad: " + empQ.get(n).edad + "\t" 
            +"Email: " + empQ.get(n).email + "\t" 
            +"Sueldo: " + empQ.get(n).sueldo + "\t" 
            +"Faltas: " + empQ.get(n).faltas + "\t" 
            +"Retardos" + empQ.get(n).retardos + "\t" 
            +"HT: " + empQ.get(n).HT +"\t" 
            +"SS: " + empQ.get(n).SS);   
        }else{
            System.out.println("Vendedor no encontrado:(");
        }
    }//main  
    }//class