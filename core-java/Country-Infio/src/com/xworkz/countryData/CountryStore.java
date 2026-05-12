package com.xworkz.countryData;

public class CountryStore {
    Country[] countries;
    int currentIndex;

    CountryStore(Country[] countries) {
        this.countries = countries;
    }

    public void save(Country country) {
        System.out.println("Ex");
        if (this.countries != null && country != null) {
            System.out.println("Start the Saving the Country Information in counntryStore..");
            int index = this.countries.length - 1;
            if (this.currentIndex != index) {
                this.countries[currentIndex] = country;
                System.out.println("The Country Info saved at Index:" + currentIndex);
                this.currentIndex++;
                country.countryInfo();
                System.out.println("Storing Country Info at next Index:" + currentIndex);
            }
        }
    }
}
