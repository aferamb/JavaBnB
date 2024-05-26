/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;


import java.awt.Point;
import javabnb.backend.*;
/**
 *
 * @author sco23
 */
public class EditarDatosAnfitrion extends javax.swing.JFrame {

    Anfitrion anfitrion;
    MenuPrincipal menuPrincipal;
    boolean emailValido = false;
    boolean telefonoValido = false;
    boolean nombreValido = false;
    boolean contraseñaValida = false;
    
    /**
     * Creates new form MenuEditarDatos
     * @param menuPrincipal
     * @param localizacion
     * @param persona
     */
    public EditarDatosAnfitrion(MenuPrincipal menuPrincipal, Point localizacion, Persona persona) {
        this.menuPrincipal = menuPrincipal;
        menuPrincipal.setVisible(false);
        this.setLocation(localizacion);
        initComponents();
        this.anfitrion = (Anfitrion) persona;
    }
    public EditarDatosAnfitrion() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        telefonoAnfitron = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        emailAnfitrion = new javax.swing.JFormattedTextField();
        DNIAnfitrion = new javax.swing.JFormattedTextField();
        contraseñaAnfitrion = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreAnfitrion = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        editarNombre = new javax.swing.JButton();
        editarTel = new javax.swing.JButton();
        editarCorreo = new javax.swing.JButton();
        editarClave = new javax.swing.JButton();
        GuardarDatos = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TUS DATOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 31, 256, 46));

        jLabel5.setText("Clave");

        telefonoAnfitron.setEditable(false);
        try {
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonoAnfitron.setText(str(anfitrion.getTelefono()));
        telefonoAnfitron.setToolTipText("");
        telefonoAnfitron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoAnfitronActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI");

        emailAnfitrion.setEditable(false);
        emailAnfitrion.setText(anfitrion.getCorreo());
        emailAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAnfitrionActionPerformed(evt);
            }
        });

        DNIAnfitrion.setEditable(false);
        DNIAnfitrion.setText(anfitrion.getDni());
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
        nombreAnfitrion.setText(anfitrion.getNombre());
        nombreAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAnfitrionActionPerformed(evt);
            }
        });

        jLabel7.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DNIAnfitrion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoAnfitron, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailAnfitrion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreAnfitrion)
                    .addComponent(contraseñaAnfitrion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoAnfitron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 140, -1, -1));

        editarNombre.setText("Editar");
        editarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(editarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 143, 75, -1));

        editarTel.setText("Editar");
        editarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTelActionPerformed(evt);
            }
        });
        getContentPane().add(editarTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 225, 75, -1));

        editarCorreo.setText("Editar");
        editarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(editarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 266, 75, -1));

        editarClave.setText("Editar");
        editarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClaveActionPerformed(evt);
            }
        });
        getContentPane().add(editarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 307, 75, -1));

        GuardarDatos.setText("Guardar Datos");
        GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 376, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefonoAnfitronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoAnfitronActionPerformed

    }//GEN-LAST:event_telefonoAnfitronActionPerformed

    private void emailAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAnfitrionActionPerformed

    }//GEN-LAST:event_emailAnfitrionActionPerformed

    private void DNIAnfitrionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DNIAnfitrionFocusLost
        
    }//GEN-LAST:event_DNIAnfitrionFocusLost

    private void DNIAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIAnfitrionActionPerformed
        DNIAnfitrion.setText(anfitrion.getDni());
    }//GEN-LAST:event_DNIAnfitrionActionPerformed

    private void contraseñaAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaAnfitrionActionPerformed

    }//GEN-LAST:event_contraseñaAnfitrionActionPerformed

    private void nombreAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAnfitrionActionPerformed

    }//GEN-LAST:event_nombreAnfitrionActionPerformed

    private void editarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNombreActionPerformed
        nombreAnfitrion.setEditable(true);
    }//GEN-LAST:event_editarNombreActionPerformed

    private void editarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTelActionPerformed
        telefonoAnfitron.setEditable(true);
    }//GEN-LAST:event_editarTelActionPerformed

    private void editarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCorreoActionPerformed
        emailAnfitrion.setEditable(true);
    }//GEN-LAST:event_editarCorreoActionPerformed

    private void GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosActionPerformed
    if (!nombreAnfitrion.getText().equals("")) {
        nombreValido = true; 
    }

    if (!telefonoAnfitron.getText().equals("") && telefonoAnfitron.getText().length() == 12 ) {
        telefonoValido = true; 
    }
    if (contraseñaAnfitrion.getPassword().length > 0) {
        contraseñaValida = true; 
    }
    if (!emailAnfitrion.getText().equals("")) {
        emailValido = true;
    }
    if (nombreValido &&  telefonoValido && contraseñaValida && emailValido){
            anfitrion.setNombre(nombreAnfitrion.getText());
            anfitrion.setTelefono(Integer.parseInt(telefonoAnfitron.getText().replace(" ","")));
            anfitrion.setCorreo(emailAnfitrion.getText());
            menuPrincipal.setVisible(true);
            this.dispose();
    }
    }//GEN-LAST:event_GuardarDatosActionPerformed

    private void editarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClaveActionPerformed
        CambiarContraseña contr = new CambiarContraseña(anfitrion);
        contr.setLocation(this.getLocation());
    }//GEN-LAST:event_editarClaveActionPerformed
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
            java.util.logging.Logger.getLogger(EditarDatosAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDatosAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDatosAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDatosAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarDatosAnfitrion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DNIAnfitrion;
    private javax.swing.JButton GuardarDatos;
    private javax.swing.JPasswordField contraseñaAnfitrion;
    private javax.swing.JButton editarClave;
    private javax.swing.JButton editarCorreo;
    private javax.swing.JButton editarNombre;
    private javax.swing.JButton editarTel;
    private javax.swing.JFormattedTextField emailAnfitrion;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField nombreAnfitrion;
    private javax.swing.JFormattedTextField telefonoAnfitron;
    // End of variables declaration//GEN-END:variables

    private String str(int telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
