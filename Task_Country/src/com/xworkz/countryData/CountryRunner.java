package com.xworkz.countryData;

public class CountryRunner {
    public static void main(String[] args) {
        Collector collector = new Collector("Shri GangadharaSwamy",2014);
        District district = new District("Davanagere",collector);
        district.districInfo();
    }
}
