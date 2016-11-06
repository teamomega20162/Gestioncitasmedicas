package interfaz;
import Atxy2k.CustomTextField.RestrictedTextField;
public class ActualizarInfoPane extends javax.swing.JFrame {

    public ActualizarInfoPane() {
        initComponents();
        RestrictedTextField texto = new RestrictedTextField(ConfirmarTxt,"/*-+");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        RegistrarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        AnteriorLb = new javax.swing.JLabel();
        AnteriorTxt = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        PasswordLb.setText("Contraseña nueva:");

        TipoBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PasswordTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ConfirmarTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RegistrarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegistrarBtn.setText("Registrarse");

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        AnteriorLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AnteriorLb.setText("Contraseña anterior:");

        AnteriorTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton1.setText("Mostrar Contraseña");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DirecciónLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(TelefonoLb)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DocumentoLb)
                                            .addComponent(TipoLb))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TipoBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnteriorLb)
                            .addComponent(EmailLb)
                            .addComponent(PasswordLb)
                            .addComponent(RepPassLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(AnteriorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegistrarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VolverBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ConfirmarTxt, DireccionTxt, DocumentoTxt, EmailTxt, PasswordTxt, TelefonoTxt, TipoBox});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DocumentoLb)
                            .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AnteriorLb)
                                .addComponent(AnteriorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TipoLb)
                                .addComponent(TipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DirecciónLb)
                            .addComponent(DireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonoLb)
                            .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RepPassLb)
                            .addComponent(ConfirmarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarBtn)
                    .addComponent(VolverBtn)
                    .addComponent(jToggleButton1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        dispose();
        MenuAdmin volver = new MenuAdmin();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            ConfirmarTxt.setEchoChar((char)0);
            PasswordTxt.setEchoChar((char)0);
        }else{
            ConfirmarTxt.setEchoChar('*');
            PasswordTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnteriorLb;
    private javax.swing.JPasswordField AnteriorTxt;
    private javax.swing.JPasswordField ConfirmarTxt;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JLabel DirecciónLb;
    private javax.swing.JLabel DocumentoLb;
    private javax.swing.JTextField DocumentoTxt;
    private javax.swing.JLabel EmailLb;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel PasswordLb;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JButton RegistrarBtn;
    private javax.swing.JLabel RepPassLb;
    private javax.swing.JLabel TelefonoLb;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JComboBox<String> TipoBox;
    private javax.swing.JLabel TipoLb;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
