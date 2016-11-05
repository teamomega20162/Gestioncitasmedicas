package interfaz;

public class AdministrarCitaPane extends javax.swing.JFrame {

    /** Creates new form AdministarPane */
    public AdministrarCitaPane() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TipoCitaBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TipoCitaLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TipoCitaLb.setText("Tipo de Cita:");

        ProcederBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProcederBtn.setText("Proceder");

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        SalidaTxt.setColumns(20);
        SalidaTxt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        SalidaTxt.setRows(5);
        jScrollPane1.setViewportView(SalidaTxt);

        CentroMedicoBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        CentroMedicoLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CentroMedicoLb.setText("Centro Medico:");

        EspecialidadBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EspecialidadLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EspecialidadLB.setText("Especialidad:");

        HoraLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HoraLB.setText("Hora:");

        HoraBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FechaLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FechaLb.setText("Fecha:");

        FechaBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DoctorBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DoctorLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorLb.setText("Nombre de Doctor:");

        CitaBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CitaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistema", "Propia" }));

        CitaLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CitaLb.setText("Cita del:");

        AccionLb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccionLb.setText("Acción a realizar");

        AccionBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Citas", "Asignar Citas", "Cancelar Citas" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TipoCitaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TipoCitaLb, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CentroMedicoLb)
                                    .addComponent(CentroMedicoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(HoraBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HoraLB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaLb)
                                    .addComponent(FechaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CitaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CitaLb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccionLb)
                                    .addComponent(AccionBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EspecialidadBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DoctorLb, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EspecialidadLB)
                                    .addComponent(DoctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProcederBtn))
                                .addGap(0, 43, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VolverBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoCitaLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoCitaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CentroMedicoLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CentroMedicoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EspecialidadLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EspecialidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HoraLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HoraBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaLb)
                            .addComponent(DoctorLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CitaLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CitaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProcederBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AccionLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolverBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
