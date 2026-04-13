package com.xworkz.showRoom;

public class Showroom implements Bike{

    @Override
    public void getBrand() {
        System.out.println("Get the Information of Bike Brands...");
    }

    @Override
    public void getDetailes() {
        System.out.println("Get the Detailes of Bike in Showroom");
    }
}
