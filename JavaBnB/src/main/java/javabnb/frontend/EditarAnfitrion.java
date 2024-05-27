/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.awt.Container;
import java.awt.Point;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.awt.Point;
import javabnb.backend.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO
 */
public class EditarAnfitrion extends javax.swing.JFrame {

    Persona persona;
    /**
     * Creates new form MenuPrincipal
     * 
     * @param inicioSesion
     */
    public EditarAnfitrion( Point localizacion, Persona persona) {
        this.setLocation(localizacion);
        this.persona = persona;
        initComponents();
        this.setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        telefonoAnfitrion = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        emailAnfitrion = new javax.swing.JFormattedTextField();
        DNIAnfitrion = new javax.swing.JFormattedTextField();
        contraseñaAnfitrion = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreAnfitrion = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        editarNombre = new javax.swing.JButton();
        editarTel = new javax.swing.JButton();
        editarCorreo = new javax.swing.JButton();
        EditarClave = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jPanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanelBusqueda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 70, -1, -1));

        jButton1.setText("jButton1");
        jPanelBusqueda.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 174, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODIFICAR DATOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 130));

        jLabel5.setText("Clave");

        telefonoAnfitrion.setEditable(false);
        try {
            telefonoAnfitrion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ## ## ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonoAnfitrion.setText(String.valueOf(persona.getTelefono()));
        telefonoAnfitrion.setToolTipText("");
        telefonoAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoAnfitrionActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI");

        emailAnfitrion.setEditable(false);
        emailAnfitrion.setText(persona.getCorreo());
        emailAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAnfitrionActionPerformed(evt);
            }
        });

        DNIAnfitrion.setEditable(false);
        DNIAnfitrion.setText(persona.getDni());
        DNIAnfitrion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DNIAnfitrionFocusLost(evt);
            }
        });
        DNIAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIAnfitrionActionPerformed(evt);
            }
        });

        contraseñaAnfitrion.setEditable(false);
        contraseñaAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaAnfitrionActionPerformed(evt);
            }
        });

        jLabel6.setText("E-mail");

        jLabel4.setText("Nombre");

        nombreAnfitrion.setEditable(false);
        nombreAnfitrion.setText(persona.getNombre());
        nombreAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAnfitrionActionPerformed(evt);
            }
        });

        jLabel8.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DNIAnfitrion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoAnfitrion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailAnfitrion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreAnfitrion)
                    .addComponent(contraseñaAnfitrion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreAnfitrion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        BotonGuardar.setText("Guardar Datos");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 170, -1));

        editarNombre.setText("Editar");
        editarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(editarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 133, 75, -1));

        editarTel.setText("Editar");
        editarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTelActionPerformed(evt);
            }
        });
        getContentPane().add(editarTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 215, 75, -1));

        editarCorreo.setText("Editar");
        editarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(editarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 256, 75, -1));

        EditarClave.setText("Editar");
        EditarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClaveActionPerformed(evt);
            }
        });
        getContentPane().add(EditarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 297, 75, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 73));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 73));

        jMenu1.setText("Busqueda");

        jMenuItem3.setText("Buscar inmuebles");
        jMenuItem3.setToolTipText("");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reseñas");

        jMenuItem4.setText("Escribir reseña");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reservas");

        jMenuItem2.setText("Consultar reservas");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Perfil");

        jMenuItem1.setText("Modificar datos");
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefonoAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoAnfitrionActionPerformed

    }//GEN-LAST:event_telefonoAnfitrionActionPerformed

    private void emailAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAnfitrionActionPerformed

    }//GEN-LAST:event_emailAnfitrionActionPerformed

    private void DNIAnfitrionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DNIAnfitrionFocusLost
        if (DNIAnfitrion.getText().length() != 9){
            DNIAnfitrion.setText("");
        }
    }//GEN-LAST:event_DNIAnfitrionFocusLost

    private void DNIAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIAnfitrionActionPerformed

    }//GEN-LAST:event_DNIAnfitrionActionPerformed

    private void contraseñaAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaAnfitrionActionPerformed

    }//GEN-LAST:event_contraseñaAnfitrionActionPerformed

    private void nombreAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAnfitrionActionPerformed

    }//GEN-LAST:event_nombreAnfitrionActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
    if (!nombreAnfitrion.getText().equals("")) {
        nombreValido = true; 
    }
    if (!telefonoAnfitrion.getText().equals("") && telefonoAnfitrion.getText().length() == 12 ) {
        telefonoValido = true; 
    }
    if (contraseñaAnfitrion.getPassword().length > 0) {
        contraseñaValida = true; 
    }
    if (!emailAnfitrion.getText().equals("")) {
        emailValido = true;
    }
    for (Persona pers: GestorInmueble.getPersonas()){
         if (pers.getCorreo().equals(emailAnfitrion.getText())) {
         emailexistente = true;}}
    if (emailexistente){
             JOptionPane.showMessageDialog(this,"el correo pertenece a una cuenta ya existente","error de correo",JOptionPane.WARNING_MESSAGE);
    }      
    if (nombreValido &&  telefonoValido && contraseñaValida && emailValido && !emailexistente){
            persona.setNombre(nombreAnfitrion.getText());
            persona.setTelefono(Integer.parseInt(telefonoAnfitrion.getText().replace(" ","")));
            persona.setCorreo(emailAnfitrion.getText());
            this.dispose();
            MenuPrincipalCliente menucliente = new MenuPrincipalCliente(persona);
            menucliente.setLocation(this.getLocation());

    }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void editarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNombreActionPerformed
        nombreAnfitrion.setEditable(true);
    }//GEN-LAST:event_editarNombreActionPerformed

    private void editarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTelActionPerformed
        telefonoAnfitrion.setEditable(true);
    }//GEN-LAST:event_editarTelActionPerformed

    private void editarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCorreoActionPerformed
          emailAnfitrion.setEditable(true);
    }//GEN-LAST:event_editarCorreoActionPerformed

    private void EditarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClaveActionPerformed
         CambiarContraseña contr = new CambiarContraseña(persona);
         contr.setLocation(this.getLocation());
    }//GEN-LAST:event_EditarClaveActionPerformed

    
    boolean emailValido = false;
    boolean telefonoValido = false;
    boolean nombreValido = false;
    boolean contraseñaValida = false;
    boolean emailexistente = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JFormattedTextField DNIAnfitrion;
    private javax.swing.JButton EditarClave;
    private javax.swing.JPasswordField contraseñaAnfitrion;
    private javax.swing.JButton editarCorreo;
    private javax.swing.JButton editarNombre;
    private javax.swing.JButton editarTel;
    private javax.swing.JFormattedTextField emailAnfitrion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JFormattedTextField nombreAnfitrion;
    private javax.swing.JFormattedTextField telefonoAnfitrion;
    // End of variables declaration//GEN-END:variables
}