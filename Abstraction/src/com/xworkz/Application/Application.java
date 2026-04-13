package com.xworkz.Application;

public class Application implements Instagram{
    @Override
    public void notification() {
        System.out.println("Execute the Notificaion in Application...");
    }

    @Override
    public void loginInfo() {
        System.out.println("Execute the Login Information in Application..");

    }
}
