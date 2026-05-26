class Organizer {
    int id;
    String brand;
    String modelName;
    String type;                
    String category;             
    int maxTaskCapacity;
    double price;
    boolean isCloudSynced;
    boolean hasReminders;
    String storageFormat;      
    String primaryColor;
    float weightGrams;
    int batteryLifeDays;         
    String securityType;         
    boolean isWaterproof;
    String paperQuality;         
    double userRating;
    int pagesCount;              
    String languageSupport;     
    int warrantyMonths;

    Organizer(int id, String brand, String modelName, String type, String category, 
              int maxTaskCapacity, double price, boolean isCloudSynced, boolean hasReminders, 
              String storageFormat, String primaryColor, float weightGrams, int batteryLifeDays, 
              String securityType, boolean isWaterproof, String paperQuality, double userRating, 
              int pagesCount, String languageSupport, int warrantyMonths) {
        
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.type = type;
        this.category = category;
        this.maxTaskCapacity = maxTaskCapacity;
        this.price = price;
        this.isCloudSynced = isCloudSynced;
        this.hasReminders = hasReminders;
        this.storageFormat = storageFormat;
        this.primaryColor = primaryColor;
        this.weightGrams = weightGrams;
        this.batteryLifeDays = batteryLifeDays;
        this.securityType = securityType;
        this.isWaterproof = isWaterproof;
        this.paperQuality = paperQuality;
        this.userRating = userRating;
        this.pagesCount = pagesCount;
        this.languageSupport = languageSupport;
        this.warrantyMonths = warrantyMonths;
    }

    void display() {
        System.out.println("Organizer ID: " + this.id);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model Name: " + this.modelName);
        System.out.println("Type: " + this.type);
        System.out.println("Category: " + this.category);
        System.out.println("Max Task Capacity: " + this.maxTaskCapacity);
        System.out.println("Price: $" + this.price);
        System.out.println("Cloud Synced: " + this.isCloudSynced);
        System.out.println("Has Reminders: " + this.hasReminders);
        System.out.println("Storage Format: " + this.storageFormat);
        System.out.println("Primary Color: " + this.primaryColor);
        System.out.println("Weight: " + this.weightGrams + "g");
        System.out.println("Battery Life: " + this.batteryLifeDays);
        System.out.println("Security Type: " + this.securityType);
        System.out.println("Waterproof: " + this.isWaterproof);
        System.out.println("Quality: " + this.paperQuality);
        System.out.println("User Rating: " + this.userRating );
        System.out.println("Pages Count: " + this.pagesCount);
        System.out.println("Language Support: " + this.languageSupport);
        System.out.println("Warranty: " + this.warrantyMonths );
        
    }
}