class TennisBallRunner {
    public static void main(String[] args) {
       
        TennisBall tennisBall = new TennisBall();

     
        tennisBall.bounce();
        tennisBall.spin();
        tennisBall.hitNet();
        tennisBall.travel();
        tennisBall.compress();
        tennisBall.losePressure();
        tennisBall.roll();
        tennisBall.getPickedUp();
        tennisBall.inflate();
        tennisBall.wearOutFuzz();
        tennisBall.landInBounds();
        tennisBall.landOut();
        tennisBall.getCleaned();
        tennisBall.storeInCan();
        tennisBall.serve();

        System.out.println("------------------------------------");

   
        TennisBall.checkStandardSize();
        TennisBall.getOfficialColors();
        TennisBall.listApprovedBrands();
        TennisBall.calculateReboundHeight();
        TennisBall.displayMaterialInfo();
    }
}