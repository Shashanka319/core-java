class Server {
    String[] softwareList;
    Hardware[] hardwareList;

    Server(String[] softwareList, Hardware[] hardwareList) {
        this.softwareList = softwareList;
        this.hardwareList = hardwareList;
    }

    void displayServerComponents() {
        System.out.println("Installed Software:");
        if (softwareList != null) {
            for (String software : softwareList) {
                if (software != null) {
                    System.out.println("Softwarers " + software);
                }
            }
        }

        System.out.println("Hardware Configuration:");
        if (hardwareList != null) {
            for (Hardware hardware : hardwareList) {
                if (hardware != null) {
                    System.out.println(" Hardware Component: " + hardware.componentName +  +hardware.capacityGB + "GB");
                }
            }
        }
    }
}