class LotionRunner {
    public static void main(String[] args) {
        Lotion lotion = new Lotion(1, "Vaseline", "Intensive Care", "Dry", "Oat Extract", 400.0, 6.99, true, true, "Clean", "White", 5.5f, 36, "Moisturizing", false, 0, 4.5, "Pump Bottle", "USA", 1200);
        lotion.display();

        Lotion lotion1 = new Lotion(2, "Cetaphil", "Moisturizing Lotion", "Sensitive", "Glycerin", 591.0, 14.50, false, true, "Fragrance-free", "White", 5.0f, 24, "Soothing", false, 0, 4.8, "Pump Bottle", "Canada", 800);
        lotion1.display();

        Lotion lotion2 = new Lotion(3, "Nivea", "Extra White", "Normal", "Camu Camu", 250.0, 8.25, true, false, "Floral", "White", 6.0f, 24, "Brightening", true, 15, 4.2, "Squeeze Bottle", "Germany", 500);
        lotion2.display();

        Lotion lotion3 = new Lotion(4, "Aveeno", "Daily Moisturizing", "Dry", "Prebiotic Oat", 354.0, 10.99, false, true, "Fragrance-free", "Beige", 5.2f, 36, "Skin Barrier", false, 0, 4.7, "Pump Bottle", "USA", 1000);
        lotion3.display();

        Lotion lotion4 = new Lotion(5, "Bath & Body Works", "Japanese Cherry Blossom", "Normal", "Shea Butter", 236.0, 13.50, true, false, "Cherry Blossom, Pear", "Pink", 6.5f, 12, "Fragrance", false, 0, 4.6, "Squeeze Bottle", "USA", 300);
        lotion4.display();

        Lotion lotion5 = new Lotion(6, "Neutrogena", "Hydro Boost", "Oily", "Hyaluronic Acid", 150.0, 12.99, true, true, "Watery Fresh", "Light Blue", 5.8f, 18, "Hydration", false, 0, 4.4, "Jar", "USA", 450);
        lotion5.display();

        Lotion lotion6 = new Lotion(7, "Eucerin", "Roughness Relief", "Combination", "Urea", 500.0, 15.99, false, true, "Fragrance-free", "White", 4.5f, 24, "Exfoliating", false, 0, 4.3, "Pump Bottle", "Mexico", 600);
        lotion6.display();

        Lotion lotion7 = new Lotion(8, "La Roche-Posay", "Lipikar AP+", "Extra Dry", "Thermal Water", 400.0, 19.99, false, true, "Odorless", "Creamy White", 5.5f, 36, "Eczema Relief", false, 0, 4.9, "Pump Bottle", "France", 200);
        lotion7.display();

        Lotion lotion8 = new Lotion(9, "Jergens", "Ultra Healing", "Extra Dry", "Hydralucence Blend", 621.0, 7.49, true, true, "Cherry Almond", "White", 6.2f, 36, "Deep Repair", false, 0, 4.1, "Pump Bottle", "USA", 1500);
        lotion8.display();

        Lotion lotion9 = new Lotion(10, "Banana Boat", "Ultra Sport", "All", "Vitamin C", 236.0, 9.00, true, false, "Fresh Sport", "White", 7.0f, 18, "Sun Protection", true, 50, 4.5, "Tube", "Australia", 900);
        lotion9.display();
    }
}