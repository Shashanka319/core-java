package crown;

public class CrownmRunner {
    public static void main(String[] args) {
        Crown crown = new Crown("Gold",2,9);
        Crown crown1 = new Crown("Gold",2,9);
        Crown crown2 = new Crown("Gold",4,9);
        boolean check = crown.equals(crown1);
        System.out.println("Check="+check);
        check= crown.equals(crown2);
        System.out.println("Check="+check);

    }
}
