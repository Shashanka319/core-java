package com.xworkz.Doller;

public class DollerRunner {
    public static void main(String[] args) {
        int[] counts = {2,3,1,4,6};
        System.out.println("Parent Class Information");
        Doller doller = new Doller(DollerType.DIGITALLY,counts,"USA","92");
        doller.info();
        doller.originInfo();
        System.out.println(doller.toString());

        System.out.println("CHild Class Information");
        CryptoCurency cryptoCurency= new CryptoCurency(DollerType.DIGITALLY,counts,"USA","92","Digitally","German");
        cryptoCurency.info();
        cryptoCurency.originInfo();
        cryptoCurency.toString();
    }
}
