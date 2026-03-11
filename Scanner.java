class Scanner {
    boolean[] hardwareStatus;
    ScanType[] modes;

    Scanner(boolean[] hardwareStatus, ScanType[] modes) {
        this.hardwareStatus = hardwareStatus;
        this.modes = modes;
    }

    void displayScannerDetails() {
        System.out.println("Hardware Diagnostics:");
        if (hardwareStatus != null) {
          
            for (boolean status : hardwareStatus) {
                
                System.out.println("Hard Status:"+ status );
            }
        }

        System.out.println("\nAvailable Scan Modes:");
        if (modes != null) {
            for (ScanType type : modes) {
                if (type != null) {
                    System.out.println("Scan Mode:" + type.mode + " (" + type.resolution + " DPI)");
                }
            }
        }
    }
}