class TurbineRunner {
    public static void main(String[] args) {
        String[] turbines = new String[10];
        Turbine turbine = new Turbine(turbines);

        turbine.saveTurbineName("Pelton");
        turbine.saveTurbineName("Francis");
        turbine.saveTurbineName("Kaplan");
        turbine.saveTurbineName("Turgo");
        turbine.saveTurbineName("Propeller");
        turbine.saveTurbineName("Darrieus");
        turbine.saveTurbineName("Savonius");
        turbine.saveTurbineName("Tyson");
        turbine.saveTurbineName("Gorlov");
        turbine.saveTurbineName("Wells");

     
        turbine.searchTurbineName("Francis");
       
        turbine.searchTurbineName("Steam");
    }
}