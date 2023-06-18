package com.exercise.messageApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class MesagesDAO {
    static Connect db_connect = new Connect();
    static Connection  conn = db_connect.get_connection();
    static PreparedStatement ps = null;
    public static void createMesageDB(Messages msg){

            try{
                String query="INSERT INTO mensajes ( mensaje, subject) VALUES (?,?)";
                ps= conn.prepareStatement(query);
                ps.setString(1, msg.getMsg());
                ps.setString(2, msg.getMsg_author());
                ps.executeUpdate();
            }
            catch(SQLException ex){
                System.out.println("Error");
                System.out.println(ex);
            }
    }
    public static ResultSet readMessage(){
        ResultSet rs = null;
            try {
                String query = "SELECT * FROM mensajes";
                ps = conn.prepareStatement(query);
                rs = ps.executeQuery();
                return rs;
            }catch (SQLException ex){
                System.out.println(ex);
            }
        return rs;
    }
    public static void insertMessage(){}
    public static void deleteMessage(){}
    public static void updateMessage(){}
}
