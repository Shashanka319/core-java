package com.xworkz.Cricket;

public interface WorldCup {
    void playerDetailes();
    void matchDetailes();
    public default void worldCupDetailes(){
        System.out.println("Execute the World CupnInfoirmation in WorldCup....");
    }
}
