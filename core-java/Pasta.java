class Pasta {
    String[] pastaTypes;
    int presentSize = 0;

    Pasta(String[] pastaTypes) {
        this.pastaTypes = pastaTypes;
    }

    void savePasta(String pastaName) {
        if (this.pastaTypes != null && pastaName != null) {
            if (presentSize < pastaTypes.length) {
                this.pastaTypes[presentSize] = pastaName;
                System.out.println("Saved Pasta: " + pastaName);
                presentSize++;
            } else {
                System.out.println("Kitchen storage is full!");
            }
        }
    }

    boolean searchPasta(String pastaName) {
        if (pastaName != null && pastaTypes != null) {
            for (String item : pastaTypes) {
                if (pastaName==item) {
                    System.out.println("Found Pasta: " + pastaName);
                    return true;
                }
            }
        }
        System.out.println("Pasta not found in storage.");
        return false;
    }

    boolean update(int index, String newPasta) {
        if (pastaTypes != null && index >= 0 && index < pastaTypes.length) {
            System.out.println("Updating index " + index + " to " + newPasta);
            this.pastaTypes[index] = newPasta;
            return true;
        }
        return false;
    }

    boolean update(String oldPasta, String newPasta) {
        if (oldPasta != null && newPasta != null && pastaTypes != null) {
            for (int i = 0; i < pastaTypes.length; i++) {
                if (oldPasta.equals(pastaTypes[i])) {
                    pastaTypes[i] = newPasta;
                    System.out.println("Updated " + oldPasta + " to " + newPasta);
                    return true;
                }
            }
        }
        return false;
    }

    String delete(int index) {
        if (pastaTypes != null && index >= 0 && index < pastaTypes.length) {
            String deleted = pastaTypes[index];
            pastaTypes[index] = null;
            System.out.println("Deleted from shelf " + index + ": " + deleted);
            return deleted;
        }
        return null;
    }

    String delete(String pastaName) {
        if (pastaTypes != null && pastaName != null) {
            for (int i = 0; i < pastaTypes.length; i++) {
                if (pastaName.equals(pastaTypes[i])) {
                    String deleted = pastaTypes[i];
                    pastaTypes[i] = null;
                    System.out.println("Deleted: " + deleted);
                    return deleted;
                }
            }
        }
        return null;
    }
}