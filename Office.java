class Office {
    int officeId;
    String officeName;
    String location;
    String city;
    int totalFloors;
    int employeeCapacity;
    double squareFootage;
    boolean hasCafeteria;
    int meetingRoomsCount;
    String internetProvider;
    double monthlyRent;
    boolean isLeased;
    String officeType;           
    int parkingSlots;
    String airConditioningType;  
    boolean securitySystemsActive;
    String buildingManager;
    int liftsAvailable;
    double energyRating;        
    String openingYear;

    Office(int officeId, String officeName, String location, String city, int totalFloors, 
           int employeeCapacity, double squareFootage, boolean hasCafeteria, int meetingRoomsCount, 
           String internetProvider, double monthlyRent, boolean isLeased, String officeType, 
           int parkingSlots, String airConditioningType, boolean securitySystemsActive, 
           String buildingManager, int liftsAvailable, double energyRating, String openingYear) {
        
        this.officeId = officeId;
        this.officeName = officeName;
        this.location = location;
        this.city = city;
        this.totalFloors = totalFloors;
        this.employeeCapacity = employeeCapacity;
        this.squareFootage = squareFootage;
        this.hasCafeteria = hasCafeteria;
        this.meetingRoomsCount = meetingRoomsCount;
        this.internetProvider = internetProvider;
        this.monthlyRent = monthlyRent;
        this.isLeased = isLeased;
        this.officeType = officeType;
        this.parkingSlots = parkingSlots;
        this.airConditioningType = airConditioningType;
        this.securitySystemsActive = securitySystemsActive;
        this.buildingManager = buildingManager;
        this.liftsAvailable = liftsAvailable;
        this.energyRating = energyRating;
        this.openingYear = openingYear;
    }

    void display() {
        System.out.println("Office ID: " + this.officeId);
        System.out.println("Name: " + this.officeName);
        System.out.println("Location: " + this.location);
        System.out.println("Floors: " + this.totalFloors);
        System.out.println("Area: " + this.squareFootage);
        System.out.println("Cafeteria: " + this.hasCafeteria );
        System.out.println("ISP: " + this.internetProvider);
        System.out.println("Rent: $" + this.monthlyRent );
        System.out.println("Type: " + this.officeType);
        System.out.println("Parking: " + this.parkingSlots );
        System.out.println("AC: " + this.airConditioningType);
        System.out.println("Security: " + this.securitySystemsActive);
        System.out.println("Manager: " + this.buildingManager);
        System.out.println("Lifts: " + this.liftsAvailable);
        System.out.println("Energy Rating: " + this.energyRating );
        System.out.println("Established: " + this.openingYear);
        
    }
}