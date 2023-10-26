/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacontable;

public class SubCuenta {

    private int idCuenta;
    private int idclasificacion;
    private String nombre;
    private double debe;
    private double haber;
    
    public SubCuenta() {
    }
    
    public int getIdCuenta(){
        return idCuenta;
    }
    public void setIdCuenta(int idSubCuenta){
        this.idCuenta = idCuenta;
    }
    
    public int getIdClasificacion() {
        return idclasificacion;
    }
    public void setIdClasificacion(int idclasificacion) {
        this.idclasificacion = idclasificacion;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getDebe() {
        return debe;
    }
    public void setDebe(double debe) {
        this.debe = debe;
    }

  
    public double getHaber() {
        return haber;
    }
    public void setHaber(double haber) {
        this.haber = haber;
    }
   
     @Override
    public String toString() {
        return   +idclasificacion +"-"+  nombre ;
    }
}
