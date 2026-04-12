public class ToyRunner {
    public static void main(String[] args) {
        Toy toy=new Toy(1,"Dall",500.0,"Pink",true);
        Toy[] toys =new Toy[5];
        ToyOperation toyOperation=new ToyOperation(toys);
        toyOperation.store(toy);
        toyOperation.search("Dall");
        toyOperation.search("Bat");

    }
}
