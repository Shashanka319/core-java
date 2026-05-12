package com.xworkz.Belt;

public class LetherBelt extends Belt{
    String name;
    double cost;

    public LetherBelt(BeltPrice beltPrice, BeltType beltType, int[] beltQuantity, String beltShopName, boolean available, String name, double cost) {
        super(beltPrice, beltType, beltQuantity, beltShopName, available);
        this.name = name;
        this.cost = cost;
    }
    public void beltInfo(){
        System.out.println("Execute the beltInfo in Leather Belt...");
    }
    public  void beltQualityInfo(){
        System.out.println("Execute the Belt Quality Info In Leather Belt....");
    }
}
