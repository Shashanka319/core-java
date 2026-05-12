public class ScannerRunner {
    public static void main(String[] args) {
        boolean[] statusArray = {true, false, true};

        ScanType[] modeArray = new ScanType[3];
        modeArray[0] = new ScanType("Color", 600);
        modeArray[1] = new ScanType("Grayscale", 300);
        modeArray[2] = new ScanType("OCR", 1200);

        Scanner myScanner = new Scanner(statusArray, modeArray);
        myScanner.displayScannerDetails();
    }
}