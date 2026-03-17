class Pasta {
    String[] pastaTypes;
    int presentSize;

    Pasta(String[] pastaTypes) {
        this.pastaTypes = pastaTypes;
    }

    void savePastaType(String pastaType) {
        System.out.println("Executing savePastaType in Pasta");
        System.out.println("Pasta Type: " + pastaType);
        if (this.pastaTypes != null) {
            System.out.println("Pasta Types array is not null. Proceeding to save.");
            int size = this.pastaTypes.length - 1;
            if (presentSize <= size) {
                this.pastaTypes[presentSize] = pastaType;
                System.out.println("Pasta Type saved at current index: " + presentSize);
                presentSize++;
                System.out.println("Next available index: " + presentSize);
            } else {
                System.out.println("Array size limit reached. Cannot save.");
            }
        } else {
            System.out.println("Pasta Types array is null.");
        }
    }

    boolean searchPastaType(String pastaType) {
        if (pastaType != null) {
            System.out.println("Pasta Type is not null. Proceeding to search.");
            System.out.println("Target Type: " + pastaType);
            if (this.pastaTypes != null) {
                System.out.println("Searching by comparing in array using index loop.");
                for (int index = 0; index < presentSize; index++) {
                    System.out.println("Checking index " + index + ": " + this.pastaTypes[index]);
                    if (this.pastaTypes[index] == pastaType) {
                        System.out.println("Pasta Type found in array.");
                        return true;
                    } else {
                        System.out.println("Not a match at index " + index);
                    }
                }
            } else {
                System.out.println("Array is null. Cannot perform search.");
            }
        }
        System.out.println("Search completed. Type not found.");
        return false;
    }
}