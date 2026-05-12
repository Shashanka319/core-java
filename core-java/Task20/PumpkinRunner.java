class PumpkinRunner {
    public static void main(String[] args) {

        Farmer farmer1 = new Farmer("Ramesh", "Karnataka");
        Farmer farmer2 = new Farmer("Suresh", "Punjab");

        Pumpkin pumpkin = new Pumpkin(15.5, farmer1, PumpkinType.JACKOLANTERN);
        Pumpkin pumpkin1 = new Pumpkin(450.0, farmer2, PumpkinType.GIANT);
        Pumpkin pumpkin2 = new Pumpkin(2.3, null, PumpkinType.PIEPUMPKIN);

        pumpkin.displayPumpkinInfo();
        pumpkin1.displayPumpkinInfo();
        pumpkin2.displayPumpkinInfo();
    }
}