
package admin;

import DBconnector.DBconnector;
import DBconnector.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class adminAdd_Staff extends javax.swing.JFrame {


    public adminAdd_Staff() {
        initComponents();
    }
    
    public String userEmail;
    public String userUsername;
    
    public boolean isDuplicate(){
        DBconnector connector = new DBconnector();
        try{
            String query = "SELECT * FROM staff_table  WHERE User_name = '" + username.getText() + "' OR Email = '" + email.getText() + "'";
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
    
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        contactNo = new javax.swing.JTextField();
        addStaff = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
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

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("last Name:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 160, 120, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Gender:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 200, 100, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Email:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(360, 240, 60, 30);

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
        jPanel1.add(lname);
        lname.setBounds(150, 160, 190, 30);
        jPanel1.add(address);
        address.setBounds(440, 160, 180, 30);
        jPanel1.add(fname);
        fname.setBounds(150, 120, 190, 30);
        jPanel1.add(email);
        email.setBounds(440, 240, 180, 30);
        jPanel1.add(age);
        age.setBounds(440, 200, 180, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Address:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(360, 160, 70, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Password:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(30, 330, 100, 30);
        jPanel1.add(password);
        password.setBounds(150, 330, 290, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 290, 100, 30);
        jPanel1.add(username);
        username.setBounds(150, 290, 290, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Contact No.");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 240, 100, 30);
        jPanel1.add(contactNo);
        contactNo.setBounds(150, 240, 190, 30);

        addStaff.setText("Add");
        addStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffActionPerformed(evt);
            }
        });
        jPanel1.add(addStaff);
        addStaff.setBounds(270, 390, 130, 40);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Fisrt Name:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(30, 120, 120, 30);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        jPanel1.add(status);
        status.setBounds(440, 120, 180, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Status:");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(360, 120, 70, 30);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        jPanel1.add(gender);
        gender.setBounds(150, 200, 190, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addStaff (1).png"))); // NOI18N
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

    private void addStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffActionPerformed
       DBconnector dbc = new DBconnector();
        
        if (fname.getText().isEmpty() || lname.getText().isEmpty() || password.getText().isEmpty() || contactNo.getText().isEmpty() || age.getText().isEmpty() || address.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else if (password.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 above");
        } else if (isDuplicate()){
            System.out.println("Duplicate");
        } else if (!isInteger(age.getText())){
            JOptionPane.showMessageDialog(null, "Please input valid age!");
        } else if (!isInteger(contactNo.getText())){
            JOptionPane.showMessageDialog(null, "Please input valid Contact!");
        } else {
            try {
                if (dbc.insertData("INSERT INTO staff_table (First_Name, Last_Name, Email, User_Name, Password, Contact, Age, Sex, Address, Status, Type)"
                        + "VALUES('" + fname.getText() + "','" + lname.getText() + "','" + email.getText() + "','" + username.getText() + "','" + passwordHasher.hashPassword(password.getText()) + "','"+ contactNo.getText() +"','"+ age.getText() +"','"+ gender.getSelectedItem() +"','"+ address.getText()+"','"+ status.getSelectedItem() +"','User')"))
                {
                    JOptionPane.showMessageDialog(null, "Inserted Successfully.");
                    adminStaff close = new adminStaff();
                    close.setVisible(true);
                    this.dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Connection Error!");
                }
            } catch (NoSuchAlgorithmException ex) {
                System.out.println(""+ex);
            }
              
        }
    }//GEN-LAST:event_addStaffActionPerformed

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
            java.util.logging.Logger.getLogger(adminAdd_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminAdd_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminAdd_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminAdd_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminAdd_Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStaff;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField contactNo;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
