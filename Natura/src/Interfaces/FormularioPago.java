/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Franco
 */
public class FormularioPago extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPago
     */
    public FormularioPago() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblImporteTotal = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombreCliente = new javax.swing.JTextField();
        lblApellidoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lblApellidoCliente1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblDiaCompra = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        lblMesCompra = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        lblAnioCompra = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblfondoFormularioPago = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(630, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizarIconFC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 20, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarIconFC.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 20, 20));

        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 45, 10, 610));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconPago.png"))); // NOI18N
        jLabel5.setText("      Formulario de Pago");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 460, 100));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarIcon.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 665, 60, 60));

        lblImporteTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblImporteTotal.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblImporteTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblImporteTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblImporteTotal.setText("0.0");
        lblImporteTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblImporteTotal.setCaretColor(new java.awt.Color(255, 255, 255));
        lblImporteTotal.setOpaque(false);
        lblImporteTotal.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        lblImporteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblImporteTotalActionPerformed(evt);
            }
        });
        jPanel1.add(lblImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 170, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dollarIcon.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 50, 50));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Importe Pago");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, 170, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellido");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 90, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Aceptar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 720, 70, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cliente");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 100, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 210, 10));

        lblNombreCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblNombreCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblNombreCliente.setCaretColor(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setEnabled(false);
        lblNombreCliente.setOpaque(false);
        lblNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 310, 30));

        lblApellidoCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblApellidoCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblApellidoCliente.setEnabled(false);
        lblApellidoCliente.setOpaque(false);
        lblApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblApellidoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(lblApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 160, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelarIcon.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 665, 60, 60));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 200, 10));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PAGO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 100, 30));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 210, 10));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, 30));

        lblApellidoCliente1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidoCliente1.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoCliente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblApellidoCliente1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblApellidoCliente1.setEnabled(false);
        lblApellidoCliente1.setOpaque(false);
        lblApellidoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblApellidoCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(lblApellidoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 310, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saldoIcon.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, 30));

        lblDiaCompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDiaCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblDiaCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblDiaCompra.setText("Dia");
        lblDiaCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblDiaCompra.setOpaque(false);
        lblDiaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDiaCompraActionPerformed(evt);
            }
        });
        jPanel1.add(lblDiaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 70, 20));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("/");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 20, 20));

        lblMesCompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMesCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblMesCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblMesCompra.setText("Mes");
        lblMesCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblMesCompra.setOpaque(false);
        lblMesCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMesCompraActionPerformed(evt);
            }
        });
        jPanel1.add(lblMesCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 70, 20));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("/");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 20, 20));

        lblAnioCompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAnioCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblAnioCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblAnioCompra.setText("Año");
        lblAnioCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblAnioCompra.setOpaque(false);
        lblAnioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAnioCompraActionPerformed(evt);
            }
        });
        jPanel1.add(lblAnioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 70, 20));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Fecha de Pago");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 110, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Saldo Actual");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 160, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cancelar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 720, 70, 30));

        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 10, 650));

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 10));

        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, 440, 10));

        lblfondoFormularioPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoFormularioPago.png"))); // NOI18N
        lblfondoFormularioPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblfondoFormularioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblImporteTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblImporteTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImporteTotalActionPerformed

    private void lblNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreClienteActionPerformed

    private void lblApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblApellidoClienteActionPerformed

    private void lblApellidoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblApellidoCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblApellidoCliente1ActionPerformed

    private void lblDiaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDiaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDiaCompraActionPerformed

    private void lblMesCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMesCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMesCompraActionPerformed

    private void lblAnioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAnioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnioCompraActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField lblAnioCompra;
    private javax.swing.JTextField lblApellidoCliente;
    private javax.swing.JTextField lblApellidoCliente1;
    private javax.swing.JTextField lblDiaCompra;
    private javax.swing.JTextField lblImporteTotal;
    private javax.swing.JTextField lblMesCompra;
    private javax.swing.JTextField lblNombreCliente;
    private javax.swing.JLabel lblfondoFormularioPago;
    // End of variables declaration//GEN-END:variables
}
