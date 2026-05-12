class OfficeRunner {
    public static void main(String[] args) {
        Office office = new Office(101, "Google Plex", "Mountain View", "California", 15, 2000, 50000.0, true, 45, "Google Fiber", 500000.0, false, "Corporate", 500, "HVAC", true, "Sundar P.", 10, 5.0, "2004");
        office.display();

        Office office1 = new Office(102, "WeWork Hub", "Koramangala", "Bangalore", 5, 400, 12000.5, true, 12, "ACT Fibernet", 8500.0, true, "Coworking", 50, "Central", true, "Amit K.", 3, 4.2, "2018");
        office1.display();

        Office office2 = new Office(103, "Microsoft Signature", "Redmond", "Washington", 20, 3500, 100000.0, true, 80, "Azure Connect", 0.0, false, "Corporate", 1200, "HVAC", true, "Satya N.", 15, 4.9, "1986");
        office2.display();

        Office office3 = new Office(104, "Garage Startup", "Palo Alto", "California", 1, 10, 800.0, false, 1, "Comcast", 2500.0, true, "Startup", 2, "Split", false, "Steve J.", 0, 3.0, "2023");
        office3.display();

        Office office4 = new Office(105, "City Hall", "Lower Manhattan", "New York", 10, 1200, 35000.0, true, 25, "Verizon", 0.0, false, "Government", 100, "Central", true, "Eric A.", 6, 3.5, "1811");
        office4.display();

        Office office5 = new Office(106, "Infosys DC", "Hinjewadi", "Pune", 8, 5000, 200000.0, true, 60, "Tata Comm", 150000.0, false, "Corporate", 2000, "Central HVAC", true, "Salil P.", 12, 4.5, "2002");
        office5.display();

        Office office6 = new Office(107, "Eco Space", "Salt Lake", "Kolkata", 12, 1500, 45000.0, true, 30, "Airtel", 12000.0, true, "Corporate", 300, "Central", true, "Rahul B.", 8, 4.8, "2015");
        office6.display();

        Office office7 = new Office(108, "Creative Studio", "Shoreditch", "London", 2, 30, 2500.0, false, 3, "BT Business", 6000.0, true, "Startup", 5, "Split", true, "Emma W.", 1, 3.8, "2020");
        office7.display();

        Office office8 = new Office(109, "Amazon Day 1", "Seattle", "Washington", 37, 5000, 250000.0, true, 150, "AWS Direct", 0.0, false, "Corporate", 1500, "Smart HVAC", true, "Andy J.", 25, 4.9, "2016");
        office8.display();

        Office office9 = new Office(110, "Regus Plaza", "Business Bay", "Dubai", 40, 800, 20000.0, true, 20, "Etisalat", 45000.0, true, "Coworking", 200, "District Cooling", true, "Zayed M.", 10, 4.4, "2012");
        ffice9.display();
    }
}