package oil;

public class Oil {
    String name;
    double cost;
    boolean quality;

    public Oil(String name, double cost, boolean quality) {
        this.name = name;
        this.cost = cost;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", quality=" + quality +
                '}';
    }
    public boolean equals(Object obj){
        Oil left = this;
        if(obj instanceof Oil){
            Oil right = (Oil)obj;
            if(left.name==right.name && left.cost == right.cost && left.quality== right.quality){
                return true;
            }

        }
        return super.equals(obj);
    }
}
