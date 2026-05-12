class TennisBall {
 
    void bounce() {
        System.out.println("The ball is bouncing on the court.");
    }

    void spin() {
        System.out.println("Topspin has been applied to the ball.");
    }

    void hitNet() {
        System.out.println("The ball hit the net and stayed on this side.");
    }

    void travel() {
        System.out.println("The ball is flying through the air at 120 mph.");
    }

    void compress() {
        System.out.println("The ball compresses upon impact with the racket.");
    }

    void losePressure() {
        System.out.println("The ball is becoming flat and losing its bounce.");
    }

    void roll() {
        System.out.println("The ball is rolling toward the back of the court.");
    }

    void getPickedUp() {
        System.out.println("The ball boy has picked up the ball.");
    }

    void inflate() {
        System.out.println("Internal pressure is being checked.");
    }

    void wearOutFuzz() {
        System.out.println("The felt on the ball is becoming fuzzy and worn.");
    }

    void landInBounds() {
        System.out.println("The ball landed exactly on the baseline!");
    }

    void landOut() {
        System.out.println("The ball landed outside the court lines.");
    }

    void getCleaned() {
        System.out.println("Removing clay dust from the ball surface.");
    }

    void storeInCan() {
        System.out.println("The ball is placed back into the pressurized tube.");
    }

    void serve() {
        System.out.println("The ball is tossed high for a serve.");
    }

  
    static void checkStandardSize() {
        System.out.println("Static Rule: Diameter must be between 6.54 and 6.86 cm.");
    }

    static void getOfficialColors() {
        System.out.println("Static Info: Optic Yellow is the standard color for visibility.");
    }

    static void listApprovedBrands() {
        System.out.println("Static Info: Wilson, Penn, and Slazenger are ITF approved.");
    }

    static void calculateReboundHeight() {
        System.out.println("Static Action: Calculating expected rebound from a height of 100 inches.");
    }

    static void displayMaterialInfo() {
        System.out.println("Static Info: Made of a hollow rubber core covered in wool or nylon felt.");
    }
}

class TennisBallRunner {
    public static void main(String[] args) {
       
        TennisBall matchBall = new TennisBall();

     
        matchBall.bounce();
        matchBall.spin();
        matchBall.hitNet();
        matchBall.travel();
        matchBall.compress();
        matchBall.losePressure();
        matchBall.roll();
        matchBall.getPickedUp();
        matchBall.inflate();
        matchBall.wearOutFuzz();
        matchBall.landInBounds();
        matchBall.landOut();
        matchBall.getCleaned();
        matchBall.storeInCan();
        matchBall.serve();

        System.out.println("------------------------------------");

   
        TennisBall.checkStandardSize();
        TennisBall.getOfficialColors();
        TennisBall.listApprovedBrands();
        TennisBall.calculateReboundHeight();
        TennisBall.displayMaterialInfo();
    }
}