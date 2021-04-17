
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
    public String get_Nom() {
        return nombre;
    }

    public String get_Direccion() {
        return direccion;
    }

    public String get_Telefono() {
        return telefono;
    }

    public int get_Edad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}