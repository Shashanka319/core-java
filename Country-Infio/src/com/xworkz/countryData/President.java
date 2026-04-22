package com.xworkz.countryData;

public class President {
    String name;
    int age;
    Address address;

    public President(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void presidentIno(){
        System.out.println("President Name:"+this.name);
        System.out.println("Prsident Age:"+this.age);
        if(address!=null){
            System.out.println("Adress:"+address.toString());
            address.info();
        }
    }
}
