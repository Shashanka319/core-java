package fork;

public class Fork {
    String material;
    int count;
    double price;

    @Override
    public String toString() {
        return "Fork{" +
                "material='" + material + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public Fork(String material, int count, double price) {
        this.material = material;
        this.count = count;
        this.price = price;
    }
    public boolean equals(Object obj){
        Fork left = this;
        if(obj instanceof Fork){
            Fork right = (Fork) obj;
            if(left.material==right.material && left.count== right.count && left.price == right.price){
                return true;
            }
        }
        return  super.equals(obj);
    }

}
