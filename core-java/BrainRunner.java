class BrainRunner {
    public static void main(String[] args) {
        Brain brain = new Brain(1, "Human", 1400.0, 86000000000L, 4, 20.0, true, "Cognition", 40.0f, 60.0f, 100, true, "Left", 3.5, 1350, "Long-term", 1000000.0, true, "Dopamine", "Adult");
        brain.display();

        Brain brain1 = new Brain(2, "Elephant", 5000.0, 257000000000L, 4, 10.0, true, "Memory", 35.0f, 65.0f, 95, true, "Balanced", 2.8, 4500, "Long-term", 800000.0, true, "Serotonin", "Adult");
        brain1.display();

        Brain brain2 = new Brain(3, "Dolphin", 1600.0, 15000000000L, 4, 15.0, true, "Echolocation", 42.0f, 58.0f, 110, true, "Right", 4.1, 1600, "Sensory", 1200000.0, false, "GABA", "Adolescent");
        brain2.display();

        Brain brain3 = new Brain(4, "Chimpanzee", 400.0, 28000000000L, 4, 12.0, true, "Problem Solving", 38.0f, 62.0f, 85, true, "Left", 3.2, 400, "Short-term", 500000.0, true, "Acetylcholine", "Adult");
        brain3.display();

        Brain brain4 = new Brain(5, "Whale", 8000.0, 21000000000L, 4, 5.0, true, "Navigation", 30.0f, 70.0f, 90, false, "Balanced", 1.5, 8000, "Sensory", 950000.0, true, "Dopamine", "Senescent");
        brain4.display();

        Brain brain5 = new Brain(6, "Neanderthal", 1500.0, 90000000000L, 4, 22.0, true, "Survival", 41.0f, 59.0f, 105, true, "Balanced", 3.7, 1500, "Long-term", 900000.0, true, "Norepinephrine", "Adult");
        brain5.display();

        Brain brain6 = new Brain(7, "Fruit Fly", 0.001, 100000L, 2, 1.0, false, "Reflexes", 90.0f, 10.0f, 50, false, "Balanced", 0.1, 1, "Sensory", 1000.0, false, "Octopamine", "Infancy");
        brain6.display();

        Brain brain7 = new Brain(8, "Parrot", 20.0, 3100000000L, 3, 8.0, true, "Vocal Mimicry", 45.0f, 55.0f, 115, true, "Left", 4.5, 20, "Long-term", 600000.0, true, "Glutamate", "Adult");
        brain7.display();

        Brain brain8 = new Brain(9, "Human Infant", 350.0, 86000000000L, 4, 50.0, true, "Learning", 50.0f, 50.0f, 120, true, "Balanced", 5.0, 350, "Short-term", 200000.0, false, "GABA", "Infancy");
        brain8.display();

        Brain brain9 = new Brain(10, "Cat", 30.0, 250000000L, 4, 10.0, true, "Motor Control", 39.0f, 61.0f, 98, true, "Right", 3.0, 30, "Sensory", 400000.0, true, "Serotonin", "Adult");
        brain9.display();
    }
}