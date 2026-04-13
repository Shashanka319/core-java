package com.xworkz.SportShop;

public interface ShuttleRocket {
    public void getDetailes();
    public void getOffer();
    public default void RocketSting(){
        System.out.println("Execute the Information of Rocket Sting in ShuttleRocket Shop");
    }
}
