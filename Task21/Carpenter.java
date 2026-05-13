class Carpenter {
    String[] tools;
    Wood[] materials;

    Carpenter(String[] tools, Wood[] materials) {
        this.tools = tools;
        this.materials = materials;
    }

    void displayInventory() {
        System.out.println("Workshop Tools:");
        if (tools != null) {
            for (String tool : tools) {
                if (tool != null) {
                    System.out.println("Tools: " + tool);
                }
            }
        }

        System.out.println("\nWood Materials:");
        if (materials != null) {
            for (Wood woodMaterials : materials) {
                if (woodMaterials != null) {
                    System.out.println(" Wood Type: " + woodMaterials.type + ", Thickness: " + woodMaterials.thickness + "mm");
                }
            }
        }
    }
}