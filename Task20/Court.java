class Court {
    String courtName;
    LegalCase currentCase;
    CourtType type;

    Court(String courtName, LegalCase currentCase, CourtType type) {
        this.courtName = courtName;
        this.currentCase = currentCase;
        this.type = type;
    }
	void displaySessionInfo() {
        System.out.println("Court Name: " + this.courtName);
        System.out.println("Jurisdiction: " + this.type);
        
        if (currentCase != null) {
            System.out.println("Case Number: " + currentCase.caseNumber);
            System.out.println("Petitioner: " + currentCase.petitioner);
        } else {
            System.out.println("Current Case: No active case.");
        }
        System.out.println("---------------------------");
    }
}