class DumbBellRunner {
    public static void main(String[] args) {
        DumbBell dumbBell = new DumbBell(1, 5.0, "kg", "Iron", "Hex", "Knurled", 28.0, false, "Rogue", "Black", 25.0f, true, 30.0, "Rubber", 12, "2024", 4.5, 100, "Gym", true);
        dumbBell.display();

        DumbBell dumbBell1 = new DumbBell(2, 2.5, "kg", "Steel", "Round", "Smooth", 25.0, false, "Decathlon", "Blue", 20.0f, true, 15.0, "Vinyl", 6, "2023", 4.2, 200, "Home", false);
        dumbBell1.display();

        DumbBell dumbBell2 = new DumbBell(3, 10.0, "kg", "Chrome", "Round", "Knurled", 30.0, false, "York", "Silver", 28.0f, true, 50.0, "Chrome", 24, "2024", 4.8, 50, "Commercial", true);
        dumbBell2.display();

        DumbBell dumbBell3 = new DumbBell(4, 24.0, "kg", "Plastic/Steel", "Square", "Rubber", 32.0, true, "Bowflex", "Black", 40.0f, false, 250.0, "Hard Shell", 36, "2023", 4.7, 30, "Home", false);
        dumbBell3.display();

        DumbBell dumbBell4 = new DumbBell(5, 1.0, "kg", "Iron", "Round", "Soft", 20.0, false, "Amazon", "Pink", 15.0f, true, 10.0, "Neoprene", 12, "2024", 4.0, 500, "Studio", false);
        dumbBell4.display();

        DumbBell dumbBell5 = new DumbBell(6, 15.0, "kg", "Urethane", "Round", "Steel", 32.0, false, "Eleiko", "Navy", 30.0f, false, 90.0, "Urethane", 60, "2024", 5.0, 40, "Professional", true);
        dumbBell5.display();

        DumbBell dumbBell6 = new DumbBell(7, 20.0, "kg", "Cast Iron", "Hex", "Knurled", 33.0, false, "CAP", "Grey", 35.0f, false, 45.0, "Enamel", 12, "2022", 4.3, 150, "Gym", false);
        dumbBell6.display();

        DumbBell dumbBell7 = new DumbBell(8, 7.5, "kg", "Iron", "Hex", "Contoured", 29.0, false, "Titan", "Black", 27.0f, true, 40.0, "Powder Coat", 12, "2023", 4.6, 80, "Gym", true);
        dumbBell7.display();

        DumbBell dumbBell8 = new DumbBell(9, 4.0, "kg", "Iron", "Round", "Smooth", 24.0, false, "Reebok", "Cyan", 22.0f, true, 25.0, "Vinyl", 24, "2024", 4.4, 120, "Studio", false);
        dumbBell8.display();

        DumbBell dumbBell9 = new DumbBell(10, 50.0, "lb", "Steel", "Round", "Knurled", 35.0, false, "Gold's Gym", "Black", 38.0f, false, 75.0, "Rubber", 6, "2023", 4.1, 20, "Commercial", true);
        dumbBell9.display();
    }
}