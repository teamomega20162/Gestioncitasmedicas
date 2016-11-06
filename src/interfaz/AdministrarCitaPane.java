package interfaz;

public class AdministrarCitaPane extends javax.swing.JFrame {

    /** Creates new form AdministarPane */
    public AdministrarCitaPane() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoCitaBox = new javax.swing.JComboBox<>();
        TipoCitaLb = new javax.swing.JLabel();
        ProcederBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalidaTxt = new javax.swing.JTextArea();
        CentroMedicoBox = new javax.swing.JComboBox<>();
        CentroMedicoLb = new javax.swing.JLabel();
        EspecialidadBox = new javax.swing.JComboBox<>();
        EspecialidadLB = new javax.swing.JLabel();
        HoraLB = new javax.swing.JLabel();
        HoraBox = new javax.swing.JComboBox<>();
        FechaLb = new javax.swing.JLabel();
        FechaBox = new javax.swing.JComboBox<>();
        DoctorBox = new javax.swing.JComboBox<>();
        DoctorLb = new javax.swing.JLabel();
        CitaBox = new javax.swing.JComboBox<>();
        CitaLb = new javax.swing.JLabel();
        AccionLb = new javax.swing.JLabel();
        AccionBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoCitaBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(TipoCitaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 150, -1));

        TipoCitaLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoCitaLb.setText("Tipo de Cita:");
        getContentPane().add(TipoCitaLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 150, -1));

        ProcederBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProcederBtn.setText("Proceder");
        getContentPane().add(ProcederBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 162, -1, -1));

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 336, -1, -1));

        SalidaTxt.setColumns(20);
        SalidaTxt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        SalidaTxt.setRows(5);
        jScrollPane1.setViewportView(SalidaTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 199, 549, -1));

        CentroMedicoBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(CentroMedicoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 39, 168, -1));

        CentroMedicoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CentroMedicoLb.setText("Centro Medico:");
        getContentPane().add(CentroMedicoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, -1, -1));

        EspecialidadBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(EspecialidadBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 39, 203, -1));

        EspecialidadLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EspecialidadLB.setText("Especialidad:");
        getContentPane().add(EspecialidadLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 11, -1, -1));

        HoraLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HoraLB.setText("Hora:");
        getContentPane().add(HoraLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 150, -1));

        HoraBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(HoraBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 150, -1));

        FechaLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FechaLb.setText("Fecha:");
        getContentPane().add(FechaLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 73, -1, -1));

        FechaBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(FechaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 101, 168, -1));

        DoctorBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(DoctorBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 200, -1));

        DoctorLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorLb.setText("Nombre de Doctor:");
        getContentPane().add(DoctorLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 73, 160, -1));

        CitaBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CitaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistema", "Propia" }));
        getContentPane().add(CitaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 150, -1));

        CitaLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CitaLb.setText("Cita del:");
        getContentPane().add(CitaLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, -1));

        AccionLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccionLb.setText("Acción a realizar");
        getContentPane().add(AccionLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 137, -1, -1));

        AccionBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Citas", "Asignar Citas", "Cancelar Citas" }));
        getContentPane().add(AccionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 165, 168, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 569, 380));

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
    private javax.swing.JComboBox<String> CentroMedicoBox;
    private javax.swing.JLabel CentroMedicoLb;
    private javax.swing.JComboBox<String> CitaBox;
    private javax.swing.JLabel CitaLb;
    private javax.swing.JComboBox<String> DoctorBox;
    private javax.swing.JLabel DoctorLb;
    private javax.swing.JComboBox<String> EspecialidadBox;
    private javax.swing.JLabel EspecialidadLB;
    private javax.swing.JComboBox<String> FechaBox;
    private javax.swing.JLabel FechaLb;
    private javax.swing.JComboBox<String> HoraBox;
    private javax.swing.JLabel HoraLB;
    private javax.swing.JButton ProcederBtn;
    private javax.swing.JTextArea SalidaTxt;
    private javax.swing.JComboBox<String> TipoCitaBox;
    private javax.swing.JLabel TipoCitaLb;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
