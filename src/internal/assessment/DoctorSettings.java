/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal.assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author jatinrughwani
 */
public class DoctorSettings extends javax.swing.JPanel {
String nm[]; //public variable - available in all the things
int count=0;
    /**
     * Creates new form DoctorSettings
     */
    public DoctorSettings() {
        initComponents();
        nm = new String[100];

    lockAll();
                        
        agec.removeAllItems();
        agec.addItem("-");
        for (int i =0; i<=120; i++){
        agec.addItem(i+"");
    }
         
        
         try
        {
            int error = 0;
            
 FileReader fr = new FileReader("doctorLoggedIn.txt");//tells which file
            BufferedReader sReader = new BufferedReader(fr);//opens the reader
            String oneStudent = "";
    
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
                
                    try
        {
            
                FileReader fre = new FileReader("doctor.txt");//tells which file
                 BufferedReader sReadere = new BufferedReader(fre);//opens the reader
                    String oneStudente = "";
    
            while((oneStudente = sReadere.readLine()) !=null)
            {
               
                StringTokenizer ste = new StringTokenizer (oneStudente, ","); // "," is used to seperate data in text file. st is variable name
                int ab = Integer.parseInt(ste.nextToken());     
                String bc = ste.nextToken();
                String cd = ste.nextToken();
                String de = ste.nextToken();
                String ef = ste.nextToken();
                String fg = ste.nextToken();
                String gh = ste.nextToken();
                
                    if (a==ab){
                
                    ide.setText(ab+"");
                    firstname.setText(bc);
                    lastname.setText(cd);
                    password.setText(de);
                    reenterpassword.setText(de);
                    age.setText(ef);
                    email.setText(fg);
                    reenteremail.setText(fg);
                    sex.setText(gh);
                    }
                    }
                sReadere.close();
                
        }
    catch(Exception ere)
                    {
                        System.out.println("System Not Workin1g");
                    }
                
            }
                sReader.close();
                
        }
    catch(Exception er)
                    {
                        System.out.println("System Not Worki2ng");
                    }
        
        
        
        
        
        
    }
    
    private void lockAll(){
        agec.setVisible(false);
        Male.setVisible(false);
        Female.setVisible(false);
        ide.setEditable(false);
        firstname.setEditable(false);
        lastname.setEditable(false);
        password.setEditable(false);
        reenterpassword.setEditable(false);
        age.setEditable(false);
        email.setEditable(false);
        reenteremail.setEditable(false);
        sex.setEditable(false);
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        agec = new javax.swing.JComboBox<>();
        reenterpassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ide = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        reenteremail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sex = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("Password");

        Male.setText("Male");

        jLabel6.setText("Email");

        Female.setText("Female");

        jLabel7.setText("Re-enter Email");

        agec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Age");

        jLabel5.setText("Last Name");

        ide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ideActionPerformed(evt);
            }
        });

        jLabel4.setText("Re-enter Password");

        jLabel1.setText("First Name");

        jLabel8.setText("Sex");

        jButton1.setText("Enable Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(reenterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(agec, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(ide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(reenteremail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Female)
                    .addComponent(Male))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jLabel3)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Female)
                        .addGap(9, 9, 9)
                        .addComponent(Male))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reenteremail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ideActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agec.setVisible(true);
        Male.setVisible(true);
        Female.setVisible(true);
        firstname.setEditable(true);
        lastname.setEditable(true);
        password.setEditable(true);
        reenterpassword.setEditable(true);
        email.setEditable(true);
        reenteremail.setEditable(true);

        
        try
        {
            FileReader fr = new FileReader ("doctor.txt");
            BufferedReader br = new BufferedReader(fr);
            String oneRec = "";
            count = 0;
            
            while ((oneRec = br.readLine()) !=null)
            {
                nm[count] = oneRec;
                count = count+1;
            }
        }
        
        catch (Exception er)
        {
            System.out.println("System Not Working 2");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        boolean done = true;
        if ((password.getText().equals(reenterpassword.getText())) && (email.getText().equals(reenteremail.getText())))
        {
            lockAll();

            String gender22 = "";
            boolean male1 = true;

            try
            {
                String idEdit = ide.getText();
                FileWriter fr = new FileWriter("doctor.txt", false);
                PrintWriter pr = new PrintWriter (fr);

                for (int i = 0; i<count; i++)
                {

                    System.out.println("hi");

                    StringTokenizer tk = new StringTokenizer(nm[i],",");
                    String id1 = tk.nextToken();
                    String  fname = tk.nextToken();
                    String lname = tk.nextToken();
                    String passworde = tk.nextToken();
                    String agee = tk.nextToken();
                    String emaill = tk.nextToken();
                    String se = tk.nextToken();

                    if (idEdit.equals(id1))
                    {
                        //copy new data from the text fields
                        if (Male.isSelected())
                        {
                            gender22 = "male";
                            male1 = false;
                        }

                        if (Female.isSelected())
                        {
                            gender22 = "female";
                            male1 = false;
                            sex.setText("female");
                        }

                        if (male1 == true )
                        {
                            gender22 = sex.getText();
                            sex.setText("male");
                        }

                        if (agec.getSelectedItem().equals("-"))
                        {
                            pr.println(ide.getText() + "," + firstname.getText()+ ","  + lastname.getText()+ ","  + password.getText() + "," + age.getText() + "," + email.getText() + "," + gender22);
                        }

                        else
                        {
                            age.setText(agec.getSelectedItem() +"");
                            pr.println(ide.getText() + "," + firstname.getText()+ ","  + lastname.getText()+ ","  + password.getText() + "," + agec.getSelectedItem() + "," + email.getText() + "," + gender22);
                        }
                    }

                    else
                    {
                        pr.println(nm[i]);
                    }

                    done = false;

                }
                pr.close();
            }
            catch (Exception er)
            {
                System.out.println("System Not Working 2");
            }

        }

        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Please make sure your passwords and emails match", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        if (done==false){
            javax.swing.JOptionPane.showMessageDialog(null, "Saved! Your information will be updated on the next log in ", "Information",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> agec;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField ide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField password;
    private javax.swing.JTextField reenteremail;
    private javax.swing.JTextField reenterpassword;
    private javax.swing.JTextField sex;
    // End of variables declaration//GEN-END:variables
}
