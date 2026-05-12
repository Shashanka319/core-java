class Pumpkin {
    double weight;
    Farmer farmer;
    PumpkinType type;

    Pumpkin(double weight, Farmer farmer, PumpkinType type) {
        this.weight = weight;
        this.farmer = farmer;
        this.type = type;
    }

    void displayPumpkinInfo() {
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Type: " + this.type);
        
        if (farmer != null) {
            System.out.println("Farmer: " + farmer.name);
            System.out.println("Region: " + farmer.region);
        } else {
            System.out.println("Farmer: Unknown (Wild Harvest)");
        }
       
    }
}