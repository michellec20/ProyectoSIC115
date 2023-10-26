/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacontable;

public class Cuenta {
    private int idTipo;
    private String tipo_cuenta;
    
    public Cuenta(){
   
    }
    
    public int getIdTipo(){
        return idTipo;
    }
    public void setIdTipo(int idTipo){
        this.idTipo = idTipo;
    }
    
    public String getTipo_Cuenta(){
        return tipo_cuenta;
    }
    public void setTipo_Cuenta(String tipo_cuenta){
        this.tipo_cuenta = tipo_cuenta;
    }
    
    @Override
    public String toString() {
        return   +idTipo +"-"+ tipo_cuenta;
    }
}
