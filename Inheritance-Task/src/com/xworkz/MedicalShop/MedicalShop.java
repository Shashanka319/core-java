package com.xworkz.MedicalShop;

import java.util.Arrays;

public class MedicalShop {
    boolean license;
    double investment;
    String[] medicines;
    MedicalName medical;
    Location location;

    public MedicalShop(boolean license, double investment, String[] medicines, MedicalName medical, Location location) {
        this.license = license;
        this.investment = investment;
        this.medicines = medicines;
        this.medical = medical;
        this.location = location;
    }

    public void medicalInfo(){
        System.out.println("Executing the Medical Information in Medical Shop");
    }
    public void tabletInfo(){
        System.out.println("Executing the Tablet informations in Medical Shop");
    }

    public String toString(){
        return "License:"+this.license +",Investment:"+investment +",Medicine:"+ Arrays.toString(medicines)+",Medical Name"+medical + ",Location:"+location;
    }


}
