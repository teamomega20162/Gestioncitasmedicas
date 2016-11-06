package interfaz;

public class AdministrarPane extends javax.swing.JFrame {

    public AdministrarPane() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoBox = new javax.swing.JComboBox<>();
        TipoLb = new javax.swing.JLabel();
        BuscarTxt = new javax.swing.JTextField();
        BuscarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultadoTxt = new javax.swing.JTextArea();
        AccionLb = new javax.swing.JLabel();
        AccionBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Agenda" }));
        getContentPane().add(TipoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 121, -1));

        TipoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoLb.setText("Tipo");
        getContentPane().add(TipoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        BuscarTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(BuscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 251, -1));

        BuscarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BuscarBtn.setText("Proceder");
        getContentPane().add(BuscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));

        ResultadoTxt.setColumns(20);
        ResultadoTxt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ResultadoTxt.setRows(5);
        jScrollPane1.setViewportView(ResultadoTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 358, -1));

        AccionLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccionLb.setText("Acción a Realizar:");
        getContentPane().add(AccionLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 11, -1, -1));

        AccionBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Restaurar", "Inhabilitar", "Eliminar" }));
        getContentPane().add(AccionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 39, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 390, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        dispose();
        MenuAdmin volver = new MenuAdmin();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccionBox;
    private javax.swing.JLabel AccionLb;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JTextField BuscarTxt;
    private javax.swing.JTextArea ResultadoTxt;
    private javax.swing.JComboBox<String> TipoBox;
    private javax.swing.JLabel TipoLb;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
