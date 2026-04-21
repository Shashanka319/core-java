package fork;

public class ForkRunner {
    public static void main(String[] args) {
        Fork fork = new Fork("Steel",2,40);
        Fork fork1 = new Fork("Steel",2,40);
        Fork fork2 = new Fork("Steel",1,40);
        boolean check = fork.equals(fork1);
        boolean check1=fork.equals(fork2);
        System.out.println("Check="+check);
        System.out.println("Check="+check1);

    }
}
