package Interfaces;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        JPanelCliente.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelPrincipal = new javax.swing.JPanel();
        JPanelPrincipalsup = new javax.swing.JPanel();
        JPanelPrincipalIzq = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JPanelCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPanelPrincipalDer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        JPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelPrincipalsup.setBackground(new java.awt.Color(247, 247, 247));
        JPanelPrincipalsup.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        JPanelPrincipalsup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanelPrincipal.add(JPanelPrincipalsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 1370, 40));

        JPanelPrincipalIzq.setBackground(new java.awt.Color(22, 156, 53));
        JPanelPrincipalIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanelPrincipalIzq.setToolTipText("");
        JPanelPrincipalIzq.setPreferredSize(new java.awt.Dimension(330, 1000));
        JPanelPrincipalIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Clientes");
        JPanelPrincipalIzq.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Icon");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        JPanelPrincipalIzq.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 40, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGO");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanelPrincipalIzq.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 60));

        jLabel6.setText("SULLI MARIA MAGNAGO");
        JPanelPrincipalIzq.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        JPanelPrincipal.add(JPanelPrincipalIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 1000));

        JPanelCliente.setBackground(new java.awt.Color(247, 247, 247));
        JPanelCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        JPanelCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 1230, -1));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        JPanelCliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JPanelCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        jLabel1.setText("AGREGAR CLIENTE ICON");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        JPanelCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("REGISTRAR COMPRA ICON");
        JPanelCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        JPanelPrincipal.add(JPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 1370, 960));

        JPanelPrincipalDer.setBackground(new java.awt.Color(247, 247, 247));
        JPanelPrincipalDer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelPrincipalDer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FOTO NATURA");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanelPrincipalDer.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 380, 260));

        jLabel7.setText("Consultora # -----------");
        JPanelPrincipalDer.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, -1, -1));

        jLabel8.setText("Puntos: ----------");
        JPanelPrincipalDer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        jLabel10.setText("Sector: ----------");
        JPanelPrincipalDer.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        jLabel11.setText("Gerencia: ----------");
        JPanelPrincipalDer.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, -1));

        JPanelPrincipal.add(JPanelPrincipalDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 1370, 960));

        getContentPane().add(JPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JPanelPrincipalDer.setVisible(false);
        JPanelCliente.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        FormularioCliente formC = new FormularioCliente();
        formC.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelCliente;
    private javax.swing.JPanel JPanelPrincipal;
    private javax.swing.JPanel JPanelPrincipalDer;
    private javax.swing.JPanel JPanelPrincipalIzq;
    private javax.swing.JPanel JPanelPrincipalsup;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
