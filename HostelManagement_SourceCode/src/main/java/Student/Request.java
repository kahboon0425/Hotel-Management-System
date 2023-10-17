/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Admin.HostelManagementSystem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Request {

    private String requestID;
    private String roomID;
    private String request;
    private String requestStatus;
    private String comments;

    public Request() {
    }

    public Request(String requestID, String roomID, String request, String requestStatus, String comments) {
        this.requestID = requestID;
        this.roomID = roomID;
        this.request = request;
        this.requestStatus = requestStatus;
        this.comments = comments;
    }

    public String getRequestID() {
        return requestID;
    }

    public String getRoomID() {
        return roomID;
    }

    public String getRequest() {
        return request;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    //read booking Id
    public static void readRequestID() {
        try {
            File file = new File("requestID.txt");

            if (file.length() == 0) {
                int c = 0;
                PrintWriter a = new PrintWriter("requestID.txt");
                a.println(c);
                a.close();
            }
            Scanner s = new Scanner(new File("requestID.txt"));
            while (s.hasNext()) {
                int c = Integer.parseInt(s.nextLine());
                MaintenanceRequest.requestID = c;
            }

        } catch (Exception e) {
            System.out.println("Error in read ...");
        }
    }

    //write Food Order Id
    public static void writeRequestID() {
        try {
            PrintWriter a = new PrintWriter("requestID.txt");
            a.println(MaintenanceRequest.requestID);
            a.close();
        } catch (Exception e) {
            System.out.println("Error in write ...");
        }
    }

    public static void writeRequest(String x, String fileToWrite) {

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

    public void display(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                if (row[2].equals(HostelManagementSystem.loginAsStudent.getName())) {
                    String[] newRow = new String[5];
                    newRow[0] = row[0];
                    newRow[1] = row[1];
                    newRow[2] = row[3];
                    newRow[3] = row[4];
                    newRow[4] = row[5];
                    JTableInfo.addRow(newRow);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }

    public void displayOnAdmin(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                String[] newRow = new String[5];
                newRow[0] = row[0];
                newRow[1] = row[1];
                newRow[2] = row[3];
                newRow[3] = row[4];
                newRow[4] = row[5];
                JTableInfo.addRow(newRow);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }
    
    
    public static void updateRowInFile(String fileName, String userRequestID ,String comment) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder updatedContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String requestID = data[0]; 

                if (requestID.equals(userRequestID)) {
                    data[5] = comment; 
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
    
    public void write(DefaultTableModel JTableInfo, String x) {

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

}
