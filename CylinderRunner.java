class CylinderRunner {
    public static void main(String[] args) {
        String[] storage = new String[4];
        Cylinder myCylinder = new Cylinder(storage);

        myCylinder.saveCylinder("LPG");
        myCylinder.saveCylinder("Oxygen");
        myCylinder.saveCylinder("Nitrogen");
        myCylinder.saveCylinder("Helium");

        myCylinder.searchCylinder("Oxygen");

        myCylinder.update(0, "Propane");
        myCylinder.update("Nitrogen", "Argon");

        myCylinder.delete(3);
        myCylinder.delete("Oxygen");
    }
}