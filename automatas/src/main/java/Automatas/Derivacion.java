
package Automatas;

public class Derivacion extends javax.swing.JFrame {

    public Derivacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtW = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txtQ = new javax.swing.JTextField();
        txtQ1 = new javax.swing.JTextField();
        txtEntrada = new javax.swing.JTextField();
        txtE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMostrar.setEditable(false);
        txtMostrar.setBackground(new java.awt.Color(255, 255, 255));
        txtMostrar.setColumns(20);
        txtMostrar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txtMostrar.setRows(5);
        jScrollPane5.setViewportView(txtMostrar);

        btnMostrar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnMostrar.setText("PRODUCCIONES");
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtW.setEditable(false);
        txtW.setBackground(new java.awt.Color(255, 108, 108));
        txtW.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txtW.setForeground(new java.awt.Color(250, 250, 250));
        txtW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtW.setText("W");

        txt3.setEditable(false);
        txt3.setBackground(new java.awt.Color(255, 108, 108));
        txt3.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(250, 250, 250));
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setText("3");

        txtQ.setEditable(false);
        txtQ.setBackground(new java.awt.Color(255, 108, 108));
        txtQ.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txtQ.setForeground(new java.awt.Color(250, 250, 250));
        txtQ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ.setText("Q");

        txtQ1.setEditable(false);
        txtQ1.setBackground(new java.awt.Color(255, 108, 108));
        txtQ1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txtQ1.setForeground(new java.awt.Color(250, 250, 250));
        txtQ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQ1.setText("P");

        txtEntrada.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txtEntrada.setForeground(new java.awt.Color(250, 108, 108));
        txtEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 108, 108)));

        txtE.setEditable(false);
        txtE.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txtE.setForeground(new java.awt.Color(250, 108, 108));
        txtE.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtE.setText("ENTRADA: ");
        txtE.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("  F-> Es.En \n  Es-> S En\n  En-> D R \n  R-> D R |  3 (vacio)\n  D-> 0...9  \n  S-> + | - | 3 (vacio)");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("  alfabetoA ( +, -, 0...9, . )\n  alfabetoP (+, -, 0...9, . , $)\n  Q {q0, q1, q2, q3}\n  q0 {q0}\n  Z0 {$}\n  F { q3}");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(526, 526, 526)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMostrar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(208, 208, 208)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked
        AutomataPilas automata = new AutomataPilas();
        try{
            this.txtMostrar.setText(automata.mostrarInformacion(this.txtEntrada.getText())+ automata.validarCadena(this.txtEntrada.getText())); 
        } catch (Exception e){
            this.txtMostrar.setText("CADENA NO VÁLIDA\nINTRODUZCA UNA CADENA VÁLIDA");
        }
    }//GEN-LAST:event_btnMostrarMouseClicked

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
            java.util.logging.Logger.getLogger(Derivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Derivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Derivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Derivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Derivacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txtE;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextArea txtMostrar;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txtQ1;
    private javax.swing.JTextField txtW;
    // End of variables declaration//GEN-END:variables
}
