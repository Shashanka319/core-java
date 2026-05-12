public class GradeSystem {
    public static void main(String[] args) {
        int studentScore = 65;
        int attendancePercent = 75;
        boolean hasExtraCredit = true;
        System.out.println("Student Evaluation System");
        processStudentGrade(studentScore, attendancePercent, hasExtraCredit);
        System.out.println(" Evaluation Complete ");
    }
    public static void processStudentGrade(int score, int attendance, boolean extraCredit) {
        boolean evaluationActive = true;
        do {
            if (score >= 90) {
                System.out.println("Grade: A");
            } 
            else if (score >= 75) {
                
                if (attendance >= 90) {
                    System.out.println("Grade: B (Eligible for Honors)");
                    if (extraCredit) {
                        int bonusPoints = 1;
                        System.out.print("Applying Bonus");
                        while (bonusPoints <= 3) {
                            System.out.print(".");
                            bonusPoints++;
                        }
                        System.out.println("Final Status: Distinction Awarded!");
                    }
                } else {
                    System.out.println("Grade: B");
                }
            } 
            else if (score >= 50) {
                System.out.println("Grade: C");
            } 
            else {
                System.out.println("Grade: F (Fail)");
            }
            evaluationActive = false;

        } while (evaluationActive);
    }
}