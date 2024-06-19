
package admin;

import DBconnector.DBconnector;
import DBconnector.Session;
import DBconnector.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import staff.staffChangePass;
import staff.staffProfile;


public class adminChangePass extends javax.swing.JFrame {

    Session session = Session.getInstance();
    public adminChangePass() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        newPassword = new javax.swing.JTextField();
        confirmPass = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(179, 203, 181));
        jPanel1.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Enter Old Password:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(130, 180, 170, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Enter New Password:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(130, 220, 180, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Confirm New Password:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(130, 260, 200, 30);

        jButton1.setText("Back");
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 350, 110, 40);
        jPanel1.add(newPassword);
        newPassword.setBounds(340, 220, 200, 30);
        jPanel1.add(confirmPass);
        confirmPass.setBounds(340, 260, 200, 30);
        jPanel1.add(password);
        password.setBounds(340, 180, 200, 30);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 350, 110, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/changePass.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 650, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DBconnector dbc =  new DBconnector();
        adminEdit_Staff changepass = new adminEdit_Staff();
        System.out.println("testing" + changepass.userId);
        if (password.getText().length() < 8 || newPassword.getText().length() < 8 || confirmPass.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 above");
        } else {   
            try {        
                
                
                
                String query = "SELECT * FROM staff_table WHERE Id = '"+ changepass.uid +"'";
                ResultSet resultSet = dbc.getData(query);
                
                if (resultSet.next()){
                    String oldPass = resultSet.getString("Password");
                    if (oldPass.equals(passwordHasher.hashPassword(password.getText()))){
                        if (!newPassword.getText().equals(confirmPass.getText())){
                            JOptionPane.showMessageDialog(null, "Password doesn't match!");
                        } else {
                            dbc.updateData("UPDATE staff_table SET Password = '"+ passwordHasher.hashPassword(confirmPass.getText())+"'WHERE Id = '"+ session.getUid()+"'");
                            adminProfile close = new adminProfile();
                            close.setVisible(true);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Your old password doesn't match!");
                    }
                }
            } catch(SQLException ex){
                System.out.println(""+ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(staffChangePass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newPassword;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
