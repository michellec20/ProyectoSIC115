/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import clases.Diseño;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import clases.PeriodoContable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import clases.Conexion;
import javax.swing.JOptionPane;

public class ContabilidadGeneral extends javax.swing.JFrame {  
    
    Conexion connect = new Conexion();
    
    public ContabilidadGeneral() {
        initComponents();
        Diseño.diseñoFrame(this);
        
        llenarComboBoxPeriodo();
        SetImageLabel(lbImagen, "/imagenes/contGeneral.png");
        lbImagen.setHorizontalAlignment(JLabel.CENTER);
        lbImagen.setVerticalAlignment(JLabel.CENTER);
        
        this.setLocationRelativeTo(null);
        new Diseño().colocarLogo(this);
        this.setTitle("Contabilidad General");
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
        jLabel2 = new javax.swing.JLabel();
        cbPeriodoContable = new javax.swing.JComboBox<>();
        btnBalanceC = new javax.swing.JButton();
        btnCerrarPeriodo = new javax.swing.JButton();
        btnLibroMayor = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel1.setText("CONTABILIDAD GENERAL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel2.setText("Período Contable: ");

        cbPeriodoContable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPeriodoContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPeriodoContableActionPerformed(evt);
            }
        });

        btnBalanceC.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBalanceC.setText("Generar Balance de Comprobación");
        btnBalanceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceCActionPerformed(evt);
            }
        });

        btnCerrarPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCerrarPeriodo.setText("Cerrar Periodo Contable");
        btnCerrarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPeriodoActionPerformed(evt);
            }
        });

        btnLibroMayor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLibroMayor.setText("Libro Mayor");
        btnLibroMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroMayorActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lbImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCerrarPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLibroMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBalanceC, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPeriodoContable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addContainerGap(199, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPeriodoContable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnCerrarPeriodo)
                        .addGap(18, 18, 18)
                        .addComponent(btnBalanceC)
                        .addGap(18, 18, 18)
                        .addComponent(btnLibroMayor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Menu m = new Menu();
        m.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLibroMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroMayorActionPerformed
        LibroMayor libroM = new LibroMayor();
        libroM.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_btnLibroMayorActionPerformed

    private void cbPeriodoContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPeriodoContableActionPerformed
        
    }//GEN-LAST:event_cbPeriodoContableActionPerformed

    private void btnCerrarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPeriodoActionPerformed
        CerrarPeriodoContable cerrarP = new CerrarPeriodoContable();
        cerrarP.setVisible(true);
    }//GEN-LAST:event_btnCerrarPeriodoActionPerformed

    private void btnBalanceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceCActionPerformed
        
        if(periodoContableCerrado()){
            BalanceComprobacion balanceC = new BalanceComprobacion();
            balanceC.setVisible(true);

            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Debe finalizar el periodo contable para generar el balance de comprobación.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnBalanceCActionPerformed

   public boolean periodoContableCerrado(){
        
        try{
            PreparedStatement sentencia = this.connect.getConexion().prepareStatement("SELECT COUNT(*) FROM periodo_contable WHERE cerrado = true");
            ResultSet resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                int count = resultado.getInt(1);
                return count > 0;
            }
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Debe finalizar el periodo contable para generar el balance de comprobación.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ContabilidadGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContabilidadGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContabilidadGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContabilidadGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContabilidadGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBalanceC;
    private javax.swing.JButton btnCerrarPeriodo;
    private javax.swing.JButton btnLibroMayor;
    private javax.swing.JComboBox<String> cbPeriodoContable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbImagen;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBoxPeriodo() {
        DefaultComboBoxModel value;
        this.cbPeriodoContable.removeAllItems();   
        try {
            cbPeriodoContable.removeAllItems();
            
            // Verifica si el periodo contable está cerrado
            if (periodoContableCerrado()) {
                cbPeriodoContable.removeAllItems(); // Limpia el ComboBox
                return; // Sale del método
            }
            
            String sentencia = "SELECT * FROM periodo_contable ORDER BY id";
            PreparedStatement sentencia1;
            sentencia1 = null;
            sentencia1 = this.connect.getConexion().prepareCall(sentencia);
            
            ResultSet rs = sentencia1.executeQuery();
            value = new DefaultComboBoxModel();
            
            cbPeriodoContable.setModel(value);

            while (rs.next()) {
                PeriodoContable periodoC = new PeriodoContable();
                
                periodoC.setId(rs.getInt("id"));
                periodoC.setFechaInicio(rs.getDate("fecha_inicio"));
                periodoC.setFechaFin(rs.getDate("fecha_fin"));
                value.addElement(periodoC);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); //Maneja la excepción SQL.
        }
    }
    
    private void limpiarComboBox() {
        cbPeriodoContable.removeAllItems();
    }
}
