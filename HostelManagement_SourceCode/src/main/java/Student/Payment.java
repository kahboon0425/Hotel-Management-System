/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Payment {
    public String StudentID;
    public int paymentAmount;

    public Payment(String StudentID, int paymentAmount) {
        this.StudentID = StudentID;
        this.paymentAmount = paymentAmount;
    }

    public String getStudentID() {
        return StudentID;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    
    public static void displayBookingFeeInfo(DefaultTableModel JTableInfo, String FileToRead, String PaymentStatus) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                if (PaymentStatus.equals(row[15])) {
                    String[] newRow = new String[5];
                    newRow[0] = row[0];
                    newRow[1] = row[14];
                    newRow[2] = row[5];
                    newRow[3] = "RM " + row[11];
                    newRow[4] = row[15];
                    JTableInfo.addRow(newRow);
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }
    
}
