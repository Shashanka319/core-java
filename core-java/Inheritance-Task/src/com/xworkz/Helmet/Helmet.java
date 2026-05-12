package com.xworkz.Helmet;

import java.util.Arrays;

public class Helmet {
    HelmetType helmetType;
    HelmetShop helmetShop;
    double[] price;
    boolean glass;
    boolean safe;

    public Helmet(HelmetType helmetType, HelmetShop helmetShop, double[] price, boolean glass, boolean safe) {
        this.helmetType = helmetType;
        this.helmetShop = helmetShop;
        this.price = price;
        this.glass = glass;
        this.safe = safe;
    }

    public HelmetShop getHelmetShop() {
        return helmetShop;
    }

    public void setGlass(boolean glass) {
        this.glass = glass;
        System.out.println(this.glass);
    }

    @Override
    public String toString() {
        System.out.println("Execute the toString in Helmet");
        return "Helmet Type:"+this.helmetType+"HelmetShop"+this.helmetType+"Price:"+ Arrays.toString(price)+"Helmet Has Glass:"+this.glass+
                "Helmet is Safe:"+this.safe;
    }
}
