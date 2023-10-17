/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MonthlyReport {
    public static String month;
    public static int masterRoomOccupancy;
    public static int juniorRoomOccupancy;
    public static int singleRoomOccupancy;
    public static int totalRoomOccupancy;
    public static double totalRental;
    public static double totalExpenses;
    public static double totalProfit;

    public MonthlyReport() {
    }
    

    public static void setMonth(String month) {
        MonthlyReport.month = month;
    }

    public static void setMasterRoomOccupancy(int masterRoomOccupancy) {
        MonthlyReport.masterRoomOccupancy = masterRoomOccupancy;
    }

    public static void setJuniorRoomOccupancy(int juniorRoomOccupancy) {
        MonthlyReport.juniorRoomOccupancy = juniorRoomOccupancy;
    }

    public static void setSingleRoomOccupancy(int singleRoomOccupancy) {
        MonthlyReport.singleRoomOccupancy = singleRoomOccupancy;
    }

    public static void setTotalRoomOccupancy(int totalRoomOccupancy) {
        MonthlyReport.totalRoomOccupancy = totalRoomOccupancy;
    }

    public static void setTotalRental(double totalRental) {
        MonthlyReport.totalRental = totalRental;
    }

    public static void setTotalExpenses(double totalExpenses) {
        MonthlyReport.totalExpenses = totalExpenses;
    }

    public static void setTotalProfit(double totalProfit) {
        MonthlyReport.totalProfit = totalProfit;
    }
    
    

    public static String getMonth() {
        return month;
    }

    public static int getMasterRoomOccupancy() {
        return masterRoomOccupancy;
    }

    public static int getJuniorRoomOccupancy() {
        return juniorRoomOccupancy;
    }

    public static int getSingleRoomOccupancy() {
        return singleRoomOccupancy;
    }

    public static int getTotalRoomOccupancy() {
        return totalRoomOccupancy;
    }

    public static double getTotalRental() {
        return totalRental;
    }

    public static double getTotalExpenses() {
        return totalExpenses;
    }

    public static double getTotalProfit() {
        return totalProfit;
    }

   
    public static void writeReportInfo(String x, String fileToWrite) {

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
    
    public static void displayReportData(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                String[] newRow = new String[4];
                newRow[0] = row[0];
                newRow[1] = row[5];
                newRow[2] = row[6];
                newRow[3] = row[7];
                JTableInfo.addRow(newRow);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }
    
    
    public static Object[] readReportInfo(String x) {
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
    

}
