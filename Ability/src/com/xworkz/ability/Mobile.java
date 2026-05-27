package com.xworkz.ability;


public interface Mobile {

    public static int price =20000;

    public  abstract  void  storage();

    default void ram(){
        System.out.println("the ram of this Mobile");
    }
}
