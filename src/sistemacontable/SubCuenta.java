/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacontable;

public class SubCuenta {
    private int idCuenta;
    private int idclasificacion;
    private String nombre;
    
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
   
     @Override
    public String toString() {
        return   +idclasificacion +"-"+  nombre ;
    }
}
