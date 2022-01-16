/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item_manager;
import java.util.*;
import java.io.*;
import java.time.*;
/**
 *
 * @author Jeffr
 */
public class Item implements Serializable{
    
    //vars
    String Description;
    int quantity;
    LocalDate ExpDate;
    String Location;

    //constructor for the class object
    public Item(String Description, int quantity, LocalDate ExpDate, String Location) {
        this.Description = Description;
        this.quantity = quantity;
        this.ExpDate = ExpDate;
        this.Location = Location;
    }

    //get description from class object
    public String getDescription() {
        return Description;
    }
//set description in the class object
    public void setDescription(String Description) {
        this.Description = Description;
    }
//get quantity from class object
    public double getQuantity() {
        return quantity;
    }
//set description in the class object
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//get expdate from class object
    public LocalDate getExpDate() {
        return ExpDate;
    }
//set description in the class object
    public void setExpDate(LocalDate ExpDate) {
        this.ExpDate = ExpDate;
    }
//get location from class object
    public String getLocation() {
        return Location;
    }
//set description in the class object
    public void setLocation(String Location) {
        this.Location = Location;
    }
}
