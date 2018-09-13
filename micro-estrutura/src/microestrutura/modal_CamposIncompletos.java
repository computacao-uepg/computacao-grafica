/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microestrutura;

import javax.swing.WindowConstants;

/**
 *
 * @author Mateus Junges <contato@mateusjunges.com>
 */
public class modal_CamposIncompletos extends javax.swing.JFrame {

    /**
     * Creates new form modal_CamposIncompletos
     */
    public modal_CamposIncompletos() {
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

        jDialog1 = new javax.swing.JDialog();
        background_modal = new javax.swing.JDesktopPane();
        label_error_title = new java.awt.Label();
        label_error_description = new java.awt.Label();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background_modal.setBackground(new java.awt.Color(255, 255, 255));

        label_error_title.setAlignment(java.awt.Label.CENTER);

        label_error_description.setAlignment(java.awt.Label.CENTER);
        label_error_description.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        background_modal.setLayer(label_error_title, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background_modal.setLayer(label_error_description, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout background_modalLayout = new javax.swing.GroupLayout(background_modal);
        background_modal.setLayout(background_modalLayout);
        background_modalLayout.setHorizontalGroup(
            background_modalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_modalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background_modalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_error_description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_error_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        background_modalLayout.setVerticalGroup(
            background_modalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_modalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_error_title, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(label_error_description, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_modal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_modal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void setLabelTitle(String title){
        label_error_title.setText(title);
    }
    public static void setLabelDescription(String description){
        label_error_description.setText(description);
    }
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
            java.util.logging.Logger.getLogger(modal_CamposIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modal_CamposIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modal_CamposIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modal_CamposIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                modal_CamposIncompletos m = new modal_CamposIncompletos();
                m.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane background_modal;
    private javax.swing.JDialog jDialog1;
    private static java.awt.Label label_error_description;
    private static java.awt.Label label_error_title;
    // End of variables declaration//GEN-END:variables

   
}
