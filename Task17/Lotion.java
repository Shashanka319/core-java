class Lotion {
    int id;
    String brand;
    String productName;
    String skinType;
    String primaryIngredient;
    double volumeMl;
    double price;
    boolean isScented;
    boolean isHypoallergenic;
    String fragranceNotes;
    String color;
    float phLevel;
    int shelfLifeMonths;
    String targetBenefit;
    boolean containsSPF;
    int spfValue;
    double averageRating;
    String containerType;
    String countryOfOrigin;
    int stockQuantity;

    Lotion(int id, String brand, String productName, String skinType, String primaryIngredient, 
           double volumeMl, double price, boolean isScented, boolean isHypoallergenic, 
           String fragranceNotes, String color, float phLevel, int shelfLifeMonths, 
           String targetBenefit, boolean containsSPF, int spfValue, double averageRating, 
           String containerType, String countryOfOrigin, int stockQuantity) {
        
        this.id = id;
        this.brand = brand;
        this.productName = productName;
        this.skinType = skinType;
        this.primaryIngredient = primaryIngredient;
        this.volumeMl = volumeMl;
        this.price = price;
        this.isScented = isScented;
        this.isHypoallergenic = isHypoallergenic;
        this.fragranceNotes = fragranceNotes;
        this.color = color;
        this.phLevel = phLevel;
        this.shelfLifeMonths = shelfLifeMonths;
        this.targetBenefit = targetBenefit;
        this.containsSPF = containsSPF;
        this.spfValue = spfValue;
        this.averageRating = averageRating;
        this.containerType = containerType;
        this.countryOfOrigin = countryOfOrigin;
        this.stockQuantity = stockQuantity;
    }

    void display() {
        System.out.println("Lotion ID: " + this.id);
        System.out.println("Brand: " + this.brand);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Skin Type: " + this.skinType);
        System.out.println("Primary Ingredient: " + this.primaryIngredient);
        System.out.println("Volume: " + this.volumeMl );
        System.out.println("Price: $" + this.price);
        System.out.println("Is Scented: " + this.isScented);
        System.out.println("Is Hypoallergenic: " + this.isHypoallergenic);
        System.out.println("Fragrance Notes: " + this.fragranceNotes);
        System.out.println("Color: " + this.color);
        System.out.println("pH Level: " + this.phLevel);
        System.out.println("Shelf Life: " + this.shelfLifeMonths);
        System.out.println("Target Benefit: " + this.targetBenefit);
        System.out.println("Contains SPF: " + this.containsSPF);
        System.out.println("SPF Value: " + this.spfValue);
        System.out.println("Average Rating: " + this.averageRating);
        System.out.println("Container Type: " + this.containerType);
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Stock Quantity: " + this.stockQuantity);
        
    }
}