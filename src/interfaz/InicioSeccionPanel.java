package interfaz;

import java.util.Arrays;
import javax.swing.*;
import logica.*;

public class InicioSeccionPanel extends javax.swing.JFrame {

    public InicioSeccionPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private static String documento;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarseBtn = new javax.swing.JButton();
        ingresar_Btn = new javax.swing.JButton();
        documento_Lb = new javax.swing.JLabel();
        contraseña_Lb = new javax.swing.JLabel();
        documentoTxt = new javax.swing.JTextField();
        claveTxt = new javax.swing.JPasswordField();
        salir_Btn = new javax.swing.JButton();
        iconoUser_Lb = new javax.swing.JLabel();
        mostrarPassBtn = new javax.swing.JToggleButton();
        fondoImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarseBtn.setBackground(new java.awt.Color(204, 204, 255));
        RegistrarseBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegistrarseBtn.setForeground(new java.awt.Color(102, 102, 102));
        RegistrarseBtn.setText("Registrarse");
        RegistrarseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        ingresar_Btn.setBackground(new java.awt.Color(204, 204, 255));
        ingresar_Btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingresar_Btn.setForeground(new java.awt.Color(102, 102, 102));
        ingresar_Btn.setText("Ingresar");
        ingresar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        documento_Lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        documento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        documento_Lb.setText("Documento :");
        getContentPane().add(documento_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        contraseña_Lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contraseña_Lb.setForeground(new java.awt.Color(255, 255, 255));
        contraseña_Lb.setText("Contraseña :");
        getContentPane().add(contraseña_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        documentoTxt.setBackground(new java.awt.Color(204, 204, 255));
        documentoTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(documentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 30));

        claveTxt.setBackground(new java.awt.Color(204, 204, 255));
        claveTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(claveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 130, 30));

        salir_Btn.setBackground(new java.awt.Color(204, 204, 255));
        salir_Btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir_Btn.setForeground(new java.awt.Color(102, 102, 102));
        salir_Btn.setText("Salir");
        salir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(salir_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        iconoUser_Lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/People-Patient-Male-icon.png"))); // NOI18N
        getContentPane().add(iconoUser_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        mostrarPassBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mostrarPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye-shape-variant-interface-view-symbol_318-60501.png"))); // NOI18N
        mostrarPassBtn.setMaximumSize(new java.awt.Dimension(33, 33));
        mostrarPassBtn.setMinimumSize(new java.awt.Dimension(33, 33));
        mostrarPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 33, 33));

        fondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N
        fondoImagen.setDisabledIcon(null);
        getContentPane().add(fondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_BtnActionPerformed
        documento = documentoTxt.getText();
        String clave = Arrays.toString(claveTxt.getPassword());
        if (!documento.equals("") && !clave.equals("")) {
            Registro ingreso = new Registro();
            boolean acceso = ingreso.ingresar(documento, clave);
            if (acceso == true) {
                JOptionPane.showMessageDialog(rootPane, "Felicidades ingreso");
                MenuAdmin adminPanel = new MenuAdmin();
                adminPanel.setVisible(true);
                dispose();
            } else {
                documentoTxt.setText("");
                claveTxt.setText("");
                JOptionPane.showMessageDialog(rootPane, "El usuario no se encuentra registrado o ingreso mal los campos intente nuevamente");
            }
        }

        MenuAdmin adminPanel = new MenuAdmin();
        adminPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingresar_BtnActionPerformed

    private void salir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_BtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir_BtnActionPerformed

    private void RegistrarseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseBtnActionPerformed
        RegistroPaciente panelRegistro = new RegistroPaciente();
        panelRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistrarseBtnActionPerformed

    private void mostrarPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPassBtnActionPerformed
        if (mostrarPassBtn.isSelected()) {
            claveTxt.setEchoChar((char) 0);
        } else {
            claveTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarPassBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSeccionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSeccionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSeccionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSeccionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSeccionPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistrarseBtn;
    private javax.swing.JPasswordField claveTxt;
    private javax.swing.JLabel contraseña_Lb;
    private javax.swing.JTextField documentoTxt;
    private javax.swing.JLabel documento_Lb;
    private javax.swing.JLabel fondoImagen;
    private javax.swing.JLabel iconoUser_Lb;
    private javax.swing.JButton ingresar_Btn;
    private javax.swing.JToggleButton mostrarPassBtn;
    private javax.swing.JButton salir_Btn;
    // End of variables declaration//GEN-END:variables
}
