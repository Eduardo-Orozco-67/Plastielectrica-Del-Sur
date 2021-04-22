package plastielectrica;

import java.util.Scanner;

public class Principal {
Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        
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
        
        
        //llamada a metodos de empleado
        Empleado emp1 = new Empleado();//objeto
        
        emp1.empQuincenal();
        emp1.empMensual();
        emp1.mostEmpQuincenal();
        emp1.mostEmpMensual();
        emp1.aguinaldoQuin();
        emp1.aguinaldoMen();
       
       
    }  
}
   
