/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import formularios.Inicio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection conexion;

    public Conexion() {
    }

    public Connection getConexion(String user, String pass) {
        conectar(user, pass);
        return conexion;
    }

    Inicio ini = new Inicio();

    //Método para establecer la conexión a la base de datos
    public void conectar(String user, String pass) {
//        String user = ini.r.mostrarUser();
//        String pass = ini.r.mostrarPass();

        if (conexion == null) {
            try {
                String url = "jdbc:postgresql://localhost:5432/techdev";
                conexion = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
//                ini.r.quitarUser();
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Método para desconectar la base de datos
    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
