class Walnut {
    double weightInGrams;
    Supplier supplier;
    WalnutGrade grade;

    Walnut(double weightInGrams, Supplier supplier, WalnutGrade grade) {
        this.weightInGrams = weightInGrams;
        this.supplier = supplier;
        this.grade = grade;
    }

    void displayWalnutDetails() {
        System.out.println("Weight: " + this.weightInGrams + "g");
        System.out.println("Grade: " + this.grade);
        
        if (supplier != null) {
            System.out.println("Supplier: " + supplier.companyName);
            System.out.println("Source: " + supplier.location);
        } else {
            System.out.println("Supplier: Local Farm / Unbranded");
        }
        System.out.println("---------------------------");
    }
}