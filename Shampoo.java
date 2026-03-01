class Shampoo {
    int id;
    String brand;
    String productName;
    String hairType;          
    String primaryIngredient; 
    double volumeMl;
    double price;
    boolean isSulfateFree;
    boolean isCrueltyFree;
    String fragrance;
    String color;
    float phLevel;
    int shelfLifeMonths;
    String targetConcern;     
    boolean isOrganic;
    String containerType;     
    double averageRating;
    int manufactureYear;
    String countryOfOrigin;
    int stockQuantity;

    Shampoo(int id, String brand, String productName, String hairType, String primaryIngredient, 
            double volumeMl, double price, boolean isSulfateFree, boolean isCrueltyFree, 
            String fragrance, String color, float phLevel, int shelfLifeMonths, 
            String targetConcern, boolean isOrganic, String containerType, 
            double averageRating, int manufactureYear, String countryOfOrigin, int stockQuantity) {
        
        this.id = id;
        this.brand = brand;
        this.productName = productName;
        this.hairType = hairType;
        this.primaryIngredient = primaryIngredient;
        this.volumeMl = volumeMl;
        this.price = price;
        this.isSulfateFree = isSulfateFree;
        this.isCrueltyFree = isCrueltyFree;
        this.fragrance = fragrance;
        this.color = color;
        this.phLevel = phLevel;
        this.shelfLifeMonths = shelfLifeMonths;
        this.targetConcern = targetConcern;
        this.isOrganic = isOrganic;
        this.containerType = containerType;
        this.averageRating = averageRating;
        this.manufactureYear = manufactureYear;
        this.countryOfOrigin = countryOfOrigin;
        this.stockQuantity = stockQuantity;
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Product: " + this.brand );
        System.out.println("Hair Type: " + this.hairType);
        System.out.println("Ingredient: " + this.primaryIngredient);
        System.out.println("Volume: " + this.volumeMl);
        System.out.println("Price: $" + this.price);
        System.out.println("Sulfate-Free: " + this.isSulfateFree);
        System.out.println("Cruelty-Free: " + this.isCrueltyFree);
        System.out.println("Fragrance: " + this.fragrance);
        System.out.println("Color: " + this.color);
        System.out.println("pH Level: " + this.phLevel);
        System.out.println("Shelf Life: " + this.shelfLifeMonths );
        System.out.println("Target: " + this.targetConcern);
        System.out.println("Organic: " + this.isOrganic);
        System.out.println("Container: " + this.containerType);
        System.out.println("Rating: " + this.averageRating );
        System.out.println("Manufacture Year: " + this.manufactureYear);
        System.out.println("Origin: " + this.countryOfOrigin);
        System.out.println("Stock: " + this.stockQuantity);
    }
}