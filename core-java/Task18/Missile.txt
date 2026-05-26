class Missile {
    
    void launch() {
        System.out.println("Ignition sequence started. Missile launched!");
    }

    void trackTarget() {
        System.out.println("On-board sensors are tracking the designated target.");
    }

    void adjustTrajectory() {
        System.out.println("Fin actuators moving to adjust flight path.");
    }

    void armWarhead() {
        System.out.println("Safety locks released. Warhead is now ARMED.");
    }

    void engageBooster() {
        System.out.println("Second-stage booster engaged for high-speed travel.");
    }

    void activateStealth() {
        System.out.println("Radar-absorbent coating and heat shields activated.");
    }

    void performSelfCheck() {
        System.out.println("Internal diagnostic: All systems operational.");
    }

    void detonate() {
        System.out.println("Target reached. Detonation sequence initiated.");
    }

    void abortMission() {
        System.out.println("Mission aborted. Self-destructing in safe zone.");
    }

    void calculateFuel() {
        System.out.println("Monitoring remaining propellant levels.");
    }

    void sendTelemetry() {
        System.out.println("Transmitting real-time flight data to base.");
    }

    void deployDecoys() {
        System.out.println("Flares and chaff deployed to evade interception.");
    }

    void lockOn() {
        System.out.println("Target signature confirmed. Lock-on achieved.");
    }

    void enterTerminalPhase() {
        System.out.println("Entering high-velocity terminal descent.");
    }

    void notifyImpact() {
        System.out.println("Impact confirmed at coordinates.");
    }

   
    static void getClassification() {
        System.out.println("Static Info: Missiles are categorized as Ballistic or Cruise.");
    }

    static void checkGlobalTreaties() {
        System.out.println("Static Rule: Use must comply with international defense protocols.");
    }

    static void displayGuidanceTypes() {
        System.out.println("Static Info: Guidance includes GPS, Laser, and Infrared.");
    }

    static void calculateMachSpeed(double velocity) {
        System.out.println("Static Action: Converting velocity to Mach units.");
    }

    static void getStandardStorageTemp() {
        System.out.println("Static Rule: Maintain storage at 20°C to 25°C.");
    }
}

class MissileRunner {
    public static void main(String[] args) {
     
        Missile interceptor = new Missile();

        interceptor.performSelfCheck();
        interceptor.launch();
        interceptor.engageBooster();
        interceptor.trackTarget();
        interceptor.lockOn();
        interceptor.adjustTrajectory();
        interceptor.activateStealth();
        interceptor.sendTelemetry();
        interceptor.calculateFuel();
        interceptor.deployDecoys();
        interceptor.enterTerminalPhase();
        interceptor.armWarhead();
        interceptor.detonate();
        interceptor.notifyImpact();
        interceptor.abortMission();

        System.out.println("------------------------------------");
        Missile.getClassification();
        Missile.checkGlobalTreaties();
        Missile.displayGuidanceTypes();
        Missile.calculateMachSpeed(3500.0);
        Missile.getStandardStorageTemp();
    }
}