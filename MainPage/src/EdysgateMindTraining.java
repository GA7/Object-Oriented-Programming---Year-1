/*
 * EdysgateMindTraining.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @author Joanna Bautista, x12374571
 * 
 */

/**
 *
 * @author Joanna Bautista, x12374571
 */
public class EdysgateMindTraining extends javax.swing.JFrame {

    /**
     * Creates new form EdysgateMindTraining
     */
    public EdysgateMindTraining() {
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

        jPanel1 = new javax.swing.JPanel();
        edyHeadingjL = new javax.swing.JLabel();
        edyDescriptionjL = new javax.swing.JLabel();
        edyMindjBback = new javax.swing.JButton();
        edyLinkjL = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        edyHeadingjL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edyHeadingjL.setForeground(new java.awt.Color(255, 255, 255));
        edyHeadingjL.setText("Edysgate\n");
        jPanel1.add(edyHeadingjL);
        edyHeadingjL.setBounds(143, 33, 81, 22);

        edyDescriptionjL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edyDescriptionjL.setForeground(new java.awt.Color(255, 255, 255));
        edyDescriptionjL.setText("<html>\nThis project looks to provide<br/>\n a highly motivating and stimulating <br/>\nlearning environment for a carefully <br/>\nselected range of skills known<br/>\n to be important for young dyslexic adults. <br/>\n It will address seven areas of particular <br/>\nimportance for vocational skills development.<br/>\n The areas are targeted through direct <br/>\n and indirect stimulation.<br/>\n<br/>\n<br/>\nCheck the website to play the games:\n\n\n</html>");
        jPanel1.add(edyDescriptionjL);
        edyDescriptionjL.setBounds(66, 73, 273, 223);

        edyMindjBback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_PNG.png"))); // NOI18N
        edyMindjBback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edyMindjBbackActionPerformed(evt);
            }
        });
        jPanel1.add(edyMindjBback);
        edyMindjBback.setBounds(120, 390, 100, 35);

        edyLinkjL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        edyLinkjL.setForeground(new java.awt.Color(255, 255, 255));
        edyLinkjL.setText("<html>\n<a href=\"http://www.edysgate.org/\">  Edysgate.org </a>\n</html>");
        edyLinkjL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                edyLinkjLMousePressed(evt);
            }
        });
        jPanel1.add(edyLinkjL);
        edyLinkjL.setBounds(109, 307, 146, 29);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/One.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(-810, -160, 1460, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edyMindjBbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edyMindjBbackActionPerformed
        // TODO add your handling code here:
        MindTraining c = new MindTraining();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_edyMindjBbackActionPerformed

    private void edyLinkjLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edyLinkjLMousePressed
        // TODO add your handling code here:
                try{
            String URL ="www.edysgate.org/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch(Exception e){
            System.out.println("error getting url");
        }
    }//GEN-LAST:event_edyLinkjLMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EdysgateMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdysgateMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdysgateMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdysgateMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EdysgateMindTraining().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel edyDescriptionjL;
    private javax.swing.JLabel edyHeadingjL;
    private javax.swing.JLabel edyLinkjL;
    private javax.swing.JButton edyMindjBback;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
