package com.xworkz.Application;

public interface Instagram {
    public  void notification();
    public void loginInfo();
    public default void contentInfo(){
        System.out.println("Execute the Content Information in Instagram...");
    }
}
