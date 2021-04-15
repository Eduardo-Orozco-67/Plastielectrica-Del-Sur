
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
        obherramientas();
        
    }
  public static void obherramientas(){
     int i;
     
       Herramientas varillas = new Herramientas();
        varillas.PedirDatosHerramientas();
        varillas.MostrarDatosHerramientas();
        
        Herramientas pilas = new Herramientas();
        pilas.PedirDatosHerramientas();
        pilas.MostrarDatosHerramientas();
        
        Herramientas reflectores = new Herramientas();
        reflectores.PedirDatosHerramientas();
        reflectores.MostrarDatosHerramientas();
        
        Herramientas multicontacto = new Herramientas();
        multicontacto.PedirDatosHerramientas();
        multicontacto.MostrarDatosHerramientas();
        
        //arreglo para pinzas
      Herramientas Pinzas[] = new Herramientas[4];
        
        for(i=0; i < Pinzas.length; i++){
            System.out.println("_____________________________________");
            System.out.println("articulo: "+(i+1));
            Pinzas[i] = new Herramientas();
            
            //System.out.println("Interruptor: " + (i+1));            
            Pinzas[i].PedirDatosHerramientas();
            Pinzas[i].MostrarDatosHerramientas();
        }
        //areglo desarmadores
        Herramientas desarmador[] = new Herramientas[4];
        
        for(i=0; i < desarmador.length; i++){
            System.out.println("_____________________________________");
            System.out.println("articulo: "+(i+1));
            desarmador[i] = new Herramientas();
            
            //System.out.println("Interruptor: " + (i+1));            
            desarmador[i].PedirDatosHerramientas();
            desarmador[i].MostrarDatosHerramientas();
        }
        //arreglo prueba de corrientes
         Herramientas pcor[] = new Herramientas[3];
        
        for(i=0; i < pcor.length; i++){
            System.out.println("_____________________________________");
            System.out.println("articulo: "+(i+1));
            pcor[i] = new Herramientas();
            
            //System.out.println("Interruptor: " + (i+1));            
            pcor[i].PedirDatosHerramientas();
            pcor[i].MostrarDatosHerramientas();
            
        }
//        28.	 manguera eléctrica
        Herramientas mele = new Herramientas();
        mele.PedirDatosHerramientas();
        mele.MostrarDatosHerramientas();
//29.	 adaptadores
        Herramientas adaptadores = new Herramientas();
        adaptadores.PedirDatosHerramientas();
        adaptadores.MostrarDatosHerramientas();
//30.	 reguladores
        Herramientas reg = new Herramientas();
        reg.PedirDatosHerramientas();
        reg.MostrarDatosHerramientas();
//31.	 fusibles 
        Herramientas fus = new Herramientas();
        fus.PedirDatosHerramientas();
        fus.MostrarDatosHerramientas();

              
                      
  }
}
