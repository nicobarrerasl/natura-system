/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases_Utilidad.*;
import Clases.Cliente;
import DatabaseControlador.Controlador;
import Memento.Caretaker;
import Memento.Originator;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author Franco
 */
public class FormularioCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormularioCliente
     */
    //String[] memento;
    int flagdia,flagmes,flaganio,flagcaract,flagtel;
    public static Caretaker caretaker;
    public static Originator originator;
    public static int memento_index=0, memento_counter=0;
    public static List<Cliente> clients;
    public FormularioCliente(Caretaker care, Originator ori) {
        initComponents();
        flagdia = 0;
        flagmes = 0;
        flaganio = 0;
        flagcaract = 0;
        flagtel = 0;
        w1.setVisible(false);
        w2.setVisible(false);
        w3.setVisible(false);
        w4.setVisible(false);
        w5.setVisible(false);
        w6.setVisible(false);    
        caretaker = care;
        originator = ori;
        contadorMementos.setText(memento_counter + "");
        memento_index = memento_counter -1;
        if(memento_counter >=1)
            Rehacer.setEnabled(true);
        else
            Rehacer.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        tf_tel = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tf_dia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblminimizar = new javax.swing.JLabel();
        jl_cerrar = new javax.swing.JLabel();
        lblTituloFC = new javax.swing.JLabel();
        tf_Apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_mes = new javax.swing.JTextField();
        tf_anio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        tf_caract = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        w1 = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        w4 = new javax.swing.JLabel();
        w5 = new javax.swing.JLabel();
        w6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_DV = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_ZV = new javax.swing.JTextField();
        jl_cancelar = new javax.swing.JLabel();
        jl_registrar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Rehacer = new javax.swing.JLabel();
        lblRehacer = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        contadorMementos = new javax.swing.JLabel();
        lblMem = new javax.swing.JLabel();
        fondoFormularioCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Cliente");
        setUndecorated(true);
        setSize(new java.awt.Dimension(850, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, 30));

        tf_tel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_tel.setForeground(new java.awt.Color(255, 255, 255));
        tf_tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_tel.setText("Telefono sin 15");
        tf_tel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_tel.setOpaque(false);
        tf_tel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_telFocusGained(evt);
            }
        });
        tf_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telActionPerformed(evt);
            }
        });
        jPanel1.add(tf_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 180, 20));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 200, 10));

        tf_dia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_dia.setForeground(new java.awt.Color(255, 255, 255));
        tf_dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_dia.setText("Dia");
        tf_dia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_dia.setOpaque(false);
        tf_dia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_diaFocusGained(evt);
            }
        });
        tf_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_diaActionPerformed(evt);
            }
        });
        jPanel1.add(tf_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 60, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono Particular");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 150, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 200, 10));

        lblminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizarIconFC.png"))); // NOI18N
        lblminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblminimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
        });
        jPanel1.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 20));

        jl_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarIconFC.png"))); // NOI18N
        jl_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jl_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jl_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 30, 20));

        lblTituloFC.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        lblTituloFC.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloFC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoNaturaFC.png"))); // NOI18N
        lblTituloFC.setText("Formulario de Cliente");
        jPanel1.add(lblTituloFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 90));

        tf_Apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_Apellido.setForeground(new java.awt.Color(255, 255, 255));
        tf_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Apellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_Apellido.setOpaque(false);
        tf_Apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_ApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_ApellidoFocusLost(evt);
            }
        });
        tf_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 300, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos de Vivienda");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 180, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, 30));

        tf_mes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_mes.setForeground(new java.awt.Color(255, 255, 255));
        tf_mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_mes.setText("Mes");
        tf_mes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_mes.setOpaque(false);
        tf_mes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_mesFocusGained(evt);
            }
        });
        tf_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mesActionPerformed(evt);
            }
        });
        jPanel1.add(tf_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 60, 20));

        tf_anio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_anio.setForeground(new java.awt.Color(255, 255, 255));
        tf_anio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_anio.setText("Año");
        tf_anio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_anio.setOpaque(false);
        tf_anio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_anioFocusGained(evt);
            }
        });
        tf_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_anioActionPerformed(evt);
            }
        });
        jPanel1.add(tf_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 60, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("/");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 20, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("_");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 20, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 150, 30));

        tf_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        tf_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_Nombre.setOpaque(false);
        tf_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_NombreFocusGained(evt);
            }
        });
        tf_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 300, 20));

        tf_caract.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_caract.setForeground(new java.awt.Color(255, 255, 255));
        tf_caract.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_caract.setText("caract");
        tf_caract.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_caract.setOpaque(false);
        tf_caract.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_caractFocusGained(evt);
            }
        });
        tf_caract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_caractActionPerformed(evt);
            }
        });
        jPanel1.add(tf_caract, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 60, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("/");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 20, 20));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 200, 10));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos Personales");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 170, 180, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 200, 10));

        w1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        w1.setForeground(new java.awt.Color(255, 0, 0));
        w1.setText("*");
        jPanel1.add(w1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 10, 30));

        w2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        w2.setForeground(new java.awt.Color(255, 0, 51));
        w2.setText("*");
        jPanel1.add(w2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        w3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        w3.setForeground(new java.awt.Color(255, 0, 0));
        w3.setText("*");
        jPanel1.add(w3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        w4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        w4.setForeground(new java.awt.Color(255, 0, 51));
        w4.setText("*");
        jPanel1.add(w4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        w5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        w5.setForeground(new java.awt.Color(255, 51, 51));
        w5.setText("*");
        jPanel1.add(w5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, -1));

        w6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        w6.setForeground(new java.awt.Color(255, 0, 51));
        w6.setText("*");
        jPanel1.add(w6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Direccion de Vivienda");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 160, 30));

        tf_DV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_DV.setForeground(new java.awt.Color(255, 255, 255));
        tf_DV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_DV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_DV.setOpaque(false);
        tf_DV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_DVActionPerformed(evt);
            }
        });
        jPanel1.add(tf_DV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 390, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Registrar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 758, 90, 30));

        tf_ZV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_ZV.setForeground(new java.awt.Color(255, 255, 255));
        tf_ZV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_ZV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        tf_ZV.setOpaque(false);
        tf_ZV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ZVActionPerformed(evt);
            }
        });
        jPanel1.add(tf_ZV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 390, 20));

        jl_cancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jl_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jl_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelarIcon.png"))); // NOI18N
        jl_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jl_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cancelarMouseClicked(evt);
            }
        });
        jPanel1.add(jl_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 60, 60));

        jl_registrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jl_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jl_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarIcon.png"))); // NOI18N
        jl_registrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jl_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jl_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_registrarMouseClicked(evt);
            }
        });
        jPanel1.add(jl_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, 60, 60));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Zona de Vivienda");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 150, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cancelar");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 760, 90, 30));

        Rehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recargarIcon.png"))); // NOI18N
        Rehacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RehacerMouseClicked(evt);
            }
        });
        jPanel1.add(Rehacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, -1));

        lblRehacer.setForeground(new java.awt.Color(255, 255, 255));
        lblRehacer.setText("Recargar Datos Cancelados");
        jPanel1.add(lblRehacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, -1, 40));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 200, 10));

        contadorMementos.setForeground(new java.awt.Color(255, 255, 255));
        contadorMementos.setText("0");
        jPanel1.add(contadorMementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, -1, -1));

        lblMem.setForeground(new java.awt.Color(255, 255, 255));
        lblMem.setText("Formularios Recopilados: ");
        jPanel1.add(lblMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        fondoFormularioCliente.setBackground(new java.awt.Color(255, 255, 255));
        fondoFormularioCliente.setForeground(new java.awt.Color(255, 255, 255));
        fondoFormularioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoFormCliente.png"))); // NOI18N
        fondoFormularioCliente.setText("asd");
        fondoFormularioCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fondoFormularioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        this.setState(FormularioCliente.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jl_cerrarMouseClicked

    private void tf_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ApellidoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_ApellidoActionPerformed

    private void tf_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telActionPerformed

    private void tf_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_diaActionPerformed

    private void tf_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mesActionPerformed

    private void tf_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_anioActionPerformed

    private void tf_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NombreActionPerformed

    private void tf_caractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_caractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_caractActionPerformed

    private void jl_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cancelarMouseClicked
        String  apel = tf_Apellido.getText();
        String  nom =  tf_Nombre.getText();
        String  dia =  tf_dia.getText();
        String mes =   tf_mes.getText();
        String anio =  tf_anio.getText();
        String  tel =  tf_tel.getText();
        String  car =  tf_caract.getText();
        String  dir =  tf_DV.getText();
        String  ZV =   tf_ZV.getText();
        String[] mementos = {apel,nom,dia,mes,anio,tel,car,dir,ZV};
        boolean not_empty = false;
        for(String z : mementos){
            if(!Control_vacio.retorno(z))
                not_empty = true;
        }
        if(not_empty){
            originator.set(mementos);
            caretaker.addMemento( originator.storeInMemento() );
            memento_counter++;
            memento_index = memento_counter -1;
        }
        

        
        this.dispose();
    }//GEN-LAST:event_jl_cancelarMouseClicked

    private void jl_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_registrarMouseClicked
        int    flag; // Este flag se utiliza para ver si se dio de alta o no, en caso afirmativo se cierra el panel, si no, se deja para arreglar los datos.
        String  apel = tf_Apellido.getText();
        String  nom =  tf_Nombre.getText();
        String  fnac = tf_anio.getText() + "-" + tf_mes.getText() + "-" + tf_dia.getText(); // YYYY-MM-DD
        String  tel =  tf_caract.getText()+ "-" + tf_tel.getText(); // Caracteristica-Nro
        String  dir =   tf_DV.getText();
        String  ZV =   tf_ZV.getText();
        if(Control_vacio.retorno(apel) || Control_vacio.retorno(tf_anio.getText()) || Control_vacio.retorno(tf_mes.getText()) || Control_vacio.retorno(tf_dia.getText()) || Control_vacio.retorno(tf_caract.getText()) || Control_vacio.retorno(tf_tel.getText()) || Control_vacio.retorno(nom) || Control_vacio.retorno(dir) || Control_vacio.retorno(ZV) ){
            w1.setVisible(true);
            w2.setVisible(true);
            w3.setVisible(true);
            w4.setVisible(true);
            w5.setVisible(true);
            w6.setVisible(true);  
            JOptionPane.showMessageDialog(null,"Los campos marcados con asterisco son obligatorios");
        }
        else{
            boolean isRepetido = false;
            for(Cliente idx : clients){
                if(idx.getApellido().equals(apel))
                    if(idx.getNombre().equals(nom))
                        isRepetido= true;
            }
            if(isRepetido){
                int resp=JOptionPane.showConfirmDialog(null,"Ya existe el cliente " + apel + ", " + nom  + " ¿Desea continuar?");
                switch (resp) {
                    case JOptionPane.OK_OPTION:
                        System.out.println("Selecciona opción Afirmativa");
                        break;
                    case JOptionPane.NO_OPTION:
                        System.out.println("No selecciona una opción afirmativa");
                        this.dispose();
                        return;
                    default:
                        return;
                }
            }
            
            Cliente nuevo_cliente;
            nuevo_cliente = new Cliente(apel,nom,fnac,tel,dir,ZV);
            try {
                Controlador.cliente_insertar(nuevo_cliente);
                flag = 1;
            } catch (SQLException ex) {
                Logger.getLogger(FormularioCliente.class.getName()).log(Level.SEVERE, null, ex);
                flag = 0;
            }
            this.dispose();
            if(flag == 1)
                JOptionPane.showMessageDialog(null,"La alta del cliente " + apel + " fue exitosa");
            else
                JOptionPane.showMessageDialog(null,"La alta del cliente " + apel + " no se pudo realizar");

        }
    }//GEN-LAST:event_jl_registrarMouseClicked

    private void tf_ZVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ZVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ZVActionPerformed

    private void tf_DVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_DVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_DVActionPerformed

    private void tf_diaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_diaFocusGained
        // TODO add your handling code here:
        
        if (flagdia == 0){
            tf_dia.setText("");
            flagdia=1;
        }
        ((AbstractDocument)tf_dia.getDocument()).setDocumentFilter(new Filtro_enteros());
       
    }//GEN-LAST:event_tf_diaFocusGained

    private void tf_mesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_mesFocusGained
        // TODO add your handling code here:
        if (flagmes == 0){
            tf_mes.setText("");
            flagmes=1;
        }
        ((AbstractDocument)tf_mes.getDocument()).setDocumentFilter(new Filtro_enteros());
    }//GEN-LAST:event_tf_mesFocusGained

    private void tf_anioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_anioFocusGained
        // TODO add your handling code here:
        if (flaganio == 0){
            tf_anio.setText("");
            flaganio=1;
        }       
        ((AbstractDocument)tf_anio.getDocument()).setDocumentFilter(new Filtro_enteros());
    }//GEN-LAST:event_tf_anioFocusGained

    private void tf_caractFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_caractFocusGained
        // TODO add your handling code here:
        if (flagcaract == 0){
            tf_caract.setText("");
            flagcaract=1;
        }
        ((AbstractDocument)tf_caract.getDocument()).setDocumentFilter(new Filtro_enteros());
    }//GEN-LAST:event_tf_caractFocusGained

    private void tf_telFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_telFocusGained
        // TODO add your handling code here:
        if (flagtel == 0){
            tf_tel.setText("");
            flagtel=1;
        }
        ((AbstractDocument)tf_tel.getDocument()).setDocumentFilter(new Filtro_enteros());
    }//GEN-LAST:event_tf_telFocusGained

    private void tf_ApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_ApellidoFocusLost
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tf_ApellidoFocusLost

    private void tf_ApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_ApellidoFocusGained
        // TODO add your handling code here:
        ((AbstractDocument)tf_Apellido.getDocument()).setDocumentFilter(new Filtro_CHAR());
    }//GEN-LAST:event_tf_ApellidoFocusGained

    private void tf_NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_NombreFocusGained
        ((AbstractDocument)tf_Nombre.getDocument()).setDocumentFilter(new Filtro_CHAR());
    }//GEN-LAST:event_tf_NombreFocusGained

    private void RehacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RehacerMouseClicked
        // TODO add your handling code here:
        if(memento_index>=0){

                String[] datos = originator.restoreFromMemento( caretaker.getMemento(memento_index) );

                tf_Apellido.setText(datos[0]);
                tf_Nombre.setText(datos[1]);
                tf_dia.setText(datos[2]);
                tf_mes.setText(datos[3]);
                tf_anio.setText(datos[4]);
                tf_tel.setText(datos[5]);
                tf_caract.setText(datos[6]);
                tf_DV.setText(datos[7]);
                tf_ZV.setText(datos[8]);
                // Make undo clickable
                memento_index--;
                if(memento_index>=0)
                    Rehacer.setEnabled(true);
                else
                    Rehacer.setEnabled(false);

        }
    }//GEN-LAST:event_RehacerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rehacer;
    private javax.swing.JLabel contadorMementos;
    private javax.swing.JLabel fondoFormularioCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jl_cancelar;
    private javax.swing.JLabel jl_cerrar;
    private javax.swing.JLabel jl_registrar;
    private javax.swing.JLabel lblMem;
    private javax.swing.JLabel lblRehacer;
    private javax.swing.JLabel lblTituloFC;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JTextField tf_Apellido;
    private javax.swing.JTextField tf_DV;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_ZV;
    private javax.swing.JTextField tf_anio;
    private javax.swing.JTextField tf_caract;
    private javax.swing.JTextField tf_dia;
    private javax.swing.JTextField tf_mes;
    private javax.swing.JTextField tf_tel;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w2;
    private javax.swing.JLabel w3;
    private javax.swing.JLabel w4;
    private javax.swing.JLabel w5;
    private javax.swing.JLabel w6;
    // End of variables declaration//GEN-END:variables
}
