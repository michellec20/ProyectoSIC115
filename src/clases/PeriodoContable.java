/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

public class PeriodoContable {
    private int id;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean cerrado;
    
    public PeriodoContable(){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public boolean isCerrado() {
        return cerrado;
    }
    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }
    
}
