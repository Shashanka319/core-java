class DiabetesRunner {
    public static void main(String[] args) {
        Diabetes diabetes = new Diabetes(101, "John Doe", 45, "Type 2", 145.5, 7.2, 0.0, false, "Metformin", 28.4, 150, true, "2020-05-12", "Fatigue", 8000, "2024-01-10", 88.0, false, "Finger Prick", "Dr. Smith");
        diabetes.display();

        Diabetes diabetes1 = new Diabetes(102, "Emma Wilson", 12, "Type 1", 180.0, 8.5, 25.5, true, "Humalog", 19.2, 180, false, "2018-02-20", "Thirst", 10000, "2024-02-15", 95.0, false, "CGM", "Dr. Adams");
        diabetes1.display();

        Diabetes diabetes2 = new Diabetes(103, "Sarah Brown", 29, "Gestational", 130.0, 6.1, 5.0, true, "Insulin", 26.5, 140, true, "2023-11-01", "Blurred Vision", 5000, "2024-02-28", 92.0, false, "Finger Prick", "Dr. Lee");
        diabetes2.display();

        Diabetes diabetes3 = new Diabetes(104, "Michael Ross", 62, "Type 2", 160.2, 7.8, 12.0, true, "Jardiance", 31.0, 120, true, "2015-08-14", "Slow Healing", 6000, "2023-12-20", 72.0, true, "CGM", "Dr. Miller");
        diabetes3.display();

        Diabetes diabetes4 = new Diabetes(105, "Anita Desai", 54, "Type 2", 115.0, 6.5, 0.0, false, "Glipizide", 24.2, 200, false, "2021-03-10", "None", 10000, "2024-01-05", 90.0, false, "Finger Prick", "Dr. Gupta");
        diabetes4.display();

        Diabetes diabetes5 = new Diabetes(106, "Liam Chen", 8, "Type 1", 210.0, 9.2, 30.0, true, "Novolog", 17.5, 160, false, "2022-09-30", "Weight Loss", 12000, "2024-02-10", 98.0, false, "CGM", "Dr. Park");
        diabetes5.display();

        Diabetes diabetes6 = new Diabetes(107, "Robert Taylor", 70, "Type 2", 155.0, 7.5, 15.0, true, "Lantus", 29.8, 130, true, "2010-06-22", "Numbness", 4000, "2023-11-15", 65.0, true, "Finger Prick", "Dr. White");
        diabetes6.display();

        Diabetes diabetes7 = new Diabetes(108, "Elena Gomez", 35, "Type 2", 125.5, 6.8, 0.0, false, "Januvia", 27.1, 150, false, "2019-12-05", "Frequent Urination", 9000, "2024-02-20", 89.0, false, "CGM", "Dr. Garcia");
        diabetes7.display();

        Diabetes diabetes8 = new Diabetes(109, "David Bond", 50, "Type 1", 170.0, 8.1, 40.0, true, "Apidra", 23.5, 200, false, "1995-10-12", "Fatigue", 7000, "2024-01-25", 82.0, true, "CGM", "Dr. Evans");
        diabetes8.display();

        Diabetes diabetes9 = new Diabetes(110, "Karen Hall", 41, "Type 2", 140.0, 7.0, 0.0, false, "Victoza", 33.4, 110, true, "2017-04-18", "Increased Hunger", 5000, "2024-02-01", 85.0, false, "Finger Prick", "Dr. Scott");
        diabetes9.display();
    }
}