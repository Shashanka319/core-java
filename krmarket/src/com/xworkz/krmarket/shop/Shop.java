package com.xworkz.krmarket.shop;

public interface Shop {
    void busiess();
    default void getMoney(){
        System.out.println("get the money Form Vegetable Business");
    }
}
