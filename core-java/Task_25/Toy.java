
public class Toy {
    String name;
    int count;
    double price;
    String color;
    boolean available;

    public Toy(int count, String name, double price, String color, boolean available) {
        this.count = count;
        this.name = name;
        this.price = price;
        this.color = color;
        this.available = available;
    }
    public void info(){
        System.out.println("Toy Name:"+this.name);
        System.out.println("Toy Count:"+this.count);
        System.out.println("Toy Price:"+this.price);
        System.out.println("Toy Color:"+this.color);
        System.out.println("Toy is Available:"+this.available);
    }
}
