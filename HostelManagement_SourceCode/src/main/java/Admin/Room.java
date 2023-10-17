/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public abstract class Room {
    private String roomIndex;
    private String roomType;
    private double roomPrice;
    private String roomDescription;
    private String roomID;
    
    public Room(){}

    public Room(String roomIndex, String roomType, double roomPrice, String roomDescription, String roomID) {
        this.roomIndex = roomIndex;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
        this.roomID = roomID;
    }

    public String getRoomIndex() {
        return roomIndex;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomIndex(String roomIndex) {
        this.roomIndex = roomIndex;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }


    public abstract void write(DefaultTableModel table, String x);
    public abstract void display(DefaultTableModel table, String x);
    public abstract void update(String x, String y);

    
}
