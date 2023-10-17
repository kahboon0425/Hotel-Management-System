/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Admin.HostelManagementSystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class HostelBookingStatus {
    public String bookingID;
    public String bookingDate;
    public String roomType;
    public String tenancyPeriod;
    public String startingDate;
    public String endDate;
    public String bookingStatus;
    public String roomNumber;
    public double fees;
    public String paymentStatus;

   public static void displayUpdatedBookingStatus(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                if (row[13].equals(HostelManagementSystem.loginAsStudent.getName())) {
                    String[] newRow = new String[10];
                    newRow[0] = row[0];
                    newRow[1] = row[1];
                    newRow[2] = row[7];
                    newRow[3] = row[9];
                    newRow[4] = row[8];
                    newRow[5] = row[10];
                    newRow[6] = row[12];
                    newRow[7] = row[14];
                    newRow[8] = row[11];
                    newRow[9] = row[15];
                    JTableInfo.addRow(newRow);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }
   
    
    
}
