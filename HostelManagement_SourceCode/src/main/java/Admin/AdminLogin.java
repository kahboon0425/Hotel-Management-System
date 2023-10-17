/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class AdminLogin {
    private String name;
    private String password;

    public AdminLogin() {
    }

    public AdminLogin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<AdminLogin> allAdmin = new ArrayList<AdminLogin>();
    
    public static void readUser(String x, ArrayList<AdminLogin> y) {
        try {
            Scanner s = new Scanner(new File(x));
            while (s.hasNext()) {
                String name_ = s.nextLine();
                String password_ = s.nextLine();
                s.nextLine();
                y.add(new AdminLogin(name_, password_));

            }

        } catch (Exception e) {
            System.out.println("Error in read...");

        }
    }

    public static void writeUser(String x, ArrayList<AdminLogin> y) {
        try {
            PrintWriter a = new PrintWriter(x);
            // for each loop

            for (AdminLogin userDetails : y) {
                a.println(userDetails.name);
                a.println(userDetails.password);
                a.println();
            }
            a.close();
        } catch (Exception e) {
            System.out.println("Error in write...");
        }
    }

    public static AdminLogin checkUserName(String x, ArrayList<AdminLogin> y) {
        if (!y.isEmpty()) {
            AdminLogin found = null;
            for (AdminLogin userDetails : y) {
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
