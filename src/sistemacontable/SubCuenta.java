/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacontable;

public class SubCuenta {
    private int idSubcuenta;
    private int idCuenta;
    private String nombre;
    private double debe;
    private double haber;
    private String descripcion;
    
    public SubCuenta() {
    }
    
    public int getIdSubcuenta() {
        return idSubcuenta;
    }
    public void setIdSubcuenta(int idSubcuenta) {
        this.idSubcuenta = idSubcuenta;
    }
    
    public int getIdCuenta(){
        return idCuenta;
    }
    public void setIdCuenta(int idSubCuenta){
        this.idCuenta = idCuenta;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getDebe(){
        return debe;
    }
    public void setDebe(double debe){
        this.debe = debe;
    }
    
    public double getHaber(){
        return haber;
    }
    public void setHaber(double haber){
        this.haber = haber;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     @Override
    public String toString() {
        return   +idSubcuenta+"-"+ idCuenta +  "-" + nombre ;
    }
}
