package interfaz;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminCitasBtn = new javax.swing.JButton();
        GenerarBtn = new javax.swing.JButton();
        CerrarSesionBtn = new javax.swing.JButton();
        AdminDatosBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminCitasBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminCitasBtn.setText("Administrar Citas");
        AdminCitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCitasBtnActionPerformed(evt);
            }
        });

        GenerarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenerarBtn.setText("Generar Certificado");

        CerrarSesionBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CerrarSesionBtn.setText("Cerrar Sesión");
        CerrarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionBtnActionPerformed(evt);
            }
        });

        AdminDatosBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminDatosBtn.setText("Administrar Datos");
        AdminDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminDatosBtnActionPerformed(evt);
            }
        });

        ActualizarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ActualizarBtn.setText("Actualizar Datos");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CerrarSesionBtn)
                    .addComponent(AdminCitasBtn)
                    .addComponent(GenerarBtn)
                    .addComponent(ActualizarBtn)
                    .addComponent(AdminDatosBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ActualizarBtn, AdminCitasBtn, AdminDatosBtn, CerrarSesionBtn, GenerarBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminCitasBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminDatosBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ActualizarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenerarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CerrarSesionBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    // End of variables declaration//GEN-END:variables
}
