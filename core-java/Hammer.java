class Hammer {
    int[] forceRatings;
    HammerType[] availableModels;

    Hammer(int[] forceRatings, HammerType[] availableModels) {
        this.forceRatings = forceRatings;
        this.availableModels = availableModels;
    }

    void displayHammerInventory() {
        System.out.println("Force Ratings (in Newtons):");
        if (forceRatings != null) {
            for (int force : forceRatings) {
                System.out.println("Hammer Rating: " + force + " N");
            }
        }

        System.out.println("\nAvailable Hammer Models:");
        if (availableModels != null) {
            for (HammerType type : availableModels) {
                if (type != null) {
                    System.out.println("Hamer Category: " + type.category + " | Material: " + type.headMaterial);
                }
            }
        }
    }
}