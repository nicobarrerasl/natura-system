package Interfaces;

import Clases.*;
import Clases_Utilidad.Control_vacio;
import Clases_Utilidad.calcular_edad;
import DatabaseDAO.Postgre_SQL.*;
import DatabaseSingleton.PostgreSQL_Singleton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    
    int flag = 0;
    short codCliente;
    public static int cantidadPedido;
    Object[] datosProducto;

    public Principal() {
        initComponents();
        JPanelCliente.setVisible(false);
        JPanelCompra.setVisible(false);
        tablaClientes.getTableHeader().setFont(new Font("arial", Font.BOLD, 12));
        tablaClientes.getTableHeader().setOpaque(false);
        tablaClientes.getTableHeader().setBackground(Color.BLACK);
        tablaClientes.getTableHeader().setForeground(Color.WHITE);
        tablaClientes.getTableHeader().setPreferredSize(new Dimension(40, 40));
        tablaCarrito.getTableHeader().setFont(new Font("arial", Font.BOLD, 12));
        tablaCarrito.getTableHeader().setOpaque(false);
        tablaCarrito.getTableHeader().setBackground(Color.BLACK);
        tablaCarrito.getTableHeader().setForeground(Color.WHITE);
        tablaCarrito.getTableHeader().setPreferredSize(new Dimension(40, 40));
        tablaStockProductos.getTableHeader().setFont(new Font("arial", Font.BOLD, 12));
        tablaStockProductos.getTableHeader().setOpaque(false);
        tablaStockProductos.getTableHeader().setBackground(Color.BLACK);
        tablaStockProductos.getTableHeader().setForeground(Color.WHITE);
        tablaStockProductos.getTableHeader().setPreferredSize(new Dimension(40, 40));
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
        lblRegistrarPago = new javax.swing.JLabel();
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
        jLabel53 = new javax.swing.JLabel();
        lblactualizar = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        lblBarraHerramientaClienteFondo = new javax.swing.JLabel();
        lblFondoCliente = new javax.swing.JLabel();
        JPanelCompra = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblImporteTotal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaStockProductos = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        lblAnioCompra = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblAgregarProducto = new javax.swing.JLabel();
        lblQuitarProducto = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        lblCancelarCompra = new javax.swing.JLabel();
        lblAceptarCompra = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblDiaCompra = new javax.swing.JTextField();
        lblMesCompra = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblApellidoCliente = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        fondoEtiquetaCliente = new javax.swing.JLabel();
        lblAgregarPago = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
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
        lblAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarClienteIcon.png"))); // NOI18N
        lblAgregarCliente.setText("  Agregar Cliente");
        lblAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarClienteMouseClicked(evt);
            }
        });
        JPanelCliente.add(lblAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, 40));

        lblRegistrarCompra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarCompraIcon.png"))); // NOI18N
        lblRegistrarCompra.setText("  Registrar Compra");
        lblRegistrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarCompraMouseClicked(evt);
            }
        });
        JPanelCliente.add(lblRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 8, 170, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 55, 1105, 10));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 10, 10, 37));

        lblRegistrarCompra1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra1.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarCompra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verClienteIcon.png"))); // NOI18N
        lblRegistrarCompra1.setText("  Detalles Cliente");
        lblRegistrarCompra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCliente.add(lblRegistrarCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 8, -1, 40));

        lblRegistrarPago.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarPago.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagoIcon.png"))); // NOI18N
        lblRegistrarPago.setText("  Registrar Pago");
        lblRegistrarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarPagoMouseClicked(evt);
            }
        });
        JPanelCliente.add(lblRegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 8, 150, 40));

        lblRegistrarCompra3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra3.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarCompra3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarClienteIcon.png"))); // NOI18N
        lblRegistrarCompra3.setText("  Eliminar Cliente");
        lblRegistrarCompra3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCliente.add(lblRegistrarCompra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 8, -1, 40));

        lblRegistrarCompra4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistrarCompra4.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarCompra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarCompra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarIcon.png"))); // NOI18N
        lblRegistrarCompra4.setText("  Editar Cliente");
        lblRegistrarCompra4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCliente.add(lblRegistrarCompra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 8, 140, 40));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 10, 10, 46));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 10, 37));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 10, 37));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 10, 46));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        JPanelCliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 450, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtroIcon.png"))); // NOI18N
        JPanelCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 40, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apellido", "Nombre", "Edad", "Saldo" }));
        JPanelCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 30));

        tablaClientes.setBackground(new java.awt.Color(247, 247, 247));
        tablaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Apellido", "Nombre", "Nacimiento", "Edad", "Telefono", "Dir. Vivienda", "Zona de Vivienda", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setToolTipText("");
        tablaClientes.setAutoscrolls(false);
        tablaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaClientes.setFocusable(false);
        tablaClientes.setGridColor(new java.awt.Color(0, 0, 0));
        tablaClientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaClientes.setRowHeight(25);
        tablaClientes.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tablaClientes.setShowVerticalLines(false);
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setMinWidth(50);
            tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaClientes.getColumnModel().getColumn(3).setMinWidth(120);
            tablaClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
            tablaClientes.getColumnModel().getColumn(3).setMaxWidth(120);
            tablaClientes.getColumnModel().getColumn(4).setMinWidth(50);
            tablaClientes.getColumnModel().getColumn(4).setPreferredWidth(50);
            tablaClientes.getColumnModel().getColumn(4).setMaxWidth(50);
            tablaClientes.getColumnModel().getColumn(5).setMinWidth(120);
            tablaClientes.getColumnModel().getColumn(5).setPreferredWidth(120);
            tablaClientes.getColumnModel().getColumn(5).setMaxWidth(120);
            tablaClientes.getColumnModel().getColumn(6).setMinWidth(200);
            tablaClientes.getColumnModel().getColumn(6).setPreferredWidth(200);
            tablaClientes.getColumnModel().getColumn(6).setMaxWidth(200);
            tablaClientes.getColumnModel().getColumn(7).setMinWidth(150);
            tablaClientes.getColumnModel().getColumn(7).setPreferredWidth(150);
            tablaClientes.getColumnModel().getColumn(7).setMaxWidth(150);
            tablaClientes.getColumnModel().getColumn(8).setMinWidth(70);
            tablaClientes.getColumnModel().getColumn(8).setPreferredWidth(70);
            tablaClientes.getColumnModel().getColumn(8).setMaxWidth(70);
        }

        JPanelCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 307, 1320, 650));

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 10, 10, 37));

        lblactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizarIcon.png"))); // NOI18N
        lblactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblactualizarMouseClicked(evt);
            }
        });
        JPanelCliente.add(lblactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 210, -1, -1));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 10, 37));

        lblBarraHerramientaClienteFondo.setBackground(new java.awt.Color(61, 110, 255));
        lblBarraHerramientaClienteFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barraHerramientaFondo.png"))); // NOI18N
        lblBarraHerramientaClienteFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        lblBarraHerramientaClienteFondo.setOpaque(true);
        JPanelCliente.add(lblBarraHerramientaClienteFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 63));

        lblFondoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO.png"))); // NOI18N
        lblFondoCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCliente.add(lblFondoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 1000));

        JPanelPrincipal.add(JPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1400, 1000));

        JPanelCompra.setBackground(new java.awt.Color(242, 242, 242));
        JPanelCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ticketIcon.png"))); // NOI18N
        jLabel20.setText("  Registro de Compra");
        JPanelCompra.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Descuento");
        JPanelCompra.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, -1, 20));

        lblNombreCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblNombreCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblNombreCliente.setEnabled(false);
        lblNombreCliente.setOpaque(false);
        lblNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNombreClienteActionPerformed(evt);
            }
        });
        JPanelCompra.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 280, 30));

        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 690, 270, 10));

        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 7, 1290, 10));

        lblImporteTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblImporteTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblImporteTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblImporteTotal.setOpaque(false);
        lblImporteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblImporteTotalActionPerformed(evt);
            }
        });
        JPanelCompra.add(lblImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, 135, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nombre");
        JPanelCompra.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 10, 190));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 415));

        tablaCarrito.setBackground(new java.awt.Color(247, 247, 247));
        tablaCarrito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "$"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCarrito.setFocusable(false);
        tablaCarrito.setGridColor(new java.awt.Color(0, 0, 0));
        tablaCarrito.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaCarrito.setOpaque(false);
        tablaCarrito.setPreferredSize(new java.awt.Dimension(300, 135));
        tablaCarrito.setRowHeight(25);
        tablaCarrito.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tablaCarrito.setShowVerticalLines(false);
        tablaCarrito.getTableHeader().setReorderingAllowed(false);
        tablaCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCarritoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCarrito);
        if (tablaCarrito.getColumnModel().getColumnCount() > 0) {
            tablaCarrito.getColumnModel().getColumn(0).setMinWidth(80);
            tablaCarrito.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaCarrito.getColumnModel().getColumn(0).setMaxWidth(80);
            tablaCarrito.getColumnModel().getColumn(2).setMinWidth(55);
            tablaCarrito.getColumnModel().getColumn(2).setPreferredWidth(55);
            tablaCarrito.getColumnModel().getColumn(2).setMaxWidth(55);
            tablaCarrito.getColumnModel().getColumn(3).setMinWidth(70);
            tablaCarrito.getColumnModel().getColumn(3).setPreferredWidth(70);
            tablaCarrito.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        JPanelCompra.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 450, 180));

        jTextField6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField6.setOpaque(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        JPanelCompra.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 370, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtroIcon.png"))); // NOI18N
        JPanelCompra.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        JPanelCompra.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 100, 30));

        jLabel29.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 233, 1384, 10));

        tablaStockProductos.setBackground(new java.awt.Color(247, 247, 247));
        tablaStockProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaStockProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Categoria", "Linea", "Nombre", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaStockProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaStockProductos.setFocusable(false);
        tablaStockProductos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaStockProductos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaStockProductos.setRowHeight(25);
        tablaStockProductos.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tablaStockProductos.setShowVerticalLines(false);
        tablaStockProductos.getTableHeader().setReorderingAllowed(false);
        tablaStockProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaStockProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaStockProductos);
        if (tablaStockProductos.getColumnModel().getColumnCount() > 0) {
            tablaStockProductos.getColumnModel().getColumn(0).setMinWidth(80);
            tablaStockProductos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaStockProductos.getColumnModel().getColumn(0).setMaxWidth(80);
            tablaStockProductos.getColumnModel().getColumn(4).setMinWidth(80);
            tablaStockProductos.getColumnModel().getColumn(4).setPreferredWidth(80);
            tablaStockProductos.getColumnModel().getColumn(4).setMaxWidth(80);
            tablaStockProductos.getColumnModel().getColumn(5).setMinWidth(50);
            tablaStockProductos.getColumnModel().getColumn(5).setPreferredWidth(50);
            tablaStockProductos.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        JPanelCompra.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 960, 590));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Apellido");
        JPanelCompra.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

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
        JPanelCompra.add(lblAnioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 20));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dollarIcon.png"))); // NOI18N
        JPanelCompra.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 50, 50));

        jLabel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 10, 190));

        lblAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarIcon.png"))); // NOI18N
        lblAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarProductoMouseClicked(evt);
            }
        });
        JPanelCompra.add(lblAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1161, 370, -1, 80));

        lblQuitarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitarIcon.png"))); // NOI18N
        lblQuitarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelCompra.add(lblQuitarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1161, 520, -1, 70));

        jLabel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 10, 235));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel38.setText("Cancelar Compra");
        JPanelCompra.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 910, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel39.setText("Registrar Compra");
        JPanelCompra.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1227, 910, -1, -1));

        jLabel40.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1191, 830, 10, 80));

        lblDescuento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblDescuento.setText("0");
        lblDescuento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblDescuento.setOpaque(false);
        lblDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDescuentoActionPerformed(evt);
            }
        });
        JPanelCompra.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, 120, 30));

        jLabel42.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 930, 270, 10));

        lblCancelarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitarProductoIcon.png"))); // NOI18N
        lblCancelarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarCompraMouseClicked(evt);
            }
        });
        JPanelCompra.add(lblCancelarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 820, -1, 80));

        lblAceptarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAceptarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarProductoIcon.png"))); // NOI18N
        lblAceptarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAceptarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAceptarCompraMouseClicked(evt);
            }
        });
        JPanelCompra.add(lblAceptarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 820, -1, 80));

        jLabel44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 390, 10, 190));

        jLabel45.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 480, 90, 10));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel47.setText("Agregar Producto");
        JPanelCompra.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1145, 450, -1, -1));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel48.setText("Quitar Producto");
        JPanelCompra.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 500, -1, -1));

        jLabel46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1382, 53, 10, 190));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Fecha de Compra");
        JPanelCompra.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 290, 30));

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
        JPanelCompra.add(lblDiaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 20));

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
        JPanelCompra.add(lblMesCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, 20));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("/");
        JPanelCompra.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 20, 20));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("/");
        JPanelCompra.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 20, 20));

        jLabel50.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 390, 10, 190));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Importe Total");
        JPanelCompra.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 210, -1, 20));

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
        JPanelCompra.add(lblApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saldoIcon.png"))); // NOI18N
        JPanelCompra.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 70, -1, -1));

        fondoEtiquetaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ticketCompra.png"))); // NOI18N
        fondoEtiquetaCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(fondoEtiquetaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 250));

        lblAgregarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarPagoIcon.png"))); // NOI18N
        JPanelCompra.add(lblAgregarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(1167, 705, -1, -1));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel55.setText("Agregar Pago");
        JPanelCompra.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1164, 788, -1, -1));

        jLabel56.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 810, 270, 10));

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
        List<Cliente> a;
        try {
            PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente (PostgreSQL_Singleton.getInstance().getConnection());
            a = DAO_Cliente.obtener_todos();
            
            DefaultTableModel tblModel = (DefaultTableModel) tablaClientes.getModel();
            tblModel.setRowCount(0);
            for(Cliente clt : a) {
                int age = new calcular_edad().calculatePeriod(clt.getFechaNac());
                Object[] datos = {clt.getCodCliente(), clt.getApellido(), clt.getNombre(), clt.getFechaNac(), age, clt.getTelefono(), clt.getDireccion(), clt.getZonaVivienda(), "$ " + clt.getSaldo()};
                tblModel.addRow(datos);

            }
            DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
            leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

            for(int i = 0;i<tablaClientes.getColumnCount();i++){
                tablaClientes.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        if(tablaClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Necesita seleccionar un cliente");
        }
        else{
            
        
            JPanelCompra.setVisible(true);
            JPanelCliente.setVisible(false);

            List<Producto> a;
            try {
                PostgreSQL_Producto DAO_Producto = new PostgreSQL_Producto (PostgreSQL_Singleton.getInstance().getConnection());
                a = DAO_Producto.obtener_todos();

                DefaultTableModel tblModel = (DefaultTableModel) tablaStockProductos.getModel();
                tblModel.setRowCount(0);
                DefaultTableModel tblModel2 = (DefaultTableModel) tablaCarrito.getModel();
                tblModel2.setRowCount(0);
                for(Producto p : a) {       
                    Object[] datos = {p.getCodProducto(), p.getCategoria(), p.getLinea(), p.getNombre(), p.getPrecio(), p.getCantidad()};
                    tblModel.addRow(datos);

                }
                DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

                for(int i = 0;i<tablaStockProductos.getColumnCount()-1;i++){
                    tablaStockProductos.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
                }
                tablaStockProductos.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblRegistrarCompraMouseClicked

    private void lblNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreClienteActionPerformed

    private void lblImporteTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblImporteTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImporteTotalActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void lblAnioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAnioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnioCompraActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void lblDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDescuentoActionPerformed

    private void lblDiaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDiaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDiaCompraActionPerformed

    private void lblMesCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMesCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMesCompraActionPerformed

    private void lblApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblApellidoClienteActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {                                           
        int Fila = tablaClientes.getSelectedRow();
        codCliente = (short) tablaClientes.getValueAt(Fila, 0);
        String apellido = (String) tablaClientes.getValueAt(Fila, 1);
        String nombre = (String) tablaClientes.getValueAt(Fila, 2);
        
        lblNombreCliente.setText(nombre);
        lblApellidoCliente.setText(apellido);
    }                                                                            

    private void tablaStockProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaStockProductosMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) tablaCarrito.getModel();
        
        int Fila = tablaStockProductos.getSelectedRow();
        int cantCarr = tablaCarrito.getRowCount();

        boolean loencontro=false;
        int cod_selec = (int)tablaStockProductos.getValueAt(Fila, 0);
        for(int d = 0;  d < cantCarr;  d++){
            if((int)tablaCarrito.getValueAt(d, 0) == cod_selec){
                short w = (short)tablaCarrito.getValueAt(d, 2);
                tablaCarrito.setValueAt((short)(w + 1), d, 2);
                loencontro = true;
                break;
            }
        }
        if(!loencontro){
            Object[] datos = {(int)tablaStockProductos.getValueAt(Fila, 0),(String)tablaStockProductos.getValueAt(Fila, 3), (short) 1, (float)tablaStockProductos.getValueAt(Fila, 4)};
            tblModel.addRow(datos);
        }
    }//GEN-LAST:event_tablaStockProductosMouseClicked

    private void lblactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblactualizarMouseClicked
        try {
            List<Cliente> a;
            /// Populate JTable named tablaClientes
            PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente (PostgreSQL_Singleton.getInstance().getConnection());
            a = DAO_Cliente.obtener_todos();
            DefaultTableModel tblModel = (DefaultTableModel) tablaClientes.getModel();
            tblModel.setRowCount(0);
            for(Cliente clt : a) {
                int age = new calcular_edad().calculatePeriod(clt.getFechaNac());
                Object[] datos = {clt.getCodCliente(), clt.getApellido(), clt.getNombre(), clt.getFechaNac(), age, clt.getTelefono(), clt.getDireccion(), clt.getZonaVivienda(), "$ " + clt.getSaldo()};
                tblModel.addRow(datos);

            }

            DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
            leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

            for(int i = 0;i<tablaClientes.getColumnCount();i++){
                tablaClientes.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }
            flag = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblactualizarMouseClicked

    private void lblAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarProductoMouseClicked
        // TODO add your handling code here:
        if(tablaStockProductos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Necesita seleccionar un producto");
        }
        else{
            DefaultTableModel tblModel = (DefaultTableModel) tablaCarrito.getModel();
            tblModel.addRow(datosProducto);
            
        }
        
        
    }//GEN-LAST:event_lblAgregarProductoMouseClicked

    private void lblRegistrarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarPagoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegistrarPagoMouseClicked

    private void tablaCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCarritoMouseClicked
        // TODO add your handling code here:
        
        /// IMPLEMENTAR QUITAR PRODUCTO CANTIDAD
    }//GEN-LAST:event_tablaCarritoMouseClicked

    private void lblCancelarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarCompraMouseClicked
       // TODO add your handling code here:
       JPanelCompra.setVisible(false);
       JPanelCliente.setVisible(true);
    }//GEN-LAST:event_lblCancelarCompraMouseClicked

    private void lblAceptarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAceptarCompraMouseClicked
        /// * REGISTRAR LA COMPRA
        /// * Alta compra
        /// * Alta compraProducto
        /// * Obtener la cantidad de producto d Carrito
        /// * Crear un objeto por cada instancia de Carrito
        /// Control de stock
        /// Restar stock, actualizando la bd, obteniendo los valores de los campos en tablaProductoCompra
        /// * control de que ingrese la fecha
        /// * Calcular el importe total
        /// * Tomar valor de descuento
        Control_vacio a = new Control_vacio();
        int CantFilas = tablaCarrito.getRowCount();
        if( a.retorno(lblDiaCompra.getText()) || a.retorno(lblMesCompra.getText()) || a.retorno(lblAnioCompra.getText()) ){
            //w1.setVisible(true);
            JOptionPane.showMessageDialog(null,"Los campos marcados con asterisco son obligatorios");
        }
        else if( CantFilas == 0){
            JOptionPane.showMessageDialog(null,"El carrito esta vacio");
        }
        else{
            try {
                Connection con = PostgreSQL_Singleton.getInstance().getConnection();
                
                PostgreSQL_Compra         DaoCompra    = new PostgreSQL_Compra(con);
                PostgreSQL_Producto       DaoProd      = new PostgreSQL_Producto(con);
                PostgreSQL_CompraProducto DaoCompraP   = new PostgreSQL_CompraProducto(con);
                PostgreSQL_Cliente        DaoCliente   = new PostgreSQL_Cliente(con);
                
                
// -------------Atributos Compra :   short codCompra /  String  compra_fecha / float  compra_saldo/  Cliente cliente / ArrayList <Producto> prod
//
// -------------Atributos Producto :  int codProducto / String categoria /    String linea /        String  nombre /  float     precio /   short cantidad
//
// -------------Atributos CompraProducto : short codCompra / int  codProducto / short cantidad
//
// ------------- CantFilas contiene la cantidad de filas, si hay 3 filas, CantFilas = 3


                //
                //Producto producto = new Producto();
                //CompraProducto compraP = new CompraProducto();
                
                Cliente comprador = DaoCliente.obtener_uno(codCliente);
                
                String fecha_compra = lblAnioCompra.getText() + "-" + lblMesCompra.getText() + "-" + lblDiaCompra.getText();
                
                ArrayList <Producto> ArrayProd = new ArrayList();
                
                float Importe_Total = 0;
                for(int d = 0;  d < CantFilas;  d++){
                    
                    Producto nuevo = DaoProd.obtener_uno((int)tablaCarrito.getValueAt(d, 0));
                    short cant = ((short)tablaCarrito.getValueAt(d, 2));
                    nuevo.setCantidad((short)(nuevo.getCantidad() - cant));
                    DaoProd.modificar(nuevo);
                    ArrayProd.add(nuevo); 
                    float valor_unidad= (float)tablaCarrito.getValueAt(d, 3);
                    Importe_Total += valor_unidad * cant;
                }
                
                System.out.println(Importe_Total);
                Compra compra = new Compra((short)0,fecha_compra,Importe_Total,comprador,ArrayProd);
                
                DaoCompra.insertar(compra);

                short id = DaoCompra.lastid().shortValue(); // PROBAR SI DEVUELVE EL ID CORRECTO DE COMPRA
                for(int d = 0;  d < CantFilas;  d++){
                    CompraProducto f = new CompraProducto(id,ArrayProd.get(d).getCodProducto(),(short)tablaCarrito.getValueAt(d, 2));
                    DaoCompraP.insertar(f);
                }
                comprador.setSaldo(Importe_Total - Float.parseFloat(lblDescuento.getText())); // Hay que ver que pija devuelve eso
                DaoCliente.modificar(comprador);
                
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_lblAceptarCompraMouseClicked

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
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAceptarCompra;
    private javax.swing.JLabel lblAgregarCliente;
    private javax.swing.JLabel lblAgregarPago;
    private javax.swing.JLabel lblAgregarProducto;
    private javax.swing.JTextField lblAnioCompra;
    private javax.swing.JTextField lblApellidoCliente;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBarraHerramientaClienteFondo;
    private javax.swing.JLabel lblCancelarCompra;
    private javax.swing.JTextField lblDescuento;
    private javax.swing.JTextField lblDiaCompra;
    private javax.swing.JLabel lblFondoCliente;
    private javax.swing.JTextField lblImporteTotal;
    private javax.swing.JTextField lblMesCompra;
    private javax.swing.JLabel lblNaturalogo;
    private javax.swing.JTextField lblNombreCliente;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblPromociones;
    private javax.swing.JLabel lblQuitarProducto;
    private javax.swing.JLabel lblRegistrarCompra;
    private javax.swing.JLabel lblRegistrarCompra1;
    private javax.swing.JLabel lblRegistrarCompra3;
    private javax.swing.JLabel lblRegistrarCompra4;
    private javax.swing.JLabel lblRegistrarPago;
    private javax.swing.JLabel lblVisitas;
    private javax.swing.JLabel lblVisitas1;
    private javax.swing.JLabel lblVisitas2;
    private javax.swing.JLabel lblactualizar;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JLabel lblclientes;
    private javax.swing.JLabel lblfondopanelIzq;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaStockProductos;
    // End of variables declaration//GEN-END:variables
}
