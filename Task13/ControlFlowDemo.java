public class ControlFlowDemo {
    public static void main(String[] args) {
        int userChoice = 2;        
        int enteredPin = 1234;     
        double withdrawAmount = 1500.0; 
        
        int correctPin = 1234;
        double accountBalance = 5000.0;
        boolean sessionActive = true;

        System.out.println("--- System Initialized ---");

        do {
            if (userChoice == 1) {
                System.out.println("Action: Checking Balance...");
                System.out.println("Your balance is: $" + accountBalance);
            } 
            else if (userChoice == 2) {
                System.out.println("Action: Attempting Withdrawal...");

                if (enteredPin == correctPin) {
                    
                    if (withdrawAmount <= accountBalance) {
                        int count = 1;
                        System.out.print("Counting notes");
                        while (count <= 3) {
                            System.out.print(".");
                            count++;
                        }
                        
                        accountBalance -= withdrawAmount;
                        System.out.println("\nSuccess! Remaining balance: " + accountBalance);
                    } else {
                        System.out.println("\nError: Insufficient funds.");
                    }
                } else {
                    System.out.println("Error: Security breach! Invalid PIN.");
                }
            } 
            else if (userChoice == 3) {
                System.out.println("Action: Exiting System.");
            } 
            else {
                System.out.println("Error: Unknown command.");
            }

        
            sessionActive = false;

        } while (sessionActive);

        System.out.println("--- System Shutdown ---");
    }
}