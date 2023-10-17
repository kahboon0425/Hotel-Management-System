/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import Student.BookingFunction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class RoomInformation extends Room {

    public RoomInformation() {
    }

    public RoomInformation(String roomIndex, String roomType, double roomPrice, String roomDescription, String roomID) {
        super(roomIndex, roomType, roomPrice, roomDescription, roomID);
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
                JTableInfo.addRow(row);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }

    // display value on combo box
    public static void display(JComboBox<String> comboBoxInfo) {

        String filePath = "RoomCategory.txt";
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");

                comboBoxInfo.addItem(row[1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read");
        }

    }

    public static void displayBookingInfo(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                String[] newRow = new String[3];
                newRow[0] = row[0];
                newRow[1] = row[1];
                newRow[2] = row[5];
                JTableInfo.addRow(newRow);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }

    
    
    public static void displayAvailableRoom(DefaultTableModel JTableInfo, String FileToRead) {
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
                    newRow[1] = row[1];
                    JTableInfo.addRow(newRow);
                

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read...");
        }
    }


    @Override
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

    public static void writeBookingInfo(Object[] pendingList, String fileToWrite) {
        String filePath = fileToWrite;
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int x = 0; x < pendingList.length; x++) {
                bw.write(pendingList[x].toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error in write...");
        }
    }

    public static Object[] readBookingInfo(String x) {
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

    public static void roomCountForEachCategory() {
        // Read data from text file
        File file = new File("RoomID.txt");
        Map<String, Integer> roomCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String category = line.split(",")[1].trim();
                if (roomCount.containsKey(category)) {
                    roomCount.put(category, roomCount.get(category) + 1);
                } else {
                    roomCount.put(category, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Print counts for each category
//        ArrayList<Object> myList = new ArrayList<Object>(); // create a new ArrayList
        ArrayList<Object> roomAvailableData = new ArrayList<Object>(); // create a new ArrayList
        for (Map.Entry<String, Integer> entry : roomCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

            Object[] roomCategoryData = BookingFunction.readRoomInfo("RoomCategory.txt");
            for (int x = 0; x < roomCategoryData.length; x++) {
                String[] data = roomCategoryData[x].toString().split(",");
                if (entry.getKey().equals(data[1])) {
                    String roomAvailable = entry.getKey() + "," + entry.getValue().toString() + "," + data[2];
                    roomAvailableData.add(roomAvailable); // add the string to the ArrayList

                }
            }

        }
        Object[] allRoomAvailable = roomAvailableData.toArray(); // convert the ArrayList to an array

        RoomInformation.writeBookingInfo(allRoomAvailable,
                "RoomAvailable.txt");
    }


    public static void generateReportTable(DefaultTableModel JTableInfo, String FileToRead) {
        String filePath = FileToRead;
        File file = new File(filePath);

        // Map to store the occupancy count for each month and room type
        Map<String, Map<String, Integer>> occupancyByMonthAndRoomType = new HashMap<>();
        // Map to store the profit earned for each month
        Map<String, Double> profitByMonth = new HashMap<>();

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();

            for (Object line : lines) {
                String[] row = line.toString().split(",");
                String roomType = row[7];
                String startDateString = row[8];
                String rentalDurationString = row[9];
                double totalPayment = Double.parseDouble(row[11]);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
                LocalDate startDate = LocalDate.parse(startDateString, formatter);

                int rentalDuration;
                if (rentalDurationString.equalsIgnoreCase("1 year")) {
                    rentalDuration = 12;
                } else {
                    rentalDuration = 6;
                }

                for (int i = 0; i < rentalDuration; i++) {
                    LocalDate currentDate = startDate.plusMonths(i);
                    String monthYear = currentDate.getMonthValue() + " " + currentDate.getYear();

                    // Retrieve the occupancy count map for the current month
                    Map<String, Integer> occupancyMap = occupancyByMonthAndRoomType.getOrDefault(monthYear, new HashMap<>());
                    // Increment the occupancy count for the current room type
                    occupancyMap.put(roomType, occupancyMap.getOrDefault(roomType, 0) + 1);
                    // Update the occupancy count map for the current month
                    occupancyByMonthAndRoomType.put(monthYear, occupancyMap);

                    // Update the profit earned for the current month
                    profitByMonth.put(monthYear, profitByMonth.getOrDefault(monthYear, 0.0) + (totalPayment / rentalDuration));
                }
            }

            // Create a list to hold the sorted rows
            List<String[]> sortedRows = new ArrayList<>();

            // Iterate over the occupancyByMonthAndRoomType entries and add rows to the sorted list
            for (Map.Entry<String, Map<String, Integer>> entry : occupancyByMonthAndRoomType.entrySet()) {
                String monthYear = entry.getKey();
                Map<String, Integer> occupancyCountByRoomType = entry.getValue();
                double profitEarned = profitByMonth.get(monthYear);

                // Split the month and year values
                String[] parts = monthYear.split(" ");
                int month = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);

                // Get the month name using the Month enum
                String monthName = Month.of(month).getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);

                // Create the modified month-year string
                monthYear = monthName + " " + year;

                String[] newRow = new String[6];
                newRow[0] = monthYear;
                newRow[1] = String.valueOf(occupancyCountByRoomType.getOrDefault("Master Room", 0));
                newRow[2] = String.valueOf(occupancyCountByRoomType.getOrDefault("Single Room", 0));
                newRow[3] = String.valueOf(occupancyCountByRoomType.getOrDefault("Junior Room", 0));
                newRow[4] = String.valueOf(occupancyCountByRoomType.values().stream().mapToInt(Integer::intValue).sum());
                newRow[5] = String.valueOf(profitEarned);
                sortedRows.add(newRow);
            }

            Comparator<String[]> rowComparator = (row1, row2) -> {
                String monthYear1 = row1[0];
                String monthYear2 = row2[0];
                // Split the month and year values
                String[] parts1 = monthYear1.split(" ");
                String[] parts2 = monthYear2.split(" ");
                String monthName1 = parts1[0];
                String monthName2 = parts2[0];
                int year1 = Integer.parseInt(parts1[1]);
                int year2 = Integer.parseInt(parts2[1]);

                // Parse the month names to month numbers
                int month1 = Month.valueOf(monthName1.toUpperCase()).getValue();
                int month2 = Month.valueOf(monthName2.toUpperCase()).getValue();

                // Compare the years first
                int yearComparison = Integer.compare(year1, year2);
                if (yearComparison != 0) {
                    return yearComparison;
                }
                // If the years are the same, compare the months
                return Integer.compare(month1, month2);
            };

            sortedRows.sort(rowComparator);

            // Clear the model
            JTableInfo.setRowCount(0);

            // Add the sorted rows to the model
            for (String[] row : sortedRows) {
                JTableInfo.addRow(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
    @Override
    public void update(String fileName, String roomCat) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder updatedContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String roomCategory = data[0]; 

                if (roomCategory.equals(roomCat)) {
                    data[1] = Integer.toString(Integer.parseInt(data[1])-1);
                    System.out.println(data[1]);
                    line = String.join(",", data); 
                }

                updatedContent.append(line).append(System.lineSeparator());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(updatedContent.toString());
            }
            System.out.println("Room Available Updated");
            
        } catch (IOException e) {
            System.out.println("An error occurred while updating the payment status: " + e.getMessage());
        }
    }
    
    public static void update(String fileName, String userBookingID, String bookingStatus, String roomID, String paymentStatus) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder updatedContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String bookingID = data[0];

                if (bookingID.equals(userBookingID)) {
                    data[12] = bookingStatus;
                    data[14] = roomID;
                    data[15] = paymentStatus;
                    line = String.join(",", data);
                }

                updatedContent.append(line).append(System.lineSeparator());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(updatedContent.toString());
            }

        } catch (IOException e) {
            System.out.println("An error occurred while updating the application status: " + e.getMessage());
        }
    }
    

}
