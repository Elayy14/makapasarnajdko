
package admin;

import DBconnector.DBconnector;
import DBconnector.passwordHasher;
import static admin.adminAdd_Staff.isInteger;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import staff.staffChangePass;


public class adminEdit_Staff extends javax.swing.JFrame {

    public adminEdit_Staff() {
        initComponents();
    }

    public int userId;
    
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    public static boolean isValidTime(String timeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        sdf.setLenient(false);
        try {
            Date time = sdf.parse(timeStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    public String userEmail;
    public String userUsername;
    
    public boolean isDuplicate(){
        DBconnector connector = new DBconnector();
        try{
            //String query = "SELECT * FROM staff_table  WHERE User_name = '" + username.getText() + "' OR Email = '" + email.getText() + "'";
            String query = "SELECT * FROM staff_table  WHERE (User_name = '" + username.getText() + "' OR Email = '" + email.getText() + "')AND Id != '"+uid.getText()+"'";
            ResultSet resultSet = connector.getData(query);
            
            if (resultSet.next()){
                
                userEmail = resultSet.getString("Email");
                if (userEmail.equalsIgnoreCase(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email already used!");
                    email.setText(" ");
                }
                
                userUsername = resultSet.getString("User_name");
                if (userUsername.equalsIgnoreCase(username.getText())){
                    JOptionPane.showMessageDialog(null, "Username already used!");
                    username.setText(" ");
                }
                
                return true;
            } else {
                return false;
            }
        }catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        
    }
    
    public boolean updateCheck(){
        DBconnector connector = new DBconnector();
        try{
            String query = "SELECT * FROM staff_table  WHERE (User_name = '" + username.getText() + "' OR Email = '" + email.getText() + "')AND Id != '"+uid.getText()+"'";
            ResultSet resultSet = connector.getData(query);
            
            if (resultSet.next()){
                
                userEmail = resultSet.getString("Email");
                if (userEmail.equalsIgnoreCase(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email already used!");
                }
                
                userUsername = resultSet.getString("User_name");
                if (userUsername.equalsIgnoreCase(username.getText())){
                    JOptionPane.showMessageDialog(null, "Username already used!");
                }
                
                return true;
            } else {
                return false;
            }
        }catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        uid = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        lname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(179, 203, 181));
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Age:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(360, 200, 40, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Staff ID:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 120, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Last Name:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 200, 120, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Gender:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 240, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-30.png"))); // NOI18N
        jLabel3.setText("Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 20, 70, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Email:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(360, 240, 60, 30);
        jPanel1.add(address);
        address.setBounds(440, 160, 180, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Status:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(360, 120, 70, 30);
        jPanel1.add(fname);
        fname.setBounds(150, 160, 190, 30);
        jPanel1.add(email);
        email.setBounds(440, 240, 180, 30);

        uid.setEnabled(false);
        jPanel1.add(uid);
        uid.setBounds(150, 120, 190, 30);
        jPanel1.add(age);
        age.setBounds(440, 200, 180, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Address:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(360, 160, 70, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 320, 100, 30);
        jPanel1.add(username);
        username.setBounds(150, 320, 290, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Contact No.");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 280, 100, 30);
        jPanel1.add(contact);
        contact.setBounds(150, 280, 190, 30);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        jPanel1.add(status);
        status.setBounds(440, 120, 180, 30);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton);
        saveButton.setBounds(270, 410, 130, 40);
        jPanel1.add(lname);
        lname.setBounds(150, 200, 190, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("First Name:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(30, 160, 120, 30);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(gender);
        gender.setBounds(150, 240, 190, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editStaff.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 650, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        adminStaff staff = new adminStaff();
        staff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        DBconnector dbc = new DBconnector();
        
        if (fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || contact.getText().isEmpty() || username.getText().isEmpty() || address.getText().isEmpty() || age.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else if (updateCheck()){
            System.out.println("Duplicates");
        } else if (!isInteger(age.getText())){
            JOptionPane.showMessageDialog(null, "Please input valid age!");
        } else if (!isInteger(contact.getText())){
            JOptionPane.showMessageDialog(null, "Please input valid Contact!");
        } else {
            dbc.updateData("UPDATE staff_table SET First_Name = '"+ fname.getText() +"', Last_Name = '"+ lname.getText() +"', Email = '"+ email.getText() +"', "
                        + "User_Name = '"+ username.getText() +"', Contact = '"+ contact.getText() +"', Sex = '"+ gender.getSelectedItem() +"', Age = '"+ age.getText() +"', Address = '"+ address.getText() +"', status = '"+ status.getSelectedItem()+"' WHERE Id = '"+ uid.getText()+"'");
            adminStaff close = new adminStaff();
            close.setVisible(true);
            this.dispose(); 
        }  
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminEdit_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminEdit_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminEdit_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminEdit_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminEdit_Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField address;
    public javax.swing.JTextField age;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    public javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField lname;
    private javax.swing.JButton saveButton;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
