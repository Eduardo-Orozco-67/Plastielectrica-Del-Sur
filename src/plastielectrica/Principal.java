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

    public static void obherramientas() {
        int i;
        //emilia-------------------------------------------------------
        Scanner ent = new Scanner(System.in);//by:emilia

        //Arreglo de objetos - Interruptor
        Herramientas Interruptor[] = new Herramientas[2];
        for (i = 0; i < Interruptor.length; i++) {
            Interruptor[i] = new Herramientas();
            System.out.println("_______________________________");
            System.out.println("Interruptor: " + (i + 1));
            Interruptor[i].PedirDatosHerramientas();
            Interruptor[i].MostrarDatosHerramientas();
        }

        //Arreglo de objetos - Contacto
        Herramientas Contacto[] = new Herramientas[2];
        for (i = 0; i < Contacto.length; i++) {
            Contacto[i] = new Herramientas();
            System.out.println("_______________________________");
            System.out.println("Contacto: " + (i + 1));
            Contacto[i].PedirDatosHerramientas();
            Contacto[i].MostrarDatosHerramientas();
        }

        //Arreglo de objetos - Cable
        Herramientas Cable[] = new Herramientas[3];
        String Calibre; //Añadí el calibre del cable, solo se deben revisar las impresiones del System.        
        for (i = 0; i < Cable.length; i++) {
            Cable[i] = new Herramientas();
            System.out.println("_______________________________");
            System.out.println("Cable: " + (i + 1));
            Cable[i].PedirDatosHerramientas();
            System.out.println("dame el calibre del Articulo: ");//Solicitar el calibre 
            Calibre = ent.next();
            Cable[i].MostrarDatosHerramientas();
            System.out.println("Calibre: " + Calibre);
        }

        //Arreglo de objetos - Foco
        Herramientas Foco[] = new Herramientas[2];
        for (i = 0; i < Contacto.length; i++) {
            Foco[i] = new Herramientas();
            System.out.println("_______________________________");
            System.out.println("Foco: " + (i + 1));
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
        for (i = 0; i < Extensiones.length; i++) {
            Extensiones[i] = new Herramientas();
            System.out.println("_______________________________");
            System.out.println("Extension: " + (i + 1));
            Extensiones[i].PedirDatosHerramientas();
            Extensiones[i].MostrarDatosHerramientas();
        }

        //Jeannete------------------------        
        //Objeto pastillas
        System.out.println("_____________________________________");
        System.out.println("Pastillas");
        Herramientas pastillas = new Herramientas();
        pastillas.PedirDatosHerramientas();
        pastillas.MostrarDatosHerramientas();

        //Objeto resistencias 
        System.out.println("_____________________________________");
        System.out.println("Resistencias");
        Herramientas resistencias = new Herramientas();
        resistencias.PedirDatosHerramientas();
        resistencias.MostrarDatosHerramientas();

        //Objeto Guantes_aislantes 
        System.out.println("_____________________________________");
        System.out.println("Guantes aislantes ");
        Herramientas guantes_aislantes = new Herramientas();
        guantes_aislantes.PedirDatosHerramientas();
        guantes_aislantes.MostrarDatosHerramientas();

        //Objeto clavijas 
        System.out.println("_____________________________________");
        System.out.println("Clavijas");
        Herramientas clavijas = new Herramientas();
        clavijas.PedirDatosHerramientas();
        clavijas.PedirDatosHerramientas();

        //Objeto grapas
        System.out.println("_____________________________________");
        System.out.println("Grapas");
        Herramientas grapas = new Herramientas();
        grapas.PedirDatosHerramientas();
        grapas.MostrarDatosHerramientas();

        //Objeto canaletas 
        System.out.println("_____________________________________");
        System.out.println("Canaletas");
        Herramientas canaletas = new Herramientas();
        canaletas.PedirDatosHerramientas();
        canaletas.MostrarDatosHerramientas();

        //Objeto cinta aislante
        System.out.println("_____________________________________");
        System.out.println("Cinta aislante");
        Herramientas cinta_ais = new Herramientas();
        cinta_ais.PedirDatosHerramientas();
        cinta_ais.MostrarDatosHerramientas();

        //Objeto transformadores
        System.out.println("_____________________________________");
        System.out.println("Transformadores");
        Herramientas transformadores = new Herramientas();
        transformadores.PedirDatosHerramientas();
        transformadores.MostrarDatosHerramientas();

        //Objeto mufa
        System.out.println("_____________________________________");
        System.out.println("Mufa");
        Herramientas mufa = new Herramientas();
        mufa.PedirDatosHerramientas();
        mufa.MostrarDatosHerramientas();

        //Objeto lamparas DEtubo
        System.out.println("_____________________________________");
        System.out.println("Lamparas de tubo");
        Herramientas lamparas_tubo = new Herramientas();
        lamparas_tubo.PedirDatosHerramientas();
        lamparas_tubo.MostrarDatosHerramientas();

        //javier-------------------------------------------------------------------
        //Objeto varillas 
        System.out.println("_____________________________________");
        System.out.println("Varillas");
        Herramientas varillas = new Herramientas();
        varillas.PedirDatosHerramientas();
        varillas.MostrarDatosHerramientas();

        //Objeto pilas
        System.out.println("_____________________________________");
        System.out.println("Pilas");
        Herramientas pilas = new Herramientas();
        pilas.PedirDatosHerramientas();
        pilas.MostrarDatosHerramientas();

        //Objeto reflectores
        System.out.println("_____________________________________");
        System.out.println("Reflectores");
        Herramientas reflectores = new Herramientas();
        reflectores.PedirDatosHerramientas();
        reflectores.MostrarDatosHerramientas();

        //Objeto multicontacto
        System.out.println("_____________________________________");
        System.out.println("Multicontacto");
        Herramientas multicontacto = new Herramientas();
        multicontacto.PedirDatosHerramientas();
        multicontacto.MostrarDatosHerramientas();

        //arreglo para pinzas
        Herramientas Pinzas[] = new Herramientas[4];
        for (i = 0; i < Pinzas.length; i++) {
            System.out.println("_____________________________________");
            System.out.println("Pinza: " + (i + 1));
            Pinzas[i] = new Herramientas();
            Pinzas[i].PedirDatosHerramientas();
            Pinzas[i].MostrarDatosHerramientas();
        }

        //areglo desarmadores
        Herramientas desarmador[] = new Herramientas[4];
        for (i = 0; i < desarmador.length; i++) {
            System.out.println("_____________________________________");
            System.out.println("Desarmador: " + (i + 1));
            desarmador[i] = new Herramientas();
            desarmador[i].PedirDatosHerramientas();
            desarmador[i].MostrarDatosHerramientas();
        }

        //arreglo prueba de corrientes
        Herramientas pcor[] = new Herramientas[3];
        for (i = 0; i < pcor.length; i++) {
            System.out.println("_____________________________________");
            System.out.println("Prueba de corrientes: " + (i + 1));
            pcor[i] = new Herramientas();
            pcor[i].PedirDatosHerramientas();
            pcor[i].MostrarDatosHerramientas();
        }

        //28. Manguera eléctrica
        System.out.println("_____________________________________");
        System.out.println("Manguera eléctrica");
        Herramientas mele = new Herramientas();
        mele.PedirDatosHerramientas();
        mele.MostrarDatosHerramientas();

        //29. Adaptadores
        System.out.println("_____________________________________");
        System.out.println("Adaptadores");
        Herramientas adaptadores = new Herramientas();
        adaptadores.PedirDatosHerramientas();
        adaptadores.MostrarDatosHerramientas();

        //30. Reguladores
        System.out.println("_____________________________________");
        System.out.println("Reguladores");
        Herramientas reg = new Herramientas();
        reg.PedirDatosHerramientas();
        reg.MostrarDatosHerramientas();

        //31. Fusibles 
        System.out.println("_____________________________________");
        System.out.println("Fusibles ");
        Herramientas fus = new Herramientas();
        fus.PedirDatosHerramientas();
        fus.MostrarDatosHerramientas();
    }
}


