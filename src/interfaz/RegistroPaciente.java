package interfaz;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.sql.Date;
import java.util.*;
import javax.swing.JOptionPane;
import logica.Registro;

public class RegistroPaciente extends javax.swing.JFrame {

    public RegistroPaciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        RestrictedTextField numero = new RestrictedTextField(telefonoTxt, "0123456789");
        RestrictedTextField numero2 = new RestrictedTextField(celularTxt, "0123456789");
        RestrictedTextField numero3 = new RestrictedTextField(documentoTxt, "0123456789");
        RestrictedTextField texto1 = new RestrictedTextField(nombreTxt);
        texto1.setOnlyText(true);
        texto1.setAcceptSpace(true);
        RestrictedTextField texto2 = new RestrictedTextField(apellidoTxt);
        texto2.setOnlyText(true);
        texto2.setAcceptSpace(true);
    }

    private String nombre;
    private String documento;
    private String tipoDocumento;
    private String apellido;
    private Date fechaNacimiento;
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
        documentoTxt = new javax.swing.JTextField();
        tipoDocumentoBox = new javax.swing.JComboBox<>();
        nombreTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        celularTxt = new javax.swing.JTextField();
        correoTxt = new javax.swing.JTextField();
        claveTxt = new javax.swing.JPasswordField();
        confirmarTxt = new javax.swing.JPasswordField();
        registrarPaciente_Btn = new javax.swing.JButton();
        regresar_Btn = new javax.swing.JButton();
        titulo_Lb = new javax.swing.JLabel();
        fechaNacimientoDate = new com.toedter.calendar.JDateChooser();
        eps_Lb = new javax.swing.JLabel();
        eps_ComboB = new javax.swing.JComboBox<>();
        mostrarPassBtn = new javax.swing.JToggleButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        documento_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        documento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        documento_Lb.setText("Documento:");
        getContentPane().add(documento_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        nombres_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombres_Lb.setForeground(new java.awt.Color(255, 255, 255));
        nombres_Lb.setText("Nombres:");
        getContentPane().add(nombres_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        apellidos_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        apellidos_Lb.setForeground(new java.awt.Color(255, 255, 255));
        apellidos_Lb.setText("Apellidos:");
        getContentPane().add(apellidos_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        tipoDeDocumento_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipoDeDocumento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        tipoDeDocumento_Lb.setText("Tipo de Documento:");
        getContentPane().add(tipoDeDocumento_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        fechaDeNacimiento_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fechaDeNacimiento_Lb.setForeground(new java.awt.Color(255, 255, 255));
        fechaDeNacimiento_Lb.setText("Fecha de nacimiento:");
        getContentPane().add(fechaDeNacimiento_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        direccion_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        direccion_Lb.setForeground(new java.awt.Color(255, 255, 255));
        direccion_Lb.setText("Direccion:");
        getContentPane().add(direccion_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        telefono_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono_Lb.setForeground(new java.awt.Color(51, 51, 51));
        telefono_Lb.setText("Telefono fijo:");
        getContentPane().add(telefono_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        celular_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        celular_Lb.setForeground(new java.awt.Color(51, 51, 51));
        celular_Lb.setText("Celular:");
        getContentPane().add(celular_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 10));

        correo_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        correo_Lb.setForeground(new java.awt.Color(51, 51, 51));
        correo_Lb.setText("Correo electronico:");
        getContentPane().add(correo_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        clave_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clave_Lb.setForeground(new java.awt.Color(51, 51, 51));
        clave_Lb.setText("Clave:");
        getContentPane().add(clave_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        confirmarClave_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmarClave_Lb.setForeground(new java.awt.Color(51, 51, 51));
        confirmarClave_Lb.setText("Confirmar clave:");
        getContentPane().add(confirmarClave_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        documentoTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(documentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, 30));

        tipoDocumentoBox.setBackground(new java.awt.Color(204, 204, 255));
        tipoDocumentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I." }));
        getContentPane().add(tipoDocumentoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 30));

        nombreTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 30));

        apellidoTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        direccionTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 30));

        telefonoTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 110, 30));

        celularTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(celularTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, 30));

        correoTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 110, 30));

        claveTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(claveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 110, 30));

        confirmarTxt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(confirmarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 110, 30));

        registrarPaciente_Btn.setBackground(new java.awt.Color(204, 204, 255));
        registrarPaciente_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrarPaciente_Btn.setForeground(new java.awt.Color(102, 102, 102));
        registrarPaciente_Btn.setText("Registrar Paciente");
        registrarPaciente_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPaciente_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(registrarPaciente_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 30));

        regresar_Btn.setBackground(new java.awt.Color(204, 204, 255));
        regresar_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regresar_Btn.setForeground(new java.awt.Color(102, 102, 102));
        regresar_Btn.setText("Regresar");
        regresar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(regresar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 363, 90, 30));

        titulo_Lb.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo_Lb.setForeground(new java.awt.Color(51, 51, 51));
        titulo_Lb.setText("REGISTRO DE PACIENTES");
        getContentPane().add(titulo_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        fechaNacimientoDate.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(fechaNacimientoDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, 30));

        eps_Lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eps_Lb.setForeground(new java.awt.Color(51, 51, 51));
        eps_Lb.setText("Eps:");
        getContentPane().add(eps_Lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        eps_ComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Famisanar", "Capital Salud", "Cafe Salud", "SaludCoop" }));
        getContentPane().add(eps_ComboB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 110, 30));

        mostrarPassBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mostrarPassBtn.setText("Mostrar Contraseña");
        mostrarPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_BtnActionPerformed
        InicioSeccionPanel adminPanel = new InicioSeccionPanel();
        adminPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresar_BtnActionPerformed

    private void registrarPaciente_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPaciente_BtnActionPerformed
        nombre = nombreTxt.getText();
        apellido = apellidoTxt.getText();
        documento = documentoTxt.getText();
        tipoDocumento = tipoDocumentoBox.getSelectedItem().toString();
        direccion = direccionTxt.getText();
        eps = eps_ComboB.getSelectedItem().toString();
        telefono = telefonoTxt.getText();
        celular = celularTxt.getText();
        correo = correoTxt.getText();
        clave = Arrays.toString(claveTxt.getPassword());
        confirmar = Arrays.toString(confirmarTxt.getPassword());
        fechaNacimiento = (Date) fechaNacimientoDate.getDate();
        if (!nombre.equals("") && !apellido.equals("") && !direccion.equals("") && !telefono.equals("") && !documento.equals("") && !apellido.equals("") && !celular.equals("") && !correo.equals("") && !fechaNacimiento.equals("")) {
            if (!confirmar.equals("") && !clave.equals("")) {
                if (confirmar.equals(clave)) {
                    //Acciones para registrar en el DB
                    Registro registrar= new Registro();
                    registrar.registrarPaciente(documento, tipoDocumento, nombre, apellido, (java.sql.Date) fechaNacimiento, direccion, eps, telefono, celular, telefono, clave);
                    JOptionPane.showMessageDialog(null, "Son iguales :P");
                } else {
                    JOptionPane.showMessageDialog(null, "Clave incorrecta, digite bien su clave");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Digita clave :/");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Digita todos los datos >:(");
        }

//        JOptionPane.showMessageDialog(null, "tu fecha es:" + new SimpleDateFormat("dd/MM/yyyy").format(fechaNacimiento));
    }//GEN-LAST:event_registrarPaciente_BtnActionPerformed

    private void mostrarPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPassBtnActionPerformed
        if (mostrarPassBtn.isSelected()) {
            claveTxt.setEchoChar((char) 0);
            confirmarTxt.setEchoChar((char) 0);
        } else {
            claveTxt.setEchoChar('*');
            confirmarTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarPassBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JLabel apellidos_Lb;
    private javax.swing.JTextField celularTxt;
    private javax.swing.JLabel celular_Lb;
    private javax.swing.JPasswordField claveTxt;
    private javax.swing.JLabel clave_Lb;
    private javax.swing.JLabel confirmarClave_Lb;
    private javax.swing.JPasswordField confirmarTxt;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JLabel correo_Lb;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JLabel direccion_Lb;
    private javax.swing.JTextField documentoTxt;
    private javax.swing.JLabel documento_Lb;
    private javax.swing.JComboBox<String> eps_ComboB;
    private javax.swing.JLabel eps_Lb;
    private javax.swing.JLabel fechaDeNacimiento_Lb;
    private com.toedter.calendar.JDateChooser fechaNacimientoDate;
    private javax.swing.JLabel fondo;
    private javax.swing.JToggleButton mostrarPassBtn;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel nombres_Lb;
    private javax.swing.JButton registrarPaciente_Btn;
    private javax.swing.JButton regresar_Btn;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JLabel telefono_Lb;
    private javax.swing.JLabel tipoDeDocumento_Lb;
    private javax.swing.JComboBox<String> tipoDocumentoBox;
    private javax.swing.JLabel titulo_Lb;
    // End of variables declaration//GEN-END:variables
}
