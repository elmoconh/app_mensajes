package com.exercise.messageApp;

import java.sql.Connection;


public class Main {
    public static void main (String[] args){
        System.out.println("hello world");
        Connect con = new Connect();

        try (Connection cnx = con.get_connection()){
            System.out.println("cnx: " + cnx);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
