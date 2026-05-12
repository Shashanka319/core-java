public class CarpenterRunner {
    public static void main(String[] args) {
        String[] toolBox = {"Level", "Screwdriver", "Tape Measure"};

        Wood[] woodStock = new Wood[3];
        woodStock[0] = new Wood("Mahogany", 20);
        woodStock[1] = new Wood("Cedar", 15);
        woodStock[2] = new Wood("Maple", 10);

        Carpenter worker = new Carpenter(toolBox, woodStock);
        worker.displayInventory();
    }
}