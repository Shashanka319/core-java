class Steel {
    String[] steelTypes;
    int presentSize;

    Steel(String[] steelTypes) {
        this.steelTypes = steelTypes;
    }

    void saveSteelType(String steelType) {
        System.out.println("Executing saveSteelType in Steel");
        System.out.println("Steel Type: " + steelType);
        if (this.steelTypes != null) {
            System.out.println("Steel Types array is not null. Proceeding to save.");
            int size = this.steelTypes.length - 1;
            if (presentSize <= size) {
                this.steelTypes[presentSize] = steelType;
                System.out.println("Steel Type saved at current index: " + presentSize);
                presentSize++;
                System.out.println("Next available index: " + presentSize);
            } else {
                System.out.println("Array size limit reached. Cannot save.");
            }
        } else {
            System.out.println("Steel Types array is null.");
        }
    }

    boolean searchSteelType(String steelType) {
        if (steelType != null) {
            System.out.println("Steel Type is not null. Proceeding to search.");
            System.out.println("Target Type: " + steelType);
            if (this.steelTypes != null) {
                System.out.println("Searching by comparing in array using index loop.");
                for (int index = 0; index < presentSize; index++) {
                    System.out.println("Checking index " + index + ": " + this.steelTypes[index]);
                    if (this.steelTypes[index] == steelType) {
                        System.out.println("Steel Type found in array.");
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