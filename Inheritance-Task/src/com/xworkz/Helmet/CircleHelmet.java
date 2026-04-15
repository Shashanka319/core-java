package com.xworkz.Helmet;

public class CircleHelmet extends Helmet{
    String type;
    double cost;

    public CircleHelmet(HelmetType helmetType, HelmetShop helmetShop, double[] price, boolean glass, boolean safe, String type, double cost) {
        super(helmetType, helmetShop, price, glass, safe);
        this.type = type;
        this.cost = cost;
    }

    @Override
    public HelmetShop getHelmetShop() {
        return super.getHelmetShop();
    }

    @Override
    public void setGlass(boolean glass) {
        super.setGlass(glass);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
