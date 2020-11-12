package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        JPanelCliente.setVisible(false);
        JPanelCompra.setVisible(false);
        tablaClientes.getTableHeader().setFont(new Font("arial", Font.BOLD, 12));
        tablaClientes.getTableHeader().setOpaque(false);
        tablaClientes.getTableHeader().setBackground(Color.BLACK);
        tablaClientes.getTableHeader().setForeground(Color.WHITE);
        tablaClientes.getTableHeader().setPreferredSize(new Dimension(40, 40));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelPrincipal = new javax.swing.JPanel();
        lblminimizar = new javax.swing.JLabel();
        lblcerrar = new javax.swing.JLabel();
        JPanelPrincipalIzq = new javax.swing.JPanel();
        lblPromociones = new javax.swing.JLabel();
        lblNaturalogo = new javax.swing.JLabel();
        lblclientes = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblVisitas = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblVisitas1 = new javax.swing.JLabel();
        lblVisitas2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblfondopanelIzq = new javax.swing.JLabel();
        JPanelCliente = new javax.swing.JPanel();
        lblAgregarCliente = new javax.swing.JLabel();
        lblRegistrarCompra = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblRegistrarCompra1 = new javax.swing.JLabel();
        lblRegistrarCompra2 = new javax.swing.JLabel();
        lblRegistrarCompra3 = new javax.swing.JLabel();
        lblRegistrarCompra4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        JPanelCompra = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        fondoEtiquetaCliente = new javax.swing.JLabel();
        JPanelPrincipalDer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Natura");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        JPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizarIcon.png"))); // NOI18N
        lblminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblminimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
        });
        JPanelPrincipal.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 10, 30, 20));

        lblcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarIcon.png"))); // NOI18N
        lblcerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcerrarMouseClicked(evt);
            }
        });
        JPanelPrincipal.add(lblcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 10, 30, 20));

        JPanelPrincipalIzq.setBackground(new java.awt.Color(255, 255, 255));
        JPanelPrincipalIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanelPrincipalIzq.setToolTipText("");
        JPanelPrincipalIzq.setPreferredSize(new java.awt.Dimension(330, 1000));
        JPanelPrincipalIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPromociones.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblPromociones.setForeground(new java.awt.Color(255, 255, 255));
        lblPromociones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/promocionIcon.png"))); // NOI18N
        lblPromociones.setText("      Promociones");
        lblPromociones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPromocionesMouseClicked(evt);
            }
        });
        JPanelPrincipalIzq.add(lblPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 588, 180, 50));

        lblNaturalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNaturalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoNatura.png"))); // NOI18N
        lblNaturalogo.setToolTipText("");
        JPanelPrincipalIzq.add(lblNaturalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, 130));

        lblclientes.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblclientes.setForeground(new java.awt.Color(255, 255, 255));
        lblclientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clienteIcon.png"))); // NOI18N
        lblclientes.setText("    Clientes");
        lblclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblclientesMouseClicked(evt);
            }
        });
        JPanelPrincipalIzq.add(lblclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 50));

        lblProductos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productoIcon.png"))); // NOI18N
        lblProductos.setText("     Productos");
        lblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
        });
        JPanelPrincipalIzq.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 427, 160, 50));

        lblPedidos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblPedidos.setForeground(new java.awt.Color(255, 255, 255));
        lblPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedidosIcon.png"))); // NOI18N
        lblPedidos.setText("      Pedidos");
        lblPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedidosMouseClicked(evt);
            }
        });
        JPanelPrincipalIzq.add(lblPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 507, 140, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelPrincipalIzq.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, 200, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelPrincipalIzq.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 240, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelPrincipalIzq.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 240, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naturaLogoNombre.png"))); // NOI18N
        JPanelPrincipalIzq.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 160, 190, 70));

        lblVisitas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVisitas.setForeground(new java.awt.Color(255, 255, 255));
        lblVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gastoIcon.png"))); // NOI18N
        lblVisitas.setText("Agregar Gasto");
        JPanelPrincipalIzq.add(lblVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 945, 120, 40));

        lblBalance.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(255, 255, 255));
        lblBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/balanceIcon.png"))); // NOI18N
        lblBalance.setText("     Balance");
        JPanelPrincipalIzq.add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 870, 120, 40));

        lblVisitas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVisitas1.setForeground(new java.awt.Color(255, 255, 255));
        lblVisitas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visitasIcon.png"))); // NOI18N
        lblVisitas1.setText("     Visitas");
        JPanelPrincipalIzq.add(lblVisitas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 800, 120, 40));

        lblVisitas2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVisitas2.setForeground(new java.awt.Color(255, 255, 255));
        lblVisitas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresoIcon.png"))); // NOI18N
        lblVisitas2.setText("Agregar Ingreso");
        JPanelPrincipalIzq.add(lblVisitas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 945, 130, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelPrincipalIzq.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 240, 10));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelPrincipalIzq.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 920, 200, 10));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelPrincipalIzq.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 945, 10, 40));

        lblfondopanelIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondopanelizq.png"))); // NOI18N
        lblfondopanelIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanelPrincipalIzq.add(lblfondopanelIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 1000));

        JPanelPrincipal.add(JPanelPrincipalIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 1000));

        JPanelCliente.setBackground(new java.awt.Color(247, 247, 247));
        JPanelCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAgregarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarClienteIcon.png"))); // NOI18N
        lblAgregarCliente.setText("  Agregar Cliente");
        lblAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarClienteMouseClicked(evt);
            }
        });
        JPanelCliente.add(lblAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, 40));

        lblRegistrarCompra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarCompraIcon.png"))); // NOI18N
        lblRegistrarCompra.setText("  Registrar Compra");
        lblRegistrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarCompraMouseClicked(evt);
            }
        });
        JPanelCliente.add(lblRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 170, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 76, 1100, 10));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 30, 10, 40));

        lblRegistrarCompra1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verClienteIcon.png"))); // NOI18N
        lblRegistrarCompra1.setText("  Detalles Cliente");
        lblRegistrarCompra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCliente.add(lblRegistrarCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 30, -1, 40));

        lblRegistrarCompra2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagoIcon.png"))); // NOI18N
        lblRegistrarCompra2.setText("  Registrar Pago");
        lblRegistrarCompra2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCliente.add(lblRegistrarCompra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 30, 150, 40));

        lblRegistrarCompra3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarClienteIcon.png"))); // NOI18N
        lblRegistrarCompra3.setText("  Eliminar Cliente");
        lblRegistrarCompra3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCliente.add(lblRegistrarCompra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 40));

        lblRegistrarCompra4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarIcon.png"))); // NOI18N
        lblRegistrarCompra4.setText("  Editar Cliente");
        lblRegistrarCompra4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCliente.add(lblRegistrarCompra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 30, 140, 40));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1046, 30, 10, 40));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 10, 40));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCliente.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 10, 40));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCliente.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 10, 40));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        JPanelCliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 165, 450, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtroIcon.png"))); // NOI18N
        JPanelCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 165, 40, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JPanelCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 150, 30));

        tablaClientes.setBackground(new java.awt.Color(247, 247, 247));
        tablaClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Apellido", "Nombre", "Fecha de Nacimiento", "Edad", "Telefono", "Direccion de Vivienda", "Zona de Vivienda", "Direccion de Trabajo", "Zona de Trabajo", "Ocupacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaClientes.setFocusable(false);
        tablaClientes.setGridColor(new java.awt.Color(0, 0, 0));
        tablaClientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaClientes.setRowHeight(25);
        tablaClientes.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tablaClientes.setShowVerticalLines(false);
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaClientes);

        JPanelCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 307, 1320, 620));

        JPanelPrincipal.add(JPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1400, 1000));

        JPanelCompra.setBackground(new java.awt.Color(247, 247, 247));
        JPanelCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("CLIENTE");
        JPanelCompra.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel21.setText("Nueva Compra");
        JPanelCompra.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, 20));

        jLabel22.setText("Apellido");
        JPanelCompra.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField2.setOpaque(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        JPanelCompra.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 190, 40));

        jTextField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField3.setOpaque(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        JPanelCompra.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 300, 20));

        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 10, 10, 233));

        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, 871, 10));

        jTextField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        JPanelCompra.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 190, 40));

        jLabel26.setText("Saldo Restante");
        JPanelCompra.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, 20));

        jTextField5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField5.setOpaque(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        JPanelCompra.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 300, 20));

        jLabel23.setText("Nombre");
        JPanelCompra.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 10, 160));

        fondoEtiquetaCliente.setText("fondo");
        fondoEtiquetaCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(fondoEtiquetaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 250));

        JPanelPrincipal.add(JPanelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1400, 1000));

        JPanelPrincipalDer.setBackground(new java.awt.Color(247, 247, 247));
        JPanelPrincipalDer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
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

        JPanelPrincipal.add(JPanelPrincipalDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1400, 1000));

        getContentPane().add(JPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPromocionesMouseClicked

    }//GEN-LAST:event_lblPromocionesMouseClicked

    private void lblAgregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarClienteMouseClicked
        FormularioCliente formC = new FormularioCliente();
        formC.setVisible(true);
    }//GEN-LAST:event_lblAgregarClienteMouseClicked

    private void lblcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcerrarMouseClicked

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void lblclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclientesMouseClicked
        JPanelPrincipalDer.setVisible(false);
        JPanelCompra.setVisible(false);
        JPanelCliente.setVisible(true);
    }//GEN-LAST:event_lblclientesMouseClicked

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPedidosMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void lblRegistrarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarCompraMouseClicked
        JPanelCompra.setVisible(true);
        JPanelCliente.setVisible(false);
    }//GEN-LAST:event_lblRegistrarCompraMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
    private javax.swing.JPanel JPanelCompra;
    private javax.swing.JPanel JPanelPrincipal;
    private javax.swing.JPanel JPanelPrincipalDer;
    private javax.swing.JPanel JPanelPrincipalIzq;
    private javax.swing.JLabel fondoEtiquetaCliente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblAgregarCliente;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblNaturalogo;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblPromociones;
    private javax.swing.JLabel lblRegistrarCompra;
    private javax.swing.JLabel lblRegistrarCompra1;
    private javax.swing.JLabel lblRegistrarCompra2;
    private javax.swing.JLabel lblRegistrarCompra3;
    private javax.swing.JLabel lblRegistrarCompra4;
    private javax.swing.JLabel lblVisitas;
    private javax.swing.JLabel lblVisitas1;
    private javax.swing.JLabel lblVisitas2;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JLabel lblclientes;
    private javax.swing.JLabel lblfondopanelIzq;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
