class PVR {
    int theaterId;
    String location;
    String city;
    int seatingCapacity;
    String screenType;       
    double ticketPrice;
    boolean is3D;
    String currentMovie;
    String soundSystem;      
    float screenWidth;      
    int floorNumber;
    boolean parkingAvailable;
    String projectorType;    
    int staffCount;
    double rating;           
    boolean popcornAvailable;
    String snackMenuType;    
    int showTimingsCount;    
    long totalAnnualRevenue;
    String managerName;

    
    PVR(int theaterId, String location, String city, int seatingCapacity, String screenType, 
        double ticketPrice, boolean is3D, String currentMovie, String soundSystem, 
        float screenWidth, int floorNumber, boolean parkingAvailable, String projectorType, 
        int staffCount, double rating, boolean popcornAvailable, String snackMenuType, 
        int showTimingsCount, long totalAnnualRevenue, String managerName) {
        
        this.theaterId = theaterId;
        this.location = location;
        this.city = city;
        this.seatingCapacity = seatingCapacity;
        this.screenType = screenType;
        this.ticketPrice = ticketPrice;
        this.is3D = is3D;
        this.currentMovie = currentMovie;
        this.soundSystem = soundSystem;
        this.screenWidth = screenWidth;
        this.floorNumber = floorNumber;
        this.parkingAvailable = parkingAvailable;
        this.projectorType = projectorType;
        this.staffCount = staffCount;
        this.rating = rating;
        this.popcornAvailable = popcornAvailable;
        this.snackMenuType = snackMenuType;
        this.showTimingsCount = showTimingsCount;
        this.totalAnnualRevenue = totalAnnualRevenue;
        this.managerName = managerName;
    }

    void infoOfPVR() {
        System.out.println("Acess the PVR of Instance Variavles...");
        System.out.println("ID: " + theaterId );
		System.out.println("location: " + location );
		System.out.println("city: " + city );
		System.out.println("seatingCapacity: " + seatingCapacity );
        System.out.println("Screen: " + screenType );
		System.out.println("ticketPrice: " + ticketPrice );
		System.out.println("3D Supported: " + is3D);
        System.out.println("Movie: " + currentMovie);
        System.out.println("Tech: " + soundSystem );
		System.out.println("screenWidth: " + screenWidth);
        System.out.println("floorNumber: " + floorNumber);
        System.out.println("Facilities:"+parkingAvailable );
		System.out.println("projectorType: " + projectorType);
		System.out.println("staffCount: " + staffCount);
        System.out.println("Rating: " + rating );
		System.out.println("popcornAvailable: " + popcornAvailable);
		System.out.println("snackMenuType: " + snackMenuType);
		System.out.println("showTimingsCount: " + showTimingsCount);
        System.out.println("Annual Revenue: ₹" + totalAnnualRevenue);
        System.out.println("Manager: " + managerName);
       
    }
}