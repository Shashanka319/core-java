class ToxicRunner {
    public static void main(String[] args) {
        
        Toxic toxic = new Toxic("Arsenic", "As", 763.0, "Solid", 4, false, false, 614.0f, 817.0f, "Ingestion", "Dimercaprol", 50, 5.73, "Grey", "Metallic", true, "Global Mining Co", "EPA", 50000, 7.0);
        toxic.display();

       
        Toxic toxic1 = new Toxic("Mercury", "Hg", 1.0, "Liquid", 3, false, false, 356.7f, -38.8f, "Inhalation", "Chelation Therapy", 100, 13.53, "Silver", "Odorless", true, "QuickSilver Ltd", "WHO", 2000, 7.0);
        toxic1.display();

   
        Toxic toxic2 = new Toxic("Chlorine", "Cl2", 0.43, "Gas", 4, false, false, -34.0f, -101.5f, "Inhalation", "Sodium Bicarbonate", 5, 0.0032, "Greenish-Yellow", "Pungent", true, "ChemCorp", "OSHA", 15000000, 2.0);
        toxic2.display();

        
        Toxic toxic3= new Toxic("Cyanide", "CN", 6.4, "Solid", 4, true, false, 25.7f, -13.4f, "Ingestion", "Hydroxocobalamin", 10, 1.45, "White", "Bitter Almond", true, "IndustriChem", "EPA", 1100000, 11.0);
        toxic3.display();

       
        Toxic toxic4 = new Toxic("Lead", "Pb", 450.0, "Solid", 2, false, false, 1749.0f, 327.5f, "Ingestion", "EDTA", 200, 11.34, "Bluish-Grey", "Odorless", false, "MetalWorks", "EPA", 12000000, 7.0);
        toxic4.display();

       
        Toxic toxic5 = new Toxic("Formaldehyde", "CH2O", 100.0, "Gas", 3, true, false, -19.0f, -92.0f, "Inhalation", "None/Wash", 2, 0.815, "Colorless", "Suffocating", true, "BioLabs", "OSHA", 52000000, 3.5);
        toxic5.display();

        
        Toxic toxic6 = new Toxic("Benzene", "C6H6", 930.0, "Liquid", 3, true, false, 80.1f, 5.5f, "Inhalation", "Oxygen Support", 5, 0.87, "Colorless", "Sweet", true, "PetroGiant", "EPA", 40000000, 7.0);
        toxic6.display();

    
        Toxic toxic7 = new Toxic("Ammonia", "NH3", 350.0, "Gas", 3, true, false, -33.3f, -77.7f, "Inhalation", "Water/Air", 3, 0.73, "Colorless", "Sharp/Pungent", false, "AgriFlow", "OSHA", 175000000, 11.6);
        toxic7.display();

       
        Toxic toxic8 = new Toxic("Uranium", "U", 150.0, "Solid", 3, false, true, 4131.0f, 1132.0f, "Inhalation", "Bicarbonate", 1000, 19.1, "Silvery-White", "Odorless", true, "EnergyNuc", "NRC", 40000, 7.0);
        toxic8.display();

       
        Toxic toxic9 = new Toxic("Carbon Monoxide", "CO", 2.3, "Gas", 4, true, false, -191.5f, -205.0f, "Inhalation", "Pure Oxygen", 1, 1.14, "Colorless", "Odorless", false, "Atmospheric", "EPA", 1000000, 7.0);
        toxic9.display();
    }
}