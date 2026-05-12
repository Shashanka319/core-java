package com.xworkz.countryData;

public class CountryRunner {
    public static void main(String[] args) {
        Collector collector = new Collector("Shri GangadharaSwamy", 2014);
        Collector collector1 = new Collector("Shri Daeshan H V", 2016);
        Collector collector2 = new Collector("Shri Bhoyar Harshal", 2016);
        Collector collector3 = new Collector("Smt. K S Latha Kumari", 2018);
        Collector collector4 = new Collector("Shri Nitish K", 2014);
        Collector collector5 = new Collector("Smt. subha Kalyan", 2014);
        Collector collector6 = new Collector("Smt.Shilpa Nag", 2014);
        Collector collector7 = new Collector("Shri K.Dayananda", 2012);
        Collector collector8 = new Collector("Dr. Kumar", 2015);
        Collector collector9 = new Collector("Shri Prabhuling Kavalikatti", 2015);

        Collector[] collectors = {collector, collector1, collector2, collector3, collector4, collector5, collector6, collector7, collector8, collector9};

        District district = new District("Davanagere", collector);
        District district1 = new District("Dakshina Kannda", collector1);
        District district2 = new District("Yadgiri", collector2);
        District district3 = new District("Hasan", collector3);
        District district4 = new District("Raichur", collector4);
        District district5 = new District("Tumakuru", collector5);
        District district6 = new District("Chamarajanagar", collector6);
        District district7 = new District("Bengaluru Urban", collector7);
        District district8 = new District("Mandya", collector8);
        District district9 = new District("Shivmoga", collector9);

        District[] districts = {district, district1, district2, district3, district4, district5, district6, district7, district8, district9};
        City city = new City("Davanagere", 1, districts);
        City city1 = new City("Dakshina Kannada", 1, districts);
        City city2 = new City("Yadgiri", 1, districts);
        City city3 = new City("Hasan", 1, districts);
        City city4 = new City("Raichur", 1, districts);
        City city5 = new City("Tumkur", 1, districts);
        City city6 = new City("Chamarajanagar", 1, districts);
        City city7 = new City("Bengaluru Urban", 1, districts);
        City city8 = new City("Mandya", 1, districts);
        City city9 = new City("Shivmoga", 1, districts);

        City[] cities = {city, city1, city2, city3, city4, city5, city6, city7, city8, city9};
        State state = new State("Karnataka", 6.91, cities);
        State state1 = new State("Telangana", 6.91, cities);

        Address address = new Address(2, "577215", state);
        President president = new President("Droupadi Murmu", 72, address);

        State[] states = {state, state1};
        Country country = new Country("India", "Dropadi Murmu", states);
        Country country1 = new Country("England", "President", states);
        Country country2 = new Country("Japan", "President", states);
        Country country3 = new Country("Nepal", "President", states);

        Country[] countries = new Country[10];
        CountryStore countryStore = new CountryStore(countries);
        countryStore.save(country);
        System.out.println();
        System.out.println("------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        countryStore.save(country1);
        System.out.println();
        System.out.println("--------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        countryStore.save(country2);
        countryStore.save(country3);

        president.presidentIno();
        System.out.println();
        System.out.println("----------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        StateOperation stateOperation = new StateOperation(states, cities, collectors, countries);
        stateOperation.check("Karnataka");
        System.out.println();
        System.out.println("----------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");

        stateOperation.checks("Karnataka");
        System.out.println();
        System.out.println("-------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        stateOperation.search("Davanagere");
        stateOperation.searchs("Shri GangadharaSwamy");
    }
}
