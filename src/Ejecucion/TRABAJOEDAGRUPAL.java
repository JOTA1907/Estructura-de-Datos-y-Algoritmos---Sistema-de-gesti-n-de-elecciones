/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecucion;


import Vista.*;
import Modelo.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import javax.swing.JOptionPane;



public class TRABAJOEDAGRUPAL {
    public static int idE = 1;
    public static LinkedList<Eleccion> Elecciones = new LinkedList<Eleccion>();
    public static void main(String[] args) {
//        agregarEleccion(0,"Presidencial",2026,5,5);
//        Mesa m1 = new Mesa(1,"todeto");
//        buscarEleccionPorId(1).agregarMesa(m1);
//        buscarEleccionPorId(1).agregarCandidato("123", "Capitan", "Casino", "BetanoCuentasCorrientes");
//        buscarEleccionPorId(1).agregarCandidato("2024", "Luis", "Todeto", "TrabasGratis");
//        MiembroMesa mm1 = new MiembroMesa("1", "pedro", "castillo", "Presidente", "asdasd");
//        buscarEleccionPorId(1).getListaMesas().getFirst().agregarMiembro(mm1);
        new Auth().setVisible(true);
    }

    
//----------------------------------------------------------------------------------------------------------

    public static void agregarEleccion(int id, String tipo, int dia, int mes, int year) {
        Eleccion nuevaEleccion = new Eleccion(id, tipo, dia, mes, year);
        Elecciones.add(nuevaEleccion);
        System.out.println("Elección agregada con éxito");
    }

    public static Eleccion buscarEleccionPorId(int id) {
        for (Eleccion eleccion : Elecciones) {
            if (eleccion.getId() == id) {
                return eleccion;
            }
        }
        return null;
    }

    public static void eliminarEleccion(int id) {
            Eleccion eleccionAEliminar = buscarEleccionPorId(id);
            if (eleccionAEliminar != null) {
                Elecciones.remove(eleccionAEliminar);
                System.out.println("Elección eliminada");
            }
        }

    public static void modificarEleccion(int id, int nuevoId, String nuevoTipo, LocalDate nuevaFecha) {
        Eleccion eleccion = buscarEleccionPorId(id);

        if (eleccion != null && eleccion.getEstado().equals("Activo")) {

            eleccion.setId(nuevoId);
            eleccion.setTipo(nuevoTipo);
            eleccion.setFecha(nuevaFecha);
            JOptionPane.showMessageDialog(null, "Elección modificada");

        } else {
            JOptionPane.showMessageDialog(null, "No se puede modificar eleccion");
        }
    }
}