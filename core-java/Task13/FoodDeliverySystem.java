class FoodDeliverySystem {

    public static void main(String[] args) {

        customerInfo("Shashanka", "Pizza", "Bangalore", 9743873982L);
        foodCategory("Veg");
        deliveryType(3);
        printMenuItems();
        trackDistance();
        confirmOrder();
    }

    static void customerInfo(String name, String foodItem, String city, long mobile) {

        if (name == null) {
            System.out.println("Customer name should not be null");
        }

        if (foodItem == null) {
            System.out.println("Food item should not be null");
        }

        if (city == null) {
            System.out.println("City should not be null");
        }

        if (mobile < 1000000000L || mobile > 9999999999L) {
            System.out.println("Enter valid 10-digit mobile number");
        }

        System.out.println("Customer details verified");
    }

    static void foodCategory(String category) {

        if (category == "Veg") {
            System.out.println("Vegetarian Food Selected");
        }
        else if (category == "NonVeg") {
            System.out.println("Non-Vegetarian Food Selected");
        }
        else if (category == "Vegan") {
            System.out.println("Vegan Food Selected");
        }
        else if (category == "Dessert") {
            System.out.println("Dessert Selected");
        }
        else {
            System.out.println("Invalid Food Category");
        }
    }

    static void deliveryType(int option) {

        switch (option) {

            case 1:
                System.out.println("Normal Delivery");
                break;

            case 2:
                System.out.println("Express Delivery");
                break;

            case 3:
                System.out.println("Scheduled Delivery");
                break;

            case 4:
                System.out.println("Self Pickup");
                break;

            default:
                System.out.println("Invalid Delivery Option");
        }
    }

    static void printMenuItems() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Menu Item " + i);
        }
    }

    static void trackDistance() {

        int distance = 0;

        while (distance <= 10) {
            System.out.println("Delivery Distance Covered: " + distance + " km");
            distance += 2;
        }

        System.out.println("Order Delivered!");
    }

    static void confirmOrder() {

        int attempts = 1;

        do {
            System.out.println("Order Confirmation Attempt " + attempts);
            attempts++;
        }
        while (attempts <= 3);

        System.out.println("Confirmation Process Finished");
    }
}