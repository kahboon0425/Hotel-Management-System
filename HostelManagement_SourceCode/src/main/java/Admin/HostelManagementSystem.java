/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Admin;

import Student.User;

/**
 *
 * @author User
 */
public class HostelManagementSystem {
    public static AdminLogin loginAsAdmin;
    public static User loginAsStudent;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Login loginPage = new Login();
        loginPage.setVisible(true);
        User.readUser("StudentInfo.txt", User.allStudent);
        AdminLogin.readUser("AdminLoginInfo.txt", AdminLogin.allAdmin);
    }
}
