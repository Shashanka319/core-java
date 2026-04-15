package com.xworkz.Room;

public class RoomRunner {
    public static void main(String[] args) {
        RoomType roomType=new RoomType("Ac",2000);
        String[] locations={"BTM Layout","Electranic CIty","Mejestic","Jalalli Cross"};
        System.out.println("Parent Class Information");
        Room room =new Room(RoomNumber.FOUR,roomType,locations,"Nahendra Reddi",2500);
        room.roomInfo();
        room.ownerInfo();
        System.out.println(room.toString());

        System.out.println("Child Class Information");
        NisargaRoom nisargaRoom=new NisargaRoom(RoomNumber.FOUR,roomType,locations,"Nahendra Reddi",2500,"Nisarga Room","Btm Layout");
        nisargaRoom.ownerInfo();
        nisargaRoom.roomInfo();
        System.out.println(nisargaRoom.toString());
    }
}
