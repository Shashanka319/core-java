class FortRunner{
    public static void main(String[] args) {

        Governor governor1 = new Governor("Chhatrapati Shivaji", "Maratha");
        Governor governor2 = new Governor("Raja Man Singh", "Kachwaha");

        Fort fort = new Fort("Raigad", governor1, FortStatus.RESTORING);
        Fort fort1 = new Fort("Amer Fort", governor2, FortStatus.MUSEUM);
        Fort fort2 = new Fort("Golconda", null, FortStatus.RUINED);

        fort.displayFortDetails();
        fort1.displayFortDetails();
        fort2.displayFortDetails();
    }
}