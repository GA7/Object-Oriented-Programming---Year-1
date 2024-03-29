
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * FeedbackGUI.java
 * 20/4/2013
 * @author Giovanni Antipala x12527037
 */
public class FeedbackGUI extends javax.swing.JFrame {

    private ArrayList<Feedback> fList;
    private String rcvr;
    private String sender;
    private String message;
    private int count;

    /**
     * Creates new form FeedbackGUI
     */
    public FeedbackGUI() {
        initComponents();
        fList = new ArrayList<>();
        rcvr = new String();
        sender = new String();
        message = new String();
        count = 0;
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
        TO = new javax.swing.JLabel();
        FROM = new javax.swing.JLabel();
        MESSAGE = new javax.swing.JLabel();
        from_TF = new javax.swing.JTextField();
        to_TF = new javax.swing.JTextField();
        message_TF = new javax.swing.JTextField();
        Feedback = new javax.swing.JLabel();
        send_btn = new javax.swing.JButton();
        load_txt_btn = new javax.swing.JButton();
        array_disp_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 350, 450));
        setMaximumSize(new java.awt.Dimension(350, 450));
        setMinimumSize(new java.awt.Dimension(340, 450));
        setResizable(false);

        jPanel1.setLayout(null);

        TO.setForeground(new java.awt.Color(255, 255, 255));
        TO.setText("To:");
        jPanel1.add(TO);
        TO.setBounds(70, 60, 40, 14);

        FROM.setForeground(new java.awt.Color(255, 255, 255));
        FROM.setText("From:");
        jPanel1.add(FROM);
        FROM.setBounds(60, 100, 50, 40);

        MESSAGE.setForeground(new java.awt.Color(255, 255, 255));
        MESSAGE.setText("Message:");
        jPanel1.add(MESSAGE);
        MESSAGE.setBounds(40, 160, 70, 20);

        from_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_TFActionPerformed(evt);
            }
        });
        jPanel1.add(from_TF);
        from_TF.setBounds(100, 110, 210, 20);

        to_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_TFActionPerformed(evt);
            }
        });
        jPanel1.add(to_TF);
        to_TF.setBounds(100, 60, 210, 20);

        message_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                message_TFActionPerformed(evt);
            }
        });
        jPanel1.add(message_TF);
        message_TF.setBounds(100, 160, 210, 150);

        Feedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Feedback.setForeground(new java.awt.Color(255, 255, 255));
        Feedback.setText("Feedback");
        jPanel1.add(Feedback);
        Feedback.setBounds(150, 10, 90, 30);

        send_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Send_PNG.png"))); // NOI18N
        send_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_btnActionPerformed(evt);
            }
        });
        jPanel1.add(send_btn);
        send_btn.setBounds(40, 320, 70, 25);

        load_txt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Load_TXT_PNG.png"))); // NOI18N
        load_txt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_txt_btnActionPerformed(evt);
            }
        });
        jPanel1.add(load_txt_btn);
        load_txt_btn.setBounds(140, 320, 70, 25);

        array_disp_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Display_PNG.png"))); // NOI18N
        array_disp_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                array_disp_btnActionPerformed(evt);
            }
        });
        jPanel1.add(array_disp_btn);
        array_disp_btn.setBounds(240, 320, 70, 25);

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_PNG.png"))); // NOI18N
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn);
        back_btn.setBounds(10, 410, 100, 35);

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search_PNG.png"))); // NOI18N
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        jPanel1.add(search_btn);
        search_btn.setBounds(240, 350, 70, 25);

        delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete_PNG.png"))); // NOI18N
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_btn);
        delete_btn.setBounds(140, 350, 70, 25);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fractal.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(-860, -150, 1430, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void message_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_message_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_message_TFActionPerformed

    private void to_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to_TFActionPerformed

    private void from_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_from_TFActionPerformed

    private void send_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_btnActionPerformed
        // TODO add your handling code here:

        rcvr = to_TF.getText();
        sender = from_TF.getText();
        message = message_TF.getText();




        //create a new object
        Feedback f = new Feedback();

        //add contents to textfields to m
        f.setRcvr(rcvr);
        f.setSender(sender);
        f.setMessage(message);

        //add objects to arraylist
        fList.add(f);
        
        //increment
        count++;


        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        String rcvr = to_TF.getText();
        String sender = from_TF.getText();
        String message = message_TF.getText();

        try {
            outFile = new File("Feedback.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);

            bw.write(rcvr);
            bw.newLine();

            bw.write(sender);
            bw.newLine();

            bw.write(message);
            bw.newLine();
            bw.close();

            JOptionPane.showMessageDialog(null, "Feedback sent!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }
    }//GEN-LAST:event_send_btnActionPerformed

    private void array_disp_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_array_disp_btnActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < fList.size(); i++) {
            JOptionPane.showMessageDialog(null, "To: " + fList.get(i).getRcvr() + "\n From: " + fList.get(i).getSender() + "\n Message: " + fList.get(i).getMessage());
    }//GEN-LAST:event_array_disp_btnActionPerformed

    }

    private void load_txt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_txt_btnActionPerformed
        // TODO add your handling code here:
        String rcvr;
        String sender;
        String message;
        File inFile;
        FileReader fr;
        BufferedReader br;

        try {
            inFile = new File("Feedback.txt");
            fr = new FileReader(inFile);
            br = new BufferedReader(fr);

            rcvr = br.readLine();
            sender = br.readLine();
            message = br.readLine();

            while ((rcvr != null) || (rcvr != null) || (message != null)) {
                JOptionPane.showMessageDialog(null, "To: " + rcvr + "\n From: " + sender + "\n Message: " + message);
                rcvr = br.readLine();
                sender = br.readLine();
                message = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_load_txt_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        String searchRcvr = JOptionPane.showInputDialog(null, "Please enter the e-mail of who will receive this feedback: ");
        for (Feedback x : fList) {
            if (searchRcvr.equalsIgnoreCase(x.getRcvr())) {
                JOptionPane.showMessageDialog(null, "Email: " + x.getRcvr());
            }
        }

    }//GEN-LAST:event_search_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        if (to_TF.getText().equals("") || from_TF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter the receiver's and the sender's e-mail address to delete");
        } else if (count == 0) {
            JOptionPane.showMessageDialog(null, "There are no items to delete this time");
        } else {
            rcvr = to_TF.getText();
            sender = from_TF.getText();
            

            for (int i = 0; i < fList.size(); i++) {
                if (fList.get(i).getRcvr().equals(rcvr) && fList.get(i).getSender().equals(sender)) {
                    fList.remove(i);
                    count = count - 1;
                    JOptionPane.showMessageDialog(null, "Deleted item at index " + i);
                    break;
                }
                if (i == count - 1) {
                    JOptionPane.showMessageDialog(null, "Item cannot be found");
                }
            }
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        MainPageGUI g = new MainPageGUI();
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FROM;
    private javax.swing.JLabel Feedback;
    private javax.swing.JLabel MESSAGE;
    private javax.swing.JLabel TO;
    private javax.swing.JButton array_disp_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel background;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField from_TF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton load_txt_btn;
    private javax.swing.JTextField message_TF;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton send_btn;
    private javax.swing.JTextField to_TF;
    // End of variables declaration//GEN-END:variables
}
