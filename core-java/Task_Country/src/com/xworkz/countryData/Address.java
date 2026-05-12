package com.xworkz.countryData;

public class Address {
    int no;
    String pincode;
    State state;

    public Address(int no, String pincode, State state) {
        this.no = no;
        this.pincode = pincode;
        this.state = state;
    }
    public void info(){
        System.out.println("Adress No:"+this.no);
        System.out.println("Pin Code "+this.pincode);
        System.out.println("State:"+this.state);
        if(this.state!=null)
        this.state.stateInfo();
    }

    @Override
    public String toString() {
        return "Address{no=" + this.no + ", pincode='" + this.pincode + "', state=" + this.state + "}";
    }

}
