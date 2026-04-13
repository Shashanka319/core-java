package com.xworkz.Station;

public interface MetroStation {
    public void detiles();
    public void passangerInfo();
    public default void lineInformation(){
        System.out.println("Execute the Lines like Yellow,Green and Purple line information in Metro station..");
    }
}
