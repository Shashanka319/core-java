class Brain {
    int brainId;
    String species;
    double weight;                  
    long neuronCount;
    int lobeCount;
    double glucoseConsumptionRate;  
    boolean isConscious;
    String primaryFunction;
    float grayMatterPercentage;
    float whiteMatterPercentage;
    int averageIQSymmetry;
    boolean neuroplasticityEnabled;
    String dominantHemisphere;      
    double oxygenRequirement;       
    int cranialVolume;              
    String memoryCapacityType;      
    double processingSpeed;         
    boolean sleepRequirementMet;
    String neurotransmitterFocus;   
    String developmentalStage;      

    Brain(int brainId, String species, double weight, long neuronCount, int lobeCount, 
          double glucoseConsumptionRate, boolean isConscious, String primaryFunction, 
          float grayMatterPercentage, float whiteMatterPercentage, int averageIQSymmetry, 
          boolean neuroplasticityEnabled, String dominantHemisphere, double oxygenRequirement, 
          int cranialVolume, String memoryCapacityType, double processingSpeed, 
          boolean sleepRequirementMet, String neurotransmitterFocus, String developmentalStage) {
        
        this.brainId = brainId;
        this.species = species;
        this.weight = weight;
        this.neuronCount = neuronCount;
        this.lobeCount = lobeCount;
        this.glucoseConsumptionRate = glucoseConsumptionRate;
        this.isConscious = isConscious;
        this.primaryFunction = primaryFunction;
        this.grayMatterPercentage = grayMatterPercentage;
        this.whiteMatterPercentage = whiteMatterPercentage;
        this.averageIQSymmetry = averageIQSymmetry;
        this.neuroplasticityEnabled = neuroplasticityEnabled;
        this.dominantHemisphere = dominantHemisphere;
        this.oxygenRequirement = oxygenRequirement;
        this.cranialVolume = cranialVolume;
        this.memoryCapacityType = memoryCapacityType;
        this.processingSpeed = processingSpeed;
        this.sleepRequirementMet = sleepRequirementMet;
        this.neurotransmitterFocus = neurotransmitterFocus;
        this.developmentalStage = developmentalStage;
    }

    void display() {
        System.out.println("Brain ID: " + this.brainId);
        System.out.println("Species: " + this.species);
        System.out.println("Weight: " + this.weight);
        System.out.println("Neurons: " + this.neuronCount);
        System.out.println("Lobe Count: " + this.lobeCount);
        System.out.println("Glucose Rate: " + this.glucoseConsumptionRate);
        System.out.println("Conscious: " + this.isConscious);
        System.out.println("Function: " + this.primaryFunction);
        System.out.println("Gray Matter: " + this.grayMatterPercentage );
        System.out.println("White Matter: " + this.whiteMatterPercentage);
        System.out.println("IQ Symmetry: " + this.averageIQSymmetry);
        System.out.println("Neuroplasticity: " + this.neuroplasticityEnabled);
        System.out.println("Dominant Side: " + this.dominantHemisphere);
        System.out.println("Oxygen Req: " + this.oxygenRequirement);
        System.out.println("Volume: " + this.cranialVolume);
        System.out.println("Memory: " + this.memoryCapacityType);
        System.out.println("Speed: " + this.processingSpeed);
        System.out.println("Sleep Met: " + this.sleepRequirementMet);
        System.out.println("Neurotransmitter: " + this.neurotransmitterFocus);
        System.out.println("Stage: " + this.developmentalStage);

    }
}