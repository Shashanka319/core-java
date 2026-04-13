package com.xworkz.MedicalShop;

public class MedicalName {
    String name;
    String location;

    public MedicalName(String name,String location) {
        this.name = name;
        this.location=location;
        System.out.println("Medical Name:"+this.name);
        System.out.println("Medical Location:"+this.location);
    }
    @Override
    public String toString() {
        return "Name:"+name +"Location"+location;
    }

}
