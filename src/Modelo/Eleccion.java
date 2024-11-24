
package Modelo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Eleccion {
    private int id;
    private String tipo;
    private LocalDate fecha;
    private String estado;
    private LinkedList<Candidato> listaCandidatos;
    private static int numMesa;
    private LinkedList<Mesa> listaMesas; 

    public Eleccion(int id, String tipo, int dia, int mes, int year) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = LocalDate.of(year, mes, dia);
        this.estado = "Activo";
        this.listaCandidatos = new LinkedList<Candidato>();
        this.numMesa = 1;
        this.listaMesas = new LinkedList<Mesa>();
    }

    public static int getNumMesa() {
        return numMesa;
    }

    public static void setNumMesa(int numMesa) {
        Eleccion.numMesa = numMesa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (!estado.equals("Activo")) {
            JOptionPane.showMessageDialog(null,"No se puede modificar una elección " + estado + ".");
            return;
        }
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        if (!estado.equals("Activo")) {
            JOptionPane.showMessageDialog(null,"No se puede modificar una elección " + estado + ".");
            return;
        }
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public LinkedList<Candidato> getListaCandidatos() {
        return listaCandidatos;
    }

    public void setListaCandidatos(LinkedList<Candidato> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public LinkedList<Mesa> getListaMesas() {
        return listaMesas;
    }

    public void agregarCandidato(String dni, String nombre, String apellidos, String partido) {
        Candidato nuevoCandidato = new Candidato(dni, nombre, apellidos, partido);
        listaCandidatos.add(nuevoCandidato);
        JOptionPane.showMessageDialog(null,"Candidato agregado");
    }
     
    public void eliminarCandidato(String dni) {
        for (Candidato candidato : listaCandidatos) {
            if (candidato.getDni().equals(dni)) {
                listaCandidatos.remove(candidato);
                JOptionPane.showMessageDialog(null,"Candidato eliminado");
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"Candidatono encontrado");
    }
    
    public void modificarCandidato(String dni, String nuevoDni, String nuevoNombre, String nuevosApellidos, String nuevoPartido) {

        for (Candidato candidato : listaCandidatos) {
            if (candidato.getDni().equals(dni)) {
                candidato.setDni(nuevoDni);
                candidato.setNombre(nuevoNombre);
                candidato.setApellidos(nuevosApellidos);
                candidato.setPartido(nuevoPartido);
                JOptionPane.showMessageDialog(null, "Candidato modificado");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Candidatono encontrado");
    }
    public void setListaMesas(LinkedList<Mesa> listaMesas) {
        if (!estado.equals("Activo")) {
            JOptionPane.showMessageDialog(null,"No se puede modificar una elección " + estado + ".");
            return;
        }
        this.listaMesas = listaMesas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (!estado.equals("Activo")) {
            JOptionPane.showMessageDialog(null, "No se puede modificar una elección " + estado + ".");
            return;
        }
        this.id = id;
    }


    public void cancelarEleccion() {
        if (!estado.equals("Activo")) {
            JOptionPane.showMessageDialog(null,"Solo se pueden cancelar elecciones en estado Activo.");
            return;
        }
        this.estado = "Cancelado";
        JOptionPane.showMessageDialog(null,"La elección ha sido cancelada.");
    }

    public void cerrarEleccion() {
        if (listaMesas == null || listaMesas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay mesas registradas.");
            return;
        }
        if (estado.equals("Cancelado")) {
            JOptionPane.showMessageDialog(null,"No se puede cerrar una elección que está cancelada.");
            return;
        }
        if (!estado.equals("Activo")) {
            JOptionPane.showMessageDialog(null,"Solo se pueden cerrar elecciones en estado Activo.");
            return;
        }
        this.estado = "Cerrado";
        JOptionPane.showMessageDialog(null,"La elección ha sido cerrada.");
    }
   
    
    public Mesa crearMesa(String ubicacion){
        Mesa mesa = new Mesa(numMesa, ubicacion);
        agregarMesa(mesa);
        return mesa;  
    }

    public void agregarMesa(Mesa mesa) {
        listaMesas.add(mesa);
        numMesa++;
        System.out.println("Mesa creada correctamente");
    }

    public void modificarMesa(int numero, String ubicacion) {
        
        boolean exito = false;
        for (Mesa mesa : listaMesas) {
            if (mesa.getNumero() == numero && mesa.getEstado().equalsIgnoreCase("Abierta")) {
                mesa.setNumero(numMesa++);
                mesa.setUbicacion(ubicacion); 
                exito = true;
            }
        }
        
        if (exito == true) {
            JOptionPane.showMessageDialog(null, "Mesa modificada correctamente");
            System.out.println("Mesa modificada con exito");
        }
        else{
            System.out.println("Solo se pueden modificar mesas en estado Abierta");
            JOptionPane.showMessageDialog(null, "Solo se pueden modificar mesas en estado Abierta");
        }
  
    }

    public Mesa BuscarMesa(int numero) {
        Mesa aux = null;
        for (Mesa mesa : listaMesas) {
            if (mesa.getNumero() == numero) {
                aux = mesa;  
                System.out.println("Mesa encontrada con exito");
                return mesa;
            }
            else{
                aux = null;
            }
        }
        
        return aux;
    }
    
    public String CancelarMesa(int numero) {

        for (Mesa mesa : listaMesas) {
            if (numero == mesa.getNumero()) {
                mesa.setEstado("Cancelada");
                return "Cancelada";
            }
        }
        return "Abierta";
    }
    
    public String CerrarMesa(int numero) {
        if (listaMesas == null || listaMesas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay mesas registradas.");
            return "Error";
        }
        
        for (Mesa mesa : listaMesas) {
            if (numero == mesa.getNumero()) {
                String estadoActual = mesa.getEstado();
                if (estadoActual.equalsIgnoreCase("Abierta")) {
                    mesa.setEstado("Cerrada");
                    return "Cerrada";
                } else if (estadoActual.equalsIgnoreCase("Cancelada")) {
                    JOptionPane.showMessageDialog(null, "No se puede cerrar una mesa en estado Cancelada");
                    return estadoActual;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontro la mesa especificada");
        return "Abierta";
    }

    public void printMesas() {
        if (listaMesas.isEmpty()) {
            System.out.println("No hay mesas registradas.");
            return;
        }

        for (Mesa mesa : listaMesas) {
            System.out.println("#Mesa: " + numMesa + " | Ubicacion: " + mesa.getUbicacion());
        }
    }

    public Candidato BuscarCandidato(String dni) {
        Candidato aux = null;
        for (Candidato candidato : listaCandidatos ) {
            if (candidato.getDni().equals(dni)) {
                aux = candidato;  
                return candidato;
            }
            else{
                aux = null;
            }
        }
        return aux;
    }
}
    
    
    
