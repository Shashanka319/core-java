class VehicleString {
    public static void main(String[] args) {
        checkVehicle("Car");
    }

    static void checkVehicle(String vehicle) {

        switch(vehicle) {
			
            case "Car":
                System.out.println("Four wheeler");
                break;
            case "Bike":
                System.out.println("Two wheeler");
                break;
            case "Bus":
                System.out.println("Public transport");
                break;
            case "Truck":
                System.out.println("Goods transport");
                break;
            case "Cycle":
                System.out.println("Manual vehicle");
                break;
            default:
                System.out.println("Unknown vehicle");
        }
    }
}