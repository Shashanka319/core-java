package com.xworkz.ability;


import static com.xworkz.ability.Mobile.price;

public class MobileRunner {

    public static void main(String[] args) {

        Mobile mobile = new SmartMobile();
        mobile.ram();
        mobile.storage();
        System.out.println("the price of the mobile is:" + price);

    }
}
