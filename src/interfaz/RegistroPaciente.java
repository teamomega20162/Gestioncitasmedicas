package interfaz;

public class RegistroPaciente extends javax.swing.JFrame {

    public RegistroPaciente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        documento_Lb = new javax.swing.JLabel();
        nombres_Lb = new javax.swing.JLabel();
        apellidos_Lb = new javax.swing.JLabel();
        tipoDeDocumento_Lb = new javax.swing.JLabel();
        fechaDeNacimiento_Lb = new javax.swing.JLabel();
        direccion_Lb = new javax.swing.JLabel();
        telefono_Lb = new javax.swing.JLabel();
        celular_Lb = new javax.swing.JLabel();
        correo_Lb = new javax.swing.JLabel();
        clave_Lb = new javax.swing.JLabel();
        confirmarClave_Lb = new javax.swing.JLabel();
        documento_TextF = new javax.swing.JTextField();
        tipoDocumento_ComboB = new javax.swing.JComboBox<>();
        nombres_TextF = new javax.swing.JTextField();
        apellidos_TextF = new javax.swing.JTextField();
        direcccion_TextF = new javax.swing.JTextField();
        telefono_TextF = new javax.swing.JTextField();
        celular_TextF = new javax.swing.JTextField();
        correo_TextF = new javax.swing.JTextField();
        contraseña_PassF = new javax.swing.JPasswordField();
        confContraseña_PassF = new javax.swing.JPasswordField();
        registrarPaciente_Btn = new javax.swing.JButton();
        regresar_Btn = new javax.swing.JButton();
        titulo_Lb = new javax.swing.JLabel();
        fechaNacimiento_DateC = new com.toedter.calendar.JDateChooser();
        eps_Lb = new javax.swing.JLabel();
        eps_ComboB = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        documento_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        documento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        documento_Lb.setText("Documento:");

        nombres_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombres_Lb.setForeground(new java.awt.Color(255, 255, 255));
        nombres_Lb.setText("Nombres:");

        apellidos_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        apellidos_Lb.setForeground(new java.awt.Color(255, 255, 255));
        apellidos_Lb.setText("Apellidos:");

        tipoDeDocumento_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipoDeDocumento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        tipoDeDocumento_Lb.setText("Tipo de Documento:");

        fechaDeNacimiento_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fechaDeNacimiento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        fechaDeNacimiento_Lb.setText("Fecha de nacimiento:");

        direccion_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        direccion_Lb.setForeground(new java.awt.Color(255, 255, 255));
        direccion_Lb.setText("Direccion:");

        telefono_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono_Lb.setForeground(new java.awt.Color(51, 51, 51));
        telefono_Lb.setText("Telefono fijo:");

        celular_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        celular_Lb.setForeground(new java.awt.Color(51, 51, 51));
        celular_Lb.setText("Celular:");

        correo_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        correo_Lb.setForeground(new java.awt.Color(51, 51, 51));
        correo_Lb.setText("Correo electronico:");

        clave_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clave_Lb.setForeground(new java.awt.Color(51, 51, 51));
        clave_Lb.setText("Clave:");

        confirmarClave_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmarClave_Lb.setForeground(new java.awt.Color(51, 51, 51));
        confirmarClave_Lb.setText("Confirmar clave:");

        documento_TextF.setBackground(new java.awt.Color(204, 204, 255));

        tipoDocumento_ComboB.setBackground(new java.awt.Color(204, 204, 255));
        tipoDocumento_ComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I." }));

        nombres_TextF.setBackground(new java.awt.Color(204, 204, 255));

        apellidos_TextF.setBackground(new java.awt.Color(204, 204, 255));

        direcccion_TextF.setBackground(new java.awt.Color(204, 204, 255));

        telefono_TextF.setBackground(new java.awt.Color(204, 204, 255));

        celular_TextF.setBackground(new java.awt.Color(204, 204, 255));

        correo_TextF.setBackground(new java.awt.Color(204, 204, 255));

        contraseña_PassF.setBackground(new java.awt.Color(204, 204, 255));

        confContraseña_PassF.setBackground(new java.awt.Color(204, 204, 255));

        registrarPaciente_Btn.setBackground(new java.awt.Color(204, 204, 255));
        registrarPaciente_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrarPaciente_Btn.setForeground(new java.awt.Color(102, 102, 102));
        registrarPaciente_Btn.setText("Registrar Paciente");

        regresar_Btn.setBackground(new java.awt.Color(204, 204, 255));
        regresar_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regresar_Btn.setForeground(new java.awt.Color(102, 102, 102));
        regresar_Btn.setText("Regresar");
        regresar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_BtnActionPerformed(evt);
            }
        });

        titulo_Lb.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo_Lb.setForeground(new java.awt.Color(51, 51, 51));
        titulo_Lb.setText("REGISTRO DE PACIENTES");

        fechaNacimiento_DateC.setBackground(new java.awt.Color(204, 204, 255));

        eps_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eps_Lb.setForeground(new java.awt.Color(51, 51, 51));
        eps_Lb.setText("Eps:");

        eps_ComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Famisanar", "Capital Salud", "Cafe Salud", "SaludCoop" }));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo_Lb))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(documento_Lb)
                .addGap(15, 15, 15)
                .addComponent(documento_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(eps_Lb)
                .addGap(15, 15, 15)
                .addComponent(eps_ComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tipoDeDocumento_Lb)
                .addGap(16, 16, 16)
                .addComponent(tipoDocumento_ComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(telefono_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(nombres_Lb)
                .addGap(13, 13, 13)
                .addComponent(nombres_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(celular_Lb)
                .addGap(5, 5, 5)
                .addComponent(celular_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(apellidos_Lb)
                .addGap(11, 11, 11)
                .addComponent(apellidos_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(correo_Lb)
                .addGap(4, 4, 4)
                .addComponent(correo_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(fechaDeNacimiento_Lb)
                .addGap(12, 12, 12)
                .addComponent(fechaNacimiento_DateC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(clave_Lb)
                .addGap(4, 4, 4)
                .addComponent(contraseña_PassF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(direccion_Lb)
                .addGap(11, 11, 11)
                .addComponent(direcccion_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(confirmarClave_Lb)
                .addGap(2, 2, 2)
                .addComponent(confContraseña_PassF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(regresar_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(registrarPaciente_Btn))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(telefono_Lb))
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo_Lb)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(documento_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eps_ComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documento_Lb)
                            .addComponent(eps_Lb))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoDocumento_ComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoDeDocumento_Lb)
                            .addComponent(telefono_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nombres_Lb))
                    .addComponent(nombres_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(celular_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(celular_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidos_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidos_Lb)
                            .addComponent(correo_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaNacimiento_DateC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaDeNacimiento_Lb)
                            .addComponent(clave_Lb)
                            .addComponent(contraseña_PassF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direcccion_TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccion_Lb)
                            .addComponent(confirmarClave_Lb)
                            .addComponent(confContraseña_PassF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(regresar_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registrarPaciente_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(telefono_Lb))
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_BtnActionPerformed
        MenuAdmin adminPanel = new MenuAdmin();
        adminPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresar_BtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos_Lb;
    private javax.swing.JTextField apellidos_TextF;
    private javax.swing.JLabel celular_Lb;
    private javax.swing.JTextField celular_TextF;
    private javax.swing.JLabel clave_Lb;
    private javax.swing.JPasswordField confContraseña_PassF;
    private javax.swing.JLabel confirmarClave_Lb;
    private javax.swing.JPasswordField contraseña_PassF;
    private javax.swing.JLabel correo_Lb;
    private javax.swing.JTextField correo_TextF;
    private javax.swing.JTextField direcccion_TextF;
    private javax.swing.JLabel direccion_Lb;
    private javax.swing.JLabel documento_Lb;
    private javax.swing.JTextField documento_TextF;
    private javax.swing.JComboBox<String> eps_ComboB;
    private javax.swing.JLabel eps_Lb;
    private javax.swing.JLabel fechaDeNacimiento_Lb;
    private com.toedter.calendar.JDateChooser fechaNacimiento_DateC;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel nombres_Lb;
    private javax.swing.JTextField nombres_TextF;
    private javax.swing.JButton registrarPaciente_Btn;
    private javax.swing.JButton regresar_Btn;
    private javax.swing.JLabel telefono_Lb;
    private javax.swing.JTextField telefono_TextF;
    private javax.swing.JLabel tipoDeDocumento_Lb;
    private javax.swing.JComboBox<String> tipoDocumento_ComboB;
    private javax.swing.JLabel titulo_Lb;
    // End of variables declaration//GEN-END:variables
}
