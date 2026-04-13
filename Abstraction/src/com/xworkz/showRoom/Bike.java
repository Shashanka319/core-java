package com.xworkz.showRoom;

public interface Bike {
    public void getBrand();
    public  void getDetailes();
    public default void getDownPaymentDetailes(){
        System.out.println("Get the Down Payment Datailes of Bike");
    }
}
