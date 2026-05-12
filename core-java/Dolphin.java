class Dolphin {
    
    void swim() {
        System.out.println("The dolphin is swimming gracefully.");
    }

    void jump() {
        System.out.println("The dolphin leaps out of the water!");
    }

    void eatFish() {
        System.out.println("The dolphin is eating a fish.");
    }

    void whistle() {
        System.out.println("The dolphin is communicating with a whistle.");
    }

    void sleep() {
        System.out.println("The dolphin is resting one half of its brain.");
    }

    void play() {
        System.out.println("The dolphin is playing with a ball.");
    }

    void dive() {
        System.out.println("The dolphin is diving deep into the ocean.");
    }

    void breathe() {
        System.out.println("The dolphin comes to the surface to breathe.");
    }

    void hunt() {
        System.out.println("The dolphin is hunting in a pod.");
    }

    void protectYoung() {
        System.out.println("The dolphin is protecting its calf.");
    }

    void followBoat() {
        System.out.println("The dolphin is riding the bow wave of a boat.");
    }

    void click() {
        System.out.println("The dolphin is using echolocation clicks.");
    }

    void spin() {
        System.out.println("The dolphin is performing a spin in the air.");
    }

    void scanEnvironment() {
        System.out.println("The dolphin is scanning for predators.");
    }

    void socialize() {
        System.out.println("The dolphin is interacting with other dolphins.");
    }

   actions related to dolphins as a class)
    static void getSpeciesInfo() {
        System.out.println("Dolphins belong to the family Delphinidae.");
    }

    static void averageLifespan() {
        System.out.println("The average lifespan of a dolphin is 20 to 50 years.");
    }

    static void habitatType() {
        System.out.println("Most dolphins live in saltwater oceans.");
    }

    static void conservationStatus() {
        System.out.println("Many dolphin species are currently protected by law.");
    }

    static void checkIntelligenceLevel() {
        System.out.println("Dolphins are considered one of the most intelligent animals.");
    }
}

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