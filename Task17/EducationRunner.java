class EducationRunner {
    public static void main(String[] args) {
        Education education = new Education(101, "Harvard University", "Higher", "Ivy League", 23000, 2400, 55000.0, true, true, "Cambridge, MA", 5000.0, true, 150, "English", 4.9, true, 1636, "Alan Garber", 50000000000L, true);
        education.display();

        Education education1 = new Education(102, "St. Xavier's High", "Secondary", "ICSE", 2500, 120, 2500.0, true, true, "Mumbai", 5.5, true, 12, "English", 4.5, true, 1869, "Fr. Dominic", 5000000L, true);
        education1.display();

        Education education2 = new Education(103, "MIT", "Higher", "Private", 11000, 1000, 58000.0, true, true, "Cambridge, MA", 168.0, true, 200, "English", 5.0, true, 1861, "Sally Kornbluth", 24000000000L, false);
        education2.display();

        Education education3 = new Education(104, "Little Hearts Preschool", "Primary", "Montessori", 150, 15, 1200.0, true, false, "London", 0.5, false, 5, "English", 4.2, false, 2010, "Sarah Jenkins", 100000L, true);
        education3.display();

        Education education4 = new Education(105, "Tokyo University", "Higher", "National", 28000, 2500, 5000.0, true, true, "Tokyo", 100.0, true, 180, "Japanese/English", 4.7, true, 1877, "Teruo Fujii", 2000000000L, true);
        education4.display();

        Education education5 = new Education(106, "Greenwood High", "Secondary", "IB", 3000, 200, 8000.0, true, true, "Bangalore", 20.0, true, 15, "English", 4.6, true, 2004, "Niru Agarwal", 10000000L, true);
        education5.display();

        Education education6 = new Education(107, "Oxford University", "Higher", "Public", 26000, 3000, 35000.0, true, true, "Oxford", 200.0, true, 250, "English", 4.9, true, 1096, "Irene Tracey", 1500000000L, false);
        education6.display();

        Education education7 = new Education(108, "Apex Vocational Tech", "Vocational", "Government", 800, 40, 500.0, false, true, "Nairobi", 3.0, true, 10, "Swahili/English", 4.0, true, 1995, "John Kamau", 500000L, true);
        education7.display();

        Education education8 = new Education(109, "Delhi Public School", "Secondary", "CBSE", 4500, 250, 1800.0, true, true, "New Delhi", 15.0, true, 18, "Hindi/English", 4.4, true, 1949, "Sunita Tanwar", 8000000L, true);
        education8.display();

        Education education9 = new Education(110, "Stanford University", "Higher", "Private", 17000, 2200, 60000.0, true, true, "Stanford, CA", 8180.0, true, 210, "English", 5.0, true, 1885, "Richard Saller", 36000000000L, false);
        education9.display();
    }
}