package com.xworkz.Helmet;

public class HelmetRunner {
    public static void main(String[] args) {
        HelmetShop helmetShop = new HelmetShop("Naruthi Helmets", "BTM_Layout");
        double[] prices = {400, 239, 250, 400};
        System.out.println("parent Class Information");
        Helmet helmet = new Helmet(HelmetType.NORMAL, helmetShop, prices, true, true);


        System.out.println(helmet.toString());
        System.out.println("Child Class Inforamtion");
        CircleHelmet circleHelmet = new CircleHelmet(HelmetType.NORMAL, helmetShop, prices, true, true, "Circle", 300);


        System.out.println(circleHelmet.toString());
    }

}

