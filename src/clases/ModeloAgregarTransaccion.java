/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import sistemacontable.SubCuenta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloAgregarTransaccion extends AbstractTableModel{
    public List<SubCuenta> scuentas= new ArrayList<SubCuenta>();
    
    @Override
    public int getRowCount() {
        return scuentas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SubCuenta sub = scuentas.get(rowIndex);
        Object valor = null;
        switch (columnIndex) {
            case 0:
                valor = sub.getIdSubcuenta();
                break;
            case 1:
                valor = sub.getNombre();
                break;
            case 2:
                valor = sub.getDebe();
                break;
            case 3:
                valor = sub.getHaber();
        }
        return valor;

    }
}
