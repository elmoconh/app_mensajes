package com.exercise.messageApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class messageServices {
    public static void createMessage() {
        String msg;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un mensaje");
        msg = sc.nextLine();

        System.out.println("Ingrese su Usuario");
        name = sc.nextLine();

        //Message Insertion
        Messages register = new Messages();
        register.setMsg(msg);
        register.setMsg_author(name);
        MesagesDAO.createMesageDB(register);

    }

    public static void listMessages() {
        ArrayList<Messages> results = MesagesDAO.readMessage();

        for (Messages message : results) {
            System.out.println("id: " + message.getId_msg());
            System.out.println("Message: " + message.getMsg());
            System.out.println("Author: " + message.getMsg_author());
        }
    }

    public static void deleteMessage() {
        Integer id;
        Boolean check;
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese id");
        id = sc.nextInt();
        check = MesagesDAO.deleteMessage(id);
        if (check) {
            System.out.println("Se eliminó el id: " + id + " Correctamente");
        } else {
            System.out.println("No se eliminó el id: " + id + " Verifique si el id es el correcto");
        }
    }

    public static void editMessage() {
    }
}
