package crown;

public class Crown {
    String material;
    int count;
    double weight;

    @Override
    public String toString() {
        return "Crown{" +
                "material='" + material + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                '}';
    }

    public Crown(String material, int count, double weight) {
        this.material = material;
        this.count = count;
        this.weight = weight;
    }
    public boolean equals(Object obj){
        Crown left=this;
        if(obj instanceof Crown){
            Crown right = (Crown) obj;
            if(left.material==right.material && left.count==right.count && left.weight== right.weight){
                return true;
            }
        }
        return super.equals(obj);
    }
}
