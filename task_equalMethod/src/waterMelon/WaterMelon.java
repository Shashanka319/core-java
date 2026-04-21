package waterMelon;

import wire.Wire;

public class WaterMelon {
    int count;
    double price;
    boolean sweet;

    public WaterMelon(int count, double price, boolean sweet) {
        this.count = count;
        this.price = price;
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "WaterMelon{" +
                "count=" + count +
                ", price=" + price +
                ", sweet=" + sweet +
                '}';
    }
    public boolean equals(Object obj){
        WaterMelon left=this;
        if(obj instanceof  WaterMelon){
            WaterMelon right=(WaterMelon)obj;
            if(left.count==right.count && left.price== right.price && left.sweet==right.sweet){
                return true;
            }

        }
        return super.equals(obj);
    }




}
