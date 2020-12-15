package Interfaces;

import Clases.*;
import Clases_Utilidad.Control_vacio;
import Clases_Utilidad.Filtro_enteros;
import Clases_Utilidad.Filtro_float;
import Clases_Utilidad.calcular_edad;
import DatabaseControlador.Controlador;
import Memento.Caretaker;
import Memento.Originator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AbstractDocument;

public class Principal extends javax.swing.JFrame {
    
    int flag = 0;
    short codCliente;
    public static int cantidadPedido;
    Object[] datosProducto;
    final TableRowSorter<TableModel> sorter ;
    final TableRowSorter<TableModel> sorterStock ;
    List<Cliente> a;
    public static Caretaker global_care = new Caretaker();
    public static Originator global_ori = new Originator();
    public Principal() {
        initComponents();
        JPanelCliente.setVisible(false);
        JPanelCompra.setVisible(false);
        JPanelPagoCompra.setVisible(false);
        tablaCompra.getTableHeader().setFont(new Font("arial", Font.BOLD, 12));
        tablaCompra.getTableHeader().setOpaque(false);
        tablaCompra.getTableHeader().setBackground(Color.BLACK);
        tablaCompra.getTableHeader().setForeground(Color.WHITE);
        tablaCompra.getTableHeader().setPreferredSize(new Dimension(40, 40));
        tablaCompraProducto.getTableHeader().setFont(new Font("arial", Font.BOLD, 12));
        tablaCompraProducto.getTableHeader().setOpaque(false);
        tablaCompraProducto.getTableHeader().setBackground(Color.BLACK);
        tablaCompraProducto.getTableHeader().setForeground(Color.WHITE);
        tablaCompraProducto.getTableHeader().setPreferredSize(new Dimension(40, 40));
        tablaPago.getTableHeader().setFont(new Font("arial", Font.BOLD, 12));
        tablaPago.getTableHeader().setOpaque(false);
        tablaPago.getTableHeader().setBackground(Color.BLACK);
        tablaPago.getTableHeader().setForeground(Color.WHITE);
        tablaPago.getTableHeader().setPreferredSize(new Dimension(40, 40));
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
        
        
        tablaClientes.setAutoCreateRowSorter(true);
        tablaCarrito.setAutoCreateRowSorter(true);
        tablaStockProductos.setAutoCreateRowSorter(true);
        
        sorter = new TableRowSorter<>(tablaClientes.getModel());
        tablaClientes.setRowSorter(sorter);
        
        sorterStock = new TableRowSorter<>(tablaStockProductos.getModel());
        tablaStockProductos.setRowSorter(sorterStock);
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
        filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        lblactualizar = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lblBarraHerramientaClienteFondo = new javax.swing.JLabel();
        filtroCB = new javax.swing.JComboBox<>();
        lblFondoCliente = new javax.swing.JLabel();
        JPanelCompra = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        lblImporteTotal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ScrollPaneCarrito = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        filtroCompra = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cbFiltroCompra = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaStockProductos = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        lblAnioCompra = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        lblCancelarCompra = new javax.swing.JLabel();
        lblAceptarCompra = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblDiaCompra = new javax.swing.JTextField();
        lblMesCompra = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblApellidoCliente = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fondoEtiquetaCliente = new javax.swing.JLabel();
        lblAgregarPago = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblFondoCliente1 = new javax.swing.JLabel();
        JPanelPagoCompra = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaCompraProducto = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPago = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblApellidoHistorial = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        lblNombreHistorial = new javax.swing.JTextField();
        lblDetalleCompra = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lblFondoCompraPago = new javax.swing.JLabel();
        JPanelPrincipalDer = new javax.swing.JPanel();
        PanelPrinDerFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Natura");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        JPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblminimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizarIconFC.png"))); // NOI18N
        lblminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblminimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
        });
        JPanelPrincipal.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 10, 30, 20));

        lblcerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarIconFC.png"))); // NOI18N
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
        lblRegistrarCompra1.setText("  Historial Cliente");
        lblRegistrarCompra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarCompra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarCompra1MouseClicked(evt);
            }
        });
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

        filtro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        filtro.setForeground(new java.awt.Color(255, 255, 255));
        filtro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        filtro.setCaretColor(new java.awt.Color(255, 255, 255));
        filtro.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        filtro.setOpaque(false);
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });
        JPanelCliente.add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 450, 30));

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
            tablaClientes.getColumnModel().getColumn(0).setMinWidth(0);
            tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaClientes.getColumnModel().getColumn(0).setMaxWidth(0);
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

        lblactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizarIconWhite.png"))); // NOI18N
        lblactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblactualizarMouseClicked(evt);
            }
        });
        JPanelCliente.add(lblactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1262, 213, -1, -1));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCliente.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 10, 37));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtroIconWhite.png"))); // NOI18N
        JPanelCliente.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("ACTUALIZAR");
        JPanelCliente.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 270, 120, 30));

        lblBarraHerramientaClienteFondo.setBackground(new java.awt.Color(61, 110, 255));
        lblBarraHerramientaClienteFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barraHerramientaFondo.png"))); // NOI18N
        lblBarraHerramientaClienteFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        lblBarraHerramientaClienteFondo.setOpaque(true);
        JPanelCliente.add(lblBarraHerramientaClienteFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 63));

        filtroCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apellido", "Nombre" }));
        JPanelCliente.add(filtroCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 140, 30));

        lblFondoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoinicio.jpg"))); // NOI18N
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
        lblNombreCliente.setCaretColor(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setEnabled(false);
        lblNombreCliente.setOpaque(false);
        lblNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNombreClienteActionPerformed(evt);
            }
        });
        JPanelCompra.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 280, 30));

        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 7, 1290, 10));

        lblImporteTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblImporteTotal.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblImporteTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblImporteTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblImporteTotal.setText("0.0");
        lblImporteTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblImporteTotal.setCaretColor(new java.awt.Color(255, 255, 255));
        lblImporteTotal.setEnabled(false);
        lblImporteTotal.setOpaque(false);
        lblImporteTotal.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        lblImporteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblImporteTotalActionPerformed(evt);
            }
        });
        JPanelCompra.add(lblImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, 170, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nombre");
        JPanelCompra.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 10, 190));

        ScrollPaneCarrito.setPreferredSize(new java.awt.Dimension(452, 415));

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
        tablaCarrito.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaCarritoComponentAdded(evt);
            }
        });
        tablaCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCarritoMouseClicked(evt);
            }
        });
        ScrollPaneCarrito.setViewportView(tablaCarrito);
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

        JPanelCompra.add(ScrollPaneCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 450, 160));

        filtroCompra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        filtroCompra.setForeground(new java.awt.Color(255, 255, 255));
        filtroCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtroCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        filtroCompra.setOpaque(false);
        filtroCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroCompraActionPerformed(evt);
            }
        });
        filtroCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroCompraKeyTyped(evt);
            }
        });
        JPanelCompra.add(filtroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 370, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtroIconWhite.png"))); // NOI18N
        JPanelCompra.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 30));

        cbFiltroCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Categoria", "Linea", "Nombre" }));
        cbFiltroCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroCompraActionPerformed(evt);
            }
        });
        JPanelCompra.add(cbFiltroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 100, 30));

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
            tablaStockProductos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaStockProductos.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablaStockProductos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablaStockProductos.getColumnModel().getColumn(4).setResizable(false);
            tablaStockProductos.getColumnModel().getColumn(4).setPreferredWidth(80);
            tablaStockProductos.getColumnModel().getColumn(5).setResizable(false);
            tablaStockProductos.getColumnModel().getColumn(5).setPreferredWidth(50);
            tablaStockProductos.getColumnModel().getColumn(5).setHeaderValue("Stock");
        }

        JPanelCompra.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 1320, 440));

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
        lblAnioCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnioCompraMouseClicked(evt);
            }
        });
        lblAnioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAnioCompraActionPerformed(evt);
            }
        });
        JPanelCompra.add(lblAnioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 20));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dollarIcon.png"))); // NOI18N
        JPanelCompra.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 165, 50, 50));

        jLabel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 10, 190));

        jLabel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 10, 235));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Cancelar Compra");
        JPanelCompra.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 960, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Registrar Compra");
        JPanelCompra.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 960, -1, -1));

        lblDescuento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblDescuento.setText("0.0");
        lblDescuento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblDescuento.setOpaque(false);
        lblDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblDescuentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblDescuentoFocusLost(evt);
            }
        });
        lblDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDescuentoMouseClicked(evt);
            }
        });
        lblDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDescuentoActionPerformed(evt);
            }
        });
        lblDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblDescuentoKeyReleased(evt);
            }
        });
        JPanelCompra.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, 120, 30));

        jLabel42.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 980, 1340, 10));

        lblCancelarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelarCompraIcon.png"))); // NOI18N
        lblCancelarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarCompraMouseClicked(evt);
            }
        });
        JPanelCompra.add(lblCancelarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 870, -1, 80));

        lblAceptarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAceptarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarCompra.png"))); // NOI18N
        lblAceptarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAceptarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAceptarCompraMouseClicked(evt);
            }
        });
        JPanelCompra.add(lblAceptarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1265, 870, -1, 80));

        jLabel46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));
        JPanelCompra.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1382, 53, 10, 190));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Fecha de Compra");
        JPanelCompra.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 160, 30));

        lblDiaCompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDiaCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblDiaCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblDiaCompra.setText("Dia");
        lblDiaCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblDiaCompra.setOpaque(false);
        lblDiaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiaCompraMouseClicked(evt);
            }
        });
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
        lblMesCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesCompraMouseClicked(evt);
            }
        });
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

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Importe Total");
        JPanelCompra.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1168, 210, -1, 20));

        lblApellidoCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblApellidoCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblApellidoCliente.setDisabledTextColor(new java.awt.Color(255, 255, 255));
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

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Carrito de Compra");
        JPanelCompra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 550, 20));

        fondoEtiquetaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ticketCompra.png"))); // NOI18N
        fondoEtiquetaCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(fondoEtiquetaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 250));

        lblAgregarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarPagoIcon.png"))); // NOI18N
        lblAgregarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarPagoMouseClicked(evt);
            }
        });
        JPanelCompra.add(lblAgregarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 875, -1, -1));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Agregar Pago");
        JPanelCompra.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 960, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Para QUITAR productos del Carrito, haga Click en la tabla de Carrito de Compra");
        JPanelCompra.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 670, 20));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Para AGREGAR productos al Carrito, haga Click en la tabla de Productos");
        JPanelCompra.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 610, 20));

        lblFondoCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoinicio.jpg"))); // NOI18N
        lblFondoCliente1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelCompra.add(lblFondoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 1000));

        JPanelPrincipal.add(JPanelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1400, 1000));

        JPanelPagoCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarIconFC.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        JPanelPagoCompra.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 10, 30, 20));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizarIconFC.png"))); // NOI18N
        JPanelPagoCompra.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 30, 20));

        tablaCompraProducto.setBackground(new java.awt.Color(247, 247, 247));
        tablaCompraProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaCompraProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Categoria", "Linea", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tablaCompraProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCompraProducto.setFocusable(false);
        tablaCompraProducto.setGridColor(new java.awt.Color(0, 0, 0));
        tablaCompraProducto.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaCompraProducto.setRowHeight(25);
        tablaCompraProducto.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tablaCompraProducto.setShowVerticalLines(false);
        tablaCompraProducto.getTableHeader().setReorderingAllowed(false);
        tablaCompraProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCompraProductoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaCompraProducto);
        if (tablaCompraProducto.getColumnModel().getColumnCount() > 0) {
            tablaCompraProducto.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaCompraProducto.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablaCompraProducto.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablaCompraProducto.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        JPanelPagoCompra.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 680, 910, 280));

        tablaPago.setBackground(new java.awt.Color(247, 247, 247));
        tablaPago.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pago", "Fecha de Pago", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaPago.setFocusable(false);
        tablaPago.setGridColor(new java.awt.Color(0, 0, 0));
        tablaPago.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaPago.setRowHeight(25);
        tablaPago.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tablaPago.setShowVerticalLines(false);
        tablaPago.getTableHeader().setReorderingAllowed(false);
        tablaPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPagoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaPago);
        if (tablaPago.getColumnModel().getColumnCount() > 0) {
            tablaPago.getColumnModel().getColumn(0).setMinWidth(0);
            tablaPago.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaPago.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaPago.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablaPago.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        JPanelPagoCompra.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 340, 400));

        tablaCompra.setBackground(new java.awt.Color(247, 247, 247));
        tablaCompra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Compra", "Fecha de Compra", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCompra.setFocusable(false);
        tablaCompra.setGridColor(new java.awt.Color(0, 0, 0));
        tablaCompra.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaCompra.setRowHeight(25);
        tablaCompra.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tablaCompra.setShowVerticalLines(false);
        tablaCompra.getTableHeader().setReorderingAllowed(false);
        tablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCompraMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaCompra);
        if (tablaCompra.getColumnModel().getColumnCount() > 0) {
            tablaCompra.getColumnModel().getColumn(0).setMinWidth(0);
            tablaCompra.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaCompra.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaCompra.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablaCompra.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        JPanelPagoCompra.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 340, 400));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Historial de Pagos");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JPanelPagoCompra.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Productos Comprados");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JPanelPagoCompra.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Historial de Compras");
        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JPanelPagoCompra.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Apellido");
        JPanelPagoCompra.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 90, 30));

        lblApellidoHistorial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidoHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoHistorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblApellidoHistorial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblApellidoHistorial.setCaretColor(new java.awt.Color(255, 255, 255));
        lblApellidoHistorial.setEnabled(false);
        lblApellidoHistorial.setOpaque(false);
        lblApellidoHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblApellidoHistorialActionPerformed(evt);
            }
        });
        JPanelPagoCompra.add(lblApellidoHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 310, 30));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Agregar Compra");
        JPanelPagoCompra.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 150, 30));

        lblNombreHistorial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreHistorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblNombreHistorial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lblNombreHistorial.setEnabled(false);
        lblNombreHistorial.setOpaque(false);
        lblNombreHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNombreHistorialActionPerformed(evt);
            }
        });
        JPanelPagoCompra.add(lblNombreHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 310, 30));

        lblDetalleCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrarIcon.png"))); // NOI18N
        lblDetalleCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDetalleCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDetalleCompraMouseClicked(evt);
            }
        });
        JPanelPagoCompra.add(lblDetalleCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 80, 60));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Nombre");
        JPanelPagoCompra.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 90, 30));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevaCompraIcon.png"))); // NOI18N
        JPanelPagoCompra.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 80, 80));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Detalles de Compra");
        JPanelPagoCompra.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 180, 30));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Agregar Pago");
        JPanelPagoCompra.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 150, 30));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarPagoIcon.png"))); // NOI18N
        JPanelPagoCompra.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 80, 80));

        lblFondoCompraPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoinicio.jpg"))); // NOI18N
        lblFondoCompraPago.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelPagoCompra.add(lblFondoCompraPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 1000));

        JPanelPrincipal.add(JPanelPagoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1400, 1000));

        JPanelPrincipalDer.setBackground(new java.awt.Color(247, 247, 247));
        JPanelPrincipalDer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        JPanelPrincipalDer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrinDerFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoinicio.jpg"))); // NOI18N
        PanelPrinDerFondo.setBorder(new javax.swing.border.MatteBorder(null));
        JPanelPrincipalDer.add(PanelPrinDerFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 1000));

        JPanelPrincipal.add(JPanelPrincipalDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1400, 1000));

        getContentPane().add(JPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPromocionesMouseClicked

    }//GEN-LAST:event_lblPromocionesMouseClicked

    private void lblAgregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarClienteMouseClicked
        FormularioCliente formC = new FormularioCliente(global_care,global_ori);
        formC.setVisible(true);
        FormularioCliente.clients = a;
        
    }//GEN-LAST:event_lblAgregarClienteMouseClicked

    private void lblcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcerrarMouseClicked
        try {
            Controlador.cerrar_conexion();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion : /n" + ex.getMessage());
        }
        System.exit(0);
    }//GEN-LAST:event_lblcerrarMouseClicked

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void lblclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclientesMouseClicked
        JPanelPrincipalDer.setVisible(false);
        JPanelCompra.setVisible(false);
        JPanelCliente.setVisible(true);
        try {
            lblImporteTotal.setText("0.0");
            a = Controlador.cliente_traer_todos();
            DefaultTableModel tblModel = (DefaultTableModel) tablaClientes.getModel();
            tblModel.setRowCount(0);
            a.stream().map((clt) -> {
                int age = new calcular_edad().calculatePeriod(clt.getFechaNac());
                Object[] datos = {clt.getCodCliente(), clt.getApellido(), clt.getNombre(), clt.getFechaNac(), age, clt.getTelefono(), clt.getDireccion(), clt.getZonaVivienda(), "$ " + clt.getSaldo()};
                return datos;
            }).forEachOrdered((datos) -> {
                tblModel.addRow(datos);
            });
            DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
            leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

            for (int i = 0; i < tablaClientes.getColumnCount(); i++) {
                tablaClientes.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_lblclientesMouseClicked

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPedidosMouseClicked

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_filtroActionPerformed

    private void lblRegistrarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarCompraMouseClicked
        if(tablaClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Necesita seleccionar un cliente");
        }
        else{
            
        
            JPanelCompra.setVisible(true);
            lblDescuento.setText("0.0");
            JPanelCliente.setVisible(false);
            tablaCarrito.setAutoscrolls(true);
            LocalDate ahora = LocalDate.now();
            lblDiaCompra.setText(ahora.getDayOfMonth()+ "");
            lblMesCompra.setText(ahora.getMonthValue()+ "");
            lblAnioCompra.setText(ahora.getYear() + "");
            List<Producto> a;
            try {
                a = Controlador.producto_traer_todos();

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

                for(int i = 0;i<tablaStockProductos.getColumnCount()-2;i++){
                    tablaStockProductos.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
                }
                for(int i = 0;i<tablaCarrito.getColumnCount();i++){
                    tablaCarrito.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
                    
                }
                tablaCarrito.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                tablaCarrito.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
                tablaStockProductos.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
                tablaStockProductos.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
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

    private void filtroCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroCompraActionPerformed

    private void lblAnioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAnioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnioCompraActionPerformed

    private void cbFiltroCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltroCompraActionPerformed

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
        short stock = (short) tablaStockProductos.getValueAt(Fila, 5);
        
        if(stock != 0){
            
            int cantCarr = tablaCarrito.getRowCount();
        
            tablaStockProductos.setValueAt((short)(stock - (short)1), Fila, 5);
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
            Float acum = 0.0f;
            for(int x = 0;x<tablaCarrito.getRowCount();x++){
                
                short cant = (short) tablaCarrito.getValueAt(x, 2);
                float price = (Float)tablaCarrito.getValueAt(x, 3);
                acum = acum + price*cant;
            }
            acum = acum - Float.parseFloat(lblDescuento.getText());
            lblImporteTotal.setText(acum + "");
        }
        
    }//GEN-LAST:event_tablaStockProductosMouseClicked

    private void lblactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblactualizarMouseClicked
        try {
            /// Populate JTable named tablaClientes
            a = Controlador.cliente_traer_todos();
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

    private void lblRegistrarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarPagoMouseClicked
        if(tablaClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Necesita seleccionar un cliente");
        }
        else{
            try {
                int Fila = tablaClientes.getSelectedRow();
                codCliente = (short) tablaClientes.getValueAt(Fila, 0);
                FormularioPago p = new FormularioPago(Controlador.cliente_traer_uno(codCliente));
                p.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblRegistrarPagoMouseClicked

    private void tablaCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCarritoMouseClicked
        
        DefaultTableModel tblModel = (DefaultTableModel) tablaCarrito.getModel();
        int Fila = tablaCarrito.getSelectedRow();
        if (Fila != - 1) {

            int cantCarr = tablaStockProductos.getRowCount();

            int cod_selec = (int) tablaCarrito.getValueAt(Fila, 0);
            for (int d = 0; d < cantCarr; d++) {
                if ((int) tablaStockProductos.getValueAt(d, 0) == cod_selec) {
                    short w = (short) tablaStockProductos.getValueAt(d, 5);
                    tablaStockProductos.setValueAt((short) (w + 1), d, 5);
                    break;
                }
            }
            
            tablaCarrito.setValueAt((short) (((short) tablaCarrito.getValueAt((int) tablaCarrito.getSelectedRow(), 2)) - 1), (int) tablaCarrito.getSelectedRow(), 2);
            if ((short) tablaCarrito.getValueAt((int) tablaCarrito.getSelectedRow(), 2) == 0) {
                tblModel.removeRow((int) tablaCarrito.getSelectedRow());
            }
            Float acum = 0.0f;
            for(int x = 0;x<tablaCarrito.getRowCount();x++){
                short cant = (short) tablaCarrito.getValueAt(x, 2);
                float price = (Float)tablaCarrito.getValueAt(x, 3);
                acum = acum + price*cant;
            }
            acum = acum - Float.parseFloat(lblDescuento.getText());
            lblImporteTotal.setText(acum + "");
        }

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
        /// * Control de stock
        /// * Restar stock, actualizando la bd, obteniendo los valores de los campos en tablaProductoCompra
        /// * control de que ingrese la fecha
        /// * Calcular el importe total
        /// * Tomar valor de descuento
        int CantFilas = tablaCarrito.getRowCount();
        if( Control_vacio.retorno(lblDiaCompra.getText()) || Control_vacio.retorno(lblMesCompra.getText()) || Control_vacio.retorno(lblAnioCompra.getText()) ){
            JOptionPane.showMessageDialog(null,"Los campos marcados con asterisco son obligatorios");
        }
        else if( CantFilas == 0){
            JOptionPane.showMessageDialog(null,"El carrito esta vacio");
        }
        else{
            try {
// -------------Atributos Compra :   short codCompra /  String  compra_fecha / float  compra_saldo/  Cliente cliente / ArrayList <Producto> prod
//
// -------------Atributos Producto :  int codProducto / String categoria /    String linea /        String  nombre /  float     precio /   short cantidad
//
// -------------Atributos CompraProducto : short codCompra / int  codProducto / short cantidad
//
// ------------- CantFilas contiene la cantidad de filas, si hay 3 filas, CantFilas = 3

                Cliente comprador = Controlador.cliente_traer_uno(codCliente);
                
                String fecha_compra = lblAnioCompra.getText() + "-" + lblMesCompra.getText() + "-" + lblDiaCompra.getText();
                
                ArrayList <Producto> ArrayProd = new ArrayList();
                
                float Importe_Total = 0;
                for(int d = 0;  d < CantFilas;  d++){
                    
                    Producto nuevo = Controlador.producto_traer_uno((int)tablaCarrito.getValueAt(d, 0));
                    short cant = ((short)tablaCarrito.getValueAt(d, 2));
                    nuevo.setCantidad((short)(nuevo.getCantidad() - cant));
                    Controlador.producto_modificar(nuevo);
                    ArrayProd.add(nuevo); 
                    float valor_unidad= (float)tablaCarrito.getValueAt(d, 3);
                    Importe_Total += valor_unidad * cant;
                }
                
                Compra compra = new Compra((short)0,fecha_compra,Importe_Total,comprador,ArrayProd);
                
                Controlador.compra_insertar(compra);
                Long x = Controlador.compra_lastid();
                short id = x.shortValue(); // PROBAR SI DEVUELVE EL ID CORRECTO DE COMPRA
                for(int d = 0;  d < CantFilas;  d++){
                    CompraProducto f = new CompraProducto(id,ArrayProd.get(d).getCodProducto(),(short)tablaCarrito.getValueAt(d, 2));
                    Controlador.comprap_insertar(f);
                }
                comprador.setSaldo(Importe_Total - Float.parseFloat(lblDescuento.getText())); // Hay que ver que pija devuelve eso
                Controlador.cliente_modificar(comprador);
                JOptionPane.showMessageDialog(this, "SE REALIZO LA COMPRA CORRECTAMENTE");
                JPanelCompra.setVisible(false);
                JPanelCliente.setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
    }//GEN-LAST:event_lblAceptarCompraMouseClicked


    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void lblRegistrarCompra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarCompra1MouseClicked
        if(tablaClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Necesita seleccionar un cliente");
        }
        else{
            try {
                short id;
                JPanelPagoCompra.setVisible(true);
                JPanelCliente.setVisible(false);
                int Fila = tablaClientes.getSelectedRow();
                id = (short) tablaClientes.getValueAt(Fila, 0);
                Cliente cliente_historial = Controlador.cliente_traer_uno(id);
                lblApellidoHistorial.setText(cliente_historial.getApellido());
                lblNombreHistorial.setText(cliente_historial.getNombre());
                
                
                List<Compra> cmpr = Controlador.compra_traer_por_cliente(id);
                DefaultTableModel tblCompra = (DefaultTableModel) tablaCompra.getModel();
                tblCompra.setRowCount(0);
                for(Compra clt : cmpr) {
                    Object[] datos = {clt.getCodCompra(),clt.getCompra_fecha(),clt.getCompra_saldo()};
                    tblCompra.addRow(datos);
                }
                // id compra, fecha compra, importe
                DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
                leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

                for(int i = 0;i<tablaCompra.getColumnCount();i++){
                    tablaCompra.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
                }
                
                ///////////////////////////////////////////////////////////
                List<Pago> pag = Controlador.pago_traer_por_cliente(id);
                DefaultTableModel tblPagos = (DefaultTableModel) tablaPago.getModel();
                tblPagos.setRowCount(0);
                for(Pago clt : pag) {
                    Object[] datos = {clt.getCodPago(),clt.getPago_fecha(),clt.getPago_saldo()};
                    tblPagos.addRow(datos);
                }
                for(int i = 0;i<tablaPago.getColumnCount();i++){
                    tablaPago.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
                }
                
                DefaultTableModel tblCP = (DefaultTableModel) tablaCompraProducto.getModel();
                tblCP.setRowCount(0);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_lblRegistrarCompra1MouseClicked

    private void tablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaCompraMouseClicked

    private void tablaPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPagoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaPagoMouseClicked

    private void tablaCompraProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCompraProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaCompraProductoMouseClicked

    private void lblApellidoHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblApellidoHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblApellidoHistorialActionPerformed

    private void lblNombreHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNombreHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreHistorialActionPerformed

    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
        filtro.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                String text = filtro.getText();
                if (text != null && !text.isEmpty()) {
                  switch (filtroCB.getSelectedIndex()){
                      case 0: sorter.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 1)); break;// Apellido
                      case 1: sorter.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 2)); break;// Nombre
                      //case 2: sorter.setRowFilter(RowFilter.numberFilter(ComparisonType.AFTER, Float.parseFloat(text), 8));break; // Saldo Mayor A, pos 8 en jtable
                      //case 3: sorter.setRowFilter(RowFilter.numberFilter(ComparisonType.BEFORE, Float.parseFloat(text), 8));break;
                      default: sorter.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 1)); // Apellido
                  }

                } else {
                  sorter.setRowFilter(null);
                }
            }
        });
        
    }//GEN-LAST:event_filtroKeyTyped

    private void lblDetalleCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleCompraMouseClicked
        // TODO add your handling code here:
        if(tablaCompra.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Necesita seleccionar una compra");
        }
        else{
            int Fila = tablaCompra.getSelectedRow();
            short id = (short) tablaCompra.getValueAt(Fila, 0);


            List<String[]> cmpr;
            try {
                cmpr = Controlador.comprap_obtener_por_compra(id);
                DefaultTableModel tblCompraP = (DefaultTableModel) tablaCompraProducto.getModel();
                tblCompraP.setRowCount(0);
                cmpr.forEach((cmpr1) -> {
                    tblCompraP.addRow(cmpr1);
                });
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
       
        
    }//GEN-LAST:event_lblDetalleCompraMouseClicked

    private void lblAnioCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnioCompraMouseClicked
        // TODO add your handling code here:
        lblAnioCompra.setText("");
    }//GEN-LAST:event_lblAnioCompraMouseClicked

    private void lblMesCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesCompraMouseClicked
        lblMesCompra.setText("");
    }//GEN-LAST:event_lblMesCompraMouseClicked

    private void lblDiaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiaCompraMouseClicked
        // TODO add your handling code here:
        lblDiaCompra.setText("");
    }//GEN-LAST:event_lblDiaCompraMouseClicked

    private void lblAgregarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarPagoMouseClicked
        if(tablaClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Necesita seleccionar un cliente");
        }
        else{
            try {
                int Fila = tablaClientes.getSelectedRow();
                codCliente = (short) tablaClientes.getValueAt(Fila, 0);
                FormularioPago p = new FormularioPago(Controlador.cliente_traer_uno(codCliente));
                p.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblAgregarPagoMouseClicked

    private void tablaCarritoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaCarritoComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaCarritoComponentAdded

    private void lblDescuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblDescuentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDescuentoFocusGained

    private void lblDescuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblDescuentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDescuentoFocusLost

    private void lblDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblDescuentoKeyReleased
        // TODO add your handling code here:
        Float acum = 0.0f;
        for(int x = 0;x<tablaCarrito.getRowCount();x++){
            short cant = (short) tablaCarrito.getValueAt(x, 2);
            float price = (Float)tablaCarrito.getValueAt(x, 3);
            acum = acum + price*cant;
        }
        Float desc = 0f;
        try{
            desc = Float.parseFloat(lblDescuento.getText());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        acum = acum - desc;
        lblImporteTotal.setText(acum + "");
    }//GEN-LAST:event_lblDescuentoKeyReleased

    private void filtroCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroCompraKeyTyped
        filtroCompra.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                String text = filtroCompra.getText();
                if (!Control_vacio.retorno(text)) {
                  switch (cbFiltroCompra.getSelectedIndex()){
                      case 0:  sorterStock.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 0)); break;// Cod
                      case 1:  sorterStock.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 1)); break;// Cat
                      case 2:  sorterStock.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 2)); break;// Linea
                      case 3:  sorterStock.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 3)); break;// Nomb
                      default: sorterStock.setRowFilter(RowFilter.regexFilter("^(?i)" + text, 0)); // Cod
                  }

                } else {
                  sorterStock.setRowFilter(null);
                }
            }
        });
    }//GEN-LAST:event_filtroCompraKeyTyped

    private void lblDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDescuentoMouseClicked
        // TODO add your handling code here:
        lblDescuento.setText("");
    }//GEN-LAST:event_lblDescuentoMouseClicked


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
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelCliente;
    private javax.swing.JPanel JPanelCompra;
    private javax.swing.JPanel JPanelPagoCompra;
    private javax.swing.JPanel JPanelPrincipal;
    private javax.swing.JPanel JPanelPrincipalDer;
    private javax.swing.JPanel JPanelPrincipalIzq;
    private javax.swing.JLabel PanelPrinDerFondo;
    private javax.swing.JScrollPane ScrollPaneCarrito;
    private javax.swing.JComboBox<String> cbFiltroCompra;
    private javax.swing.JTextField filtro;
    private javax.swing.JComboBox<String> filtroCB;
    private javax.swing.JTextField filtroCompra;
    private javax.swing.JLabel fondoEtiquetaCliente;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAceptarCompra;
    private javax.swing.JLabel lblAgregarCliente;
    private javax.swing.JLabel lblAgregarPago;
    private javax.swing.JTextField lblAnioCompra;
    private javax.swing.JTextField lblApellidoCliente;
    private javax.swing.JTextField lblApellidoHistorial;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBarraHerramientaClienteFondo;
    private javax.swing.JLabel lblCancelarCompra;
    private javax.swing.JTextField lblDescuento;
    private javax.swing.JLabel lblDetalleCompra;
    private javax.swing.JTextField lblDiaCompra;
    private javax.swing.JLabel lblFondoCliente;
    private javax.swing.JLabel lblFondoCliente1;
    private javax.swing.JLabel lblFondoCompraPago;
    private javax.swing.JTextField lblImporteTotal;
    private javax.swing.JTextField lblMesCompra;
    private javax.swing.JLabel lblNaturalogo;
    private javax.swing.JTextField lblNombreCliente;
    private javax.swing.JTextField lblNombreHistorial;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblPromociones;
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
    private javax.swing.JTable tablaCompra;
    private javax.swing.JTable tablaCompraProducto;
    private javax.swing.JTable tablaPago;
    private javax.swing.JTable tablaStockProductos;
    // End of variables declaration//GEN-END:variables
}
