package com.xworkz.Information;

public class Information {
    InformationCount informationCount;
    InformationType informationType;
    String[] informations;
    int count;
    boolean valid;

    public Information(InformationCount informationCount, InformationType informationType, String[] informations, int count, boolean valid) {
        this.informationCount = informationCount;
        this.informationType = informationType;
        this.informations = informations;
        this.count = count;
        this.valid = valid;
    }
    public void Info(){
        System.out.println("Executing the Info in Information");
    }
}
