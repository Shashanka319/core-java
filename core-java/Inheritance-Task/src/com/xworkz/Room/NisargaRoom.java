package com.xworkz.Room;

public class NisargaRoom  extends  Room{
    String name;
    String location;

    public NisargaRoom(RoomNumber roomNumber, RoomType roomType, String[] location, String roomOwner, double roomRent, String name, String location1) {
        super(roomNumber, roomType, location, roomOwner, roomRent);
        this.name = name;
        this.location = location1;
    }
    public void roomInfo(){
        System.out.println("Executing the Room Info in Nisarga Room");
    }
    public void ownerInfo(){
        System.out.println("Executing the Owner Info in Nisarga Room");
    }
    public String toString(){
        return "Name:"+this.name+"Location"+this.location;
    }
}
