/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Diseño {
    
//Colocar el logo en el frame
    public void colocarLogo(JFrame frame) {
        frame.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage().getScaledInstance(80, 80, 200));
    }
    
    //Colocar el logo como icono
    public void colocarLogo(javax.swing.JDialog cuadroDialogo) {
        cuadroDialogo.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage().getScaledInstance(80, 80, 200));
    }
    
    //Aplicar diseño a los Frame
    public static void diseñoFrame(JFrame frame) {
      try {
            String diseño;
            diseño = "com.jtattoo.plaf.smart.SmartLookAndFeel"; //Tipo de diseño
            UIManager.setLookAndFeel(diseño); //Aplicar diseño
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Diseño.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Diseño.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Diseño.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Diseño.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

