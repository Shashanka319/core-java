package com.xworkz.City;

public interface Bangalore {
    public void cityInfo();
    public void getTiuristPlace();
    public default void HighCourtDetailes(){
        System.out.println("Execute the High Court Information in Bangalore...");
    }
}
