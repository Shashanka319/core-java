class Fort {
    String fortName;
    Governor governor;
    FortStatus status;

    Fort(String fortName, Governor governor, FortStatus status) {
        this.fortName = fortName;
        this.governor = governor;
        this.status = status;
    }

    void displayFortDetails() {
        System.out.println("Fort Name: " + this.fortName);
        System.out.println("Status: " + this.status);
        
        if (governor != null) {
            System.out.println("Governor: " + governor.name);
            System.out.println("Dynasty: " + governor.dynasty);
        } else {
            System.out.println("Governor: Historical records unavailable.");
        }
        System.out.println("---------------------------");
    }
}