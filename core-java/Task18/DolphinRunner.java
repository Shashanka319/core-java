class DolphinRunner {
    public static void main(String[] args) {
        
        Dolphin myDolphin = new Dolphin();

        
        myDolphin.swim();
        myDolphin.jump();
        myDolphin.eatFish();
        myDolphin.whistle();
        myDolphin.sleep();
        myDolphin.play();
        myDolphin.dive();
        myDolphin.breathe();
        myDolphin.hunt();
        myDolphin.protectYoung();
        myDolphin.followBoat();
        myDolphin.click();
        myDolphin.spin();
        myDolphin.scanEnvironment();
        myDolphin.socialize();

        System.out.println("------------------------------------");

        
        Dolphin.getSpeciesInfo();
        Dolphin.averageLifespan();
        Dolphin.habitatType();
        Dolphin.conservationStatus();
        Dolphin.checkIntelligenceLevel();
    }
}