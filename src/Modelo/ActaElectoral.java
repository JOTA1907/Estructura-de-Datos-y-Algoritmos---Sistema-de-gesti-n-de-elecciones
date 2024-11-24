/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Stack;

public class ActaElectoral {
    
    private int id;
    private int ideleccion;
    private String fecha;
    private int idmesa;
    private int votantesregistrados;
    private String horaacta;
    private int votantesnovoto;
    private int votantessivoto;
    private int cantvotosnulos;
    private String[][] votoscandidatos; 
    private String observaciones;

    public ActaElectoral(int id, int idmesa) {
        this.id = id;
        this.ideleccion = 0;
        this.fecha = LocalDate.now().toString();
        this.idmesa = idmesa;
        this.votantesregistrados = 1200;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = now.format(formatter);
        this.horaacta = formattedTime;
        this.votantesnovoto = 0;
        this.votantessivoto = 0;
        this.cantvotosnulos = 0;
        this.votoscandidatos = new String[10][5];
        this.observaciones = " ";
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdeleccion() {
        return ideleccion;
    }

    public void setIdeleccion(int ideleccion) {
        this.ideleccion = ideleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(int idmesa) {
        this.idmesa = idmesa;
    }

    public int getVotantesregistrados() {
        return votantesregistrados;
    }

    public void setVotantesregistrados(int votantesregistrados) {
        this.votantesregistrados = votantesregistrados;
    }

    public String getHoraacta() {
        return horaacta;
    }

    public void setHoraacta(String horaacta) {
        this.horaacta = horaacta;
    }

    public int getVotantesnovoto() {
        return votantesnovoto;
    }

    public void setVotantesnovoto(int votantesnovoto) {
        this.votantesnovoto = votantesnovoto;
    }

    public int getVotantessivoto() {
        return votantessivoto;
    }

    public void setVotantessivoto(int votantessivoto) {
        this.votantessivoto = votantessivoto;
    }

    public int getCantvotosnulos() {
        return cantvotosnulos;
    }

    public void setCantvotosnulos(int cantvotosnulos) {
        this.cantvotosnulos = cantvotosnulos;
    }

    public String[][] getVotoscandidatos() {
        return votoscandidatos;
    }

    public void setVotoscandidatos(String[][] votoscandidatos) {
        this.votoscandidatos = votoscandidatos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}