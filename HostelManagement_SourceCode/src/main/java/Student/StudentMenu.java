/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import Admin.HostelManagementSystem;
import Admin.Login;
import Admin.RoomInformation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class StudentMenu extends javax.swing.JFrame {

    /**
     * Creates new form studentMenu
     */
    public StudentMenu() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewBookingStatusButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bookHostelButton = new javax.swing.JButton();
        viewBookingStatusButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        checkHostelRoom = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        waitingList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        viewBookingStatusButton1.setBackground(new java.awt.Color(0, 153, 153));
        viewBookingStatusButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        viewBookingStatusButton1.setForeground(new java.awt.Color(255, 255, 255));
        viewBookingStatusButton1.setText("View Booking Status");
        viewBookingStatusButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingStatusButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        bookHostelButton.setBackground(new java.awt.Color(0, 153, 153));
        bookHostelButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        bookHostelButton.setForeground(new java.awt.Color(255, 255, 255));
        bookHostelButton.setText("Book Hostel");
        bookHostelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookHostelButtonActionPerformed(evt);
            }
        });

        viewBookingStatusButton.setBackground(new java.awt.Color(0, 153, 153));
        viewBookingStatusButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        viewBookingStatusButton.setForeground(new java.awt.Color(255, 255, 255));
        viewBookingStatusButton.setText("View Booking");
        viewBookingStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingStatusButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        checkHostelRoom.setBackground(new java.awt.Color(0, 153, 153));
        checkHostelRoom.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        checkHostelRoom.setForeground(new java.awt.Color(255, 255, 255));
        checkHostelRoom.setText("Check Hostel Room");
        checkHostelRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHostelRoomActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Modify Personal Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Maintenance Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        waitingList.setBackground(new java.awt.Color(0, 153, 153));
        waitingList.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        waitingList.setForeground(new java.awt.Color(255, 255, 255));
        waitingList.setText("Waiting List Form");
        waitingList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitingListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookHostelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewBookingStatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkHostelRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(waitingList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(bookHostelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBookingStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkHostelRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(waitingList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookHostelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookHostelButtonActionPerformed
        // TODO add your handling code here:

        MakeBooking bookRoom = new MakeBooking();
        bookRoom.setVisible(true);
        this.setVisible(false);
        RoomInformation.roomCountForEachCategory();
        MakeBooking.roomCatDropDownMenu.insertItemAt("", 0);
        MakeBooking.startMonthDropDownList.insertItemAt("", 0);
        MakeBooking.durationDropDownMenu.insertItemAt("", 0);
        MakeBooking.durationDropDownMenu.setSelectedIndex(0);
        MakeBooking.genderChoice.insertItemAt("", 0);
        MakeBooking.genderChoice.setSelectedIndex(0);

        BookingFunction.fillComboFromTextFile(MakeBooking.roomCatDropDownMenu);
        LocalDate currentDate = LocalDate.now(); // Get current date

        for (int i = 1; i <= 3; i++) { // Loop through next 3 months
            LocalDate nextMonth = currentDate.plusMonths(i); // Add i months
            String formattedMonth = nextMonth.format(DateTimeFormatter.ofPattern("MMMM yyyy")); // Format month and year as string
            System.out.println(formattedMonth); // Print month and year
            MakeBooking.startMonthDropDownList.addItem("1 " + formattedMonth);
        }

        MakeBooking.emailTextField.setText(HostelManagementSystem.loginAsStudent.getEmail());
        MakeBooking.phoneTextField.setText("0"+HostelManagementSystem.loginAsStudent.getContact());
        MakeBooking.studentIDTextField.setText(HostelManagementSystem.loginAsStudent.getStudentID());
        MakeBooking.nameTextField.setText(HostelManagementSystem.loginAsStudent.getName());


    }//GEN-LAST:event_bookHostelButtonActionPerformed

    private void viewBookingStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingStatusButtonActionPerformed
        // TODO add your handling code here:
        BookingStatus bookingStatus = new BookingStatus();
        bookingStatus.setVisible(true);
        this.setVisible(false);
        HostelBookingStatus.displayUpdatedBookingStatus(BookingStatus.model, "AllStudentBooking.txt");
//        RoomInformation.displayUpdatedBookingStatus(BookingStatus.model, "ApprovedHostelApplication.txt");

    }//GEN-LAST:event_viewBookingStatusButtonActionPerformed

    private void viewBookingStatusButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingStatusButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBookingStatusButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login loginPage = new Login();
        loginPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkHostelRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHostelRoomActionPerformed
        // TODO add your handling code here:
        CheckHostelRoom checkHostelRoomAvailable = new CheckHostelRoom();
        checkHostelRoomAvailable.setVisible(true);
        this.setVisible(false);
        RoomInformation roomInfo = new RoomInformation();
        RoomInformation.roomCountForEachCategory();
        roomInfo.display(CheckHostelRoom.model,
                "RoomAvailable.txt");


    }//GEN-LAST:event_checkHostelRoomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ModifyUser modifyUser = new ModifyUser();
        modifyUser.setVisible(true);
        ModifyUser.newUsername.setText(HostelManagementSystem.loginAsStudent.getName());
        ModifyUser.newUsername.setEditable(false);
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MaintenanceRequest maintenanceRequest = new MaintenanceRequest();
        maintenanceRequest.setVisible(true);
        this.setVisible(false);
        Request request = new Request();
        request.display(MaintenanceRequest.model, "AllMaintenanceRequest.txt");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void waitingListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitingListActionPerformed
        // TODO add your handling code here:
        WaitingListStudent waitingList = new WaitingListStudent();
        waitingList.setVisible(true);

        WaitingListStudent.roomCatDropDownMenu.insertItemAt("", 0);
        WaitingListStudent.startMonthDropDownList.insertItemAt("", 0);
        WaitingListStudent.durationDropDownMenu.insertItemAt("", 0);
        WaitingListStudent.durationDropDownMenu.setSelectedIndex(0);
        WaitingListStudent.genderChoice.insertItemAt("", 0);
        WaitingListStudent.genderChoice.setSelectedIndex(0);

        WaitingList.fillComboFromTextFile(WaitingListStudent.roomCatDropDownMenu);
        LocalDate currentDate = LocalDate.now(); // Get current date

        for (int i = 1; i <= 3; i++) { // Loop through next 3 months
            LocalDate nextMonth = currentDate.plusMonths(i); // Add i months
            String formattedMonth = nextMonth.format(DateTimeFormatter.ofPattern("MMMM yyyy")); // Format month and year as string
            System.out.println(formattedMonth); // Print month and year
            WaitingListStudent.startMonthDropDownList.addItem("1 " + formattedMonth);
        }

        WaitingListStudent.emailTextField.setText(HostelManagementSystem.loginAsStudent.getEmail());
        WaitingListStudent.phoneTextField.setText("0"+HostelManagementSystem.loginAsStudent.getContact());
        WaitingListStudent.studentIDTextField.setText(HostelManagementSystem.loginAsStudent.getStudentID());
        WaitingListStudent.nameTextField.setText(HostelManagementSystem.loginAsStudent.getName());
        this.setVisible(false);
    }//GEN-LAST:event_waitingListActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookHostelButton;
    private javax.swing.JButton checkHostelRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton viewBookingStatusButton;
    private javax.swing.JButton viewBookingStatusButton1;
    private javax.swing.JButton waitingList;
    // End of variables declaration//GEN-END:variables
}
