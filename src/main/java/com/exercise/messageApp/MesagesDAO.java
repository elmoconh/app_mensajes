package com.exercise.messageApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MesagesDAO {
    public static void createMesageDB(Messages msg){
        Connect db_connect = new Connect();
        try(Connection conn = db_connect.get_connection()){
            PreparedStatement ps = null;
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


        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void readMessage(){}
    public static void insertMessage(){}
    public static void deleteMessage(){}
    public static void updateMessage(){}
}
