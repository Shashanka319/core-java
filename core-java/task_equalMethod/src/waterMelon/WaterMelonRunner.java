package waterMelon;

public class WaterMelonRunner {
    public static void main(String[] args) {
        WaterMelon waterMelon = new WaterMelon(2,150,true);
        WaterMelon waterMelon1 = new WaterMelon(3,150,true);
        WaterMelon waterMelon2 = new WaterMelon(2,150,true);
        boolean compare=waterMelon.equals(waterMelon1);
        System.out.println("Compare the waterMelon and waterMewlon1:"+compare);
        compare = waterMelon.equals(waterMelon2);
        System.out.println("Compare between WaterMelon and WaterMelon2:"+compare);
    }
}
