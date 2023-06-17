package com.exercise.messageApp;

import java.util.Scanner;

public class messageServices {
    public static void createMessage(){
        String msg;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un mensaje");
        msg =  sc.nextLine();

        System.out.println("Ingrese su Usuario");
        name =  sc.nextLine();

        //Message Insertion
        Messages register  = new Messages();
        register.setMsg(msg);
        register.setMsg_author(name);
        MesagesDAO.createMesageDB(register);

    }
    public static void listMessages(){}
    public static void deleteMessage(){}
    public static void editMessage(){}
}
