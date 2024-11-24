/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author joaqu
 */
public class MiembroMesa {

    private String dni, nombre, apellido, tipo, clave;

    public MiembroMesa(String dni, String nombre, String apellido, String tipo, String clave) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        if(this.nombre!=null){
            return nombre;
        }else{
            return "No registrado";
        }
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
