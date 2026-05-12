package com.xworkz.Belt;

import java.util.Arrays;

public class Belt {
    BeltPrice beltPrice;
    BeltType beltType;
    int[] beltQuantity;
    String beltShopName;
    boolean available;

    public Belt(BeltPrice beltPrice, BeltType beltType, int[] beltQuantity, String beltShopName, boolean available) {
        this.beltPrice = beltPrice;
        this.beltType = beltType;
        this.beltQuantity = beltQuantity;
        this.beltShopName = beltShopName;
        this.available = available;
    }
    public void beltInfo(){
        System.out.println("Executing the Belt Information in Belt");
    }
    public void beltQualityInfo(){
        System.out.println("Executing the Belt Quality Information in Belt");
    }
    public String toString(){
        return "Belt Price:"+beltPrice+",Belt Type:"+beltType +",Belt Quantity:"+ Arrays.toString(beltQuantity)+",BeltShop Name:"+beltShopName+",Belt Available:"+available;
    }
}
