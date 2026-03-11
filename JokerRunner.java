public class JokerRunner {
    public static void main(String[] args) {
		double[] trickList = {150,50,550};

        JokerType[] info = new JokerType[3];
        info[0] = new JokerType("Magic In Cards", 7);
        info[1] = new JokerType("Magic in Humans", 10);
        info[2] = new JokerType("Magic in Books", 6);

        Joker villain = new Joker(trickList, info);
        villain.display();
    }
}