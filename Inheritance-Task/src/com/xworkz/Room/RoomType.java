package com.xworkz.Room;

public class RoomType {
    String type;
    double price;

    public RoomType(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public String toString(){
        return "Type:"+type + "Price:"+price;
    }
}
