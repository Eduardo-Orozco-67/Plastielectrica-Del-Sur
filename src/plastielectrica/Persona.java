
package plastielectrica;

import java.util.Scanner;

public class Persona {
    Scanner x = new Scanner(System.in);
    String nombre;
    int edad; 
    String direccion;
    String email;
    String telefono;
    
    public void setNom(String nombre) {
        this.nombre = nombre;
    }

    public void setDirecc(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodos GET
    public String getNom() {
        return nombre;
    }

    public String getDirecc() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void llenado(){
        System.out.println("Dame su nombre:  ");
        setNom(x.next());

        System.out.println("Dame su direccion: ");
        setDirecc(x.next());

        System.out.println("Dame su numero de telefono: ");
        setTelefono(x.next());

        System.out.println("Dame su edad: ");
        setEdad(x.nextInt());

        System.out.println("Dame su email: ");
        setEmail(x.next());


    }
    public void mostrar(){
        System.out.println("Nombre :" + getNom());

        System.out.println("Direccion: " + getDirecc());

        System.out.println("Telefono: " + getTelefono());

        System.out.println("Dame su edad: " + getEdad());

        System.out.println("Dame su email: " + getEmail());      
    }
}

