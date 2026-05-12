class NapkinRunner {
    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("SoftTouch", "India");
        Manufacturer manufacturer1 = new Manufacturer("RoyalLinens", "France");

        Napkin napkin = new Napkin("White", manufacturer, MaterialType.PAPER);
        Napkin napkin1 = new Napkin("Crimson", manufacturer1, MaterialType.SILK);
        Napkin napkin2 = new Napkin("Beige", null, MaterialType.COTTON);

        napkin.displayNapkinDetails();
        napkin1.displayNapkinDetails();
        napkin2.displayNapkinDetails();
    }
}