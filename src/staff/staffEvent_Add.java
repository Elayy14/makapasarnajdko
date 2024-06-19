/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import DBconnector.DBconnector;
import admin.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class staffEvent_Add extends javax.swing.JFrame {

    public staffEvent_Add() {
        initComponents();
    }

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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        eventType = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        record = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        eventsName = new javax.swing.JLabel();
        eventsVenue = new javax.swing.JLabel();
        eventsDate = new javax.swing.JLabel();
        eventsTime = new javax.swing.JLabel();
        EventType = new javax.swing.JLabel();
        venue = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        amounts = new javax.swing.JTextField();
        eventName = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();
        customerName = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(179, 203, 181));
        jPanel1.setLayout(null);

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Time:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 310, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Event Name:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 190, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Venue:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 230, 80, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 270, 80, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Amount:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(20, 390, 80, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Event Type:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(20, 350, 100, 30);

        eventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conference", "Kids Party", "Company Party", "Seminar", "Ceremony", "Exhibitions", "Festival", "Sports Event", "Performance" }));
        jPanel1.add(eventType);
        eventType.setBounds(140, 350, 200, 30);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton);
        addButton.setBounds(140, 430, 200, 40);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Venue:");

        jLabel2.setText("SETTING YOU UP FOR BETTER EVENT");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Event Name:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Eli & Aya");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Time:");

        totalAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalAmount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-peso-symbol-40.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Event Type:");

        jLabel24.setText("Total Amount");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Date:");

        javax.swing.GroupLayout recordLayout = new javax.swing.GroupLayout(record);
        record.setLayout(recordLayout);
        recordLayout.setHorizontalGroup(
            recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(recordLayout.createSequentialGroup()
                .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recordLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(recordLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recordLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eventsName, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .addGroup(recordLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eventsVenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(recordLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eventsDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(recordLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EventType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(recordLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eventsTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(recordLayout.createSequentialGroup()
                                .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(104, 104, 104))
        );
        recordLayout.setVerticalGroup(
            recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(eventsName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(eventsVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(eventsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(eventsTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(EventType, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(14, 14, 14)
                .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel1.add(record);
        record.setBounds(370, 120, 250, 300);
        jPanel1.add(venue);
        venue.setBounds(140, 230, 200, 30);
        jPanel1.add(date);
        date.setBounds(140, 270, 200, 30);
        jPanel1.add(time);
        time.setBounds(140, 310, 200, 30);
        jPanel1.add(amounts);
        amounts.setBounds(140, 390, 200, 30);
        jPanel1.add(eventName);
        eventName.setBounds(140, 190, 200, 30);

        printButton.setText("PRINT");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        jPanel1.add(printButton);
        printButton.setBounds(440, 440, 110, 23);
        jPanel1.add(customerName);
        customerName.setBounds(140, 110, 200, 30);
        jPanel1.add(contact);
        contact.setBounds(140, 150, 200, 30);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Customer Name:");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(0, 110, 140, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Contact:");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(50, 150, 70, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addEvent.png"))); // NOI18N
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        staffManage manage = new staffManage();
        manage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DBconnector dbc = new DBconnector();
        
        if (customerName.getText().isEmpty() || contact.getText().isEmpty() || eventName.getText().isEmpty() || venue.getText().isEmpty() || date.getText().isEmpty() || time.getText().isEmpty() || amounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else if (!isValidDate(date.getText())){
            JOptionPane.showMessageDialog(null, "Please follow the date format 'MM/dd/yy'");
        } else if (!isInteger(contact.getText())){
            JOptionPane.showMessageDialog(null, "Please input a valid contact!");
        } else if (!isValidTime(time.getText())){
            JOptionPane.showMessageDialog(null, "Please input a valid time format 'hh:mm a'");
        } else if (!isInteger(amounts.getText())){
            JOptionPane.showMessageDialog(null, "Please input a valid amount!");
        } else {
            if (dbc.insertData("INSERT INTO event_list (Customer_Name, Contact, Event_Name, Venue, Date, Time, Event_Type, Amount, status)"
                    + " VALUES('" + customerName.getText() + "','" + contact.getText() + "','" + eventName.getText() + "','" + venue.getText() + "','" + date.getText() + "','" + time.getText() + "','" + eventType.getSelectedItem() + "','" + amounts.getText() + "','Booked')")) {
                JOptionPane.showMessageDialog(null, "Inserted Successfully.");
                eventsName.setText("" + eventName.getText());
                eventsVenue.setText("" + venue.getText());
                eventsDate.setText("" + date.getText());
                eventsTime.setText("" + time.getText());
                EventType.setText("" + eventType.getSelectedItem());
                totalAmount.setText("" + amounts.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        printRecord(record);
    }//GEN-LAST:event_printButtonActionPerformed

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
            java.util.logging.Logger.getLogger(staffEvent_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffEvent_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffEvent_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffEvent_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffEvent_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventType;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amounts;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField date;
    private javax.swing.JTextField eventName;
    private javax.swing.JComboBox<String> eventType;
    private javax.swing.JLabel eventsDate;
    private javax.swing.JLabel eventsName;
    private javax.swing.JLabel eventsTime;
    private javax.swing.JLabel eventsVenue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printButton;
    private javax.swing.JPanel record;
    private javax.swing.JTextField time;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JTextField venue;
    // End of variables declaration//GEN-END:variables

    private void printRecord (JPanel panel){
        
        PrinterJob printerJob = PrinterJob.getPrinterJob();
                
        printerJob.setJobName("Print Record");
        
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics grphcs, PageFormat pf, int pageIndex) throws PrinterException {
                
                if (pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D graphics2D = (Graphics2D)grphcs;
                
                graphics2D.translate(pf.getImageableX()*2, pf.getImageableX()*2 );
                
                graphics2D.scale(0.70, 0.70);
                
                panel.paint(graphics2D);
                
                return Printable.PAGE_EXISTS;
            }
        });
        
        boolean returningResult = printerJob.printDialog();
        
        if (returningResult) {
            try {
                printerJob.print();
            } catch (PrinterException printerException){
                JOptionPane.showMessageDialog(this, "Print Error " + printerException.getMessage());
                
            }
        }
    }


}
