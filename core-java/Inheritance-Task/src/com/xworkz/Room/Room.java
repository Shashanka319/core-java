package com.xworkz.Room;

import java.util.Arrays;

public class Room {
    RoomNumber roomNumber;
    RoomType roomType;
    String[] locations;
    String roomOwner;
    double roomRent;

    public Room(RoomNumber roomNumber, RoomType roomType, String[] locations, String roomOwner, double roomRent) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.locations = locations;
        this.roomOwner = roomOwner;
        this.roomRent = roomRent;
    }
    public void roomInfo(){
        System.out.println("Executing the room info in Room");
    }
    public void ownerInfo(){
        System.out.println("Executing the Information in Room");
    }
    public String toString(){
        return "Room Number"+this.roomNumber+"RoomType"+roomType+"Room Location"+ Arrays.toString(locations)+"Room Owner"+roomOwner+"Room Rent"+roomRent;
    }
}
