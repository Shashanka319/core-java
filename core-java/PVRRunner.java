public class PVRRunner {
    public static void main(String[] args) {
        PVR pvr = new PVR(1001, "Phoenix Marketcity", "Mumbai", 450, "IMAX", 850.0, true, "Avatar 3", "Dolby Atmos", 22.5f, 3, true, "Dual 4K Laser", 45, 4.8, true, "Premium Global", 5, 25000000L, "Rahul Sharma");
        pvr.infoOfPVR();

     
        PVR pvr1 = new PVR(1002, "Select CITYWALK", "Delhi", 520, "P[XL]", 650.0, true, "Inception Re-release", "Meyer Sound", 25.0f, 2, true, "4K Laser", 38, 4.7, true, "Veg & Non-Veg", 6, 18000000L, "Amit Verma");
        pvr1.infoOfPVR();

      
        PVR pvr2 = new PVR(1003, "Forum Mall", "Bangalore", 40, "Gold Class", 1500.0, false, "James Bond 26", "Dolby 7.1", 12.0f, 4, true, "Digital Xenon", 15, 4.9, true, "Gourmet", 4, 12000000L, "Srinivas K.");
        pvr2.infoOfPVR();

     
        PVR pvr3 = new PVR(1004, "Lulu Mall", "Kochi", 120, "4DX", 700.0, true, "Fast X", "DTS:X", 15.5f, 1, true, "4K Digital", 25, 4.5, true, "Standard", 7, 9500000L, "Faisal Khan");
        pvr3.infoOfPVR();

       
        PVR pvr4 = new PVR(1005, "Cyber Hub", "Gurgaon", 180, "Onyx LED", 550.0, false, "The Batman", "Harman JBL", 10.0f, 1, false, "Samsung Onyx LED", 20, 4.6, true, "Quick Bites", 5, 7000000L, "Priyanka Chopra");
        pvr4.infoOfPVR();

      
        PVR pvr5 = new PVR(1006, "Express Avenue", "Chennai", 300, "Standard", 250.0, false, "Leo", "Dolby Atmos", 18.0f, 3, true, "Sony 4K", 30, 4.4, true, "South Indian", 6, 11000000L, "M. Mani");
        pvr5.infoOfPVR();

      
        PVR pvr6 = new PVR(1007, "Elante Mall", "Chandigarh", 280, "Standard", 180.0, false, "Dangal", "Dolby 5.1", 16.0f, 2, true, "Digital", 22, 4.2, true, "Veg", 5, 5500000L, "Jaspreet Singh");
        pvr6.infoOfPVR();

       
        PVR pvr7 = new PVR(1008, "Acropolis Mall", "Kolkata", 150, "Standard", 220.0, true, "Belashuru", "Dolby Atmos", 14.5f, 4, true, "Digital Laser", 18, 4.3, true, "Continental", 4, 4800000L, "Subhash Roy");
        pvr7.infoOfPVR();

        
        PVR pvr8 = new PVR(1009, "Nexus Mall", "Hyderabad", 400, "Standard", 350.0, true, "RRR 2", "Dolby Atmos", 20.0f, 3, true, "4K Laser", 35, 4.5, true, "Multicuisine", 6, 14000000L, "Venkatesh D.");
        pvr8.infoOfPVR();

    
        PVR pvr9 = new PVR(1010, "Director's Cut", "Vasant Kunj", 25, "Director's Cut", 2500.0, false, "The Irishman", "Custom Hi-Fi", 11.0f, 2, true, "4K Christie", 12, 5.0, true, "Japanese & Italian", 3, 9000000L, "Siddharth Malhotra");
        pvr9.infoOfPVR();
    }
}