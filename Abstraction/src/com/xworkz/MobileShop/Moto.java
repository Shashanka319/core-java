package com.xworkz.MobileShop;

public interface Moto {
    public void getFeatures();
    public void getPrices();
    public default void getOffer(){
        System.out.println("Executing the Get Offer in Moto...");
    }
}
