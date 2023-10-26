package formularios;

import clases.Conexion;
import clases.Diseño;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sistemacontable.Cuenta;
import sistemacontable.SubCuenta;

public class RegistrarCuenta extends javax.swing.JFrame {

    Diseño d = new Diseño();
    Conexion connect = new Conexion();

    public RegistrarCuenta() {
        initComponents();
        d.colocarLogo(this);
        d.diseñoFrame(this);

        //Llenar comboBox 
        llenarComboBoxCodigoCuenta();
        llenarComboBoxClasifCuenta();

        this.setTitle("Cuenta");
        this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        txtNombreCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        cbClasiCuenta = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        cbCodigoCuenta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCodCuenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAR CUENTAS DEL CATÁLOGO");

        jLabel2.setText("Clase de cuenta:");

        jLabel3.setText("Nombre:");

        txtNombreCuenta.setToolTipText("Ingrese nombre de cuenta");

        jLabel4.setText("Subclasificación de cuenta:");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setText("Código de cuenta:");

        txtCodCuenta.setToolTipText("Ingrese valores numéricos");
        txtCodCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodCuentaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbClasiCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(cbCodigoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreCuenta)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCodCuenta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(7, 7, 7)
                            .addComponent(cbCodigoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbClasiCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        CatalogoCuentas catalogo = new CatalogoCuentas();
        catalogo.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtCodCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodCuentaKeyTyped
        char c = evt.getKeyChar();
        String text = txtCodCuenta.getText();

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

        if (text.length() >= 4) {
            evt.consume();  // Consume el evento si ya hay 4 dígitos.
        }
    }//GEN-LAST:event_txtCodCuentaKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Validar que los Txt no estén vacíos
        if (txtCodCuenta.getText().isEmpty() || txtNombreCuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener los valores seleccionados de los ComboBox
        String valorCb1 = cbCodigoCuenta.getSelectedItem().toString();
        String valorCb2 = cbClasiCuenta.getSelectedItem().toString();

        // Separar el valor numérico del texto en los ComboBox      
        int valorNumericoCb1 = Integer.parseInt(valorCb1.split("-")[0].trim());
        int valorNumericoCb2 = Integer.parseInt(valorCb2.split("-")[0].trim());

        // Obtener los valores de los Txt
        int valorTxt1 = Integer.parseInt(txtCodCuenta.getText());
        String valorTxt2 = txtNombreCuenta.getText();

        // Guardar los datos en la base de datos
        try {
            connect.conectar();
            String sentencia = "INSERT INTO cuenta (idtipo, idclasificacion, idcuenta, nombre_cuenta, debe_cuenta, haber_cuenta) VALUES (?, ?, ?, ?, 0.0, 0.0)";
            PreparedStatement ps = this.connect.getConexion().prepareStatement(sentencia);

            ps.setInt(1, valorNumericoCb1);
            ps.setInt(2, valorNumericoCb2);
            ps.setInt(3, valorTxt1);
            ps.setString(4, valorTxt2);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Datos guardados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            cbCodigoCuenta.setSelectedIndex(0);
            cbClasiCuenta.setSelectedIndex(0);
            txtCodCuenta.setText("");
            txtNombreCuenta.setText("");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodCuenta.setText("");
        txtNombreCuenta.setText("");
        cbCodigoCuenta.setSelectedIndex(0);
        cbCodigoCuenta.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    private void llenarComboBoxCodigoCuenta() {
        DefaultComboBoxModel value;
        this.cbCodigoCuenta.removeAllItems();
        try {
            cbCodigoCuenta.removeAllItems();
            String sentencia = "select * from tipocuenta order by idtipo";
            PreparedStatement sentencia1;
            sentencia1 = null;
            sentencia1 = this.connect.getConexion().prepareCall(sentencia);
            ResultSet rs = sentencia1.executeQuery();
            value = new DefaultComboBoxModel();
            cbCodigoCuenta.setModel(value);

            while (rs.next()) {
                Cuenta aux = new Cuenta();
                aux.setIdTipo(rs.getInt("idtipo"));
                aux.setTipo_Cuenta(rs.getString("tipo_cuenta"));
                value.addElement(aux);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(); //Maneja la excepción SQL.
        }
    }

    private void llenarComboBoxClasifCuenta() {
        DefaultComboBoxModel value;
        this.cbClasiCuenta.removeAllItems();
        try {
            cbClasiCuenta.removeAllItems();
            String sentencia = "select * from subclasificacion_cuenta order by idclasificacion";
            PreparedStatement sentencia1;
            sentencia1 = null;
            sentencia1 = this.connect.getConexion().prepareCall(sentencia);
            ResultSet rs = sentencia1.executeQuery();
            value = new DefaultComboBoxModel();
            cbClasiCuenta.setModel(value);

            while (rs.next()) {
                SubCuenta aux = new SubCuenta();
                aux.setIdClasificacion(rs.getInt("idclasificacion"));
                aux.setNombre(rs.getString("nombre_cuenta"));
                value.addElement(aux);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(); //Maneja la excepción SQL.
        }
    }

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
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbClasiCuenta;
    private javax.swing.JComboBox<String> cbCodigoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCodCuenta;
    private javax.swing.JTextField txtNombreCuenta;
    // End of variables declaration//GEN-END:variables
}
