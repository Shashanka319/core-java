class Google {
    int id;
    String productName;
    String category;             
    String primaryLanguage;      
    double monthlyActiveUsers;   
    double annualRevenue;        
    boolean isOpenSource;
    boolean requiresSubscription;
    String releaseDate;
    String headOfProduct;
    float userRating;            
    int employeeCount;           
    String primaryPlatform;      
    boolean aiIntegrated;        
    String dataStorageType;      
    int securityPatchLevel;
    double energyEfficiencyScore;
    String targetAudience;       
    boolean isAvailableOffline;
    String coreTechnology;       

    Google(int id, String productName, String category, String primaryLanguage, 
           double monthlyActiveUsers, double annualRevenue, boolean isOpenSource, 
           boolean requiresSubscription, String releaseDate, String headOfProduct, 
           float userRating, int employeeCount, String primaryPlatform, 
           boolean aiIntegrated, String dataStorageType, int securityPatchLevel, 
           double energyEfficiencyScore, String targetAudience, 
           boolean isAvailableOffline, String coreTechnology) {
        
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.primaryLanguage = primaryLanguage;
        this.monthlyActiveUsers = monthlyActiveUsers;
        this.annualRevenue = annualRevenue;
        this.isOpenSource = isOpenSource;
        this.requiresSubscription = requiresSubscription;
        this.releaseDate = releaseDate;
        this.headOfProduct = headOfProduct;
        this.userRating = userRating;
        this.employeeCount = employeeCount;
        this.primaryPlatform = primaryPlatform;
        this.aiIntegrated = aiIntegrated;
        this.dataStorageType = dataStorageType;
        this.securityPatchLevel = securityPatchLevel;
        this.energyEfficiencyScore = energyEfficiencyScore;
        this.targetAudience = targetAudience;
        this.isAvailableOffline = isAvailableOffline;
        this.coreTechnology = coreTechnology;
    }

    void display() {
        System.out.println("Google Product ID: " + this.id);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Category: " + this.category);
        System.out.println("Language: " + this.primaryLanguage);
        System.out.println("Users: " + this.monthlyActiveUsers );
        System.out.println("Revenue: $" + this.annualRevenue );
        System.out.println("Open Source: " + this.isOpenSource);
        System.out.println("Subscription: " + this.requiresSubscription);
        System.out.println("Release Date: " + this.releaseDate);
        System.out.println("Head: " + this.headOfProduct);
        System.out.println("Rating: " + this.userRating  );
        System.out.println("Employees: " + this.employeeCount);
        System.out.println("Platform: " + this.primaryPlatform);
        System.out.println("AI Integrated: " + this.aiIntegrated);
        System.out.println("Storage: " + this.dataStorageType);
        System.out.println("Security Level: " + this.securityPatchLevel);
        System.out.println("Energy Score: " + this.energyEfficiencyScore);
        System.out.println("Target: " + this.targetAudience);
        System.out.println("Offline: " + this.isAvailableOffline);
        System.out.println("Core Tech: " + this.coreTechnology);
        
    }
}