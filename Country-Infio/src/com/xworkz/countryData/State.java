package com.xworkz.countryData;

public class State {
    String name;
    double population;
    City[] cities;

    public State(String name, double population, City[] cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }

    public void stateInfo() {
        System.out.println("State Name:" + this.name);
        System.out.println("State Population:" + this.population);
        for (City city : cities) {
            if (city != null) {
                city.cityInfo();
            }
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
