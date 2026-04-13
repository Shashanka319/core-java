package com.xworkz.Belt;

public class BeltRunner {
    public static void main(String[] args) {
        BeltType beltType = new BeltType("Leather Type",400);
        int[] quantity ={2,6,3,1,9};
        System.out.println("Parent Class Information...");
        Belt belt = new Belt(BeltPrice.FOUR_HUNDRED,beltType,quantity,"Shankar Shop",true);
        belt.beltInfo();
        belt.beltQualityInfo();
        System.out.println(belt.toString());

        System.out.println("Child Class Information...");
        LetherBelt letherBelt = new LetherBelt(BeltPrice.FOUR_HUNDRED,belt.beltType,belt.beltQuantity,belt.beltShopName,belt.available,"Star Belt",450);
        letherBelt.beltInfo();
        letherBelt.beltQualityInfo();
        System.out.println(letherBelt.toString());

    }
}
