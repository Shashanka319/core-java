class Bridge {
    
    void open() {
        System.out.println("The drawbridge is opening for a ship.");
    }

    void close() {
        System.out.println("The bridge is closed for maintenance.");
    }

    void allowTraffic() {
        System.out.println("Vehicles are now crossing the bridge.");
    }

    void collectToll() {
        System.out.println("Toll fee has been collected from the driver.");
    }

    void monitorVibration() {
        System.out.println("Sensors are checking bridge stability.");
    }

    void illuminate() {
        System.out.println("The bridge lights are turned on for the night.");
    }

    void inspectPillars() {
        System.out.println("Divers are inspecting the underwater pillars.");
    }

    void repaint() {
        System.out.println("The steel structure is being repainted.");
    }

    void detectOverload() {
        System.out.println("Weight sensors have detected a heavy vehicle.");
    }

    void raiseLowerDeck() {
        System.out.println("The lower deck is being adjusted.");
    }

    void clearSnow() {
        System.out.println("The maintenance crew is clearing snow from the lanes.");
    }

    void soundAlarm() {
        System.out.println("High wind warning: Alarm sounding on the bridge.");
    }

    void updateTrafficSignal() {
        System.out.println("The bridge traffic light turned green.");
    }

    void recordVehicleCount() {
        System.out.println("The bridge counter has registered another car.");
    }

    void checkExpansionJoints() {
        System.out.println("Thermal expansion joints are functioning correctly.");
    }

   
    static void calculateMaxLoad() {
        System.out.println("Static Rule: Calculating maximum load capacity based on material.");
    }

    static void displaySafetyStandards() {
        System.out.println("Static Info: All bridges must follow ISO 2026 safety codes.");
    }

    static void listBridgeTypes() {
        System.out.println("Static Info: Types include Suspension, Arch, Beam, and Truss.");
    }

    static void verifyMaterialQuality() {
        System.out.println("Static Action: Testing steel and concrete durability standards.");
    }

    static void getGlobalBridgeCount() {
        System.out.println("Static Data: Accessing the total number of bridges in the database.");
    }
}

class BridgeRunner {
    public static void main(String[] args) {
        
        Bridge howrahBridge = new Bridge();

      
        howrahBridge.open();
        howrahBridge.close();
        howrahBridge.allowTraffic();
        howrahBridge.collectToll();
        howrahBridge.monitorVibration();
        howrahBridge.illuminate();
        howrahBridge.inspectPillars();
        howrahBridge.repaint();
        howrahBridge.detectOverload();
        howrahBridge.raiseLowerDeck();
        howrahBridge.clearSnow();
        howrahBridge.soundAlarm();
        howrahBridge.updateTrafficSignal();
        howrahBridge.recordVehicleCount();
        howrahBridge.checkExpansionJoints();

        System.out.println("------------------------------------");

        
        Bridge.calculateMaxLoad();
        Bridge.displaySafetyStandards();
        Bridge.listBridgeTypes();
        Bridge.verifyMaterialQuality();
        Bridge.getGlobalBridgeCount();
    }
}