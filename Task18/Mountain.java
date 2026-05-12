class Mountain {
    void measureHeight() {
        System.out.println("Calculating the current altitude of this peak.");
    }

    void triggerAvalanche() {
        System.out.println("A snow slide has been triggered on the north slope.");
    }

    void displayEcosystem() {
        System.out.println("Showing flora and fauna specific to this altitude.");
    }

    void startErosion() {
        System.out.println("Natural forces are slowly wearing down the rock face.");
    }

    void permitClimb() {
        System.out.println("Climbing permit has been issued for this mountain.");
    }

    void trackWeather() {
        System.out.println("Monitoring localized wind speeds and temperature.");
    }

    void recordSummit() {
        System.out.println("A new climber has reached the top!");
    }

    void meltSnow() {
        System.out.println("Spring warmth is turning snow into mountain streams.");
    }

    void growForest() {
        System.out.println("Pine trees are growing at the base of the mountain.");
    }

    void hideInClouds() {
        System.out.println("The peak is currently obscured by heavy cloud cover.");
    }

    void reflectSunlight() {
        System.out.println("The snow-capped peak is glowing during sunset.");
    }

    void blockWind() {
        System.out.println("The mountain is creating a rain shadow effect.");
    }

    void supportSkiResort() {
        System.out.println("Ski trails are open on the eastern side.");
    }

    void volcanicEruption() {
        System.out.println("If this is a volcano, it is now showing activity.");
    }

    void collapse() {
        System.out.println("A landslide has occurred on the steep cliff.");
    }

    static void getFormationProcess() {
        System.out.println("Static Fact: Mountains are formed by tectonic plate collisions.");
    }

    static void listMountainRanges() {
        System.out.println("Static Info: Major ranges include the Himalayas, Andes, and Alps.");
    }

    static void defineTreeLine() {
        System.out.println("Static Rule: The tree line is the edge of the habitat where trees can grow.");
    }

    static void calculateAtmosphericPressure() {
        System.out.println("Static Action: Calculating pressure drop based on standard altitude formulas.");
    }

    static void getOldestMountainRange() {
        System.out.println("Static Info: The Aravalli Range is one of the oldest in the world.");
    }
}

class MountainRunner {
    public static void main(String[] args) {
        
        Mountain everest = new Mountain();

 
        everest.measureHeight();
        everest.triggerAvalanche();
        everest.displayEcosystem();
        everest.startErosion();
        everest.permitClimb();
        everest.trackWeather();
        everest.recordSummit();
        everest.meltSnow();
        everest.growForest();
        everest.hideInClouds();
        everest.reflectSunlight();
        everest.blockWind();
        everest.supportSkiResort();
        everest.volcanicEruption();
        everest.collapse();

        System.out.println("------------------------------------");

        Mountain.getFormationProcess();
        Mountain.listMountainRanges();
        Mountain.defineTreeLine();
        Mountain.calculateAtmosphericPressure();
        Mountain.getOldestMountainRange();
    }
}