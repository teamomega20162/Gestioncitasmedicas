package interfaz;

public class InicioSeccionPanel extends javax.swing.JFrame {

    public InicioSeccionPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarseBtn = new javax.swing.JButton();
        ingresar_Btn = new javax.swing.JButton();
        documento_Lb = new javax.swing.JLabel();
        contraseña_Lb = new javax.swing.JLabel();
        documento_TextF = new javax.swing.JTextField();
        contraseña_PassF = new javax.swing.JPasswordField();
        salir_Btn = new javax.swing.JButton();
        iconoUser_Lb = new javax.swing.JLabel();
        fondoImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        documento_TextF.setBackground(new java.awt.Color(204, 204, 255));
        documento_TextF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(documento_TextF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 30));

        contraseña_PassF.setBackground(new java.awt.Color(204, 204, 255));
        contraseña_PassF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(contraseña_PassF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 30));

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

        fondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N
        fondoImagen.setDisabledIcon(null);
        getContentPane().add(fondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_BtnActionPerformed
//        String documento = documento_TextF.getText();
//        String contraseña = contraseña_PassF.getPassword().toString();
//        Registro ingreso = new Registro();
//        boolean acceso = ingreso.ingresar(documento, contraseña);
//        if (acceso == true) {
//            JOptionPane.showMessageDialog(rootPane, "Felicidades ingreso");
//        } else {
//            documento_TextF.setText("");
//            contraseña_PassF.setText("");
//            JOptionPane.showMessageDialog(rootPane, "El usuario no se encuentra registrado o ingreso mal los campos intente nuevamente");
//        }+
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
    private javax.swing.JLabel contraseña_Lb;
    private javax.swing.JPasswordField contraseña_PassF;
    private javax.swing.JLabel documento_Lb;
    private javax.swing.JTextField documento_TextF;
    private javax.swing.JLabel fondoImagen;
    private javax.swing.JLabel iconoUser_Lb;
    private javax.swing.JButton ingresar_Btn;
    private javax.swing.JButton salir_Btn;
    // End of variables declaration//GEN-END:variables
}
