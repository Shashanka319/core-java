class Cell {
    int id;
    String name;
    String type;                 
    String organism;             
    double diameterMicrometers;
    long organelleCount;
    boolean hasNucleus;
    boolean hasCellWall;
    String primaryEnergySource;  
    double lifespanDays;
    String reproductionMethod;   
    float waterContentPercentage;
    int chromosomeCount;
    String membraneType;         
    boolean isMotile;            
    double metabolicRate;        
    String storageForm;          
    String cytoskeletonType;     
    boolean canPhotosynthesize;
    String discoveryYear;

    Cell(int id, String name, String type, String organism, double diameterMicrometers, 
         long organelleCount, boolean hasNucleus, boolean hasCellWall, String primaryEnergySource, 
         double lifespanDays, String reproductionMethod, float waterContentPercentage, 
         int chromosomeCount, String membraneType, boolean isMotile, double metabolicRate, 
         String storageForm, String cytoskeletonType, boolean canPhotosynthesize, String discoveryYear) {
        
        this.id = id;
        this.name = name;
        this.type = type;
        this.organism = organism;
        this.diameterMicrometers = diameterMicrometers;
        this.organelleCount = organelleCount;
        this.hasNucleus = hasNucleus;
        this.hasCellWall = hasCellWall;
        this.primaryEnergySource = primaryEnergySource;
        this.lifespanDays = lifespanDays;
        this.reproductionMethod = reproductionMethod;
        this.waterContentPercentage = waterContentPercentage;
        this.chromosomeCount = chromosomeCount;
        this.membraneType = membraneType;
        this.isMotile = isMotile;
        this.metabolicRate = metabolicRate;
        this.storageForm = storageForm;
        this.cytoskeletonType = cytoskeletonType;
        this.canPhotosynthesize = canPhotosynthesize;
        this.discoveryYear = discoveryYear;
    }

    void display() {
        System.out.println("Cell ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Organism: " + this.organism);
        System.out.println("Diameter: " + this.diameterMicrometers );
        System.out.println("Organelles: " + this.organelleCount);
        System.out.println("Nucleus: " + this.hasNucleus);
        System.out.println("Cell Wall: " + this.hasCellWall);
        System.out.println("Energy: " + this.primaryEnergySource);
        System.out.println("Lifespan: " + this.lifespanDays + " days");
        System.out.println("Reproduction: " + this.reproductionMethod);
        System.out.println("Water Content: " + this.waterContentPercentage );
        System.out.println("Chromosomes: " + this.chromosomeCount);
        System.out.println("Membrane: " + this.membraneType);
        System.out.println("Motile: " + this.isMotile);
        System.out.println("Metabolic Rate: " + this.metabolicRate);
        System.out.println("Storage: " + this.storageForm);
        System.out.println("Cytoskeleton: " + this.cytoskeletonType);
        System.out.println("Photosynthesis: " + this.canPhotosynthesize);
        System.out.println("Discovery Year: " + this.discoveryYear);
        
    }
}