class Flag {
 
    void hoist() {
        System.out.println("The flag is being hoisted to the top of the pole.");
    }

    void lower() {
        System.out.println("The flag is being lowered carefully.");
    }

    void flutter() {
        System.out.println("The flag is fluttering in the wind.");
    }

    void halfMast() {
        System.out.println("The flag is being flown at half-mast as a sign of mourning.");
    }

    void fold() {
        System.out.println("The flag is being folded into a ceremonial triangle.");
    }

    void salute() {
        System.out.println("A salute is being performed as the flag passes.");
    }

    void wash() {
        System.out.println("The flag fabric is being cleaned according to protocol.");
    }

    void iron() {
        System.out.println("The wrinkles are being ironed out of the flag.");
    }

    void displayColors() {
        System.out.println("The vibrant colors of this flag are being displayed.");
    }

    void illuminate() {
        System.out.println("Spotlights are illuminating the flag at night.");
    }

    void repair() {
        System.out.println("The frayed edges of the flag are being stitched.");
    }

    void retire() {
        System.out.println("The worn-out flag is being retired with dignity.");
    }

    void wave() {
        System.out.println("A spectator is waving the flag in the crowd.");
    }

    void wrap() {
        System.out.println("The flag is being wrapped around the pole for storage.");
    }

    void identifyOrigin() {
        System.out.println("Checking the symbols to identify which country this flag represents.");
    }

   
    static void getVexillologyDefinition() {
        System.out.println("Static Fact: Vexillology is the scientific study of flags.");
    }

    static void standardDimenions() {
        System.out.println("Static Rule: Most flags follow a 2:3 or 3:5 aspect ratio.");
    }

    static void listCommonSymbols() {
        System.out.println("Static Info: Common symbols include stars, crosses, and crescents.");
    }

    static void checkFlagCode() {
        System.out.println("Static Rule: Respectful handling is governed by a National Flag Code.");
    }

    static void getAncientHistory() {
        System.out.println("Static Info: The first flags were used in ancient China and India.");
    }
}

class FlagRunner {
    public static void main(String[] args) {
        
        Flag indianFlag = new Flag();

       
        indianFlag.hoist();
        indianFlag.lower();
        indianFlag.flutter();
        indianFlag.halfMast();
        indianFlag.fold();
        indianFlag.salute();
        indianFlag.wash();
        indianFlag.iron();
        indianFlag.displayColors();
        indianFlag.illuminate();
        indianFlag.repair();
        indianFlag.retire();
        indianFlag.wave();
        indianFlag.wrap();
        indianFlag.identifyOrigin();

        System.out.println("------------------------------------");

        Flag.getVexillologyDefinition();
        Flag.standardDimenions();
        Flag.listCommonSymbols();
        Flag.checkFlagCode();
        Flag.getAncientHistory();
    }
}