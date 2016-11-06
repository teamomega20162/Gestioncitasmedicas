package interfaz;

public class InicioSeccionPanel extends javax.swing.JFrame {

    public InicioSeccionPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresar_Btn = new javax.swing.JButton();
        documento_Lb = new javax.swing.JLabel();
        contraseña_Lb = new javax.swing.JLabel();
        documento_TextF = new javax.swing.JTextField();
        contraseña_PassF = new javax.swing.JPasswordField();
        salir_Btn = new javax.swing.JButton();
        iconoUser_Lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ingresar_Btn.setBackground(new java.awt.Color(204, 204, 255));
        ingresar_Btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingresar_Btn.setForeground(new java.awt.Color(102, 102, 102));
        ingresar_Btn.setText("Ingresar");
        ingresar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_BtnActionPerformed(evt);
            }
        });

        documento_Lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        documento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        documento_Lb.setText("Documento :");

        contraseña_Lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contraseña_Lb.setForeground(new java.awt.Color(255, 255, 255));
        contraseña_Lb.setText("Contraseña :");

        documento_TextF.setBackground(new java.awt.Color(204, 204, 255));
        documento_TextF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        contraseña_PassF.setBackground(new java.awt.Color(204, 204, 255));
        contraseña_PassF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        salir_Btn.setBackground(new java.awt.Color(204, 204, 255));
        salir_Btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir_Btn.setForeground(new java.awt.Color(102, 102, 102));
        salir_Btn.setText("Salir");
        salir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_BtnActionPerformed(evt);
            }
        });

        iconoUser_Lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/People-Patient-Male-icon.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(documento_Lb)
                .addGap(11, 11, 11)
                .addComponent(documento_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(contraseña_Lb)
                .addGap(11, 11, 11)
                .addComponent(contraseña_PassF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(iconoUser_Lb))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(ingresar_Btn))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(salir_Btn))
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(documento_Lb))
                    .addComponent(documento_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(contraseña_Lb))
                    .addComponent(contraseña_PassF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(iconoUser_Lb))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(ingresar_Btn))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(salir_Btn))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
    RegistroPaciente panelRegistro = new RegistroPaciente();
    panelRegistro.setVisible(true);
    dispose();
    }//GEN-LAST:event_ingresar_BtnActionPerformed

    private void salir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_BtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir_BtnActionPerformed

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
    private javax.swing.JLabel contraseña_Lb;
    private javax.swing.JPasswordField contraseña_PassF;
    private javax.swing.JLabel documento_Lb;
    private javax.swing.JTextField documento_TextF;
    private javax.swing.JLabel iconoUser_Lb;
    private javax.swing.JButton ingresar_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton salir_Btn;
    // End of variables declaration//GEN-END:variables
}
