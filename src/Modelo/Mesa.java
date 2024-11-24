/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.util.Stack;


/**
 *
 * @author joaqu
 */
public class Mesa { 
    
    private int numero;
    private String ubicacion, estado;
    private Stack<Voto> votos;
    private ActaElectoral acta;
    private LinkedList<MiembroMesa> listamiembros;

    public Mesa(int numero, String ubicación) {
        this.ubicacion = ubicación;
        this.estado = "Abierta";
        this.listamiembros = new LinkedList<>(); 
        this.numero = numero;
        this.votos = new Stack<Voto>(); 
        this.acta = new ActaElectoral(numero,numero);
    }

    public Stack<Voto> getVotos() {
        return votos;
    }

    public void setVotos(Stack<Voto> votos) {
        this.votos = votos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LinkedList<MiembroMesa> getListamiembros() {
        return listamiembros;
    }

    public void setListamiembros(LinkedList<MiembroMesa> listamiembros) {
        this.listamiembros = listamiembros;
    }
    
    public MiembroMesa crearMiembro(String dni, String nombre, String apellido, String tipo, String clave){
        MiembroMesa miembro = new MiembroMesa(dni, nombre, apellido, tipo, clave);
        agregarMiembro(miembro);
        return miembro;  
    }

    public boolean agregarMiembro(MiembroMesa miembro) {
        if (listamiembros.size() >= 3) {
            JOptionPane.showMessageDialog(null, "Error: La mesa ya tiene el maximo de 3 miembros.");
            return false;
        }

        for (MiembroMesa m : listamiembros) {
            if (m.getTipo().equalsIgnoreCase(miembro.getTipo())) {
                JOptionPane.showMessageDialog(null,"Error: El rol " + miembro.getTipo() + " ya esta asignado en esta mesa.");
                return false;
            }
        }

        listamiembros.add(miembro);
        JOptionPane.showMessageDialog(null,"Miembro agregado con exito: " + miembro.getTipo());
        return true;
    }

    public boolean autenticar(String user, String pass) {
        for (MiembroMesa miembro : listamiembros) {
            if (miembro.getDni().equals(user) && miembro.getClave().equals(pass)) {
                return true;
            }
        }
        return false;
    }
   
    
    
    public boolean rolValido(String rol) {
        for (MiembroMesa miembro : listamiembros) {
            if (miembro.getTipo().equalsIgnoreCase(rol)) {
                return false;
            }
        }
        return true;
    }

    public MiembroMesa BuscarMiembro(String tipo) {
        MiembroMesa aux = null;
        for (MiembroMesa miembro : listamiembros) {
            if (miembro.getTipo().equalsIgnoreCase(tipo)) {
                aux = miembro;  
                System.out.println("Miembro encontrado con exito");
                return miembro;
            }
            else{
                aux = null;
            }
        }
        return aux;
    }
    
    public void modificarMiembro(String tipo, String nuevodni, String nuevoNombre, String nuevoApellido, String nuevoTipo, String nuevaClave) {
        boolean encontrado = false;

        for (MiembroMesa miembro : listamiembros) {
            // Verifica si el miembro a modificar tiene el mismo tipo que el buscado
            if (miembro.getTipo().equals(tipo)) {
                // Verifica que el nuevo tipo no esté repetido en otro miembro
                if (esRolRepetido(nuevoTipo, miembro)) {
                    JOptionPane.showMessageDialog(null, "El rol ya está asignado a otro miembro.");
                    return; // Termina la ejecución si el rol es repetido
                }

                // Verifica que todos los campos estén completos
                if (!nuevodni.isEmpty() && !nuevoNombre.isEmpty() && !nuevoApellido.isEmpty() && !nuevoTipo.isEmpty() && !nuevaClave.isEmpty()) {
                    // Modifica los datos del miembro
                    miembro.setDni(nuevodni);
                    miembro.setNombre(nuevoNombre);
                    miembro.setApellido(nuevoApellido);
                    miembro.setTipo(nuevoTipo);
                    miembro.setClave(nuevaClave);
                    encontrado = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos.");
                    return; // Termina la ejecución si faltan campos
                }
            }
        }

        // Muestra un mensaje según si se encontró y modificó al miembro
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Miembro modificado con exito.");
        } else {
            JOptionPane.showMessageDialog(null, "Miembro no encontrado o no modificado.");
        }
    }

    private boolean esRolRepetido(String nuevoTipo, MiembroMesa miembroActual) {
        for (MiembroMesa miembro : listamiembros) {
            // Evita comparar el miembro actual consigo mismo
            if (!miembro.equals(miembroActual) && miembro.getTipo().equals(nuevoTipo)) {
                return true; // El rol está repetido
            }
        }
        return false; // El rol no está repetido
    }
    
    public void eliminarMiembro(String tipo) {
        boolean eliminado = listamiembros.removeIf(miembro -> miembro.getTipo().equalsIgnoreCase(tipo));
        if (eliminado) {
            JOptionPane.showMessageDialog(null,"Miembro eliminado con exito.");
        } else {
            JOptionPane.showMessageDialog(null,"Miembro no encontrado.");
        }
    }

    public void printMiembros() {
        if (listamiembros.isEmpty()) {
            JOptionPane.showMessageDialog(null,"No hay miembros registrados.");
            return;
        }

        for (MiembroMesa miembro : listamiembros) {
            System.out.println(
                "DNI: " + miembro.getDni()
                + " | Nombre: " + miembro.getNombre()
                + " | Apellido: " + miembro.getApellido()
                + " | Tipo de miembro: " + miembro.getTipo()
                + " | Clave: " + miembro.getClave()
            );
        }
    }
    
    public void printMesa() {
        System.out.println("#Mesa: " + numero + " | Ubicacion: " + ubicacion);
        for (MiembroMesa miembro : getListamiembros()) {
            System.out.println("  Miembro: " + miembro.getNombre() + " " + miembro.getApellido() + " | DNI: " + miembro.getDni());            
        }
    }
    public ActaElectoral getActa() {
        return acta;
    }

    public void setActa(ActaElectoral acta) {
        this.acta = acta;
    }
}
