package com.demo;

public class user {
    public static void main(String[] args) {
        gust gust = new gust();
        gust.read();

        developer dev = new developer();
        dev.read();
        dev.write();

        admin admin = new admin();
        admin.read();
        admin.write();
        admin.manage();

    }
}
