package com.xworkz.MedicalShop;

public class AppoloShop extends MedicalShop{
    String openTime;
    String closingTime;

    public AppoloShop(boolean license, double investment, String[] medicines, MedicalName medical, Location location, String openTime, String closingTime) {
        super(license, investment, medicines, medical, location);
        this.openTime = openTime;
        this.closingTime = closingTime;
    }
    public void medicalInfo(){
        System.out.println("Execute the medical Information in AppoloShop");
    }
    public void tabletInfo(){
        System.out.println("Execute the Tablet Information in Appolo Shop");
    }
    public String toString(){
        return "Open Time:"+openTime + "Closing Time:"+closingTime;
    }
}
