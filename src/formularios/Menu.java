/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import clases.Diseño;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import clases.PeriodoContable;
import java.util.Date;

public class Menu extends javax.swing.JFrame {
    
    Conexion connect = new Conexion();
    
    public Menu() {
        initComponents();
        Diseño.diseñoFrame(this);
        SetImageLabel(lbImagen, "/imagenes/logo2.jpg");
        lbImagen.setHorizontalAlignment(JLabel.CENTER);
        lbImagen.setVerticalAlignment(JLabel.CENTER);
      
        this.setLocationRelativeTo(null);
        new Diseño().colocarLogo(this);
        this.setTitle("Menú Principal");
        
        //btnAjustes.setVisible(false); //ocultar opcion de ajustes
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCatalogoCuentas = new javax.swing.JButton();
        btnTransacciones = new javax.swing.JButton();
        btnContCostos = new javax.swing.JButton();
        btnContG = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbImagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIniciarPeriodoC = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("SISTEMA CONTABLE EMPRESA TECH DEV S.A. DE C.V.");

        btnCatalogoCuentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCatalogoCuentas.setText("Catálogo de Cuentas");
        btnCatalogoCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoCuentasActionPerformed(evt);
            }
        });

        btnTransacciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTransacciones.setText("Registrar Transacciones");
        btnTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionesActionPerformed(evt);
            }
        });

        btnContCostos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnContCostos.setText("Contabilidad de Costos");
        btnContCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContCostosActionPerformed(evt);
            }
        });

        btnContG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnContG.setText("Contabilidad General");
        btnContG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContGActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbImagen.setMaximumSize(new java.awt.Dimension(106, 106));
        lbImagen.setMinimumSize(new java.awt.Dimension(1065, 776));
        lbImagen.setPreferredSize(new java.awt.Dimension(1065, 776));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Período Contable");

        btnIniciarPeriodoC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciarPeriodoC.setText("Iniciar Periodo Contable");
        btnIniciarPeriodoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarPeriodoCActionPerformed(evt);
            }
        });

        btnAjustes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAjustes.setText("Ajustes");
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciarPeriodoC, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCatalogoCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnContG, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnContCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarPeriodoC)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTransacciones)
                            .addComponent(btnContG))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCatalogoCuentas)
                            .addComponent(btnContCostos))
                        .addGap(28, 28, 28)
                        .addComponent(btnAjustes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0); // Sale del programa si el usuario elige "Sí"
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCatalogoCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoCuentasActionPerformed
        CatalogoCuentas catalogo = new CatalogoCuentas();
        catalogo.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_btnCatalogoCuentasActionPerformed

    private void btnTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionesActionPerformed
        
        if (existePeriodoContable()) {
            RegistroTransacciones registroT = new RegistroTransacciones();
            registroT.setVisible(true);

            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar un periodo contable.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTransaccionesActionPerformed
    
    private void btnContCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContCostosActionPerformed
        ContabilidadCostos contCostos = new ContabilidadCostos();
        contCostos.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_btnContCostosActionPerformed

    private void btnContGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContGActionPerformed
        ContabilidadGeneral contGral = new ContabilidadGeneral();
        contGral.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_btnContGActionPerformed

    private void btnIniciarPeriodoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarPeriodoCActionPerformed
        IniciarPeriodoContable iniciarPeriodo = new IniciarPeriodoContable();
        iniciarPeriodo.setVisible(true);
        
//        setVisible(false);
    }//GEN-LAST:event_btnIniciarPeriodoCActionPerformed

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        Ajustes a = new Ajustes();
        a.setVisible(true);
    }//GEN-LAST:event_btnAjustesActionPerformed

    public boolean existePeriodoContable(){
        
        try{
            PreparedStatement sentencia = this.connect.getConexion().prepareStatement("SELECT COUNT(*) FROM periodo_contable WHERE cerrado = false");
            ResultSet resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                int count = resultado.getInt(1);
                return count > 0;
            }
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Debe ingresar un periodo contable.", "Error", JOptionPane.ERROR_MESSAGE);
        }         
        
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnCatalogoCuentas;
    private javax.swing.JButton btnContCostos;
    private javax.swing.JButton btnContG;
    private javax.swing.JButton btnIniciarPeriodoC;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransacciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbImagen;
    // End of variables declaration//GEN-END:variables
}
