class OnlineShoppingSystem {

    public static void main(String[] args) {

        customerDetails("Shashanka", 3000, "Bangalore", 9743873982L);
        membershipType("Gold");
        paymentMode(2);
        printOrderedItems();
        addRewardPoints();
        otpVerification();
    }

    static void customerDetails(String username, double cartAmount, String address, long mobile) {

        if (username == null) {
            System.out.println("User name should not be null");
        }

        if (cartAmount <= 0) {
            System.out.println("Cart amount should be greater than zero");
        }

        if (address == null) {
            System.out.println("Address should not be null");
        }

        if (mobile < 1000000000L || mobile > 9999999999L) {
            System.out.println("Enter a valid 10-digit mobile number");
        }

        System.out.println("Customer validation completed");
    }

    static void membershipType(String type) {

        if (type == "Silver") {
            System.out.println("5% Discount");
        }
        else if (type == "Gold") {
            System.out.println("10% Discount");
        }
        else if (type == "Platinum") {
            System.out.println("15% Discount");
        }
        else if (type == "Prime") {
            System.out.println("20% Discount");
        }
        else {
            System.out.println("Invalid Membership");
        }
    }

    static void paymentMode(int option) {

        switch (option) {

            case 1:
                System.out.println("Payment Mode: UPI");
                break;

            case 2:
                System.out.println("Payment Mode: Card");
                break;

            case 3:
                System.out.println("Payment Mode: Net Banking");
                break;

            case 4:
                System.out.println("Payment Mode: Cash on Delivery");
                break;

            default:
                System.out.println("Invalid Payment Option");
        }
    }

    static void printOrderedItems() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ordered Item " + i);
        }
    }

    static void addRewardPoints() {

        int points = 0;

        while (points < 1000) {
            points += 200;
            System.out.println("Current Points: " + points);
        }

        System.out.println("Reward Target Reached!");
    }

    static void otpVerification() {

        int attempts = 1;

        do {
            System.out.println("Attempt " + attempts + ": Enter OTP");
            attempts++;
        }
        while (attempts <= 3);

        System.out.println("OTP Attempts Finished");
    }
}
