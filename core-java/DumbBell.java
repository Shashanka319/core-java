class DumbBell {
    int id;
    double weight;
    String weightUnit;
    String material;
    String shape;
    String handleType;
    double handleDiameter;
    boolean isAdjustable;
    String brand;
    String color;
    float length;
    boolean isSoldAsPair;
    double price;
    String coating;
    int warrantyMonths;
    String manufacturingDate;
    double userRating;
    int stockQuantity;
    String category;
    boolean rustResistant;

    DumbBell(int id, double weight, String weightUnit, String material, String shape, 
             String handleType, double handleDiameter, boolean isAdjustable, String brand, 
             String color, float length, boolean isSoldAsPair, double price, String coating, 
             int warrantyMonths, String manufacturingDate, double userRating, 
             int stockQuantity, String category, boolean rustResistant) {
        
        this.id = id;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.material = material;
        this.shape = shape;
        this.handleType = handleType;
        this.handleDiameter = handleDiameter;
        this.isAdjustable = isAdjustable;
        this.brand = brand;
        this.color = color;
        this.length = length;
        this.isSoldAsPair = isSoldAsPair;
        this.price = price;
        this.coating = coating;
        this.warrantyMonths = warrantyMonths;
        this.manufacturingDate = manufacturingDate;
        this.userRating = userRating;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.rustResistant = rustResistant;
    }
	void display() {
        System.out.println("Id: " + this.id);
        System.out.println("Weight: " + this.weight + " " + this.weightUnit);
        System.out.println("Material: " + this.material);
        System.out.println("Shape: " + this.shape);
        System.out.println("Handle: " + this.handleType);
        System.out.println("Diameter: " + this.handleDiameter + "mm");
        System.out.println("Adjustable: " + this.isAdjustable);
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Length: " + this.length + "cm");
        System.out.println("Pair: " + this.isSoldAsPair);
        System.out.println("Price: $" + this.price);
        System.out.println("Coating: " + this.coating);
        System.out.println("Warranty: " + this.warrantyMonths + " months");
        System.out.println("Date: " + this.manufacturingDate);
        System.out.println("Rating: " + this.userRating);
        System.out.println("Stock: " + this.stockQuantity);
        System.out.println("Category: " + this.category);
        System.out.println("Rust Resistant: " + this.rustResistant);
    }
}