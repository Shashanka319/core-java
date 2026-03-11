class HammerRunner {
    public static void main(String[] args) {
        int[] ratings = {500, 800, 1200};

        HammerType[] models = new HammerType[3];
        models[0] = new HammerType("Claw Hammer", "Steel");
        models[1] = new HammerType("Sledgehammer", "Iron");
        models[2] = new HammerType("Mallet", "Rubber");

        Hammer myHammer = new Hammer(ratings, models);
        myHammer.displayHammerInventory();
    }
}