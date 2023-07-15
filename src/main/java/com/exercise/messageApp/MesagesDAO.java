package com.exercise.messageApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class MesagesDAO {
    static Connect db_connect = new Connect();
    static Connection conn = db_connect.get_connection();
    static PreparedStatement ps = null;

    public static void createMesageDB(Messages msg) {

        try {
            String query = "INSERT INTO mensajes ( mensaje, subject) VALUES (?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, msg.getMsg());
            ps.setString(2, msg.getMsg_author());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println(ex);
        }
    }

    public static ArrayList<Messages> readMessage() {
        ArrayList<Messages> msgs = new ArrayList<Messages>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM mensajes";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Messages message = new Messages();
                message.setId_msg(rs.getInt("id_mensaje"));
                message.setMsg(rs.getString("mensaje"));
                message.setMsg_author(rs.getString("subject"));
                msgs.add(message);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return msgs;
    }

    public static boolean queryMessage(Integer id){
        ResultSet rs=null;
        try {
            String query = "SELECT * FROM mensajes WHERE id_mensaje = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public static boolean deleteMessage(Integer id) {
        Integer count;
        try {
            String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            count = ps.executeUpdate();
            if (count != 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }


    public static void updateMessage(Integer id, String msg) {
        try{
            String query = "UPDATE mensajes set mensaje =? WHERE id_mensaje = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1,msg);
            ps.setInt(2, id);
            ps.executeUpdate();

        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
}
