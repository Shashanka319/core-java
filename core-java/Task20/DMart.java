class DMart {
    int staffCount;
    Manager manager;
    CityArea location;

    DMart(int staffCount, Manager manager, CityArea location) {
        this.staffCount = staffCount;
        this.manager = manager;
        this.location = location;
    }

    void displayDetails() {
        System.out.println("Staff Count: " + this.staffCount);
        System.out.println("Location: " + this.location);
        
        if (manager != null) {
            System.out.println("Manager Name: " + manager.name);
            System.out.println("Experience: " + manager.experience + " years");
        } else {
            System.out.println("Manager: Position Vacant");
        }
        
    }
}