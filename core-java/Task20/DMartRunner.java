class DMartRunner {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Arjun", 10);
        Manager manager2 = new Manager("Deepa", 8);

        DMart store1 = new DMart(120, manager1, CityArea.RAJAJINAGAR);
        DMart store2 = new DMart(150, manager1, CityArea.WHITEFIELD);
        DMart store3 = new DMart(80, null, CityArea.JAYANAGAR);

        store1.displayDetails();
        store2.displayDetails();
        store3.displayDetails();
    }
}