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
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class User {

    private String name;
    private String password;
    private String email;
    private String studentID;
    private String gender;
    private int contact;

    public User() {
    }

    public User(String name, String password, String email, String studentID, String gender, int contact) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.studentID = studentID;
        this.gender = gender;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getGender() {
        return gender;
    }

    public int getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public static ArrayList<User> allAdmin = new ArrayList<User>();
    public static ArrayList<User> allStudent = new ArrayList<User>();

    // student
    public static void readUser(String x, ArrayList<User> y) {
        try {
            Scanner s = new Scanner(new File(x));
            while (s.hasNext()) {
                String name_ = s.nextLine();
                String password_ = s.nextLine();
                String email_ = s.nextLine();
                String studentID_ = s.nextLine();
                String gender_ = s.nextLine();
                int contact_ = Integer.parseInt(s.nextLine());
                s.nextLine();
                y.add(new User(name_, password_, email_, studentID_, gender_, contact_));

            }

        } catch (Exception e) {
            System.out.println("Error in read...");

        }
    }

    public static void writeUser(String x, ArrayList<User> y) {
    try {
        PrintWriter a = new PrintWriter(x);

        for (User userDetails : y) {
            a.println(userDetails.getName());
            a.println(userDetails.getPassword());
            a.println(userDetails.getEmail());
            a.println(userDetails.getStudentID());
            a.println(userDetails.getGender());
            
            // Format the contact number with leading zero
            String contactNumber = String.valueOf(userDetails.getContact());
            if (!contactNumber.startsWith("0")) {
                contactNumber = "0" + contactNumber;
            }
            
            a.println(contactNumber);
            a.println();
        }
        a.close();
    } catch (Exception e) {
        System.out.println("Error in write...");
    }
}

    

    // check if user already exist
//    public static User checkUserName(String x, ArrayList<User> y){
//        User found = null;
//        for (User userDetails: y){
//            if(x.equals(userDetails.name)){
//                found = userDetails;
//                break;
//            }
//        }
//        return found;
//    }
    public static User checkUserName(String x, ArrayList<User> y) {
        if (!y.isEmpty()) {
            User found = null;
            for (User userDetails : y) {
                if (x.equals(userDetails.getName())) {
                    found = userDetails;
                    break;
                }
            }
            return found;
        }
        return null;
    }
    
    
    

}
