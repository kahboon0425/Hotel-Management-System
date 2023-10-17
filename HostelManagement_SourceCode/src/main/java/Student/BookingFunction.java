/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Admin.HostelManagementSystem;
import Admin.Room;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class BookingFunction extends Room{
    
    private String bookingID;
    private String studentID;
    private String bookingDate;
    private String gender;
    private String email;
    private int phoneNo;
    private String name;
    private String roomCategory;
    private String checkInDate;
    private String checkOutDate;
    private String tenancyDuration;
    private int totalFees;
    
    public BookingFunction(){}

    public BookingFunction(String bookingID, String studentID, String bookingDate, String gender, String email, int phoneNo, String name, String roomCategory, String checkInDate, String checkOutDate, String tenancyDuration, int totalFees) {
        this.bookingID = bookingID;
        this.studentID = studentID;
        this.bookingDate = bookingDate;
        this.gender = gender;
        this.email = email;
        this.phoneNo = phoneNo;
        this.name = name;
        this.roomCategory = roomCategory;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.tenancyDuration = tenancyDuration;
        this.totalFees = totalFees;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getTenancyDuration() {
        return tenancyDuration;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setTenancyDuration(String tenancyDuration) {
        this.tenancyDuration = tenancyDuration;
    }

    public void setTotalFees(int totalFees) {
        this.totalFees = totalFees;
    }

    
    //read booking Id
    public static void readOrderID(){
        try{
            File file = new File("bookingID.txt");

            if (file.length() == 0) {
                int c = 0;
                PrintWriter a = new PrintWriter("bookingID.txt");
                a.println(c);
                a.close();
            } 
            Scanner s = new Scanner(new File("bookingID.txt"));
            while(s.hasNext()){
                int c = Integer.parseInt(s.nextLine());
                MakeBooking.orderId = c;
            }
            
        }catch(Exception e){
            System.out.println("Error in read ...");
        }
    }
    
    //write Food Order Id
    public static void writeOrderID(){
        try{
            PrintWriter a = new PrintWriter("bookingID.txt");
            a.println(MakeBooking.orderId);
            a.close();
        }catch(Exception e){
            System.out.println("Error in write ...");
        }
    }
    
    public static Object[] readRoomInfo(String x) {
        String filePath = x;
        File file = new File(filePath);
        Object[] lines = null;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            lines = br.lines().toArray();

        } catch (FileNotFoundException ex) {
            System.out.println("Error in read");
        }
        return lines;
    }
    
    public void write(String x, String fileToWrite) {

        String filePath = fileToWrite;
        File file = new File(filePath);
        try {
            // pass true as a second parameter to indicate that you want to append to the file instead of overwriting it
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            bw.newLine();

            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("Error in read...");
        }
    }
    

    @Override
    public void display(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                if (row[13].equals(HostelManagementSystem.loginAsStudent.getName())) {
                    String[] newRow = new String[6];
                    newRow[0] = row[0];
                    newRow[1] = row[8];
                    newRow[2] = row[10];
                    newRow[3] = row[11];
                    newRow[4] = row[14];
                    newRow[5] = "-";
                    JTableInfo.addRow(newRow);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }

    public static void displayApprovedRoomInfo(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                if (row[15].equals(HostelManagementSystem.loginAsStudent.getName())) {
                    String[] newRow = new String[6];
                    newRow[0] = row[1];
                    newRow[1] = row[7];
                    newRow[2] = row[8];
                    newRow[3] = row[10];
                    newRow[4] = row[11];
                    newRow[5] = row[12];
                    JTableInfo.addRow(newRow);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }

    public static void displayHostelRoomInfo(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                String[] newRow = new String[2];
                newRow[0] = row[0];
                newRow[1] = row[4];
                JTableInfo.addRow(newRow);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }

    
    
    public static void updateRoomAvailable(DefaultTableModel JTableInfo, String x) {

        String filePath = x;
        File file = new File(filePath);
        try {
            // pass true as a second parameter to indicate that you want to append to the file instead of overwriting it
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < JTableInfo.getRowCount(); i++) {
                for (int j = 0; j < JTableInfo.getColumnCount(); j++) {
                    bw.write(JTableInfo.getValueAt(i, j).toString() + ",");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("Error in read...");
        }
    }
    
    
    @Override
    public void update(String fileName, String userBookingID) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder updatedContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String bookingID = data[0]; 

                if (bookingID.equals(userBookingID)) {
                    data[15] = "Paid"; 
                    line = String.join(",", data); 
                }

                updatedContent.append(line).append(System.lineSeparator());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(updatedContent.toString());
            }
            System.out.println("Payment status updated successfully.");
            
        } catch (IOException e) {
            System.out.println("An error occurred while updating the payment status: " + e.getMessage());
        }
    }
    
    
    
    public static void fillComboFromTextFile(JComboBox<String> comboBoxInfo) {

        String filePath = "RoomAvailable.txt";
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");

                if (!row[1].equals("0") && !row[1].equals("-")) {
                    comboBoxInfo.addItem(row[0]);

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read");
        }

    }

    @Override
    public void write(DefaultTableModel table, String x) {
        
    }

}
