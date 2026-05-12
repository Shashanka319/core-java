package com.xworkz.Station;

public class Station implements MetroStation {

    @Override
    public void detiles() {
        System.out.println("Execute the Station Infomation");
    }

    @Override
    public void passangerInfo() {
        System.out.println("Execute the Passenger Information in Station");

    }
}
