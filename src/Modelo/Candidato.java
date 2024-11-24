
package Modelo;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Candidato {
    private String nombre;
    private String apellidos;
    private String dni;
    private String partido;

    public Candidato(String dni, String nombre, String apellidos, String partido) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
}
