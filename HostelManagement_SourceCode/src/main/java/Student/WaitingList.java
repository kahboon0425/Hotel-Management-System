/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JComboBox;

/**
 *
 * @author User
 */
public class WaitingList extends BookingFunction{

    //read booking Id
    public static void readWaitingListID(){
        try{
            File file = new File("waitingListID.txt");

            if (file.length() == 0) {
                int c = 0;
                PrintWriter a = new PrintWriter("waitingListID.txt");
                a.println(c);
                a.close();
            } 
            Scanner s = new Scanner(new File("waitingListID.txt"));
            while(s.hasNext()){
                int c = Integer.parseInt(s.nextLine());
                WaitingListStudent.waitingListId = c;
            }
            
        }catch(Exception e){
            System.out.println("Error in read ...");
        }
    }
    
    //write Food Order Id
    public static void writeWaitingListID(){
        try{
            PrintWriter a = new PrintWriter("waitingListID.txt");
            a.println(WaitingListStudent.waitingListId);
            a.close();
        }catch(Exception e){
            System.out.println("Error in write ...");
        }
    }
    
    public static void fillComboFromTextFile(JComboBox<String> comboBoxInfo) {

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
    
}