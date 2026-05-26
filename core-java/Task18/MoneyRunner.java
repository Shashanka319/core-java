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