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
public class PatientPayments extends javax.swing.JPanel {
    String nm[]; //public variable - available in all the things
int count=0;
int appointment = 0;
int totalf = 0;
String patientID = "";
    /**
     * Creates new form PatientPayments
     */
    public PatientPayments() {
        initComponents();
         nm = new String[100];
         rfund.setEditable(false);
        
        deets.setEditable(false);
        
            try
                {
                FileReader freee = new FileReader ("appointments.txt");
                BufferedReader breee = new BufferedReader (freee);
                String oneStudent = "";
                
                while((oneStudent = breee.readLine()) !=null){
                StringTokenizer stefe = new StringTokenizer (oneStudent, ",");
                String abcd = stefe.nextToken().trim();
                String bcde = stefe.nextToken().trim();
                String cdef = stefe.nextToken().trim();
                String defg = stefe.nextToken().trim();
                String efgh = stefe.nextToken().trim();
                String fghi = stefe.nextToken().trim();
                String ghij = stefe.nextToken().trim(); 
                String hijk = stefe.nextToken().trim(); 
                String ijkl = stefe.nextToken().trim(); 
                String jklm = stefe.nextToken().trim(); 
                
                try
    {
    FileReader fr = new FileReader ("patientLoggedIn.txt");
    BufferedReader br = new BufferedReader (fr);
    String oneStu = "";
            
    while ((oneStu = br.readLine()) !=null)
    {           
    StringTokenizer st = new StringTokenizer (oneStu, ",");
    String a = st.nextToken().trim();
    String b = st.nextToken().trim();
    String c = st.nextToken().trim();
    String d = st.nextToken().trim();
    String e = st.nextToken().trim();
    String f = st.nextToken().trim();
    String g = st.nextToken().trim();
    int h = Integer.parseInt(st.nextToken());
    
    try
                {
                FileReader free = new FileReader ("doctor.txt");
                BufferedReader bree = new BufferedReader (free);
                String oneStud = "";
                
                while((oneStud = bree.readLine()) !=null){
                StringTokenizer stef = new StringTokenizer (oneStud, ",");
                String abc = stef.nextToken().trim();
                String bcd = stef.nextToken().trim();
                String cde = stef.nextToken().trim();
                String def = stef.nextToken().trim();
                String efg = stef.nextToken().trim();
                String fgh = stef.nextToken().trim();
                String ghi = stef.nextToken().trim(); 
                
                if(a.equals(abcd))
                {
                    if(ijkl.equals(abc)){
                        appointment = appointment +1;
                        total.setText((appointment*150)+"");
                        totalf = h;
                        patientID = a;
                        deets.setText("Doctor: " + bcd + " " + cde + "\n" + "Doctor Details: " + ghi + "; " + efg + "\n" + "Issue: " + fghi + "\n" + "Date: " + ghij + "\n" + "Time: " + hijk + "\n" + "Satus: " + jklm + "\n" + "Funds: " + h);
                    }
                    
                
                }   
                }

                bree.close();
                }
                catch(Exception erre)
                {
                System.out.println("System Not Workingf");
                }
    
    }
    br.close();
    }
    catch(Exception er)
    {
    System.out.println("System Not Workingm");
    }
                
                
                }

                breee.close();
                }
                catch(Exception errn)
                {
                System.out.println("System Not Workingl");
                }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        deets = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rfund = new javax.swing.JTextField();

        deets.setColumns(20);
        deets.setRows(5);
        jScrollPane1.setViewportView(deets);

        jLabel1.setText("Appointment Details:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Payments");

        jLabel3.setText("Total (AED):");

        jButton1.setText("Pay Now!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Remaning Funds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(159, 159, 159))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfund, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rfund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int ans = 0;
String ansb = "";
String paid = "";
if (totalf>=150){
ans = totalf- (150* appointment);


try
        {
            FileReader fr = new FileReader ("patient.txt");
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
            System.out.println("System Not Working 1");
        }
     
        try
{
    FileWriter fre = new FileWriter("patient.txt", false);
    PrintWriter pre = new PrintWriter (fre);
    
    
    for (int i = 0; i<count; i++)
    {
        

        StringTokenizer tk = new StringTokenizer(nm[i],",");
        String id1 = tk.nextToken();
        String fname = tk.nextToken();
        String lname = tk.nextToken();
        String agee = tk.nextToken();
        String sexp = tk.nextToken();
        String iss = tk.nextToken();
        String dte = tk.nextToken();
        String tme = tk.nextToken();

        
        if (patientID.equals(id1))
        {
            //copy new data from the text fields
            if (appointment==1)
            {
               javax.swing.JOptionPane.showMessageDialog(null, "Thank you! Payment Recieved", "Information",
                javax.swing.JOptionPane.INFORMATION_MESSAGE); 
               pre.println(id1 + "," + fname + "," + lname + "," + agee + "," + sexp + "," + iss + "," + dte + "," + ans);  
               
               try
                {
                    FileWriter fw12 = new FileWriter ("paid.txt",true);
                    PrintWriter stRecord = new PrintWriter (fw12);

                    String idg= id1;
                    paid = "yes";
                   

                    ansb = ansb + id1+"," + paid ;

                    stRecord.println(ansb);
                    stRecord.close();


                }

                catch(Exception er)
                {
                    System.out.println("System Not Working");
                }
               
            }
            
        }
            else
        {
            pre.println(nm[i]);
            
            
        }
            
        
        
        
      
               
    }
    pre.close();
}
catch (Exception err)
        {
            System.out.println("System Not Working 2");
        }

        rfund.setText(ans+"");
}

else{
    javax.swing.JOptionPane.showMessageDialog(null, "Insufficient Funds", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
    
    
}
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea deets;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rfund;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}