package interfaz;

public class RegistroPane extends javax.swing.JFrame {

    public RegistroPane() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreLb = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        ApellidoLb = new javax.swing.JLabel();
        ApellidoTxt = new javax.swing.JTextField();
        DocumentoLb = new javax.swing.JLabel();
        DocumentoTxt = new javax.swing.JTextField();
        TipoLb = new javax.swing.JLabel();
        RepPassLb = new javax.swing.JLabel();
        DirecciónLb = new javax.swing.JLabel();
        DireccionTxt = new javax.swing.JTextField();
        TelefonoLb = new javax.swing.JLabel();
        TelefonoTxt = new javax.swing.JTextField();
        EmailLb = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        PasswordLb = new javax.swing.JLabel();
        TipoBox = new javax.swing.JComboBox<>();
        PasswordTxt = new javax.swing.JPasswordField();
        ConfirmarTxt = new javax.swing.JPasswordField();
        FechaLb = new javax.swing.JLabel();
        FechaTxt = new javax.swing.JFormattedTextField();
        RegistrarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        MostrarPassBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NombreLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NombreLb.setText("Nombre:");

        NombreTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ApellidoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ApellidoLb.setText("Apellido:");

        ApellidoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DocumentoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DocumentoLb.setText("Documento");

        DocumentoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TipoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoLb.setText("Tipo de Documento:");

        RepPassLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RepPassLb.setText("Repetir Contraseña:");

        DirecciónLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DirecciónLb.setText("Dirección:");

        DireccionTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TelefonoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TelefonoLb.setText("Telefono:");

        TelefonoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EmailLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailLb.setText("Email:");

        EmailTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PasswordLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordLb.setText("Contraseña:");

        TipoBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PasswordTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ConfirmarTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FechaLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FechaLb.setText("Fecha Nacimiento:");

        FechaTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        FechaTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RegistrarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegistrarBtn.setText("Registrarse");
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        MostrarPassBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarPassBtn.setText("Mostrar Contraseña");
        MostrarPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreLb)
                                .addComponent(ApellidoLb)
                                .addComponent(DocumentoLb)
                                .addComponent(TipoLb))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(TipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(FechaLb)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegistrarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VolverBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DirecciónLb)
                            .addComponent(TelefonoLb)
                            .addComponent(EmailLb)
                            .addComponent(RepPassLb)
                            .addComponent(PasswordLb))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ConfirmarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(MostrarPassBtn))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ApellidoTxt, ConfirmarTxt, DireccionTxt, DocumentoTxt, EmailTxt, FechaTxt, NombreTxt, PasswordTxt, TelefonoTxt, TipoBox});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NombreLb)
                                .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DirecciónLb)
                                .addComponent(DireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoLb)
                            .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TelefonoLb)
                        .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocumentoLb)
                    .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLb)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoLb)
                    .addComponent(PasswordLb)
                    .addComponent(TipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepPassLb)
                    .addComponent(ConfirmarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaLb)
                    .addComponent(FechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RegistrarBtn)
                        .addComponent(VolverBtn))
                    .addComponent(MostrarPassBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed
/*Miren mis cambios */
    }//GEN-LAST:event_RegistrarBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
       dispose();
       LoginPane volver= new LoginPane();
       volver.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void MostrarPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPassBtnActionPerformed
        if (MostrarPassBtn.isSelected()) {
            PasswordTxt.setEchoChar((char)0);
            ConfirmarTxt.setEchoChar((char)0);
        }else{
            PasswordTxt.setEchoChar('*');
            ConfirmarTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_MostrarPassBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoLb;
    private javax.swing.JTextField ApellidoTxt;
    private javax.swing.JPasswordField ConfirmarTxt;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JLabel DirecciónLb;
    private javax.swing.JLabel DocumentoLb;
    private javax.swing.JTextField DocumentoTxt;
    private javax.swing.JLabel EmailLb;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel FechaLb;
    private javax.swing.JFormattedTextField FechaTxt;
    private javax.swing.JToggleButton MostrarPassBtn;
    private javax.swing.JLabel NombreLb;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel PasswordLb;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JButton RegistrarBtn;
    private javax.swing.JLabel RepPassLb;
    private javax.swing.JLabel TelefonoLb;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JComboBox<String> TipoBox;
    private javax.swing.JLabel TipoLb;
    private javax.swing.JButton VolverBtn;
    // End of variables declaration//GEN-END:variables
}
