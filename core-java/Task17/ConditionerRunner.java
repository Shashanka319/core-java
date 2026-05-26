class ConditionerRunner {
    public static void main(String[] args) {
        Conditioner conditioner = new Conditioner(1, "Pantene", "Pro-V Repair", "Damaged", "Biotin", 300.0, 5.99, false, false, "Classic Floral", "White", 4.5f, 24, "Split Ends", true, "Squeeze Bottle", 4.3, 2024, "USA", 800);
        conditioner.display();

        Conditioner conditioner1 = new Conditioner(2, "SheaMoisture", "Coconut & Hibiscus", "Curly", "Silk Protein", 384.0, 11.99, false, true, "Tropical", "Off-white", 5.0f, 12, "Frizz Control", true, "Pump Bottle", 4.7, 2023, "Ghana", 400);
        conditioner1.display();

        Conditioner conditioner2 = new Conditioner(3, "Olaplex", "No.5 Bond Maintenance", "All", "Bis-Aminopropyl Diglycol Dimaleate", 250.0, 30.00, false, true, "Citrus", "White", 4.0f, 36, "Bond Repair", true, "Squeeze Bottle", 4.9, 2024, "USA", 200);
        conditioner2.display();

        Conditioner conditioner3 = new Conditioner(4, "Its a 10", "Miracle Leave-In", "All", "Sunflower Seed Extract", 120.0, 18.50, true, true, "Clean", "White", 4.2f, 24, "Detangling", true, "Spray Bottle", 4.8, 2024, "USA", 600);
        conditioner3.display();

        Conditioner conditioner4 = new Conditioner(5, "L'Oreal", "Elvive Color Vibrancy", "Color-Treated", "Linseed Oil", 375.0, 4.49, false, false, "Berry", "White", 5.5f, 36, "Color Fade", false, "Squeeze Bottle", 4.1, 2023, "France", 1200);
        conditioner4.display();

        Conditioner conditioner5 = new Conditioner(6, "Aveeno", "Oat Milk Blend", "Sensitive Scalp", "Colloidal Oatmeal", 354.0, 8.99, false, true, "Almond", "Cream", 5.2f, 24, "Scalp Soothing", true, "Squeeze Bottle", 4.5, 2024, "Canada", 500);
        conditioner5.display();

        Conditioner conditioner6 = new Conditioner(7, "Briogeo", "Don't Despair, Repair!", "Dry", "Rosehip Oil", 236.0, 39.00, false, true, "Floral", "White", 4.8f, 18, "Deep Conditioning", true, "Jar", 4.6, 2024, "USA", 150);
        conditioner6.display();

        Conditioner conditioner7 = new Conditioner(8, "Tresemme", "Rich Moisture", "Dry", "Vitamin E", 828.0, 6.99, false, false, "Fresh", "White", 6.0f, 36, "Hydration", false, "Large Pump", 4.2, 2023, "UK", 1500);
        conditioner7.display();

        Conditioner conditioner8 = new Conditioner(9, "Love Beauty and Planet", "Murumuru Butter", "Color-Treated", "Murumuru Butter", 400.0, 7.50, false, true, "Rose", "White", 5.3f, 24, "Glossy Shine", true, "Recycled Bottle", 4.4, 2024, "India", 300);
        conditioner8.display();

        Conditioner conditioner9 = new Conditioner(10, "Maui Moisture", "Heal & Hydrate", "Curly", "Shea Butter", 385.0, 9.00, false, true, "Creamy Coconut", "White", 5.1f, 24, "Softening", true, "Rectangle Bottle", 4.5, 2024, "USA", 450);
        conditioner9.display();
    }
}