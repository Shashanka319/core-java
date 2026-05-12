package toothPaste;

public class ToothPaste {
    String name;
    double cost;
    boolean quality;

    @Override
    public String toString() {
        return "ToothPaste{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", quality=" + quality +
                '}';
    }

    public ToothPaste(String name, double cost, boolean quality) {
        this.name = name;
        this.cost = cost;
        this.quality = quality;
    }
    public boolean equals(Object obj){
        ToothPaste left=this;
        if(obj instanceof  ToothPaste){
            ToothPaste right= (ToothPaste) obj;
            if(left.name== right.name && left.cost== right.cost && left.quality== right.quality){
                return true;
            }
        }
        return super.equals(obj);
    }
}
