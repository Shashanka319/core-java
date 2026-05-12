class ShampooRunner {
    public static void main(String[] args) {
        Shampoo shampoo = new Shampoo(1, "Head & Shoulders", "Classic Clean", "All", "Pyrithione Zinc", 400.0, 7.99, false, false, "Fresh", "White", 5.5f, 24, "Dandruff", false, "Pump Bottle", 4.5, 2024, "USA", 500);
        shampoo.display();

        Shampoo shampoo1 = new Shampoo(2, "Pantene", "Pro-V Daily Moisture", "Dry", "Pro-Vitamin B5", 350.0, 6.50, false, false, "Floral", "Pearlescent", 6.0f, 36, "Hydration", false, "Squeeze Bottle", 4.2, 2023, "Switzerland", 1200);
        shampoo1.display();

        Shampoo shampoo2 = new Shampoo(3, "OGX", "Renewing Argan Oil", "Damaged", "Argan Oil", 385.0, 8.99, true, true, "Nutty", "Golden", 5.0f, 18, "Repair", false, "Eco-Oval Bottle", 4.7, 2024, "Morocco", 350);
        shampoo2.display();

        Shampoo shampoo3 = new Shampoo(4, "Shea Moisture", "Raw Shea Butter", "Curly", "Shea Butter", 500.0, 12.99, true, true, "Musky", "Beige", 5.2f, 12, "Deep Moisture", true, "Pump Bottle", 4.8, 2024, "Ghana", 200);
        shampoo3.display();

        Shampoo shampoo4 = new Shampoo(5, "L'Oreal", "EverPure Color", "Color-Treated", "Rosemary", 250.0, 9.49, true, true, "Herbal", "Clear", 5.8f, 24, "Color Protection", false, "Tube", 4.4, 2023, "France", 800);
        shampoo4.display();

        Shampoo shampoo5 = new Shampoo(6, "Johnson's", "No More Tears", "Baby", "Mild Cleansers", 500.0, 5.99, true, true, "Baby Powder", "Yellow", 7.0f, 36, "Gentle Cleaning", false, "Pump Bottle", 4.6, 2024, "USA", 2000);
        shampoo5.display();

        Shampoo shampoo6 = new Shampoo(7, "Tresemme", "Keratin Smooth", "Frizzy", "Keratin", 580.0, 10.00, false, false, "Sweet", "White", 6.2f, 24, "Frizz Control", false, "Large Pump", 4.3, 2023, "UK", 1500);
        shampoo6.display();

        Shampoo shampoo7 = new Shampoo(8, "The Body Shop", "Ginger Scalp Care", "Oily", "Ginger Extract", 250.0, 15.00, true, true, "Spicy", "Clear", 5.4f, 12, "Scalp Health", true, "Recycled Plastic", 4.9, 2024, "India", 150);
        shampoo7.display();

        Shampoo shampoo8 = new Shampoo(9, "Dove", "Nutritive Solutions", "Fine", "Fiber Actives", 340.0, 4.99, false, true, "Clean", "White", 6.0f, 36, "Hair Fall", false, "Squeeze Bottle", 4.1, 2023, "USA", 3000);
        shampoo8.display();

        Shampoo shampoo9 = new Shampoo(10, "Ethique", "Heali Kiwi", "Dry Scalp", "Kiwifruit Oil", 110.0, 16.00, true, true, "Lime", "Green", 5.0f, 24, "Itchy Scalp", true, "Bar", 4.9, 2024, "New Zealand", 100);
        shampoo9.display();
    }
}