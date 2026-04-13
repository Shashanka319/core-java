package com.xworkz.superMaeket;

public interface DryFruit {
    public void getPrice();
    public void getTypesOfDryFruit();
    public default void getOffer(){
        System.out.println("Executing the getOffers of DryFruits in Super Market...");
    }
}
