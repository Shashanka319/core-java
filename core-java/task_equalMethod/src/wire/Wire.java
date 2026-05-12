package wire;

public class Wire {
    double length;
    String material;
    double cost;

    public Wire(double length, double cost, String material) {
        this.length = length;
        this.cost = cost;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wire{" +
                "length=" + length +
                ", material='" + material + '\'' +
                ", cost=" + cost +
                '}';
    }

    public boolean equals(Object obj)
    {
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
