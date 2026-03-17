class SteelRunner {
    public static void main(String[] args) {
        String[] steelArray = new String[10];
        Steel steel = new Steel(steelArray);

        steel.saveSteelType("Carbon Steel");
        steel.saveSteelType("Alloy Steel");
        steel.saveSteelType("Stainless Steel");
        steel.saveSteelType("Tool Steel");
        steel.saveSteelType("Mild Steel");
        steel.saveSteelType("High-Speed Steel");
        steel.saveSteelType("Galvanized Steel");
        steel.saveSteelType("Cobalt Steel");
        steel.saveSteelType("Damascus Steel");
        steel.saveSteelType("Structural Steel");

        
        steel.searchSteelType("Stainless Steel");
        
        steel.searchSteelType("Iron");
    }
}