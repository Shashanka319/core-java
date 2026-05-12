package diamond;

public class Diamond {
    int count;
    double weight;
    boolean quality;

    public Diamond(int count, double weight, boolean quality) {
        this.count = count;
        this.weight = weight;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "count=" + count +
                ", weight=" + weight +
                ", quality=" + quality +
                '}';
    }
    public boolean equals(Object obj){
        Diamond left=this;
        if(obj instanceof  Diamond){
            Diamond right=(Diamond)obj;
            if(left.count== right.count && left.weight==right.weight && left.quality== right.quality){
                return  true;
            }
        }return super.equals(obj);
    }
}
