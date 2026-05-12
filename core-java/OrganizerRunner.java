class OrganizerRunner {
    public static void main(String[] args) {
        Organizer o1 = new Organizer(1, "Moleskine", "Classic Daily", "Physical", "Personal", 50, 25.99, false, false, "Hardcover", "Black", 340.5f, 0, "Elastic Band", false, "70 GSM", 4.8, 400, "English", 12);
        o1.display();

        Organizer o2 = new Organizer(2, "Apple", "iCloud Calendar", "Digital", "Business", 10000, 0.00, true, true, "Software", "Multicolor", 0.0f, 1, "FaceID", true, "Retina UI", 4.9, 0, "All Global", 0);
        o2.display();

        Organizer o3 = new Organizer(3, "Filofax", "Metropol Personal", "Physical", "Business", 100, 45.00, false, false, "Leather Binder", "Brown", 500.0f, 0, "Snap Fastener", false, "90 GSM", 4.7, 250, "English/French", 24);
        o3.display();

        Organizer o4 = new Organizer(4, "Remarkable", "Paper Tablet 2", "Digital", "Academic", 5000, 399.00, true, true, "Electronic Ink", "Grey", 403.5f, 14, "Passcode", false, "E-Ink Canvas", 4.6, 10000, "Multilingual", 12);
        o4.display();

        Organizer o5 = new Organizer(5, "FranklinPlanner", "Leadership Edition", "Physical", "Executive", 200, 85.00, false, false, "Zippered Leather", "Burgundy", 750.0f, 0, "Metal Lock", true, "100 GSM", 4.5, 500, "English", 36);
        o5.display();

        Organizer o6 = new Organizer(6, "Google", "Google Keep", "Digital", "Personal", 2000, 0.00, true, true, "Web/App", "Yellow", 0.0f, 1, "OAuth 2.0", true, "Material Design", 4.7, 0, "Global", 0);
        o6.display();

        Organizer o7 = new Organizer(7, "Erin Condren", "LifePlanner", "Physical", "Personal", 150, 60.00, false, false, "Coiled", "Floral Print", 900.0f, 0, "None", false, "Mohawk 80#", 4.9, 220, "English", 6);
        o7.display();

        Organizer o8 = new Organizer(8, "Samsung", "S-Planner", "Digital", "Business", 8000, 0.00, true, true, "Mobile App", "Blue", 0.0f, 2, "Knox Security", true, "One UI", 4.4, 0, "Multi", 0);
        o8.display();

        Organizer o9 = new Organizer(9, "Hobonichi", "Techo Cousin", "Physical", "Academic", 365, 35.00, false, false, "Softcover", "Beige", 480.0f, 0, "None", false, "Tomoe River", 5.0, 544, "Japanese/English", 12);
        o9.display();

        Organizer o10 = new Organizer(10, "Microsoft", "Outlook Tasks", "Digital", "Corporate", 15000, 12.99, true, true, "Enterprise Cloud", "Deep Blue", 0.0f, 1, "Azure AD", true, "Fluent UI", 4.6, 0, "Global", 12);
        o10.display();
    }
}