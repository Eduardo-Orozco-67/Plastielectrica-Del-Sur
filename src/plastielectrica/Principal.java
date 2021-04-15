
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
     
     //jeanete
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
        
         //emilia-------------------------------------------------------
        Scanner ent = new Scanner(System.in);//by:emilia
        
        //Arreglo de objetos - Interruptor
        Herramientas Interruptor[] = new Herramientas[2];        
        for(i=0; i < Interruptor.length; i++){            
            Interruptor[i] = new Herramientas();
            System.out.println("_______________________________");
            System.out.println("Interruptor: " + (i+1));            
            Interruptor[i].PedirDatosHerramientas();
            Interruptor[i].MostrarDatosHerramientas();
        }
        
        //Arreglo de objetos - Contacto
        Herramientas Contacto[] = new Herramientas[2];        
        for(i=0; i < Contacto.length; i++){
            Contacto[i] = new Herramientas(); 
            System.out.println("_______________________________");
            System.out.println("Contacto: " + (i+1));
            Contacto[i].PedirDatosHerramientas();
            Contacto[i].MostrarDatosHerramientas();
        }
        
        //Arreglo de objetos - Cable
        Herramientas Cable[] = new Herramientas[3]; 
        String Calibre; //Añadí el calibre del cable, solo se deben revisar las impresiones del System.        
        for(i=0; i < Cable.length; i++){
            Cable[i] = new Herramientas(); 
            System.out.println("_______________________________");
            System.out.println("Cable: " + (i+1));
            Cable[i].PedirDatosHerramientas();
            System.out.println("dame el calibre del Articulo: ");//Solicitar el calibre 
            Calibre = ent.next();
            Cable[i].MostrarDatosHerramientas();
            System.out.println("Calibre: " + Calibre);            
        }
        
        //Arreglo de objetos - Foco
        Herramientas Foco[] = new Herramientas[2];        
        for(i=0; i < Contacto.length; i++){
            Foco[i] = new Herramientas(); 
            System.out.println("_______________________________");
            System.out.println("Foco: " + (i+1));                                 
            Foco[i].PedirDatosHerramientas();
            Foco[i].MostrarDatosHerramientas();
        }
        
        //Objeto socket
        System.out.println("_____________________________________");
        System.out.println("Socket");
        Herramientas socket = new Herramientas();
        socket.PedirDatosHerramientas();
        socket.MostrarDatosHerramientas();
        
        //Objeto lámpara incandescente
        System.out.println("_____________________________________");
        System.out.println("Lámpara incandescente");
        Herramientas lampara_in = new Herramientas();
        lampara_in.PedirDatosHerramientas();
        lampara_in.MostrarDatosHerramientas();
        
        //Objeto Medidores
        System.out.println("_____________________________________");
        System.out.println("Medidor");
        Herramientas Medidores = new Herramientas();
        Medidores.PedirDatosHerramientas();
        Medidores.MostrarDatosHerramientas();
        
        //Objeto Chalupas
        System.out.println("_____________________________________");
        System.out.println("Chalupa");
        Herramientas Chalupas = new Herramientas();
        Chalupas.PedirDatosHerramientas();
        Chalupas.MostrarDatosHerramientas();
        
        //Objeto cajas de registro
        System.out.println("_____________________________________");
        System.out.println("Caja de registro");
        Herramientas Cajas_Regis = new Herramientas();
        Cajas_Regis.PedirDatosHerramientas();
        Cajas_Regis.MostrarDatosHerramientas();
        
        //Arreglo de objetos - Extensiones
        Herramientas Extensiones[] = new Herramientas[2];        
        for(i=0; i < Extensiones.length; i++){
            Extensiones[i] = new Herramientas(); 
            System.out.println("_______________________________");
            System.out.println("Extension: " + (i+1));                                 
            Extensiones[i].PedirDatosHerramientas();
            Extensiones[i].MostrarDatosHerramientas();            
        }
        //javier-------------------------------------------------------------------
        Herramientas transformadores = new Herramientas();
        transformadores.PedirDatosHerramientas();
        transformadores.MostrarDatosHerramientas();
        
        Herramientas mufa = new Herramientas();
        mufa.PedirDatosHerramientas();
        mufa.MostrarDatosHerramientas();
        
        Herramientas lamparas_tubo = new Herramientas();
        lamparas_tubo.PedirDatosHerramientas();
        lamparas_tubo.MostrarDatosHerramientas();
        
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
