package com.exercise.messageApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import com.exercise.messageApp.Connect;

public class Main {
    public static void main (String[] args) throws SQLException {

        Connect con = new Connect();
         con.get_connection();

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. actualizar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            option = sc.nextInt();

            switch (option){
                case 1:
                    messageServices.createMessage();
                    break;
                case 2:
                    messageServices.listMessages();
                    break;
                case 3:
                    messageServices.deleteMessage();
                    break;
                case 4:
                    messageServices.editMessage();
                    break;
                case 5:
                    System.out.println("Cerrando programa");
                    break;

                default:
                    System.out.println("Elija otro numero");
                    break;
            }

        }while(option != 5);

    }

}
