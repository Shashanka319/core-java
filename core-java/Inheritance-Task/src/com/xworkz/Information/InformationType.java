package com.xworkz.Information;

public class InformationType {
    String type;
    String name;

    public InformationType(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public String toString(){
        return "Type:"+type+"Name:"+name;
    }
}
