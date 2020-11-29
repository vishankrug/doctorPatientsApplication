/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal.assessment;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author jatinrughwani
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
         jButton3.setVisible(false);
        
        age.removeAllItems();
        age.addItem("-");
       for (int i =0; i<=120; i++){
        age.addItem(i+"");
    }
        
        
         try
        {
 FileReader fr = new FileReader("doctor.txt");//tells which file
            BufferedReader sReader = new BufferedReader(fr);//opens the reader
            String oneStudent = "";
            int z = 0;
    
            while((oneStudent = sReader.readLine()) !=null)
            {
               
                StringTokenizer st = new StringTokenizer (oneStudent, ","); // "," is used to seperate data in text file. st is variable name
                int a = Integer.parseInt(st.nextToken());     
                String b = st.nextToken();
                String c = st.nextToken();
                String d = st.nextToken();
                String e = st.nextToken();
                String f = st.nextToken();
                String g = st.nextToken();
                
                z = a + 1;
                
        }
                sReader.close();
                ide.setText(z+"");
                firstname.setText("");
                lastname.setText("");
                password.setText("");
                reenterpassword.setText("");
                age.setSelectedItem(0);
                email.setText("");
                reenteremail.setText("");
                password.setText("");
                buttonGroup1.clearSelection();
        }
    catch(Exception er)
                    {
                        System.out.println("hi");
                    }
                        ide.setEditable(false);
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        lastname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        ide = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JComboBox<>();
        password = new javax.swing.JTextField();
        reenteremail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        reenterpassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Create Account!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        jLabel6.setText("Email");

        ide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ideActionPerformed(evt);
            }
        });

        jLabel7.setText("Re-enter Email");

        age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("First Name");

        jLabel8.setText("Sex");

        jLabel2.setText("Password");

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        jLabel3.setText("Age");

        buttonGroup1.add(female);
        female.setText("Female");

        jLabel4.setText("Re-enter Password");

        jLabel5.setText("Last Name");

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextField1.setText("Doctor");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Log In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(male)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(female))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(reenteremail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(reenterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(39, 39, 39)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jButton3)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(reenterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(reenteremail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(male)
                            .addComponent(female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int err=0;
        boolean avi = false;

        int m = password.getText().length();
        int j = email.getText().length();

        if(firstname.getText().equals(""))
        {
            err =1;
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter your first name", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;
        }

        if(lastname.getText().equals("")&& avi==false)
        {
            err =2;
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter your last name", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;
        }

        if(password.getText().equals("") &&avi==false)
        {
            err =3;
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter a password", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;
        }
        
        if ((!(password.getText().equals(reenterpassword.getText()))) && (avi==false)){
            err=7;
            javax.swing.JOptionPane.showMessageDialog(null, "Please make sure your passwords match", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;
        }
        
        if (age.getSelectedItem().equals("-") && avi==false){
            err=10;
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter your age", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;
        }
        
        if(email.getText().equals("") &&avi==false)
        {
            err =4;
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter your email", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;
        }
        else
        {
            if (avi==false)
            {
                int w = j-4;

                String x = email.getText().substring(w,j);

                if (x.equals(".com"))
                {
                }
                else
                {
                    err=5;
                    javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                    avi = true;
                }
            }
        }

        if ((!(email.getText().equals(reenteremail.getText())))&& avi==false){
            err=8;
            javax.swing.JOptionPane.showMessageDialog(null, "Please make sure your emails match", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;
        }
        
        if (!(male.isSelected()||female.isSelected()) && avi==false){
            err=9;
            javax.swing.JOptionPane.showMessageDialog(null, "Please choose your sex", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            avi = true;}

        if (err<=0)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Successful", "Information",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

                try
                {
                    FileWriter fw1 = new FileWriter ("doctor.txt",true);
                    PrintWriter stRecord = new PrintWriter (fw1);

                    String fname = firstname.getText();
                    String lname = lastname.getText();
                    String ppassword = password.getText();
                    String repassword = reenterpassword.getText();
                    String agee = age.getSelectedItem()+"";
                    String eemail = email.getText();
                    String reemail = reenteremail.getText();
                    String ans = "";
                    String id = ide.getText();
                    String sex = "";
                    
                    if (male.isSelected()){
                        sex = "male";
                    }
                    if (female.isSelected()){
                        sex = "female";
                    }

                    ans = ans + id + "," + fname + "," + lname + "," + ppassword + "," + agee + "," + eemail + "," + sex ;

                    stRecord.println(ans);
                    stRecord.close();

                    FileReader fr = new FileReader ("doctor.txt");
                    BufferedReader sReader = new BufferedReader (fr);

                    String oneStudent = "";
                    int z = 0;

                    while((oneStudent = sReader.readLine()) !=null)
                    {
                        StringTokenizer st = new StringTokenizer (oneStudent, ",");
                        int a = Integer.parseInt(st.nextToken());
                        String b = st.nextToken();
                        String c = st.nextToken();
                        String d = st.nextToken();
                        String e = st.nextToken();
                        String f = st.nextToken();
                        String g = st.nextToken();

                        z = a + 1;
                    }
                    sReader.close();
                    ide.setText(z+"");
                }

                catch(Exception er)
                {
                    System.out.println("Systemn not working");
                }

            firstname.setText("");
                lastname.setText("");
                password.setText("");
                reenterpassword.setText("");
                age.setSelectedItem("0");
                email.setText("");
                reenteremail.setText("");
                password.setText("");
                buttonGroup1.clearSelection();
                
                                jButton3.setVisible(true);

        }
        
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        CreateAccount say = new CreateAccount();
        say.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ideActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
close();
        DoctorLogIn day = new DoctorLogIn();
        day.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField ide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField password;
    private javax.swing.JTextField reenteremail;
    private javax.swing.JTextField reenterpassword;
    // End of variables declaration//GEN-END:variables
}
