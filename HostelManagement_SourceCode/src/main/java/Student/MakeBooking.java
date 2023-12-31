/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import Admin.HostelManagementSystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MakeBooking extends javax.swing.JFrame {

    /**
     * Creates new form ManageHostelApplication
     */
    public static int orderId;

    public MakeBooking() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        studentIDTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roomCatDropDownMenu = new javax.swing.JComboBox<>();
        feesPerMonthTextField = new javax.swing.JTextField();
        durationDropDownMenu = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        totalFeetextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        startMonthDropDownList = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        leavingDateTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        genderChoice = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Room Category:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Student ID:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Contact:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Gender:");

        emailTextField.setMaximumSize(new java.awt.Dimension(64, 22));
        emailTextField.setPreferredSize(new java.awt.Dimension(64, 20));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        nameTextField.setMaximumSize(new java.awt.Dimension(64, 22));
        nameTextField.setPreferredSize(new java.awt.Dimension(64, 20));

        phoneTextField.setMaximumSize(new java.awt.Dimension(64, 22));
        phoneTextField.setPreferredSize(new java.awt.Dimension(64, 20));

        studentIDTextField.setMaximumSize(new java.awt.Dimension(64, 22));
        studentIDTextField.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Starting Month:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Duration:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Fees Per Month:");

        roomCatDropDownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomCatDropDownMenuActionPerformed(evt);
            }
        });

        feesPerMonthTextField.setMaximumSize(new java.awt.Dimension(64, 22));
        feesPerMonthTextField.setPreferredSize(new java.awt.Dimension(64, 20));
        feesPerMonthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesPerMonthTextFieldActionPerformed(evt);
            }
        });

        durationDropDownMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 months", "1 year", " " }));
        durationDropDownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationDropDownMenuActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Leaving Date:");

        totalFeetextField.setMaximumSize(new java.awt.Dimension(64, 22));
        totalFeetextField.setPreferredSize(new java.awt.Dimension(64, 20));
        totalFeetextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFeetextFieldActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(0, 102, 102));
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Hostel Application Form");

        startMonthDropDownList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMonthDropDownListMouseClicked(evt);
            }
        });
        startMonthDropDownList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMonthDropDownListActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Total Fee:");

        leavingDateTextField.setMaximumSize(new java.awt.Dimension(64, 22));
        leavingDateTextField.setPreferredSize(new java.awt.Dimension(64, 20));
        leavingDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leavingDateTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Email:");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        genderChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderChoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(startMonthDropDownList, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(7, 7, 7))
                                .addComponent(jLabel15)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomCatDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(leavingDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalFeetextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(genderChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(feesPerMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(durationDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(genderChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roomCatDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(feesPerMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startMonthDropDownList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(durationDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leavingDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(totalFeetextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(217, 217, 217))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        BookingFunction.readOrderID();
        orderId = orderId + 1;
        BookingFunction.writeOrderID();

        System.out.print("AA" + orderId);
        String bookingID = "AA" + orderId;
        String emailTF = emailTextField.getText();
        String nameTF = nameTextField.getText();
        String phoneTF = phoneTextField.getText();
        String studentIDTF = studentIDTextField.getText();
        String gender = genderChoice.getSelectedItem().toString();
        String roomCat = roomCatDropDownMenu.getSelectedItem().toString();
        String startMonth = startMonthDropDownList.getSelectedItem().toString();
        String duration = durationDropDownMenu.getSelectedItem().toString();
        String leavingDateTF = leavingDateTextField.getText();
        String totalFeeTF = totalFeetextField.getText();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        BookingFunction bookingFunc = new BookingFunction();
        bookingFunc.setBookingID(bookingID);
        bookingFunc.setEmail(emailTF);
        bookingFunc.setGender(gender);
        bookingFunc.setName(nameTF);
        bookingFunc.setPhoneNo(Integer.parseInt(phoneTF));
        bookingFunc.setStudentID(studentIDTF);
        bookingFunc.setRoomCategory(roomCat);
        bookingFunc.setTenancyDuration(duration);
        bookingFunc.setBookingDate(currentDate.toString());
        bookingFunc.setCheckInDate(startMonth);
        bookingFunc.setCheckOutDate(leavingDateTF);

        String allInfomation = (bookingID + "," + currentDate + "," + emailTF + "," + nameTF + "," + phoneTF + "," + studentIDTF + "," + gender + "," + roomCat + "," + startMonth + "," + duration + "," + leavingDateTF + "," + totalFeeTF + "," + "pending" + "," + HostelManagementSystem.loginAsStudent.getName());
        String allDisplayInfomation = (bookingID + "," + currentDate + "," + emailTF + "," + nameTF + "," + phoneTF + "," + studentIDTF + "," + gender + "," + roomCat + "," + startMonth + "," + duration + "," + leavingDateTF + "," + totalFeeTF + "," + "pending" + "," + HostelManagementSystem.loginAsStudent.getName() + "," + "-" + "," + "-");
        BookingFunction bookingFunction = new BookingFunction();
        bookingFunction.write(allInfomation, "studentBookingDetails.txt");
        bookingFunction.write(allDisplayInfomation, "AllStudentBooking.txt");
        JOptionPane.showMessageDialog(rootPane, "Thank you for submitting your application! We would like to inform you that it has been received and is currently under review. Please expect to receive the application result within 2-3 days");

//        ----------------------------------------------------
        

        emailTextField.setText("");
        nameTextField.setText("");
        phoneTextField.setText("");
        studentIDTextField.setText("");
        MakeBooking.genderChoice.setSelectedIndex(0);
        roomCatDropDownMenu.setSelectedItem("");
        feesPerMonthTextField.setText("");
        startMonthDropDownList.setSelectedItem("");
        durationDropDownMenu.setSelectedItem("");
        leavingDateTextField.setText("");
        totalFeetextField.setText("");
        
        StudentMenu menu = new StudentMenu();
        menu.setVisible(true);
        this.setVisible(false);



    }//GEN-LAST:event_submitButtonActionPerformed

    private void durationDropDownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationDropDownMenuActionPerformed
        // TODO add your handling code here:
        if (durationDropDownMenu.getSelectedItem().toString().equals("6 months")) {
            String chosenMonth = startMonthDropDownList.getSelectedItem().toString().substring(2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
            YearMonth startMonth = YearMonth.parse(chosenMonth, formatter); // Parse chosen month
            YearMonth endMonth = startMonth.plusMonths(6); // Add 6 months to chosen month
            LocalDate endDate = endMonth.atEndOfMonth(); // Get last day of resulting month

            // convert a date string from the format "yyyy-MM-dd" (e.g. "2024-07-31") to the format "dd MMMM yyyy" (e.g. "31 July 2024")
            LocalDate date = LocalDate.parse(endDate.toString());
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            String formattedDate = date.format(formatDate);

            leavingDateTextField.setText(formattedDate);

            double livingFee = Double.parseDouble(feesPerMonthTextField.getText());
            totalFeetextField.setText(String.valueOf(6 * livingFee));

        } else if (durationDropDownMenu.getSelectedItem().toString().equals("1 year")) {
            String chosenMonth = startMonthDropDownList.getSelectedItem().toString().substring(2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
            YearMonth startMonth = YearMonth.parse(chosenMonth, formatter); // Parse chosen month
            YearMonth endMonth = startMonth.plusMonths(12); // Add 12 months to chosen month
            LocalDate endDate = endMonth.atEndOfMonth(); // Get last day of resulting month

            LocalDate date = LocalDate.parse(endDate.toString());
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            String formattedDate = date.format(formatDate);

            leavingDateTextField.setText(formattedDate);

            double livingFee = Double.parseDouble(feesPerMonthTextField.getText());
            totalFeetextField.setText(String.valueOf(12 * livingFee));

        }

    }//GEN-LAST:event_durationDropDownMenuActionPerformed

    private void startMonthDropDownListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMonthDropDownListActionPerformed
        // TODO add your handling code here:
        MakeBooking.durationDropDownMenu.setSelectedIndex(0);
        leavingDateTextField.setText("");
        totalFeetextField.setText("");

    }//GEN-LAST:event_startMonthDropDownListActionPerformed

    private void leavingDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leavingDateTextFieldActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_leavingDateTextFieldActionPerformed

    private void startMonthDropDownListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMonthDropDownListMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_startMonthDropDownListMouseClicked

    private void roomCatDropDownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomCatDropDownMenuActionPerformed
        // TODO add your handling code here:

        Object[] roomData = BookingFunction.readRoomInfo("RoomCategory.txt");
        for (int i = 0; i < roomData.length; i++) {
            String[] data = roomData[i].toString().split(",");
            if (roomCatDropDownMenu.getSelectedItem().toString().equals(data[1])) {
                System.out.println(data[2]);
                feesPerMonthTextField.setText(data[2]);
            }

        }

        MakeBooking.startMonthDropDownList.setSelectedIndex(0);
        MakeBooking.durationDropDownMenu.setSelectedIndex(0);
        leavingDateTextField.setText("");
        totalFeetextField.setText("");


    }//GEN-LAST:event_roomCatDropDownMenuActionPerformed

    private void totalFeetextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFeetextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_totalFeetextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void feesPerMonthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesPerMonthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesPerMonthTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StudentMenu studentMenuPage = new StudentMenu();
        studentMenuPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genderChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderChoiceActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> durationDropDownMenu;
    public static javax.swing.JTextField emailTextField;
    private javax.swing.JTextField feesPerMonthTextField;
    public static javax.swing.JComboBox<String> genderChoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField leavingDateTextField;
    public static javax.swing.JTextField nameTextField;
    public static javax.swing.JTextField phoneTextField;
    public static javax.swing.JComboBox<String> roomCatDropDownMenu;
    public static javax.swing.JComboBox<String> startMonthDropDownList;
    public static javax.swing.JTextField studentIDTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField totalFeetextField;
    // End of variables declaration//GEN-END:variables
}
