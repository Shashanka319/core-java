import com.xworkz.wire.WireRunner;

public class  Wire{
    double length;
    STring material;
    double cost;

    public Wire(double length, STring material, double cost) {
        this.length = length;
        this.material = material;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Length: " + length + ", Material: " + material + ", Cost: " + cost;
    }

    @Override
    public boolean equals(Object obj) {
        Wire leftSide=this;
        if(obj instanceof Wire)
        {
            Wire rightSide=(Wire)obj;
            if(leftSide.length==rightSide.length && leftSide.material==rightSide.material && leftSide.cost==rightSide.cost)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}