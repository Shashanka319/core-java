package com.xworkz.countryData;

public class City {
    String name;
    int noOfDistricts;
    District[] districtNames;

    public City(String name, int noOfDistricts, District[] districtNames) {
        this.name = name;
        this.noOfDistricts = noOfDistricts;
        this.districtNames = districtNames;
    }

    public void cityInfo() {
        System.out.println("City Name:" + this.name);
        System.out.println("No of Districts :" + this.noOfDistricts);
        for (District district : districtNames) {
            if (district != null)
                district.districtInfo();
        }
    }
}

