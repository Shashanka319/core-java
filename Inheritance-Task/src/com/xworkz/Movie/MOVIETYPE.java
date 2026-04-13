package com.xworkz.Movie;

public class MOVIETYPE {
    String type;
    String name;

    public MOVIETYPE(String type, String name) {
        this.type = type;
        this.name = name;
        System.out.println("Movie Type:"+type);
        System.out.println("Movie Name:"+name);
    }
    public String toString(){
        return "Type:"+type +"Name:"+name;
    }
}
