package com.xworkz.Belt;

public class BeltType {
    String type;
    double cost;

    public BeltType(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }
    public String toString(){
        return "Type:"+type + "Cost:"+cost;
    }
}
