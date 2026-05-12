class WalnutRunner {
    public static void main(String[] args) {

        Supplier supplier = new Supplier("Kashmir Organics", "Jammu & Kashmir");
        Supplier supplier1 = new Supplier("California Nut Corp", "USA");

        Walnut walnut = new Walnut(500, supplier, WalnutGrade.EXTRALIGHT);
        Walnut walnut1 = new Walnut(1000, supplier1, WalnutGrade.AMBER);
        Walnut walnut2 = new Walnut(250, null, WalnutGrade.PIECES);

        walnut.displayWalnutDetails();
        walnut1.displayWalnutDetails();
        walnut2.displayWalnutDetails();
    }
}