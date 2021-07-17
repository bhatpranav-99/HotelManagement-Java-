/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class tables {
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            //Create table for users
            //st.executeUpdate("create table users1(name varchar(150),email varchar(200),password varchar(50),securityQuestion varchar(300),answer varchar(200),address varchar(400),status varchar(20))");
            //create table for rooms
            //st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
            //create table for customer
            //st.executeUpdate("create table customer(id int ,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int(10),numberOfDaysStay int(10),totalAmount varchar(200),checkout varchar(50))");
           st.executeUpdate("delete from users1 where status='false'");
           //JOptionPane.showMessageDialog(null,"Created Successfully");
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
                con.close();
                st.close();
        }catch(Exception e){
            
        } 
        }
    }
    
}
