class Napkin {
    String color;
    Manufacturer manufacturer;
    MaterialType material;

    Napkin(String color, Manufacturer manufacturer, MaterialType material) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.material = material;
    }

    void displayNapkinDetails() {
        System.out.println("Napkin Color: " + this.color);
        System.out.println("Material: " + this.material);
        
        if (manufacturer != null) {
            System.out.println("Brand: " + manufacturer.brandName);
            System.out.println("Origin: " + manufacturer.country);
        } else {
            System.out.println("Manufacturer: Generic ");
        }
  
}