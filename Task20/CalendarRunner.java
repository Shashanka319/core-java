class CalendarRunner {
    public static void main(String[] args) {

        Festival festival1 = new Festival("Deepavali", "Festival of Lights");
        Festival festival2= new Festival("Ugadi", "Kannada New Year");

        Calendar calender1 = new Calendar(2026, Month.OCTOBER,festival);
        Calendar calender2= new Calendar(2026, Month.MARCH, festival);
        Calendar calender3 = new Calendar(2026, Month.JUNE, null);

        calender1.displayCalendarInfo();
		calender2.displayCalendarInfo();
        calender3.displayCalendarInfo();
    }
}