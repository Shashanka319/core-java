public class Runner {
    public static void main(String[] args) {
        NumberStringOperations ops = new NumberStringOperations();

        System.out.println("--- Task 1: Even/Odd Sum ---");
        int[] task1Array = {1, 2, 3, 4};
        ops.findEvenOddSum(task1Array);

        System.out.println("\n--- Task 2: String Reverse ---");
        String original = "hello";
        System.out.println("Input: " + original + " => Output: " + ops.reverseString(original));

        System.out.println("\n--- Task 3: Palindrome Check ---");
        int p1 = 121;
        int p2 = 122;
        System.out.println("Input: " + p1 + " => Output: " + ops.isPalindrome(p1));
        System.out.println("Input: " + p2 + " => Output: " + ops.isPalindrome(p2));

        System.out.println("\n--- Task 4: Total Array Sum ---");
        int[] task4Array = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + ops.sumOfArray(task4Array));
    }
}