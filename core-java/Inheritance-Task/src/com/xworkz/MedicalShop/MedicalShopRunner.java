package com.xworkz.MedicalShop;

public class MedicalShopRunner {
    public static void main(String[] args) {

        System.out.println("Execute the Parent Class Information");
        MedicalName medicalName = new MedicalName("Sri Lakshmi Medical","BTM Layout");
        String[] mediciens={"Tablets","Tanics","Bandage"};
        MedicalShop medicalShop = new MedicalShop((true),500000,mediciens,medicalName,Location.BTM_LAYOUT);
        medicalShop.medicalInfo();
        medicalShop.tabletInfo();
        System.out.println(medicalShop.toString());

        System.out.println("Execute the Child class Information");
        AppoloShop appoloShop = new AppoloShop((true),100000,mediciens,medicalName,Location.RAJAJINAGAR,"7:30","10:30");
        appoloShop.medicalInfo();
        appoloShop.tabletInfo();
        System.out.println(appoloShop.toString());

    }
}
