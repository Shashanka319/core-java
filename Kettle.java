Here is the implementation for the Cylinder class. I have followed your pattern while ensuring the code is error-free, specifically using .equals() for String comparisons and fixing the indexing logic.

Java
class Cylinder {
    String[] cylinderTypes;
    int presentSize = 0;

    Cylinder(String[] cylinderTypes) {
        this.cylinderTypes = cylinderTypes;
    }

    void saveCylinder(String type) {
        if (this.cylinderTypes != null && type != null) {
            if (presentSize < cylinderTypes.length) {
                this.cylinderTypes[presentSize] = type;
                System.out.println("Cylinder saved: " + type);
                presentSize++;
            } else {
                System.out.println("Storage is full!");
            }
        }
    }

    boolean searchCylinder(String type) {
        if (type != null && cylinderTypes != null) {
            for (String item : cylinderTypes) {
                if (type.equals(item)) {
                    System.out.println("Cylinder found: " + type);
                    return true;
                }
            }
        }
        System.out.println("Cylinder not found.");
        return false;
    }

    boolean update(int index, String newType) {
        if (cylinderTypes != null && index >= 0 && index < cylinderTypes.length) {
            this.cylinderTypes[index] = newType;
            System.out.println("Updated index " + index + " to " + newType);
            return true;
        }
        return false;
    }

    boolean update(String oldType, String newType) {
        if (oldType != null && newType != null && cylinderTypes != null) {
            for (int i = 0; i < cylinderTypes.length; i++) {
                if (oldType.equals(cylinderTypes[i])) {
                    cylinderTypes[i] = newType;
                    System.out.println("Updated " + oldType + " to " + newType);
                    return true;
                }
            }
        }
        return false;
    }

    String delete(int index) {
        if (cylinderTypes != null && index >= 0 && index < cylinderTypes.length) {
            String deleted = cylinderTypes[index];
            cylinderTypes[index] = null;
            System.out.println("Deleted from index " + index + ": " + deleted);
            return deleted;
        }
        return null;
    }

    String delete(String type) {
        if (cylinderTypes != null && type != null) {
            for (int i = 0; i < cylinderTypes.length; i++) {
                if (type.equals(cylinderTypes[i])) {
                    String deleted = cylinderTypes[i];
                    cylinderTypes[i] = null;
                    System.out.println("Deleted: " + deleted);
                    return deleted;
                }
            }
        }
        return null;
    }
}