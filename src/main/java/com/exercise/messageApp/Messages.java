package com.exercise.messageApp;

public class Messages {
    int id_msg;
    String msg;
    String msg_author;
    String msg_date;

    public Messages() {

    }

    public Messages(String msg, String msg_author, String msg_date) {
        this.msg = msg;
        this.msg_author = msg_author;
        this.msg_date = msg_date;
    }

    public int getId_msg() {
        return id_msg;
    }

    public void setId_msg(int id_msg) {
        this.id_msg = id_msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg_author() {
        return msg_author;
    }

    public void setMsg_author(String msg_author) {
        this.msg_author = msg_author;
    }

    public String getMsg_date() {
        return msg_date;
    }

    public void setMsg_date(String msg_date) {
        this.msg_date = msg_date;
    }
}
