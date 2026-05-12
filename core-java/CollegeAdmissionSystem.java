class CollegeAdmissionSystem {

    public static void main(String[] args) {

        String name = "Shashaka";
        int marks = 85;
        String email = "sharathshashank1986@gmail.com";
        int age = 18;
        if (name == null) {
            System.out.println("Name is invalid");
        }
        if (marks <= 0) {
            System.out.println("Marks are invalid");
        }
        if (email == null) {
            System.out.println("Email is invalid");
        }
        if (age < 17) {
            System.out.println("Age not eligible");
        }

        if (marks >= 90) {
            System.out.println("Distinction");
        }
        else if (marks >= 75) {
            System.out.println("First Class");
        }
        else if (marks >= 60) {
            System.out.println("Second Class");
        }
        else if (marks >= 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        int course = 1;

        switch (course) {
            case 1:
                System.out.println("Course: CSE");
                break;
            case 2:
                System.out.println("Course: ECE");
                break;
            case 3:
                System.out.println("Course: Mechanical");
                break;
            case 4:
                System.out.println("Course: Civil");
                break;
            default:
                System.out.println("Invalid Course");
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println("Subject " + i);
        }
        int semester = 1;
        while (semester <= 8) {
            System.out.println("Semester: " + semester);
            semester++;
        }

  
        int attempts = 1;
        do {
            System.out.println("Fee Payment Attempt " + attempts);
            attempts++;
        }
        while (attempts <= 3);
    }
}