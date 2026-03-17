class Turbine {
    String[] turbineNames;
    int presentSize;

    Turbine(String[] turbineNames) {
        this.turbineNames = turbineNames;
    }

    void saveTurbineName(String turbineName) {
        System.out.println("Executing saveTurbineName in Turbine");
        System.out.println("Turbine Name: " + turbineName);
        if (this.turbineNames != null) {
            System.out.println("Turbine Names array is not null. Proceeding to save.");
            int size = this.turbineNames.length - 1;
            if (presentSize <= size) {
                this.turbineNames[presentSize] = turbineName;
                System.out.println("Turbine Name saved at current index: " + presentSize);
                presentSize++;
                System.out.println("Next available index: " + presentSize);
            } else {
                System.out.println("Array size limit reached. Cannot save.");
            }
        } else {
            System.out.println("Turbine Names array is null.");
        }
    }

    boolean searchTurbineName(String turbineName) {
        if (turbineName != null) {
            System.out.println("Turbine Name is not null. Proceeding to search.");
            System.out.println("Target Name: " + turbineName);
            if (this.turbineNames != null) {
                System.out.println("Searching by comparing in array using index loop.");
                for (int index = 0; index < presentSize; index++) {
                    System.out.println("Checking index " + index + ": " + this.turbineNames[index]);
                    if (this.turbineNames[index] == turbineName) {
                        System.out.println("Turbine Name found in array.");
                        return true;
                    } else {
                        System.out.println("Not a match at index " + index);
                    }
                }
            } else {
                System.out.println("Array is null. Cannot perform search.");
            }
        }
        System.out.println("Search completed. Name not found.");
        return false;
    }
}