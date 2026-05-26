class Resource {
    void allocate() {
        System.out.println("Resource has been allocated to a specific task.");
    }

    void deallocate() {
        System.out.println("Resource has been released and is now free.");
    }

    void reserve() {
        System.out.println("Resource is now reserved for future use.");
    }

    void cancelReservation() {
        System.out.println("The reservation for this resource has been cancelled.");
    }

    void checkAvailability() {
        System.out.println("Checking if this specific resource is currently available.");
    }

    void updateStatus() {
        System.out.println("The status of the resource has been updated in the database.");
    }

    void trackUsage() {
        System.out.println("Monitoring the current usage metrics of this resource.");
    }

    void lock() {
        System.out.println("Resource is locked to prevent concurrent access (Mutual Exclusion).");
    }

    void unlock() {
        System.out.println("Resource lock has been released.");
    }

    void repair() {
        System.out.println("The resource is undergoing maintenance or repair.");
    }

    void decommission() {
        System.out.println("This resource is being permanently removed from the system.");
    }

    void assignOwner() {
        System.out.println("A specific user or process has been assigned as the owner.");
    }

    void validatePermissions() {
        System.out.println("Verifying if the requester has the rights to use this resource.");
    }

    void renew() {
        System.out.println("The lease or duration for this resource has been extended.");
    }

    void notifyUser() {
        System.out.println("Sending a notification regarding the status of this resource.");
    }

   
    static void getSystemCapacity() {
        System.out.println("Static Info: Total capacity of all resources in the system is 500 units.");
    }

    static void setGlobalAccessPolicy() {
        System.out.println("Static Action: Updating the security policy for all system resources.");
    }

    static void listResourceTypes() {
        System.out.println("Static Info: Available types: Hardware, Software, Human, and Financial.");
    }

    static void calculateUtilizationRate() {
        System.out.println("Static Action: Computing the average utilization across the entire pool.");
    }

    static void displayEmergencyProtocol() {
        System.out.println("Static Rule: In case of system failure, release all critical resources.");
    }
}

