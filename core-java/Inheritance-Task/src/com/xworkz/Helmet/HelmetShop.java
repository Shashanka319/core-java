package com.xworkz.Helmet;

public class HelmetShop {
    String name;
    String location;

    public HelmetShop(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public String toString(){
        return "Name:"+this.name+"Location:"+this.location;
    }
}
