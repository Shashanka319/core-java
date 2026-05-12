class Organ {
    int id;
    String name;
    String system;           
    double averageWeight;    
    String primaryFunction;
    boolean isVital;         
    String tissueType;       
    float oxygenConsumption; 
    boolean canRegenerate;
    String location;         
    double bloodFlowRate;    
    int cellTypeCount;
    boolean isTransplantable;
    String sensoryInput;     
    double phLevel;
    int nerveSupplyCount;
    String hormoneProduced;  
    boolean isHollow;
    float surfaceArea;       
    String developmentalOrigin; 

    Organ(int id, String name, String system, double averageWeight, String primaryFunction, 
          boolean isVital, String tissueType, float oxygenConsumption, boolean canRegenerate, 
          String location, double bloodFlowRate, int cellTypeCount, boolean isTransplantable, 
          String sensoryInput, double phLevel, int nerveSupplyCount, String hormoneProduced, 
          boolean isHollow, float surfaceArea, String developmentalOrigin) {
        
        this.id = id;
        this.name = name;
        this.system = system;
        this.averageWeight = averageWeight;
        this.primaryFunction = primaryFunction;
        this.isVital = isVital;
        this.tissueType = tissueType;
        this.oxygenConsumption = oxygenConsumption;
        this.canRegenerate = canRegenerate;
        this.location = location;
        this.bloodFlowRate = bloodFlowRate;
        this.cellTypeCount = cellTypeCount;
        this.isTransplantable = isTransplantable;
        this.sensoryInput = sensoryInput;
        this.phLevel = phLevel;
        this.nerveSupplyCount = nerveSupplyCount;
        this.hormoneProduced = hormoneProduced;
        this.isHollow = isHollow;
        this.surfaceArea = surfaceArea;
        this.developmentalOrigin = developmentalOrigin;
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("System: " + this.system);
        System.out.println("Weight: " + this.averageWeight);
        System.out.println("Function: " + this.primaryFunction);
        System.out.println("Vital: " + this.isVital);
        System.out.println("Tissue: " + this.tissueType);
        System.out.println("Oxygen: " + this.oxygenConsumption );
        System.out.println("Regenerate: " + this.canRegenerate);
        System.out.println("Location: " + this.location);
        System.out.println("Blood Flow: " + this.bloodFlowRate );
        System.out.println("Cell Types: " + this.cellTypeCount);
        System.out.println("Transplantable: " + this.isTransplantable);
        System.out.println("Sensory: " + this.sensoryInput);
        System.out.println("pH: " + this.phLevel);
        System.out.println("Nerves: " + this.nerveSupplyCount);
        System.out.println("Hormone: " + this.hormoneProduced);
        System.out.println("Hollow: " + this.isHollow);
        System.out.println("Surface Area: " + this.surfaceArea );
        System.out.println("Origin: " + this.developmentalOrigin);
        
    }
}