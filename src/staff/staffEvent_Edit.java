
package staff;

import DBconnector.DBconnector;
import admin.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class staffEvent_Edit extends javax.swing.JFrame {


    public staffEvent_Edit() {
        initComponents();
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
    
    public int eventId;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eventType = new javax.swing.JComboBox<>();
        venue = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        eventName = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        Status = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(179, 203, 181));
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Time:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 260, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Event Name:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 140, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Venue:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(140, 180, 80, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(140, 220, 80, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Status:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(170, 340, 60, 30);

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

        eventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conference", "Kids Party", "Company Party", "Seminar", "Ceremony", "Exhibitions", "Festival", "Sports Event", "Performance" }));
        jPanel1.add(eventType);
        eventType.setBounds(260, 300, 200, 30);
        jPanel1.add(venue);
        venue.setBounds(260, 180, 200, 30);
        jPanel1.add(date);
        date.setBounds(260, 220, 200, 30);
        jPanel1.add(time);
        time.setBounds(260, 260, 200, 30);
        jPanel1.add(eventName);
        eventName.setBounds(260, 140, 200, 30);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton);
        saveButton.setBounds(260, 400, 200, 40);

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completed", "Canceled", "On going", "Booked", " " }));
        jPanel1.add(Status);
        Status.setBounds(260, 340, 200, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Event Type:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(140, 300, 100, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Event Type:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(140, 300, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editEvent.png"))); // NOI18N
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
        staffManage manage = new staffManage();
        manage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        DBconnector dbc = new DBconnector();
        
        if (eventName.getText().isEmpty() || venue.getText().isEmpty() || date.getText().isEmpty() || time.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else if (!isValidTime(time.getText())){
            JOptionPane.showMessageDialog(null, "Please input a valid time format 'hh:mm a'");
        } else if (!isValidDate(date.getText())){
            JOptionPane.showMessageDialog(null, "Please follow the date format 'MM/dd/yy'");
        } else {
            dbc.updateData("UPDATE event_list SET Event_Name = '" + eventName.getText() + "', Event_Type = '" + eventType.getSelectedItem() + "', Venue = '" + venue.getText() + "', Date = '" + date.getText() + "', "
                    + "Time = '" + time.getText() + "', Status = '" + Status.getSelectedItem() + "' WHERE Id = '" + eventId + "'");
            adminManage close = new adminManage();
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
            java.util.logging.Logger.getLogger(staffEvent_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffEvent_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffEvent_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffEvent_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffEvent_Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Status;
    public javax.swing.JTextField date;
    public javax.swing.JTextField eventName;
    public javax.swing.JComboBox<String> eventType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    public javax.swing.JTextField time;
    public javax.swing.JTextField venue;
    // End of variables declaration//GEN-END:variables
}
