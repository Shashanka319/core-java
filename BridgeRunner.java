class BridgeRunner {
    public static void main(String[] args) {
        
        Bridge bridge = new Bridge();

      
        bridge.open();
        bridge.close();
        bridge.allowTraffic();
        bridge.collectToll();
        bridge.monitorVibration();
        bridge.illuminate();
        bridge.inspectPillars();
        bridge.repaint();
        bridge.detectOverload();
        bridge.raiseLowerDeck();
        bridge.clearSnow();
        bridge.soundAlarm();
        bridge.updateTrafficSignal();
        bridge.recordVehicleCount();
        bridge.checkExpansionJoints();

        System.out.println("------------------------------------");

        
        Bridge.calculateMaxLoad();
        Bridge.displaySafetyStandards();
        Bridge.listBridgeTypes();
        Bridge.verifyMaterialQuality();
        Bridge.getGlobalBridgeCount();
    }
}