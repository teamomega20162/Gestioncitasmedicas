package interfaz;

public class MenuPane extends javax.swing.JFrame {

    public MenuPane() {
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
        LoginPane volver = new LoginPane();
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
            java.util.logging.Logger.getLogger(MenuPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton AdminCitasBtn;
    private javax.swing.JButton AdminDatosBtn;
    private javax.swing.JButton CerrarSesionBtn;
    private javax.swing.JButton GenerarBtn;
    // End of variables declaration//GEN-END:variables
}
