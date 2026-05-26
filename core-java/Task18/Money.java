class Money {
   
    void deposit() {
        System.out.println("The amount has been deposited into the account.");
    }

    void withdraw() {
        System.out.println("The amount has been withdrawn from the wallet.");
    }

    void spend() {
        System.out.println("Money is being spent on a purchase.");
    }

    void transfer() {
        System.out.println("Funds are being transferred to another user.");
    }

    void encrypt() {
        System.out.println("Digital currency transaction is being encrypted.");
    }

    void validateSerial() {
        System.out.println("Checking the serial number for counterfeit detection.");
    }

    void calculateInterest() {
        System.out.println("Calculating monthly interest earned on this balance.");
    }

    void convertToCents() {
        System.out.println("Converting the dollar amount into raw cents.");
    }

    void donate() {
        System.out.println("A portion of this money is being sent to charity.");
    }

    void invest() {
        System.out.println("Allocating these funds into a stock portfolio.");
    }

    void save() {
        System.out.println("Moving the amount to a high-yield savings account.");
    }

    void refund() {
        System.out.println("The transaction has been reversed; refunding money.");
    }

    void checkBalance() {
        System.out.println("Displaying the current available balance.");
    }

    void audit() {
        System.out.println("Performing a security audit on this specific transaction.");
    }

    void freeze() {
        System.out.println("This specific fund has been frozen due to suspicious activity.");
    }

 
    static void getGlobalCurrencyList() {
        System.out.println("Static Info: Supported currencies include INR, USD, EUR, and JPY.");
    }

    static void setExchangeRate() {
        System.out.println("Static Action: Updating the global USD to INR exchange rate.");
    }

    static void displayTaxRate() {
        System.out.println("Static Info: The current standard GST/Tax rate is 18%.");
    }

    static void getMintingYear() {
        System.out.println("Static Info: Accessing the official year of the current currency series.");
    }

    static void verifyBankCode() {
        System.out.println("Static Action: Validating the IFSC or SWIFT code format.");
    }
}

class MoneyRunner {
    public static void main(String[] args) {
       
        Money mySavings = new Money();

    
        mySavings.deposit();
        mySavings.withdraw();
        mySavings.spend();
        mySavings.transfer();
        mySavings.encrypt();
        mySavings.validateSerial();
        mySavings.calculateInterest();
        mySavings.convertToCents();
        mySavings.donate();
        mySavings.invest();
        mySavings.save();
        mySavings.refund();
        mySavings.checkBalance();
        mySavings.audit();
        mySavings.freeze();


        Money.getGlobalCurrencyList();
        Money.setExchangeRate();
        Money.displayTaxRate();
        Money.getMintingYear();
        Money.verifyBankCode();
    }
}