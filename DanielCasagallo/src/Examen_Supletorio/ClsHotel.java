/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Supletorio;

import java.util.ArrayList;

/**
 *
 * @author 22A
 */
public class ClsHotel {
    
    int idHotel;
    private String nombreHotel;
    private int numHab;
    ArrayList<ClsHabitacion> habitacion;

    public ClsHotel(int idHotel, String nombreHotel, int numHab) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.numHab = numHab;
        habitacion = new ArrayList<ClsHabitacion>();
    }

    public ClsHotel(){
        habitacion = new ArrayList<ClsHabitacion>();
    }
    
    public void agregarHab(ClsHabitacion habitacion){
        getHabitacion().add(habitacion);
    }
            
        public String mostrarHabitacion() {
            ClsHabitacion objHabitacion = new ClsHabitacion();
        String texto = "";
        for (int i = 0; i < getHabitacion().size(); i++) {
            texto = texto + "Tipo: "+getHabitacion().get(i).getTipoHabitacion()+"   "+"Cantidad de Personas "+getHabitacion().get(i).getNumeroPersonas()+"   "+"Costo "+getHabitacion().get(i).getCostoHabitacion()+ " "+"Precio Total: "+objHabitacion.costoTotalHabitacion(getHabitacion().get(i).getCostoHabitacion(),getHabitacion().get(i).getNumeroPersonas())+"\n";
        }
        return texto;
    }
    
    @Override
    public String toString() {
        return this.nombreHotel;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public ArrayList<ClsHabitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(ArrayList<ClsHabitacion> habitacion) {
        this.habitacion = habitacion;
    }
    
    
    
    
    
}
