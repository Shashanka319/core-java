package trolley;

public class TralleyRunner {
    public static void main(String[] args) {
        Tralley tralley= new Tralley("Medium",2,"30KG");
        Tralley tralley1= new Tralley("Medium",2,"30KG");
        Tralley tralley2= new Tralley("Medium",2,"35KG");
        boolean check = tralley.equals(tralley1);
        System.out.println("Check="+check);
        boolean check1 = tralley.equals(tralley2);
        System.out.println("CHeck:"+check1);
    }
}
