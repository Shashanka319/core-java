public class RideFareRunner {
    public static void main(String[] args) {
        
        RideFare ride1 = new RideFare(2, 13, true, 5);
        RideFare ride2 = new RideFare(10.0, 8, false, 5);
        RideFare ride3 = new RideFare(5.0, 2, true, 4);

        System.out.println("Scenario 1 Final Fare: " + ride1.calculateFinalFare());
        System.out.println("Scenario 2 Final Fare: " + ride2.calculateFinalFare());
        System.out.println("Scenario 3 Final Fare: " + ride3.calculateFinalFare());
    }
}