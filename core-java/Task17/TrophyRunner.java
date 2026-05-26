 class TrophyRunner {
    public static void main(String[] args) {
       
        Trophy trophy = new Trophy(101, "FIFA World Cup Trophy", "FIFA World Cup", "18-carat Gold", 6.175, 36.8f, 1974, "Argentina", "Italy", 20000000.0, true, "Sports", 22, "FIFA World Cup", true, "Silvio Gazzaniga", 18, "Zurich Museum", 3500000000L, "None");
        trophy.displayDetails();

     
        Trophy trophy1 = new Trophy(102, "Academy Award", "The Oscars", "Gold-plated Bronze", 3.8, 34.3f, 1929, "Cillian Murphy", "USA", 400.0, false, "Arts", 96, "Best Actor", true, "Cedric Gibbons", 24, "Private Residence", 20000000L, "None");
        trophy1.displayDetails();

       
        Trophy trophy2 = new Trophy(103, "Gentlemen's Singles Trophy", "Wimbledon", "Silver Gilt", 3.5, 46.0f, 1887, "Carlos Alcaraz", "UK", 15000.0, true, "Sports", 137, "All England Lawn Tennis Club", true, "Unknown", 0, "Wimbledon Museum", 50000000L, "Purple/Green");
        trophy2.displayDetails();

        Trophy trophy3 = new Trophy(104, "Nobel Medal", "Nobel Prize Ceremony", "18k Green Gold", 0.175, 6.6f, 1901, "Narges Mohammadi", "Norway", 1100000.0, false, "Science/Peace", 123, "Pro Pace et Fraternitate Gentium", true, "Erik Lindberg", 18, "Private Collection", 5000000L, "None");
        trophy3.displayDetails();

        Trophy trophy4 = new Trophy(105, "Stanley Cup", "NHL Playoffs", "Silver/Nickel Alloy", 15.5, 89.5f, 1892, "Florida Panthers", "Canada", 650000.0, true, "Sports", 131, "Lord Stanley of Preston", false, "Puck Masters", 0, "Traveling", 10000000L, "None");
        trophy4.displayDetails();

        Trophy trophy5 = new Trophy(106, "ICC World Cup", "ICC Men's Cricket World Cup", "Silver/Gold", 11.0, 60.0f, 1999, "Australia", "UAE", 30000.0, true, "Sports", 13, "Garrard & Co", true, "Garrard", 0, "Dubai HQ", 2600000000L, "White");
        trophy5.displayDetails();

        Trophy trophy6 = new Trophy(107, "Ballon d'Or", "France Football Awards", "Gold-brass", 12.0, 31.0f, 1956, "Lionel Messi", "France", 500000.0, false, "Sports", 67, "France Football", true, "Mellerio dits Meller", 18, "Private Collection", 100000000L, "None");
        trophy6.displayDetails();

        Trophy trophy7 = new Trophy(108, "Larry O'Brien Trophy", "NBA Finals", "Sterling Silver/Gold Vermeil", 7.0, 61.0f, 1977, "Boston Celtics", "USA", 13500.0, false, "Sports", 78, "The Finals", true, "Tiffany & Co.", 24, "Boston", 30000000L, "None");
        trophy7.displayDetails();

        Trophy trophy8 = new Trophy(109, "Grammy", "Grammy Awards", "Grammium (Zinc Alloy)", 2.4, 23.0f, 1958, "Taylor Swift", "USA", 50.0, false, "Arts", 66, "Album of the Year", true, "Billie Billingsley", 0, "Private Residence", 15000000L, "None");
        trophy8.displayDetails();

        Trophy trophy9 = new Trophy(110, "Webb Ellis Cup", "Rugby World Cup", "Silver Gilt", 4.5, 38.0f, 1987, "South Africa", "London", 35000.0, true, "Sports", 10, "International Rugby Board", true, "Carrington & Co", 0, "Cape Town", 800000000L, "Yellow");
        trophy9.displayDetails();
    }
}