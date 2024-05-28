

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.awt.Container;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import javabnb.backend.*;
import javabnb.frontend.EditarAnfitrion;
import javabnb.frontend.EditarCliente;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author ALEJANDRO
 */
public class VerUsuariosAdministrador extends javax.swing.JFrame {

    Persona persona;
    
    ArrayList<Persona> listaUsuarios = GestorInmueble.getPersonas();
    int pagAct = 0; 
    int numPag = (int) Math.ceil(listaUsuarios.size()/4);
    int startIndex = pagAct*4;
    
    /**
     * Creates new form MenuPrincipal
     * 
     * @param inicioSesion
     */
    public VerUsuariosAdministrador( Point localizacion) {
        this.setLocation(localizacion);

        Persona persona1 = listaUsuarios.get(startIndex);
        Persona persona2 = listaUsuarios.get(startIndex+1);
        Persona persona3 = listaUsuarios.get(startIndex+2);
        Persona persona4 = listaUsuarios.get(startIndex+3);
        
        initComponents();
        
        
        this.setVisible(true);
        
        nombre.setText("");
        correo.setText("");
        telefono.setText("");
        DNI.setText("");
        esVip.setText("");
        tipo4.setText("");

        
        
        nombre1.setText("");
        correo1.setText("");
        telefono1.setText("");
        DNI1.setText("");
        esVip1.setText("");
        tipo1.setText("");

        
        nombre2.setText("");
        correo2.setText("");
        telefono2.setText("");
        DNI2.setText("");
        esVip2.setText("");
        tipo2.setText("");

        
        nombre3.setText("");
        correo3.setText("");
        telefono3.setText("");
        DNI3.setText("");
        esVip3.setText("");
        tipo3.setText("");
  

    if (startIndex < listaUsuarios.size()) {
        persona1 = listaUsuarios.get(pagAct*4);
        nombre.setText(persona1.getNombre());
        correo.setText(persona1.getCorreo());
        telefono.setText(String.valueOf( persona1.getTelefono()));
        DNI.setText(persona1.getDni());
        if (persona1 instanceof ClienteParticular) {
            if(((ClienteParticular)persona1).isVip()) {esVip.setText("Sí");}
            if(!((ClienteParticular)persona1).isVip()) {esVip.setText("No");}
        else {esVip.setText("No Disponible");}
        if (persona1 instanceof ClienteParticular) { tipo4.setText("Cliente Particular");}
        else {tipo4.setText("Anfitrión");}
        }
    }
        
    if (startIndex+1 < listaUsuarios.size()) {
        persona2 = listaUsuarios.get(pagAct*4+1);
        nombre1.setText(persona2.getNombre());
        correo1.setText(persona2.getCorreo());
        telefono1.setText(String.valueOf( persona2.getTelefono()));
        DNI1.setText(persona2.getDni());
        if(persona instanceof ClienteParticular) {
            if(((ClienteParticular)persona2).isVip()) {esVip1.setText("Sí");}
            if(!((ClienteParticular)persona2).isVip()) {esVip1.setText("No");}
        else {esVip1.setText("No Disponible");}
        if (persona2 instanceof ClienteParticular) { tipo1.setText("Cliente Particular");}
        else {tipo1.setText("Anfitrión");}
        }
    }   

    if (startIndex+2 < listaUsuarios.size()) {
        persona3 = listaUsuarios.get(pagAct*4+2);
        nombre2.setText(persona3.getNombre());
        correo2.setText(persona3.getCorreo());
        telefono2.setText(String.valueOf( persona3.getTelefono()));
        DNI2.setText(persona3.getDni());
        if(persona2 instanceof ClienteParticular) {
            if(((ClienteParticular)persona3).isVip()) {esVip2.setText("Sí");}
            if(!((ClienteParticular)persona3).isVip()) {esVip2.setText("No");}
        else {esVip2.setText("No Disponible");}
        if (persona3 instanceof ClienteParticular) { tipo2.setText("Cliente Particular");}
        else {tipo2.setText("Anfitrión");}
        }  
    }
    
    if (startIndex+3 < listaUsuarios.size()) {
        persona4 = listaUsuarios.get(pagAct*4+3);
        nombre3.setText(persona4.getNombre());
        correo3.setText(persona4.getCorreo());
        telefono3.setText(String.valueOf( persona4.getTelefono()));
        DNI3.setText(persona4.getDni());
        if(persona instanceof ClienteParticular) {
            if(((ClienteParticular)persona4).isVip()) {esVip3.setText("Sí");}
            if(!((ClienteParticular)persona4).isVip()) {esVip3.setText("No");}
        else {esVip3.setText("No Disponible");}
        if (persona4 instanceof ClienteParticular) { tipo3.setText("Cliente Particular");}
        else {tipo3.setText("Anfitrión");}
        
    }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        canvas1 = new java.awt.Canvas();
        jPanel4 = new javax.swing.JPanel();
        precio1 = new javax.swing.JLabel();
        media1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        superVip = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        DNI = new javax.swing.JLabel();
        esVip = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        tipo4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        media2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        telefono1 = new javax.swing.JLabel();
        DNI1 = new javax.swing.JLabel();
        esVip1 = new javax.swing.JLabel();
        tipo1 = new javax.swing.JLabel();
        superVip1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        media3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        correo2 = new javax.swing.JLabel();
        telefono2 = new javax.swing.JLabel();
        DNI2 = new javax.swing.JLabel();
        esVip2 = new javax.swing.JLabel();
        tipo2 = new javax.swing.JLabel();
        superVip2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        titulo4 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        media4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        correo3 = new javax.swing.JLabel();
        telefono3 = new javax.swing.JLabel();
        DNI3 = new javax.swing.JLabel();
        esVip3 = new javax.swing.JLabel();
        tipo3 = new javax.swing.JLabel();
        superVip3 = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        botonInmuebles = new javax.swing.JMenuItem();
        BotonInmuebles = new javax.swing.JMenu();
        botonUsuarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jPanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanelBusqueda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 70, -1, -1));

        jButton1.setText("jButton1");
        jPanelBusqueda.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 174, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaBnB");
        setMinimumSize(new java.awt.Dimension(900, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel4.add(media1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jLabel3.setText("Correo");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        jLabel4.setText("telefono");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setText("DNI");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        jLabel7.setText("Tipo:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        superVip.setText("Es  Vip");
        jPanel4.add(superVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        nombre.setText("jLabel6");
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, 20));

        correo.setText("jLabel9");
        jPanel4.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, -1));

        telefono.setText("jLabel10");
        jPanel4.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));

        DNI.setText("jLabel11");
        jPanel4.add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, -1));

        esVip.setText("jLabel12");
        jPanel4.add(esVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, -1));
        jPanel4.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 180, -1));

        tipo4.setText("jLabel15");
        jPanel4.add(tipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 100, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 690, 130));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 730, 75, -1));

        botonAtras.setText("Anterior");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 40));
        jPanel5.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel5.add(media2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nombre");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jLabel10.setText("Correo");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        jLabel11.setText("telefono");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel12.setText("DNI");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        jLabel13.setText("Tipo:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        nombre1.setText("jLabel6");
        jPanel5.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, 20));

        correo1.setText("jLabel9");
        jPanel5.add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, -1));

        telefono1.setText("jLabel10");
        jPanel5.add(telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));

        DNI1.setText("jLabel11");
        jPanel5.add(DNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, -1));

        esVip1.setText("jLabel12");
        jPanel5.add(esVip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, -1));

        tipo1.setText("jLabel6");
        jPanel5.add(tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, -1));

        superVip1.setText("Es  Vip");
        jPanel5.add(superVip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 690, 130));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 80, 40));
        jPanel6.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel6.add(media3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Nombre");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jLabel17.setText("Correo");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        jLabel18.setText("telefono");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel19.setText("DNI");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        jLabel20.setText("Tipo:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        nombre2.setText("jLabel6");
        jPanel6.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, 20));

        correo2.setText("jLabel9");
        jPanel6.add(correo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, -1));

        telefono2.setText("jLabel10");
        jPanel6.add(telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));

        DNI2.setText("jLabel11");
        jPanel6.add(DNI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, -1));

        esVip2.setText("jLabel12");
        jPanel6.add(esVip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, -1));

        tipo2.setText("jLabel6");
        jPanel6.add(tipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, -1));

        superVip2.setText("Es  Vip");
        jPanel6.add(superVip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 690, 130));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel7.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 80, 40));
        jPanel7.add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel7.add(media4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Nombre");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jLabel24.setText("Correo");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        jLabel25.setText("telefono");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel26.setText("DNI");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        jLabel27.setText("Tipo:");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        nombre3.setText("jLabel6");
        jPanel7.add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, 20));

        correo3.setText("jLabel9");
        jPanel7.add(correo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, -1));

        telefono3.setText("jLabel10");
        jPanel7.add(telefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));

        DNI3.setText("jLabel11");
        jPanel7.add(DNI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, -1));

        esVip3.setText("jLabel12");
        jPanel7.add(esVip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, -1));

        tipo3.setText("jLabel6");
        jPanel7.add(tipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 140, -1));

        superVip3.setText("Es  Vip");
        jPanel7.add(superVip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 690, 130));

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 73));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 73));

        jMenu2.setText("Inmuebles");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu2.setMinimumSize(new java.awt.Dimension(120, 22));

        botonInmuebles.setText("Mostrar inmuebles");
        botonInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInmueblesActionPerformed(evt);
            }
        });
        jMenu2.add(botonInmuebles);

        jMenuBar1.add(jMenu2);

        BotonInmuebles.setText("Usuarios");
        BotonInmuebles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonInmuebles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonInmuebles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonInmuebles.setMaximumSize(new java.awt.Dimension(120, 32767));
        BotonInmuebles.setMinimumSize(new java.awt.Dimension(120, 22));

        botonUsuarios.setText("Mostar usuarios");
        botonUsuarios.setToolTipText("");
        botonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuariosActionPerformed(evt);
            }
        });
        BotonInmuebles.add(botonUsuarios);

        jMenuBar1.add(BotonInmuebles);

        jMenu3.setText("Reservas");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu3.setMinimumSize(new java.awt.Dimension(120, 22));

        jMenuItem2.setText("Mostrar reservas");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
    if (pagAct >0) {pagAct--;}
        Persona persona1 = listaUsuarios.get(startIndex);
        Persona persona2 = listaUsuarios.get(startIndex+1);
        Persona persona3 = listaUsuarios.get(startIndex+2);
        Persona persona4 = listaUsuarios.get(startIndex+3);
    
    
       nombre1.setText("");
        correo1.setText("");
        telefono1.setText("");
        DNI1.setText("");
        esVip1.setText("");
        tipo1.setText("");

        
        nombre2.setText("");
        correo2.setText("");
        telefono2.setText("");
        DNI2.setText("");
        esVip2.setText("");
        tipo2.setText("");

        
        nombre3.setText("");
        correo3.setText("");
        telefono3.setText("");
        DNI3.setText("");
        esVip3.setText("");
        tipo3.setText("");


    if (startIndex < listaUsuarios.size()) {
        persona1 = listaUsuarios.get(pagAct*4);
        nombre.setText(persona1.getNombre());
        correo.setText(persona1.getCorreo());
        telefono.setText(String.valueOf( persona1.getTelefono()));
        DNI.setText(persona1.getDni());
        if (persona1 instanceof ClienteParticular) {
            if(((ClienteParticular)persona1).isVip()) {esVip.setText("Sí");}
            if(!((ClienteParticular)persona1).isVip()) {esVip.setText("No");}
        else {esVip.setText("No Disponible");}
        if (persona1 instanceof ClienteParticular) { tipo4.setText("Cliente Particular");}
        else {tipo4.setText("Anfitrión");}
        } 
    }
        
    if (startIndex+1 < listaUsuarios.size()) {
        persona2 = listaUsuarios.get(pagAct*4+1);
        nombre1.setText(persona2.getNombre());
        correo1.setText(persona2.getCorreo());
        telefono1.setText(String.valueOf( persona2.getTelefono()));
        DNI1.setText(persona2.getDni());
        if(persona instanceof ClienteParticular) {
            if(((ClienteParticular)persona2).isVip()) {esVip1.setText("Sí");}
            if(!((ClienteParticular)persona2).isVip()) {esVip1.setText("No");}
        else {esVip1.setText("No Disponible");}
        if (persona2 instanceof ClienteParticular) { tipo1.setText("Cliente Particular");}
        else {tipo1.setText("Anfitrión");}
        }
    }   

    if (startIndex+2 < listaUsuarios.size()) {
        persona3 = listaUsuarios.get(pagAct*4+2);
        nombre2.setText(persona3.getNombre());
        correo2.setText(persona3.getCorreo());
        telefono2.setText(String.valueOf( persona3.getTelefono()));
        DNI2.setText(persona3.getDni());
        if(persona2 instanceof ClienteParticular) {
            if(((ClienteParticular)persona3).isVip()) {esVip2.setText("Sí");}
            if(!((ClienteParticular)persona3).isVip()) {esVip2.setText("No");}
        else {esVip2.setText("No Disponible");}
        if (persona3 instanceof ClienteParticular) { tipo2.setText("Cliente Particular");}
        else {tipo2.setText("Anfitrión");}
        }
    }
    
    if (startIndex+3 < listaUsuarios.size()) {
        persona4 = listaUsuarios.get(pagAct*4+3);
        nombre3.setText(persona4.getNombre());
        correo3.setText(persona4.getCorreo());
        telefono3.setText(String.valueOf( persona4.getTelefono()));
        DNI3.setText(persona4.getDni());
        if(persona4 instanceof ClienteParticular) {
            if(((ClienteParticular)persona4).isVip()) {esVip3.setText("Sí");}
           if(!((ClienteParticular)persona4).isVip()) {esVip3.setText("No");}
        else {esVip3.setText("No Disponible");}
        if (persona4 instanceof ClienteParticular) { tipo3.setText("Cliente Particular");}
        else {tipo3.setText("Anfitrión");}
        } }    
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        if (pagAct < numPag){ pagAct++;}
        
        Persona persona1 = listaUsuarios.get(startIndex);
        Persona persona2 = listaUsuarios.get(startIndex+1);
        Persona persona3 = listaUsuarios.get(startIndex+2);
        Persona persona4 = listaUsuarios.get(startIndex+3);
    
    
       nombre1.setText("");
        correo1.setText("");
        telefono1.setText("");
        DNI1.setText("");
        esVip1.setText("");
        tipo1.setText("");
        
        
        nombre2.setText("");
        correo2.setText("");
        telefono2.setText("");
        DNI2.setText("");
        esVip2.setText("");
        tipo2.setText("");
       
        
        nombre3.setText("");
        correo3.setText("");
        telefono3.setText("");
        DNI3.setText("");
        esVip3.setText("");
        tipo3.setText("");
        

    if (startIndex < listaUsuarios.size()) {
        persona1 = listaUsuarios.get(pagAct*4);
        nombre.setText(persona1.getNombre());
        correo.setText(persona1.getCorreo());
        telefono.setText(String.valueOf( persona1.getTelefono()));
        DNI.setText(persona1.getDni());
        if (persona1 instanceof ClienteParticular) {
            if(((ClienteParticular)persona1).isVip()) {esVip.setText("Sí");}
            if(!((ClienteParticular)persona1).isVip()) {esVip.setText("No");}
        else {esVip.setText("No Disponible");}
        if (persona1 instanceof ClienteParticular) { tipo4.setText("Cliente Particular");}
        else {tipo4.setText("Anfitrión");}}
 
    }
        
    if (startIndex+1 < listaUsuarios.size()) {
        persona2 = listaUsuarios.get(pagAct*4+1);
        nombre1.setText(persona2.getNombre());
        correo1.setText(persona2.getCorreo());
        telefono1.setText(String.valueOf( persona2.getTelefono()));
        DNI1.setText(persona2.getDni());
        if(persona2 instanceof ClienteParticular) {
            if(((ClienteParticular)persona2).isVip()) {esVip1.setText("Sí");}
            if(!((ClienteParticular)persona2).isVip()) {esVip1.setText("No");}
        else {esVip1.setText("No Disponible");}
        if (persona2 instanceof ClienteParticular) { tipo1.setText("Cliente Particular");}
        else {tipo1.setText("Anfitrión");}
        }
    }   

    if (startIndex+2 < listaUsuarios.size()) {
        persona3 = listaUsuarios.get(pagAct*4+2);
        nombre2.setText(persona3.getNombre());
        correo2.setText(persona3.getCorreo());
        telefono2.setText(String.valueOf( persona3.getTelefono()));
        DNI2.setText(persona3.getDni());
        if(persona2 instanceof ClienteParticular) {
            if(((ClienteParticular)persona3).isVip()) {esVip2.setText("Sí");}
            if(!((ClienteParticular)persona3).isVip()) {esVip2.setText("No");}
        else {esVip2.setText("No Disponible");}
        if (persona3 instanceof ClienteParticular) { tipo2.setText("Cliente Particular");}
        else {tipo2.setText("Anfitrión");}
        }
    }
    
    if (startIndex+3 < listaUsuarios.size()) {
        persona4 = listaUsuarios.get(pagAct*4+3);
        nombre3.setText(persona4.getNombre());
        correo3.setText(persona4.getCorreo());
        telefono3.setText(String.valueOf( persona4.getTelefono()));
        DNI3.setText(persona4.getDni());
        if(persona4 instanceof ClienteParticular) {
            if(((ClienteParticular)persona4).isVip()) {esVip3.setText("Sí");}
            if(!((ClienteParticular)persona4).isVip()) {esVip3.setText("No");}
        else {esVip3.setText("No Disponible");}
        if (persona4 instanceof ClienteParticular) { tipo3.setText("Cliente Particular");}
        else {tipo3.setText("Anfitrión");}
        } 
    }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuariosActionPerformed
        VerUsuariosAdministrador users= new VerUsuariosAdministrador(this.getLocation());
        users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonUsuariosActionPerformed

    private void botonInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInmueblesActionPerformed
 VerUsuariosAdministrador menuAdmin = new VerUsuariosAdministrador(this.getLocation());
        menuAdmin.setVisible(true);
        this.dispose();         
    }//GEN-LAST:event_botonInmueblesActionPerformed
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BotonInmuebles;
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel DNI1;
    private javax.swing.JLabel DNI2;
    private javax.swing.JLabel DNI3;
    private javax.swing.JButton botonAtras;
    private javax.swing.JMenuItem botonInmuebles;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JMenuItem botonUsuarios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel correo2;
    private javax.swing.JLabel correo3;
    private javax.swing.JLabel esVip;
    private javax.swing.JLabel esVip1;
    private javax.swing.JLabel esVip2;
    private javax.swing.JLabel esVip3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JLabel media1;
    private javax.swing.JLabel media2;
    private javax.swing.JLabel media3;
    private javax.swing.JLabel media4;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel superVip;
    private javax.swing.JLabel superVip1;
    private javax.swing.JLabel superVip2;
    private javax.swing.JLabel superVip3;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono1;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel telefono3;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel tipo1;
    private javax.swing.JLabel tipo2;
    private javax.swing.JLabel tipo3;
    private javax.swing.JLabel tipo4;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
