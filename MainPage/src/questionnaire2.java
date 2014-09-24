
/*
 *questionnaire2.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @reference Frances Sheridan http://www.youtube.com/channel/UCtUpH8J1hPwknbP55T3Vung?feature=watch
 * 
 * @author Joanna Bautista, x12374571
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joanna Bautista, x12374571
 */
public class questionnaire2 extends javax.swing.JFrame {
// FIrstYear [] first;
    ArrayList<FIrstYear> firstList;
    
    int firstCount;   
     /* Creates new form questionnaire */
    public questionnaire2() {
        initComponents();
    

    //first = new FIrstYear[100];
    firstList = new ArrayList<>();
    firstCount = 0;
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
        selfAssessmentheadingjL = new javax.swing.JLabel();
        firstRB = new javax.swing.JRadioButton();
        secondRB = new javax.swing.JRadioButton();
        thirdRB = new javax.swing.JRadioButton();
        fourthRB = new javax.swing.JRadioButton();
        courseQJL = new javax.swing.JLabel();
        courseQTF = new javax.swing.JTextField();
        diagnosedQJL = new javax.swing.JLabel();
        diagnosedQJCB = new javax.swing.JComboBox();
        readQJL = new javax.swing.JLabel();
        readQJCB = new javax.swing.JComboBox();
        clumsyQJL = new javax.swing.JLabel();
        clumsyQJCB = new javax.swing.JComboBox();
        listenQJL = new javax.swing.JLabel();
        listenQJCB = new javax.swing.JComboBox();
        deleteJBq = new javax.swing.JButton();
        searchJBq = new javax.swing.JButton();
        saveJBq = new javax.swing.JButton();
        writeJBq = new javax.swing.JButton();
        loadJBq = new javax.swing.JButton();
        viewJBq = new javax.swing.JButton();
        studentQJL = new javax.swing.JLabel();
        studentQTF = new javax.swing.JTextField();
        backJBq = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        selfAssessmentheadingjL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selfAssessmentheadingjL.setForeground(new java.awt.Color(255, 255, 255));
        selfAssessmentheadingjL.setText("Self Assessment Questionnaire");
        jPanel1.add(selfAssessmentheadingjL);
        selfAssessmentheadingjL.setBounds(60, 10, 278, 22);

        firstRB.setBackground(new java.awt.Color(51, 51, 255));
        firstRB.setForeground(new java.awt.Color(255, 255, 255));
        firstRB.setText("First Year");
        firstRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstRBActionPerformed(evt);
            }
        });
        jPanel1.add(firstRB);
        firstRB.setBounds(110, 40, 110, 23);

        secondRB.setBackground(new java.awt.Color(51, 51, 255));
        secondRB.setForeground(new java.awt.Color(255, 255, 255));
        secondRB.setText("Second Year");
        secondRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondRBActionPerformed(evt);
            }
        });
        jPanel1.add(secondRB);
        secondRB.setBounds(110, 60, 110, 23);

        thirdRB.setBackground(new java.awt.Color(51, 51, 255));
        thirdRB.setForeground(new java.awt.Color(255, 255, 255));
        thirdRB.setText("Third Year");
        thirdRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdRBActionPerformed(evt);
            }
        });
        jPanel1.add(thirdRB);
        thirdRB.setBounds(220, 40, 110, 23);

        fourthRB.setBackground(new java.awt.Color(51, 51, 255));
        fourthRB.setForeground(new java.awt.Color(255, 255, 255));
        fourthRB.setText("Fourth Year");
        fourthRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthRBActionPerformed(evt);
            }
        });
        jPanel1.add(fourthRB);
        fourthRB.setBounds(220, 60, 110, 23);

        courseQJL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        courseQJL.setForeground(new java.awt.Color(255, 255, 255));
        courseQJL.setText("Course:");
        jPanel1.add(courseQJL);
        courseQJL.setBounds(20, 120, 70, 17);
        jPanel1.add(courseQTF);
        courseQTF.setBounds(110, 120, 120, 20);

        diagnosedQJL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        diagnosedQJL.setForeground(new java.awt.Color(255, 255, 255));
        diagnosedQJL.setText("<html>\nHave you ever been <br/>\ndiagnosed with dislexia<br/>\n/dyspraxia/dyscalculia?\n</html>");
        jPanel1.add(diagnosedQJL);
        diagnosedQJL.setBounds(20, 130, 140, 70);

        diagnosedQJCB.setEditable(true);
        diagnosedQJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No", "Don't Know", " " }));
        diagnosedQJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosedQJCBActionPerformed(evt);
            }
        });
        jPanel1.add(diagnosedQJCB);
        diagnosedQJCB.setBounds(210, 160, 120, 20);

        readQJL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        readQJL.setForeground(new java.awt.Color(255, 255, 255));
        readQJL.setText("<html>\nHave you ever used a <br/>\ncoloured overlay or had <br/>\ntinted lenses to help you <br/>\nwith reading?\n </html>");
        jPanel1.add(readQJL);
        readQJL.setBounds(20, 200, 160, 60);

        readQJCB.setEditable(true);
        readQJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes ", "No", "Don't Know", " " }));
        jPanel1.add(readQJCB);
        readQJCB.setBounds(210, 220, 120, 20);

        clumsyQJL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clumsyQJL.setForeground(new java.awt.Color(255, 255, 255));
        clumsyQJL.setText("<html>\nDo you consider yourself to<br/>\nbe accident prone or clumsy?<br/>\n</html>");
        jPanel1.add(clumsyQJL);
        clumsyQJL.setBounds(20, 260, 170, 60);

        clumsyQJCB.setEditable(true);
        clumsyQJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No", "Don't Know", " " }));
        jPanel1.add(clumsyQJCB);
        clumsyQJCB.setBounds(210, 270, 120, 20);

        listenQJL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listenQJL.setForeground(new java.awt.Color(255, 255, 255));
        listenQJL.setText("<html>\nDo you find it hard to listen<br/>\nto retain verbal info/ Spoken <br/>\ninstructions?\n</html>");
        jPanel1.add(listenQJL);
        listenQJL.setBounds(20, 320, 190, 50);

        listenQJCB.setEditable(true);
        listenQJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No", "Don't Know" }));
        jPanel1.add(listenQJCB);
        listenQJCB.setBounds(210, 330, 120, 20);

        deleteJBq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete_PNG.png"))); // NOI18N
        deleteJBq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBqActionPerformed(evt);
            }
        });
        jPanel1.add(deleteJBq);
        deleteJBq.setBounds(20, 380, 70, 25);

        searchJBq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search_PNG.png"))); // NOI18N
        searchJBq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJBqActionPerformed(evt);
            }
        });
        jPanel1.add(searchJBq);
        searchJBq.setBounds(240, 100, 70, 25);

        saveJBq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save_PNG.png"))); // NOI18N
        saveJBq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJBqActionPerformed(evt);
            }
        });
        jPanel1.add(saveJBq);
        saveJBq.setBounds(260, 380, 70, 25);

        writeJBq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Write_PNG.png"))); // NOI18N
        writeJBq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeJBqActionPerformed(evt);
            }
        });
        jPanel1.add(writeJBq);
        writeJBq.setBounds(140, 380, 70, 25);

        loadJBq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Load_TXT_PNG.png"))); // NOI18N
        loadJBq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadJBqActionPerformed(evt);
            }
        });
        jPanel1.add(loadJBq);
        loadJBq.setBounds(140, 420, 70, 25);

        viewJBq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Display_PNG.png"))); // NOI18N
        viewJBq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJBqActionPerformed(evt);
            }
        });
        jPanel1.add(viewJBq);
        viewJBq.setBounds(260, 420, 70, 25);

        studentQJL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentQJL.setForeground(new java.awt.Color(255, 255, 255));
        studentQJL.setText("Student ID:\n");
        jPanel1.add(studentQJL);
        studentQJL.setBounds(20, 90, 80, 15);
        jPanel1.add(studentQTF);
        studentQTF.setBounds(110, 90, 120, 20);

        backJBq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_PNG.png"))); // NOI18N
        backJBq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBqActionPerformed(evt);
            }
        });
        jPanel1.add(backJBq);
        backJBq.setBounds(20, 410, 100, 35);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/One.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(-780, -330, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteJBqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBqActionPerformed
        // TODO add your handling code here:
        String studentID = studentQTF.getText();
        String course = courseQTF.getText();
        //int deleteIndex = -1;
        FIrstYear f;
        firstCount = firstList.size();
        if (studentID.equals("") && course.equals("")){
            JOptionPane.showConfirmDialog(null, "Enter student ID and course to delete!");
        }else {
            for (int i=0; i<firstCount; i++){
                //f = first[i];
                f = firstList.get(i);
                if(studentID.equals(f.getStudentIDQ()) && course.equals(f.getCourseQ())){
                    //first[i] = first [firstCount-1];
                    //first[firstCount-1] = null;
                    //firstCount --;
                    
                    firstList.remove(i);
                    
                    JOptionPane.showMessageDialog(null, "Deleting:" +f.getStudentIDQ()+", "+f.getCourseQ()+"from array"
                            + "There are" + firstCount + "more information left");
                    break;
                }
            }
            if (firstCount == 0){
                JOptionPane.showMessageDialog(null, "No information in database");
             }
    }
        
        
        
    }//GEN-LAST:event_deleteJBqActionPerformed

    private void saveJBqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJBqActionPerformed
        // TODO add your handling code here:
        String studentIDQ, courseQ, type;
        FIrstYear f;
        studentIDQ = studentQTF.getText();
        courseQ = courseQTF.getText();
        if(firstRB.isSelected()){
            type = "First Year";
            f = new FIrstYear (studentIDQ, courseQ);
        }else if (secondRB.isSelected()){
            type="Second year";
            f = new SecondYear (studentIDQ, courseQ);
        }else if (thirdRB.isSelected()){
            type = "Third Year";
            f = new ThirdYear  (studentIDQ, courseQ);
        }else if (fourthRB.isSelected()){
            type = "Fourth Year";
            f = new FourthYear (studentIDQ, courseQ);
        }else{
            type = null;
            f = new FIrstYear(studentIDQ, courseQ);
        }
        studentQTF.setText("");
        courseQTF.setText("");
         String answer1 = diagnosedQJCB.getSelectedItem().toString();       
         String answer2 =  (String) listenQJCB.getSelectedItem();
         String answer3 = readQJCB.getSelectedItem(). toString();
         String answer4 = clumsyQJCB.getSelectedItem(). toString();         
        JOptionPane.showMessageDialog(null, "Success Adding"+studentIDQ+"to the Array");
        //first[firstCount] = f;
        //firstCount++;
        firstList.add(f);
       
    }//GEN-LAST:event_saveJBqActionPerformed

    private void searchJBqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJBqActionPerformed
        // TODO add your handling code here:
        String studentID, course;
        
        studentID = studentQTF.getText();
        course = courseQTF.getText();
        
       //firstCount = firstList.size();
        FIrstYear f;
        if(studentID.equals("") && course.equals("")){
            JOptionPane.showMessageDialog(null, "You did not enter a valid student ID or a course");
        }else{
            for (int i = 0; i<firstCount; i++) {
                //f = first[i];
                f = firstList.get(i);
                if(studentID.equals(f.getStudentIDQ()) || course.equals(f.getCourseQ())){
                    if (f instanceof SecondYear) {
                        SecondYear sec = (SecondYear) f;
                        JOptionPane.showMessageDialog(null, "Student ID:" +sec.getStudentIDQ()+"\nCourse:" + sec.getCourseQ());
                    }else if (f instanceof ThirdYear){
                        ThirdYear third = (ThirdYear) f;
                        JOptionPane.showMessageDialog(null,"Student ID:" +third.getStudentIDQ()+"\nCourse:" + third.getCourseQ());
                    }else if(f instanceof FourthYear) {
                        FourthYear fourth = (FourthYear) f;
                        JOptionPane.showMessageDialog(null,"Student ID :"+fourth.getStudentIDQ()+"\nCourse:"+fourth.getCourseQ());
                    }else if (f instanceof FIrstYear){
                        JOptionPane.showMessageDialog(null, "Student ID:"+f.getStudentIDQ()+"\nCourse:" + f.getCourseQ());
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"No such ID");
                    }
                }
                
            }
        }
        if (firstCount == 0) {
            JOptionPane.showMessageDialog(null, "No information in database");
        }
    }//GEN-LAST:event_searchJBqActionPerformed

    private void viewJBqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJBqActionPerformed
        // TODO add your handling code here:
        FIrstYear f;
        String studentID, course;
        
        firstCount = firstList.size();
        
        for(int i = 0; i<firstCount; i++){
            //e = emp[i];
            f =  firstList.get(i);
            studentID = f.getStudentIDQ();
            course = f.getCourseQ();
            if (f instanceof SecondYear){
                SecondYear sec = (SecondYear) f;
                JOptionPane.showMessageDialog(null, "Student ID: " +studentID+ "\n Course:" + course);
            }else if (f instanceof ThirdYear) {
                ThirdYear third = (ThirdYear) f;
                 JOptionPane.showMessageDialog(null, "Student ID;" + studentID+ "\n Course: " + course);
            }else if(f instanceof FourthYear) {
                FourthYear fourth = (FourthYear) f;
                JOptionPane.showMessageDialog(null,"Student ID :" + studentID+ "\n Course:" + course);
            }else {
                JOptionPane.showMessageDialog(null, "Student ID:" + studentID+ "\n Course:" + course);
           
            }
        }
    }//GEN-LAST:event_viewJBqActionPerformed

    private void writeJBqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeJBqActionPerformed
        // TODO add your handling code here:
        String studentID, course;
        try{
            //1.Change to allow writing of objects
            File f = new File ("output.dat");
            FileOutputStream os = new FileOutputStream(f);
            ObjectOutputStream outputStream = new ObjectOutputStream (os);
            
            outputStream.writeObject(firstList);
            
            outputStream.close();
            JOptionPane.showMessageDialog(null, "Success writing to File:" +f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(questionnaire2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(questionnaire2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_writeJBqActionPerformed

    private void loadJBqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadJBqActionPerformed
        // TODO add your handling code here:
        String line, arr[];
        String studentID, course;
        try{
            File f = new File("output.dat");
            FileInputStream inStream = new FileInputStream(f);
            try (ObjectInputStream oStream = new ObjectInputStream (inStream)) {
                firstList = (ArrayList) oStream.readObject();
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(questionnaire2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString()+ "Error reading from File");
        }
    }//GEN-LAST:event_loadJBqActionPerformed

    private void backJBqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBqActionPerformed
        // TODO add your handling code here:
        questionnaire1 q = new questionnaire1();
        q.setVisible(true);
        dispose();
    }//GEN-LAST:event_backJBqActionPerformed

    private void firstRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstRBActionPerformed
        // TODO add your handling code here:
        courseQTF.setVisible(true);
        courseQJL.setVisible(true);
        
        clumsyQJCB.setVisible(true);
        clumsyQJL.setVisible(true);
        
        diagnosedQJCB.setVisible(true);
        diagnosedQJL.setVisible(true);
        
        listenQJCB.setVisible(true);
        listenQJL.setVisible(true);
        
        readQJCB.setVisible(true);
        readQJL.setVisible(true);
        
    }//GEN-LAST:event_firstRBActionPerformed

    private void thirdRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdRBActionPerformed
        // TODO add your handling code here:
                courseQTF.setVisible(true);
        courseQJL.setVisible(true);
        
        clumsyQJCB.setVisible(true);
        clumsyQJL.setVisible(true);
        
        diagnosedQJCB.setVisible(true);
        diagnosedQJL.setVisible(true);
        
        listenQJCB.setVisible(true);
        listenQJL.setVisible(true);
        
        readQJCB.setVisible(true);
        readQJL.setVisible(true);
    }//GEN-LAST:event_thirdRBActionPerformed

    private void secondRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondRBActionPerformed
        // TODO add your handling code here:
                courseQTF.setVisible(true);
        courseQJL.setVisible(true);
        
        clumsyQJCB.setVisible(true);
        clumsyQJL.setVisible(true);
        
        diagnosedQJCB.setVisible(true);
        diagnosedQJL.setVisible(true);
        
        listenQJCB.setVisible(true);
        listenQJL.setVisible(true);
        
        readQJCB.setVisible(true);
        readQJL.setVisible(true);
    }//GEN-LAST:event_secondRBActionPerformed

    private void fourthRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthRBActionPerformed
        // TODO add your handling code here:
                courseQTF.setVisible(true);
        courseQJL.setVisible(true);
        
        clumsyQJCB.setVisible(true);
        clumsyQJL.setVisible(true);
        
        diagnosedQJCB.setVisible(true);
        diagnosedQJL.setVisible(true);
        
        listenQJCB.setVisible(true);
        listenQJL.setVisible(true);
        
        readQJCB.setVisible(true);
        readQJL.setVisible(true);
    }//GEN-LAST:event_fourthRBActionPerformed

    private void diagnosedQJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosedQJCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosedQJCBActionPerformed

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
            java.util.logging.Logger.getLogger(questionnaire2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questionnaire2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questionnaire2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questionnaire2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new questionnaire2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBq;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox clumsyQJCB;
    private javax.swing.JLabel clumsyQJL;
    private javax.swing.JLabel courseQJL;
    private javax.swing.JTextField courseQTF;
    private javax.swing.JButton deleteJBq;
    private javax.swing.JComboBox diagnosedQJCB;
    private javax.swing.JLabel diagnosedQJL;
    private javax.swing.JRadioButton firstRB;
    private javax.swing.JRadioButton fourthRB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox listenQJCB;
    private javax.swing.JLabel listenQJL;
    private javax.swing.JButton loadJBq;
    private javax.swing.JComboBox readQJCB;
    private javax.swing.JLabel readQJL;
    private javax.swing.JButton saveJBq;
    private javax.swing.JButton searchJBq;
    private javax.swing.JRadioButton secondRB;
    private javax.swing.JLabel selfAssessmentheadingjL;
    private javax.swing.JLabel studentQJL;
    private javax.swing.JTextField studentQTF;
    private javax.swing.JRadioButton thirdRB;
    private javax.swing.JButton viewJBq;
    private javax.swing.JButton writeJBq;
    // End of variables declaration//GEN-END:variables
}
