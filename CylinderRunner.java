class CylinderRunner {
    public static void main(String[] values) {
        String[] cylinderNames = new String[10];
        Cylinder cylinder = new Cylinder(cylinderNames);
        
        cylinder.saveCylinderName("Indane");
        cylinder.saveCylinderName("HP");
        cylinder.saveCylinderName("Super Gas");
        cylinder.saveCylinderName("Reliance");
        cylinder.saveCylinderName("GoGas");
        cylinder.saveCylinderName("BharathGas");
        cylinder.saveCylinderName("Total Gas");
        cylinder.saveCylinderName("Agis Gas");
        cylinder.saveCylinderName("Mahanagar Gas");
        cylinder.saveCylinderName("Adani Gas");
		
		cylinder.searchCylindername("HP");
    }
}