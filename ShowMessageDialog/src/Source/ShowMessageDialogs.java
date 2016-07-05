package Source;

import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.*;

public class ShowMessageDialogs extends javax.swing.JFrame {

    public ShowMessageDialogs() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNormal = new javax.swing.JButton();
        btnNormalTitulo = new javax.swing.JButton();
        btnNormalTituloIcono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ShowMessageDialog");

        btnNormal.setText("Normal");
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });

        btnNormalTitulo.setText("Normal y Título");
        btnNormalTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalTituloActionPerformed(evt);
            }
        });

        btnNormalTituloIcono.setText("Normal, Título e Icono");
        btnNormalTituloIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalTituloIconoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(btnNormalTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(btnNormalTituloIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNormalTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNormalTituloIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        showMessageDialog(this, "Esto es una ventana");
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnNormalTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalTituloActionPerformed
        showMessageDialog(this, "Esta es una ventana", "Mensaje Personalizado", WARNING_MESSAGE);
    }//GEN-LAST:event_btnNormalTituloActionPerformed

    private void btnNormalTituloIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalTituloIconoActionPerformed
        showMessageDialog(this, "Esto es otra ventana", "Mensaje Personalizado", WARNING_MESSAGE, new ImageIcon(ShowMessageDialogs.class.getResource("showDialogSave.png")));
    }//GEN-LAST:event_btnNormalTituloIconoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowMessageDialogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowMessageDialogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNormal;
    private javax.swing.JButton btnNormalTitulo;
    private javax.swing.JButton btnNormalTituloIcono;
    // End of variables declaration//GEN-END:variables
}
