package interfaz;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminCitasBtn = new javax.swing.JButton();
        GenerarBtn = new javax.swing.JButton();
        CerrarSesionBtn = new javax.swing.JButton();
        AdminDatosBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminCitasBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminCitasBtn.setText("Administrar Citas");
        AdminCitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCitasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AdminCitasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 183, -1));

        GenerarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenerarBtn.setText("Generar Certificado");
        getContentPane().add(GenerarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, -1));

        CerrarSesionBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CerrarSesionBtn.setText("Cerrar Sesión");
        CerrarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSesionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 183, -1));

        AdminDatosBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminDatosBtn.setText("Administrar Datos");
        AdminDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminDatosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AdminDatosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 183, -1));

        ActualizarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ActualizarBtn.setText("Actualizar Datos");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ActualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 183, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 210, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionBtnActionPerformed
        dispose();
        InicioSeccionPanel volver = new InicioSeccionPanel();
        volver.setVisible(true);
    }//GEN-LAST:event_CerrarSesionBtnActionPerformed

    private void AdminCitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCitasBtnActionPerformed
        dispose();
        AdministrarCitaPane citas = new AdministrarCitaPane();
        citas.setVisible(true);
    }//GEN-LAST:event_AdminCitasBtnActionPerformed

    private void AdminDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminDatosBtnActionPerformed
        dispose();
        AdministrarPane admin = new AdministrarPane();
        admin.setVisible(true);
    }//GEN-LAST:event_AdminDatosBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        dispose();
        ActualizarInfoPane actualizar = new ActualizarInfoPane();
        actualizar.setVisible(true);
    }//GEN-LAST:event_ActualizarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton AdminCitasBtn;
    private javax.swing.JButton AdminDatosBtn;
    private javax.swing.JButton CerrarSesionBtn;
    private javax.swing.JButton GenerarBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
