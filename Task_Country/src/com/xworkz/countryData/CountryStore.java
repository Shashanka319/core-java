package com.xworkz.countryData;

public class CountryStore {
    Country[] countries;
    int currentIndex;
<<<<<<< HEAD
    CountryStore(Country[] countries){
        this.countries=countries;
=======

    public CountryStore(Country[] countries) {
        this.countries = countries;

>>>>>>> ba47bc0 (Task-updated)
    }
    public void save(Country country){
        System.out.println("Ex");
        if(this.countries!=null && country!=null){
            System.out.println("Start the Saving the Country Information in counntryStore..");
            int index=this.countries.length-1;
            if(this.currentIndex!=index){
                this.countries[currentIndex]=country;
                System.out.println("The Country Info saved at Index:"+currentIndex);
                this.currentIndex++;
                country.countryInfo();
                System.out.println("Storing Country Info at next Index:"+currentIndex);

            }
        }
<<<<<<< HEAD


    }
=======
    }
    boolean search(String names){
        if(countries!=null && names!=null){
            for(Country country:this.countries){
                if(country!=null){
                    System.out.println("Country is not null proceed to Search...");
                    if(country.name== names){
                        System.out.println("Country name is Found:"+country.name);
                        return true;
                    }
                }
            }
        }
        return false;
    }



>>>>>>> ba47bc0 (Task-updated)
}
