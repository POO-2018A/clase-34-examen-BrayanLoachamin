/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author ESFOT
 */
public class PanelEqui extends javax.swing.JFrame {

    /**
     * Creates new form PanelEqui
     */
    public PanelEqui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ladoEqui = new javax.swing.JLabel();
        txtLadoEqui = new javax.swing.JTextField();
        btnAreaEqui = new javax.swing.JButton();
        btnPerimetroEqui = new javax.swing.JButton();
        btnAlturaEqui = new javax.swing.JButton();
        lblRespuestaArea = new javax.swing.JLabel();
        lblRespuestaPerimetro = new javax.swing.JLabel();
        lblRespuestaAltura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Triangulo Equilatero");

        jButton1.setText("Regresar a seleccion de Triangulos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ladoEqui.setText("Ingrese el valor de un lado");

        btnAreaEqui.setText("Calcular Area");
        btnAreaEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaEquiActionPerformed(evt);
            }
        });

        btnPerimetroEqui.setText("Calcular Perimetro");
        btnPerimetroEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroEquiActionPerformed(evt);
            }
        });

        btnAlturaEqui.setText("Calcular altura");
        btnAlturaEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaEquiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ladoEqui)
                                .addGap(18, 18, 18)
                                .addComponent(txtLadoEqui, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAlturaEqui)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRespuestaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAreaEqui)
                                        .addComponent(btnPerimetroEqui))
                                    .addGap(66, 66, 66)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblRespuestaPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRespuestaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ladoEqui)
                    .addComponent(txtLadoEqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAreaEqui)
                    .addComponent(lblRespuestaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerimetroEqui)
                    .addComponent(lblRespuestaPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlturaEqui)
                    .addComponent(lblRespuestaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Triangulos tri = new Triangulos();
        tri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPerimetroEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroEquiActionPerformed

        String equi = txtLadoEqui.getText();
        double convertirToDouble = Double.parseDouble(equi);
        double equiDouble = convertirToDouble;
        
        float equilatero = (float) ((equiDouble)*3);
        String equilateroToString = String.valueOf(equilatero);
        
        lblRespuestaPerimetro.setText(equilateroToString);
        
        
    }//GEN-LAST:event_btnPerimetroEquiActionPerformed

    private void btnAreaEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaEquiActionPerformed
        
        String equi = txtLadoEqui.getText();
        double convertirToDouble = Double.parseDouble(equi);
        double equiDouble = convertirToDouble;
        
        float equilatero = (float) ((Math.sqrt(equiDouble*3)/2));
        String equilateroToString = String.valueOf(equilatero);
        
        lblRespuestaArea.setText(equilateroToString);// TODO add your handling code here:
    }//GEN-LAST:event_btnAreaEquiActionPerformed

    private void btnAlturaEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaEquiActionPerformed
        String equi = txtLadoEqui.getText();
        double convertirToDouble = Double.parseDouble(equi);
        double equiDouble = convertirToDouble;
        
        float equilatero = (float) ((Math.sqrt(equiDouble*3)/2));
        String equilateroToString = String.valueOf(equilatero);
        
        lblRespuestaAltura.setText(equilateroToString);// TODO add your handling code here:
    }//GEN-LAST:event_btnAlturaEquiActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PanelEqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelEqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelEqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelEqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelEqui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlturaEqui;
    private javax.swing.JButton btnAreaEqui;
    private javax.swing.JButton btnPerimetroEqui;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ladoEqui;
    private javax.swing.JLabel lblRespuestaAltura;
    private javax.swing.JLabel lblRespuestaArea;
    private javax.swing.JLabel lblRespuestaPerimetro;
    private javax.swing.JTextField txtLadoEqui;
    // End of variables declaration//GEN-END:variables
}
