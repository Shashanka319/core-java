package com.xworkz.countryData;

public class Collector {
    String name;
    int batchNo;

    public Collector(String name, int batchNo) {
        this.name = name;
        this.batchNo = batchNo;
    }
    public void collectorInfo(){
        System.out.println("Collector Name:"+this.name);
        System.out.println("Collector Batch No:"+batchNo);
    }
}
