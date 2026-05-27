package com.xworkz.ability;

public class SmartMobile implements Mobile{


    @Override
    public void storage() {
        System.out.println("The storage of this phone");
    }

    @Override
    public void ram() {
        Mobile.super.ram();
    }
}
