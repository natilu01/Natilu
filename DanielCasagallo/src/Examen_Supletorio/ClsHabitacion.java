/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Supletorio;

/**
 *
 * @author 22A
 */
public class ClsHabitacion {
    
    private int idHabitacion;
    private String tipoHabitacion;
    private int numeroPersonas;
    private double costoHabitacion;

    public ClsHabitacion(int idHabitacion, String tipoHabitacion, int numeroPersonas, double costoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroPersonas = numeroPersonas;
        this.costoHabitacion = costoHabitacion;
    }
    
    public ClsHabitacion(){
        
    }
    
    public double costoTotalHabitacion(double costo, int personas){
        return costo * personas;
    }
    
    @Override
    public String toString() {
        return this.tipoHabitacion;
    }
    
    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public double getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(double costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }
    
    
  
    
}
