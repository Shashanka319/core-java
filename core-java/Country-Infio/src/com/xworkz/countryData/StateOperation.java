package com.xworkz.countryData;

public class StateOperation {
    State[] states;
    City[] cities;
    Collector[] colectors;
    Country[] countries;
    StateOperation(State[] states,City[] cities,Collector[] colectors,Country[] countries){
        this.states=states;
        this.cities=cities;
        this.colectors=colectors;
        this.countries=countries;
    }
    boolean check(String stateName ){
        if(this.states!=null && stateName!=null){
            for(State state:this.states){
                if(state!=null){
                    System.out.println("State is not null proceed to Search...");
                    if (state.name.equals(stateName)) {
                        System.out.println("State name is Found: " + state.name);
                        state.stateInfo();
                        return true;
                    }
                }else{
                    System.out.println("State name is not Found...");
                }
            }
        }
        return false;
    }
    boolean checks(String stateName){
        if(stateName!=null){
            for(State state:this.states){
                if(state!=null){
                    System.out.println("City is not Null proceed to Check");
                    if(state.name==stateName){
                        System.out.println("Found the State Name so below have the City Information");
                        for(City cities:this.cities)
                            cities.cityInfo();
                        return true;
                    }
                }

            }
        }return false;
    }
    boolean search(String cityName){
        if(cityName!=null){
            for(City city:this.cities){
                if(city!=null){
                    System.out.println("Number of District is not Zero so proceed to check");
                    if(city.name.equals(cityName)){
                       city.cityInfo();
                       return false;
                    }

                }
            }

        }
        return false;
    }
    boolean searchs(String collectorName){
        if(collectorName!=null){
            for(Collector collector:this.colectors){
                if(collector!=null){
                    if(collector.name.equals(collectorName)){
                        System.out.println("Collector Name is Found ,below the Country Information:"+collectorName);
                        for(Country country:this.countries){
                            if(country!=null)
                            country.countryInfo();
                        }
                        return true;
                    }
                }
            }
        }
        System.out.println("Collector Name is not Found: " + collectorName);
        return false;
    }




}
