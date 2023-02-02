package com.demo;

public class admin extends developer {
    public void read(){
        System.out.println("read only");
    }
    public void write(){
        System.out.println("write code");
    }
    public void manage(){
        System.out.println("mage code");
    }
}