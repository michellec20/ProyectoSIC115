/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import clases.Conexion;
import clases.Diseño;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sistemacontable.SubCuenta;

/**
 *
 * @author mimel
 */
public class RegistroServicios extends javax.swing.JFrame {

    Conexion connect = new Conexion();
    /**
     * Creates new form RegistroServicios
     */
    public RegistroServicios() {
        initComponents();
        Diseño d = new Diseño();
        d.colocarLogo(this);
        Diseño.diseñoFrame(this);
        
        llenarComboBox();
        this.setTitle("Registro de Servicios");
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

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
        btnAtras = new javax.swing.JButton();
        btnCalcularCosto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SpNumServicio = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        cbTipoServicio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        SpCantEmpleados = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel1.setText("SOLICITUD DE SERVICIO");

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnCalcularCosto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCalcularCosto.setText("Calcular Costo Total");
        btnCalcularCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCostoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Número de servicio:");

        jLabel3.setText("Tipo de servicio:");

        cbTipoServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servicio de Consultoria", "Desarrollo de aplicación e-commers personalizada", "Desarrollo de sistema de gestión empresaria" }));

        jLabel7.setText("Cantidad de empleados:");

        jLabel5.setText("Cliente:");

        jLabel4.setText("Descripción del servicio a realizar:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel6.setText("Fecha de entrega:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Costo Total:        $");

        txtCostoTotal.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SpNumServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbTipoServicio, 0, 345, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(SpCantEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(SpNumServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SpCantEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcularCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularCosto)
                    .addComponent(btnAtras)
                    .addComponent(btnGuardar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ContabilidadCostos cc = new ContabilidadCostos();
        cc.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCalcularCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCostoActionPerformed
        // Obtener los datos de los campos

        int numServicio = (int) SpNumServicio.getValue();
        String tipoServicio = cbTipoServicio.getSelectedItem().toString();
        String cliente = txtCliente.getText();
        int cantEmpleados = (int) SpCantEmpleados.getValue();
        String descripcion = txtDescripcion.getText();
        float total = 0, iva = 0;
        Date fechaActual = new Date();
        Date fechaEntrega = txtFecha.getDate();

        // Validando los campos
        if (numServicio == 0 || this.txtFecha.getDate() == null || tipoServicio.isEmpty() || cliente.isEmpty() || cantEmpleados == 0 || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        } else {
            try {
                // Calcular la cantidad de días entre la fecha actual y la fecha de entrega
                long diferenciaEnMillis = fechaEntrega.getTime() - fechaActual.getTime();
                int cantidadDias = (int) (diferenciaEnMillis / (1000 * 60 * 60 * 24)); // 1 día = 24 horas * 60 minutos * 60 segundos * 1000 milisegundos

                switch (tipoServicio) {
                    case "1-Consultoria":
                        total = (float) (cantEmpleados * 23.08 * cantidadDias) + 100; //(cantEmpleados * salarioPorDia * cantDias) + costoAdicional 
                        iva = (float) (total * 0.13);
                        total += iva;
                        break;

                    case "2-Desarrollo de aplicacion e-commers":
                        total = (float) (cantEmpleados * 44.56 * cantidadDias) + 500;
                        iva = (float) (total * 0.13);
                        total += iva;
                        break;

                    case "3-Desarrollo de aplicacion de gestion empresarial":
                        total = (float) (cantEmpleados * 44.56 * cantidadDias) + 250;
                        iva = (float) (total * 0.13);
                        total += iva;
                        break;

                    case "4-Mantenimiento y soporte":
                        total = (float) (cantEmpleados * 16.86 * cantidadDias) + 100;
                        iva = (float) (total * 0.13);
                        total += iva;
                        break;

                    default:
                        throw new AssertionError();
                }
                txtCostoTotal.setText(String.format("%.2f", total));
                btnCalcularCosto.setEnabled(false);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error, verifique los campos numéricos.");
            }
        }
    }//GEN-LAST:event_btnCalcularCostoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Obtener los datos de los campos

        int numServicio = (int) SpNumServicio.getValue();
        String tipoServicio = cbTipoServicio.getSelectedItem().toString();
        String cliente = txtCliente.getText();
        int cantEmpleados = (int) SpCantEmpleados.getValue();
        String descripcion = txtDescripcion.getText();
        String txtCostoT = txtCostoTotal.getText();

        int valorNumericoCb1 = Integer.parseInt(tipoServicio.split("-")[0].trim());

        // Validando los campos
        if (numServicio == 0 || this.txtFecha.getDate() == null || tipoServicio.isEmpty() || cliente.isEmpty() || cantEmpleados == 0 || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            if (txtCostoT.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe calcular el costo total antes.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                try {
//                connect.conectar();
                    float costoTotal = Float.parseFloat(txtCostoT);
                    String sentencia = "INSERT INTO servicios (id, idservicio, nombre_cliente, cantEmpleados, descripcion, fecha, costoTotal) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps = this.connect.getConexion().prepareStatement(sentencia);
                    java.sql.Date fecha = new java.sql.Date(this.txtFecha.getDate().getTime());

                    ps.setInt(1, numServicio);
                    ps.setInt(2, valorNumericoCb1);
                    ps.setString(3, cliente);
                    ps.setInt(4, cantEmpleados);
                    ps.setString(5, descripcion);
                    ps.setDate(6, fecha);
                    ps.setFloat(7, costoTotal);

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Datos guardados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                    SpNumServicio.setValue(0);
                    cbTipoServicio.setSelectedIndex(0);
                    txtDescripcion.setText("");
                    SpCantEmpleados.setValue(0);
                    txtCliente.setText("");
                    txtFecha.setDate(null);
                    txtCostoTotal.setText("");
                    
                    btnCalcularCosto.setEnabled(true);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Error, verifique los campos numéricos.");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpCantEmpleados;
    private javax.swing.JSpinner SpNumServicio;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCalcularCosto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbTipoServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextArea txtDescripcion;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBox() {
        DefaultComboBoxModel value;
        this.cbTipoServicio.removeAllItems();
        try {
            cbTipoServicio.removeAllItems();
            String sentencia = "select * from tiposervicio order by idservicio";
            PreparedStatement sentencia1;
            sentencia1 = null;
            sentencia1 = this.connect.getConexion().prepareCall(sentencia);
            ResultSet rs = sentencia1.executeQuery();
            value = new DefaultComboBoxModel();
            cbTipoServicio.setModel(value);

            while (rs.next()) {
                SubCuenta aux = new SubCuenta();
                aux.setIdClasificacion(rs.getInt("idservicio"));
                aux.setNombre(rs.getString("nombre_servicio"));
                value.addElement(aux);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(); //Maneja la excepción SQL.
        }
    }
}
