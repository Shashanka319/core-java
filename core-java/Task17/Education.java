class Education {
    int institutionId;
    String institutionName;
    String level;               
    String affiliation;         
    int totalStudents;
    int facultyCount;
    double annualFee;
    boolean isCoEd;
    boolean hasLibrary;
    String campusLocation;
    double campusAreaAcres;
    boolean providesScholarship;
    int coursesOffered;
    String mediumOfInstruction; 
    double averageRating;
    boolean isDigitalEnabled;    
    int establishedYear;
    String principalName;
    long endowmentFund;
    boolean hasTransportFacility;

    Education(int institutionId, String institutionName, String level, String affiliation, 
              int totalStudents, int facultyCount, double annualFee, boolean isCoEd, 
              boolean hasLibrary, String campusLocation, double campusAreaAcres, 
              boolean providesScholarship, int coursesOffered, String mediumOfInstruction, 
              double averageRating, boolean isDigitalEnabled, int establishedYear, 
              String principalName, long endowmentFund, boolean hasTransportFacility) {
        
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.level = level;
        this.affiliation = affiliation;
        this.totalStudents = totalStudents;
        this.facultyCount = facultyCount;
        this.annualFee = annualFee;
        this.isCoEd = isCoEd;
        this.hasLibrary = hasLibrary;
        this.campusLocation = campusLocation;
        this.campusAreaAcres = campusAreaAcres;
        this.providesScholarship = providesScholarship;
        this.coursesOffered = coursesOffered;
        this.mediumOfInstruction = mediumOfInstruction;
        this.averageRating = averageRating;
        this.isDigitalEnabled = isDigitalEnabled;
        this.establishedYear = establishedYear;
        this.principalName = principalName;
        this.endowmentFund = endowmentFund;
        this.hasTransportFacility = hasTransportFacility;
    }

    void display() {
        System.out.println("Institution ID: " + this.institutionId);
        System.out.println("Name: " + this.institutionName);
        System.out.println("Level: " + this.level);
        System.out.println("Affiliation: " + this.affiliation);
        System.out.println("Total Students: " + this.totalStudents);
        System.out.println("Faculty Count: " + this.facultyCount);
        System.out.println("Annual Fee: $" + this.annualFee);
        System.out.println("Co-Education: " + this.isCoEd);
        System.out.println("Library Available: " + this.hasLibrary);
        System.out.println("Location: " + this.campusLocation);
        System.out.println("Campus Area: " + this.campusAreaAcres );
        System.out.println("Scholarships: " + this.providesScholarship);
        System.out.println("Courses Offered: " + this.coursesOffered);
        System.out.println("Medium: " + this.mediumOfInstruction);
        System.out.println("Rating: " + this.averageRating );
        System.out.println("Digital Classrooms: " + this.isDigitalEnabled);
        System.out.println("Established: " + this.establishedYear);
        System.out.println("Principal: " + this.principalName);
        System.out.println("Endowment Fund: $" + this.endowmentFund);
        System.out.println("Transport: " + this.hasTransportFacility);
  
    }
}