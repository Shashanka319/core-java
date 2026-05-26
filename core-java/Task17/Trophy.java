class Trophy {
    // 20 Instance Variables
    int trophyId;
    String name;
    String eventName;
    String material;        
    double weight;          
    float height;           
    int yearEstablished;
    String currentHolder;
    String countryOfOrigin;
    double marketValue;
    boolean isPerpetual;    
    String category;       
    int editionNumber;      
    String engravingText;
    boolean isHandmade;
    String designerName;
    int goldPurityKarat;    
    String storageLocation;  
    long globalFanReach;    
    String ribbonColor;

    
    Trophy(int trophyId, String name, String eventName, String material, double weight, 
           float height, int yearEstablished, String currentHolder, String countryOfOrigin, 
           double marketValue, boolean isPerpetual, String category, int editionNumber, 
           String engravingText, boolean isHandmade, String designerName, int goldPurityKarat, 
           String storageLocation, long globalFanReach, String ribbonColor) {
        
        this.trophyId = trophyId;
        this.name = name;
        this.eventName = eventName;
        this.material = material;
        this.weight = weight;
        this.height = height;
        this.yearEstablished = yearEstablished;
        this.currentHolder = currentHolder;
        this.countryOfOrigin = countryOfOrigin;
        this.marketValue = marketValue;
        this.isPerpetual = isPerpetual;
        this.category = category;
        this.editionNumber = editionNumber;
        this.engravingText = engravingText;
        this.isHandmade = isHandmade;
        this.designerName = designerName;
        this.goldPurityKarat = goldPurityKarat;
        this.storageLocation = storageLocation;
        this.globalFanReach = globalFanReach;
        this.ribbonColor = ribbonColor;
    }

    void displayDetails() {
		 System.out.println("trophyId: " + trophyId);
        System.out.println("Trophy: " + name);
        System.out.println("Event: " + eventName );
        System.out.println("Material: " + material );
		System.out.println("weight: " + weight);
        System.out.println("Dimensions: Height " + height);
		System.out.println("yearEstablished: " + yearEstablished);
		System.out.println("currentHolder: " + currentHolder);
		System.out.println("countryOfOrigin: " + countryOfOrigin);
	    System.out.println("marketValue: " + marketValue);
		System.out.println("isPerpetual: " + isPerpetual);
		System.out.println("category: " + category);
		System.out.println("editionNumber: " + editionNumber);
	    System.out.println("engravingText: " + engravingText);
		System.out.println("isHandmade: " + isHandmade);
		System.out.println("designerName: " + designerName);
		System.out.println("goldPurityKarat: " + goldPurityKarat);
		System.out.println("storageLocation: " + storageLocation);
		System.out.println("globalFanReach: " + globalFanReach);
		System.out.println("ribbonColor: " + ribbonColor);
		
	}
}
       