package com.xworkz.countryData;

public class Country {
    String name;
    String president;
    State[] states;

    public Country(String name, String president, State[] states) {
        this.name = name;
        this.president = president;
        this.states = states;
    }

    public void countryInfo() {
        System.out.println("Country Name:" + this.name);
        System.out.println("Country President:" + this.president);
        for (State state : states) {
            if (state != null) {
                state.stateInfo();
            }
        }
    }
}
