package diamond;

public class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond = new Diamond(1,4.5,true);
        Diamond diamond1 = new Diamond(1,4.5,true);
        Diamond diamond2 = new Diamond(4,4.5,true);
        boolean check = diamond2.equals(diamond1);
        System.out.println("Check="+check);
        boolean check1 = diamond1.equals(diamond);
        System.out.println("Check="+check1);

    }
}
