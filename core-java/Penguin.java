class Penguin {

    void eat() {
        System.out.println("Penguin is eating a fish.");
    }

    void swim() {
        System.out.println("Penguin is swimming in the icy water.");
    }

    void waddle() {
        System.out.println("Penguin is waddling across the snow.");
    }

    void slide() {
        System.out.println("Penguin is sliding on its belly!");
    }

    void sleep() {
        System.out.println("Penguin is taking a nap.");
    }

    void dive() {
        System.out.println("Penguin is diving deep for prey.");
    }

    void call() {
        System.out.println("Penguin is making a vocalizing sound.");
    }

    void hatchEgg() {
        System.out.println("Penguin is carefully keeping the egg warm.");
    }

    void shakeFeathers() {
        System.out.println("Penguin is shaking water off its feathers.");
    }

    void hunt() {
        System.out.println("Penguin is hunting for krill.");
    }

    void groom() {
        System.out.println("Penguin is preening its waterproof feathers.");
    }

    void hideFromPredator() {
        System.out.println("Penguin is hiding from a leopard seal.");
    }

    void jump() {
        System.out.println("Penguin jumps out of the water onto the ice.");
    }

    void protectYoung() {
        System.out.println("Penguin is guarding its chick.");
    }

    void molting() {
        System.out.println("Penguin is shedding its old feathers.");
    }

    static void migrate() {
        System.out.println("Static: The penguin colony is starting migration.");
    }

    static void huddle() {
        System.out.println("Static: Penguins are huddling together to stay warm.");
    }

    static void speciesInfo() {
        System.out.println("Static: Penguins are flightless birds found in the Southern Hemisphere.");
    }

    static void averageLifespan() {
        System.out.println("Static: Most penguins live 15-20 years in the wild.");
    }

    static void conservationStatus() {
        System.out.println("Static: Checking the conservation status of penguin species.");
    }
}

class PenguinRunner {
    public static void main(String[] args) {
       
        Penguin myPenguin = new Penguin();
		
        myPenguin.eat();
        myPenguin.swim();
        myPenguin.waddle();
        myPenguin.slide();
        myPenguin.sleep();
        myPenguin.dive();
        myPenguin.call();
        myPenguin.hatchEgg();
        myPenguin.shakeFeathers();
        myPenguin.hunt();
        myPenguin.groom();
        myPenguin.hideFromPredator();
        myPenguin.jump();
        myPenguin.protectYoung();
        myPenguin.molting();

        Penguin.migrate();
        Penguin.huddle();
        Penguin.speciesInfo();
        Penguin.averageLifespan();
        Penguin.conservationStatus();
    }
}