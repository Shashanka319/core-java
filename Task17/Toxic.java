class Toxic{
    String name;
    String chemicalFormula;
    double toxicityLevel;     
    String stateOfMatter;      
    int hazardCode;            
    boolean isFlammable;
    boolean isRadioactive;
    float boilingPoint;        
    float meltingPoint;        
    String primaryExposure;    
    String antidote;
    int shelfLifeYears;
    double density;           
    String color;
    String odor;
    boolean requiresPermit;
    String manufacturer;
    String regulatoryBody;     
    long globalProductionTons;
    double phValue;

    
    Toxic(String name, String chemicalFormula, double toxicityLevel, String stateOfMatter, int hazardCode, 
          boolean isFlammable, boolean isRadioactive, float boilingPoint, float meltingPoint, 
          String primaryExposure, String antidote, int shelfLifeYears, double density, String color, 
          String odor, boolean requiresPermit, String manufacturer, String regulatoryBody, 
          long globalProductionTons, double phValue) {
        
        this.name = name;
        this.chemicalFormula = chemicalFormula;
        this.toxicityLevel = toxicityLevel;
        this.stateOfMatter = stateOfMatter;
        this.hazardCode = hazardCode;
        this.isFlammable = isFlammable;
        this.isRadioactive = isRadioactive;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.primaryExposure = primaryExposure;
        this.antidote = antidote;
        this.shelfLifeYears = shelfLifeYears;
        this.density = density;
        this.color = color;
        this.odor = odor;
        this.requiresPermit = requiresPermit;
        this.manufacturer = manufacturer;
        this.regulatoryBody = regulatoryBody;
        this.globalProductionTons = globalProductionTons;
        this.phValue = phValue;
    }

    void display() {
        System.out.println("Acess thwe instances variables...");
        System.out.println("Name: " + this.name );
		System.out.println("CHemical Foermula: " + this.chemicalFormula );
        System.out.println("Toxicity (LD50): " + this.toxicityLevel );
        System.out.println("State: " + this.stateOfMatter);
		System.out.println("hazardCode: " + this.hazardCode );
        System.out.println("Flammable: " + this.isFlammable);
		System.out.println("isRadioactive: " + this.isRadioactive );
        System.out.println("Boiling Pt: " + this.boilingPoint );
		System.out.println("meltingPoint: " + this.meltingPoint );
        System.out.println("Exposure Route: " + this.primaryExposure);
        System.out.println("Antidote: " + this.antidote);
        System.out.println("Shelf Life: " + this.shelfLifeYears);
        System.out.println("Density: " + this.density );
        System.out.println("Appearance: " + this.color);
		System.out.println("odor: " + this.odor );
        System.out.println("Permit Required: " + this.requiresPermit);
        System.out.println("Produced By: " + this.manufacturer);
		System.out.println("regulatoryBody: " + this.regulatoryBody );
        System.out.println("Global Vol: " + this.globalProductionTons );
		System.out.println("phValue: " + this.phValue );
       
    }
}