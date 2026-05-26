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