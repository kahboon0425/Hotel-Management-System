/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import Student.User;
import static Student.User.allStudent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class RegisteredUser {

    public String name;
    public String TPNo;
    public String email;
    public String gender;
    public int phoneNo;

    public void searchUser(DefaultTableModel JTableInfo, String userEmail) {
        boolean found = false;
        for (User userDetails : allStudent) {
            if (userDetails.getEmail().equals(userEmail)) {
                while (JTableInfo.getRowCount() > 0) {
                    JTableInfo.removeRow(0);
                }

                Object[] rowData = {
                    userDetails.getName(),
                    userDetails.getEmail(),
                    userDetails.getStudentID(),
                    userDetails.getGender(),
                    userDetails.getContact()
                // Add more properties as needed
                };
                JTableInfo.addRow(rowData);

                break; // Exit the loop after finding a matching email
            }

        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "No student found");
        }
    }

}
