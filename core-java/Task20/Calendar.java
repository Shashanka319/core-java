class Calendar {
    int year;
    Festival festival;
    Month month;

    Calendar(int year, Month month, Festival festival) {
        this.year = year;
        this.month = month;
        this.festival = festival;
    }

    void displayCalendarInfo() {
        System.out.println("Year: " + this.year);
        System.out.println("Month: " + this.month);
        
        if (festival != null) {
            System.out.println("Festival: " + festival.name);
            System.out.println("Significance: " + festival.Significance);
        } else {
            System.out.println("Festival: No major festival recorded for this date.");
        }
        System.out.println("---------------------------");
    }
}