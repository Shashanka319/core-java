class Tower {
    int[] floorCounts;
    TowerType[] variants;

    Tower(int[] floorCounts, TowerType[] variants) {
        this.floorCounts = floorCounts;
        this.variants = variants;
    }

    void displayTowerSpecs() {
        System.out.println("Available Floor Counts:");
        if (floorCounts != null) {
            for (int floors : floorCounts) {
                System.out.println("Tower :" + floors + " Floors");
            }
        }

        System.out.println("\nTower Classifications:");
        if (variants != null) {
            for (TowerType type : variants) {
                if (type != null) {
                    System.out.println("Tower  Purpose: " + type.purpose + " | Location: " + type.location);
                }
            }
        }
    }
}