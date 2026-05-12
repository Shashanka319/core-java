public class Fibonacci {
    public static void main(String[] args) {
        int count = 10; // Number of terms to print
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + count + " terms:");

        for (int i = 1; i <= count; i++) {
            System.out.print(firstTerm + ", ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            // Update variables for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}