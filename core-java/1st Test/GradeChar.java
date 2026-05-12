class GradeChar {
    public static void main(String[] args) {
        checkGrade('B');
    }

    static void checkGrade(char grade) {

        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
				break;
        }
    }
}