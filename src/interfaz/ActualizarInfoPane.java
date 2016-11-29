package interfaz;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.util.Arrays;

public class ActualizarInfoPane extends javax.swing.JFrame {

    public ActualizarInfoPane() {
        initComponents();
        this.setLocationRelativeTo(null);
        RestrictedTextField numero = new RestrictedTextField(TelefonoTxt, "0123456789");
        RestrictedTextField numero2 = new RestrictedTextField(CelularTxt, "0123456789");
        RestrictedTextField numero3 = new RestrictedTextField(DocumentoTxt, "0123456789");

    }
    private String documento;
    private String tipoDocumento;
    private String direccion;
    private String eps;
    private String telefono;
    private String celular;
    private String correo;
    private String clave;
    private String confirmar;

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
        CorreoLb = new javax.swing.JLabel();
        CorreoTxt = new javax.swing.JTextField();
        PasswordLb = new javax.swing.JLabel();
        EpsBox = new javax.swing.JComboBox<>();
        claveTxt = new javax.swing.JPasswordField();
        confirmarTxt = new javax.swing.JPasswordField();
        RegistrarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        AnteriorLb = new javax.swing.JLabel();
        AnteriorTxt = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        CelularLb = new javax.swing.JLabel();
        CelularTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocumentoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DocumentoLb.setText("Documento");
        getContentPane().add(DocumentoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

        DocumentoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(DocumentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 11, 164, -1));

        TipoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoLb.setText("Eps:");
        getContentPane().add(TipoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 48, -1, -1));

        RepPassLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RepPassLb.setText("Repetir Contraseña:");
        getContentPane().add(RepPassLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 116, -1, -1));

        DirecciónLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DirecciónLb.setText("Dirección:");
        getContentPane().add(DirecciónLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));

        DireccionTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(DireccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 79, 164, -1));

        TelefonoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TelefonoLb.setText("Telefono:");
        getContentPane().add(TelefonoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        TelefonoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(TelefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 113, 164, -1));

        CorreoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CorreoLb.setText("Email:");
        getContentPane().add(CorreoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 14, -1, -1));

        CorreoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(CorreoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 11, 164, -1));

        PasswordLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordLb.setText("Contraseña nueva:");
        getContentPane().add(PasswordLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 82, -1, -1));

        EpsBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EpsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(EpsBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 45, 164, -1));

        claveTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(claveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 79, 164, -1));

        confirmarTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(confirmarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 113, 164, -1));

        RegistrarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegistrarBtn.setText("Actualizar info");
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        AnteriorLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AnteriorLb.setText("Contraseña anterior:");
        getContentPane().add(AnteriorLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 48, -1, -1));

        AnteriorTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(AnteriorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 45, 165, -1));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton1.setText("Mostrar Contraseña");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        CelularLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CelularLb.setText("Celular:");
        getContentPane().add(CelularLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        CelularTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(CelularTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 164, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 720, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        dispose();
        MenuAdmin volver = new MenuAdmin();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            confirmarTxt.setEchoChar((char) 0);
            claveTxt.setEchoChar((char) 0);
        } else {
            confirmarTxt.setEchoChar('*');
            claveTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed
        documento = DocumentoTxt.getText();
        direccion = DireccionTxt.getText();
        eps = EpsBox.getSelectedItem().toString();
        telefono = TelefonoTxt.getText();
        celular = CelularTxt.getText();
        correo = CorreoTxt.getText();
        clave = Arrays.toString(claveTxt.getPassword());
        confirmar = Arrays.toString(confirmarTxt.getPassword());
        if (!direccion.equals("") && !telefono.equals("") && !documento.equals("") && !celular.equals("") && !correo.equals("")) {
            if (confirmar.equals(clave)) {

            } else {

            }
        }

    }//GEN-LAST:event_RegistrarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnteriorLb;
    private javax.swing.JPasswordField AnteriorTxt;
    private javax.swing.JLabel CelularLb;
    private javax.swing.JTextField CelularTxt;
    private javax.swing.JLabel CorreoLb;
    private javax.swing.JTextField CorreoTxt;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JLabel DirecciónLb;
    private javax.swing.JLabel DocumentoLb;
    private javax.swing.JTextField DocumentoTxt;
    private javax.swing.JComboBox<String> EpsBox;
    private javax.swing.JLabel PasswordLb;
    private javax.swing.JButton RegistrarBtn;
    private javax.swing.JLabel RepPassLb;
    private javax.swing.JLabel TelefonoLb;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JLabel TipoLb;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JPasswordField claveTxt;
    private javax.swing.JPasswordField confirmarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
