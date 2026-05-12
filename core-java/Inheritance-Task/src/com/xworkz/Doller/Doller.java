package com.xworkz.Doller;

import java.util.Arrays;

import static java.lang.System.in;

public class Doller {
    DollerType dollerType;
    int[] counts;
    String dollerOrigin;
    String indianRupes;

    public Doller(DollerType dollerType, int[] counts, String dollerOrigin, String indianRupes) {
        this.dollerType = dollerType;
        this.counts = counts;
        this.dollerOrigin = dollerOrigin;
        this.indianRupes = indianRupes;
    }
    public void info(){
        System.out.println("Executing the info in Doller");
    }
    public void  originInfo(){
        System.out.println("Executing the originInfo in Doller....");
    }
    public String toString(){
        return "DolerType:"+dollerType+"Counts:"+ Arrays.toString(counts)+"DollerOrigin:"+dollerOrigin+"Indian Rupees:"+indianRupes;
    }
}
